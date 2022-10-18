package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.Collection
import typings.openui5.anon.CollectionName
import typings.openui5.anon.FontFamily
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreIconPoolMod extends Shortcut {
  
  @JSImport("sap/ui/core/IconPool", JSImport.Default)
  @js.native
  val default: IconPool = js.native
  
  /**
    * The IconPool is a static class for retrieving or registering icons. It also provides helping methods
    * for easier consumption of icons. There are already icons registered in IconPool, please use the Demo
    * App named "Icon Explorer" to find the name of the icon.
    *
    * In order to use the icon inside an existing control, please call {@link sap.ui.core.IconPool.getIconURI}
    * and assign the URI to the control's property which supports icons. If you want to support both, icons
    * and standard images in your own control, please use the static method {@link sap.ui.core.IconPool.createControlByURI}
    * to either create an Icon in case the first argument is an icon-URL or another control which you define
    * by providing it as the second argument.
    */
  @js.native
  trait IconPool extends StObject {
    
    /**
      * Register an additional icon to the sap.ui.core.IconPool.
      *
      * @returns the info object of the registered icon which has the name, collection, uri, fontFamily, content
      * and suppressMirroring properties.
      */
    def addIcon(
      /**
      * the name of the icon.
      */
    iconName: String,
      /**
      * the name of icon collection. The built in icons are with empty collectionName, so if additional icons
      * need to be registered in IconPool, the collectionName can't be empty.
      */
    collectionName: String,
      /**
      * the icon info which contains the following properties:
      */
    iconInfo: FontFamily
    ): Collection = js.native
    
    /**
      * Creates an instance of {@link sap.ui.core.Icon} if the given URI is an icon URI, otherwise the given
      * constructor is called. The given URI is set to the src property of the control.
      *
      * @returns Either an instance of `sap.ui.core.Icon` or instance created by calling the given constructor
      */
    def createControlByURI(
      /**
      * Contains the properties which will be used to instantiate the returned control. All properties of the
      * associated constructor can be used. Unknown properties are ignored. It should contain at least a property
      * named src. If it's given with a string type, it will be taken as the value of src property.
      */
    setting: String,
      /**
      * The constructor function which is called when the given URI isn't an icon URI
      */
    constructor: js.Function
    ): typings.openui5.sapUiCoreControlMod.default = js.native
    def createControlByURI(
      /**
      * Contains the properties which will be used to instantiate the returned control. All properties of the
      * associated constructor can be used. Unknown properties are ignored. It should contain at least a property
      * named src. If it's given with a string type, it will be taken as the value of src property.
      */
    setting: js.Object,
      /**
      * The constructor function which is called when the given URI isn't an icon URI
      */
    constructor: js.Function
    ): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @SINCE 1.56.0
      *
      * Checks if the icon font is loaded
      *
      * @returns a Promise that resolves when the icon font is loaded; or `undefined` if the icon font has not
      * been registered yet
      */
    def fontLoaded(/**
      * icon collection name
      */
    sCollectionName: String): js.UndefOr[js.Promise[Any]] = js.native
    
    /**
      * Returns all names of registered collections in IconPool
      *
      * @returns An array contains all of the registered collections' names.
      */
    def getIconCollectionNames(): js.Array[Any] = js.native
    
    /**
      * @SINCE 1.25.0
      *
      * Returns the icon url based on the given mime type
      *
      * @returns the icon url (e.g. "sap-icon://attachment-zip-file")
      */
    def getIconForMimeType(/**
      * the mime type of a file (e.g. "application/zip")
      */
    sMimeType: String): String = js.native
    
    /**
      * Returns an info object for the icon with the given `iconName` and `collectionName`.
      *
      * Instead of giving name and collection, a complete icon-URI can be provided as `iconName`. The method
      * will determine name and collection from the URI, see {@link #.isIconURI IconPool.isIconURI} for details.
      *
      * The returned info object has the following properties:
      * 	 - `string: name` Name of the icon
      * 	 - `string: collection` Name of the collection that contains the icon or `undefined` in case of the
      * 			default collection
      * 	 - `string: uri` Icon URI that identifies the icon
      * 	 - `string: fontFamily` CSS font family to use for this icon
      * 	 - `string: content` Character sequence that represents the icon in the icon font
      * 	 - `string: text` Alternative text describing the icon (optional, might be empty)
      * 	 - `boolean: suppressMirroring` Whether the icon needs no mirroring in right-to-left mode
      *
      * @returns Info object or Promise for the icon depending on the loadingMode or `undefined` when the icon
      * can't be found or no icon name was given.
      */
    def getIconInfo(
      /**
      * Name of the icon, or a complete icon-URI with icon collection and icon name; must not be empty
      */
    iconName: String
    ): js.UndefOr[js.Object | js.Promise[Any]] = js.native
    def getIconInfo(
      /**
      * Name of the icon, or a complete icon-URI with icon collection and icon name; must not be empty
      */
    iconName: String,
      /**
      * Name of the icon collection; to access built-in icons, omit the collection name
      */
    collectionName: String
    ): js.UndefOr[js.Object | js.Promise[Any]] = js.native
    def getIconInfo(
      /**
      * Name of the icon, or a complete icon-URI with icon collection and icon name; must not be empty
      */
    iconName: String,
      /**
      * Name of the icon collection; to access built-in icons, omit the collection name
      */
    collectionName: String,
      /**
      * The approach for loading the icon info, if it is not already available: sync - font metadata is loaded
      * synchronously and the icon info is returned immediately async - a promise is returned that returns the
      * icon info when the font metadata is loaded mixed - until the font metadata is loaded a promise is returned,
      * afterwards the icon info
      */
    loadingMode: String
    ): js.UndefOr[js.Object | js.Promise[Any]] = js.native
    def getIconInfo(
      /**
      * Name of the icon, or a complete icon-URI with icon collection and icon name; must not be empty
      */
    iconName: String,
      /**
      * Name of the icon collection; to access built-in icons, omit the collection name
      */
    collectionName: Unit,
      /**
      * The approach for loading the icon info, if it is not already available: sync - font metadata is loaded
      * synchronously and the icon info is returned immediately async - a promise is returned that returns the
      * icon info when the font metadata is loaded mixed - until the font metadata is loaded a promise is returned,
      * afterwards the icon info
      */
    loadingMode: String
    ): js.UndefOr[js.Object | js.Promise[Any]] = js.native
    
    /**
      * Returns all name of icons that are registered under the given collection.
      *
      * @returns An array contains all of the registered icon names under the given collection.
      */
    def getIconNames(/**
      * the name of collection where icon names are retrieved.
      */
    collectionName: String): js.Array[Any] = js.native
    
    /**
      * Returns the URI of the icon in the pool which has the given `iconName` and `collectionName`.
      *
      * @returns URI of the icon or `undefined` if the icon can't be found in the IconPool
      */
    def getIconURI(/**
      * Name of the icon, must not be empty
      */
    iconName: String): js.UndefOr[String] = js.native
    def getIconURI(
      /**
      * Name of the icon, must not be empty
      */
    iconName: String,
      /**
      * Name of the icon collection; to access built-in icons, omit the collection name
      */
    collectionName: String
    ): js.UndefOr[String] = js.native
    
    /**
      * Adds CSS code to load an icon font to the DOM
      */
    def insertFontFaceStyle(
      /**
      * the file name of the font face
      */
    sFontFace: String,
      /**
      * the path to the font file
      */
    sPath: String
    ): Unit = js.native
    def insertFontFaceStyle(
      /**
      * the file name of the font face
      */
    sFontFace: String,
      /**
      * the path to the font file
      */
    sPath: String,
      /**
      * the collection name, if not specified the font face is used
      */
    sCollectionName: String
    ): Unit = js.native
    
    /**
      * Returns whether the given `uri` is an icon URI.
      *
      * A string is an icon URI when it can be parsed as a URI and when it has one of the two forms
      * 	 - sap-icon://collectionName/iconName
      * 	 - sap-icon://iconName  where collectionName and iconName must be non-empty.
      *
      * @returns Whether the URI matches the icon URI format
      */
    def isIconURI(/**
      * The URI to check
      */
    uri: String): Boolean = js.native
    
    /**
      * @SINCE 1.56.0
      *
      * Registers an additional icon font to the icon pool
      */
    def registerFont(/**
      * configuration object for registering the font
      */
    oConfig: CollectionName): Unit = js.native
  }
  
  type _To = IconPool
  
  /* This means you don't have to write `default`, but can instead just say `sapUiCoreIconPoolMod.foo` */
  override def _to: IconPool = default
}
