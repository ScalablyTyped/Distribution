package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUxapBreadCrumbsMod {
  
  @JSImport("sap/uxap/BreadCrumbs", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `BreadCrumbs`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends BreadCrumbs {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: BreadCrumbsSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: BreadCrumbsSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: BreadCrumbsSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/uxap/BreadCrumbs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.uxap.BreadCrumbs with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BreadCrumbs]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BreadCrumbs],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.uxap.BreadCrumbs.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait BreadCrumbs
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some link to the aggregation {@link #getLinks links}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addLink(
      /**
      * The link to add; if empty, nothing is inserted
      */
    oLink: typings.openui5.sapMLinkMod.default
    ): this.type = js.native
    
    /**
      * Destroys the currentLocation in the aggregation {@link #getCurrentLocation currentLocation}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCurrentLocation(): this.type = js.native
    
    /**
      * Destroys all the links in the aggregation {@link #getLinks links}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLinks(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getCurrentLocation currentLocation}.
      *
      * The current/last element in the BreadCrumbs path.
      */
    def getCurrentLocation(): typings.openui5.sapMTextMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getLinks links}.
      *
      * A list of all the active link elements in the BreadCrumbs control.
      */
    def getLinks(): js.Array[typings.openui5.sapMLinkMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getShowCurrentLocation showCurrentLocation}.
      *
      * Sets the visibility of the current/last element in the BreadCrumbs path.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showCurrentLocation`
      */
    def getShowCurrentLocation(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.m.Link` in the aggregation {@link #getLinks links}. and returns its index
      * if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfLink(/**
      * The link whose index is looked for
      */
    oLink: typings.openui5.sapMLinkMod.default): int = js.native
    
    /**
      * Inserts a link into the aggregation {@link #getLinks links}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertLink(
      /**
      * The link to insert; if empty, nothing is inserted
      */
    oLink: typings.openui5.sapMLinkMod.default,
      /**
      * The `0`-based index the link should be inserted at; for a negative value of `iIndex`, the link is inserted
      * at position 0; for a value greater than the current size of the aggregation, the link is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getLinks links}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllLinks(): js.Array[typings.openui5.sapMLinkMod.default] = js.native
    
    def removeLink(/**
      * The link to remove or its index or id
      */
    vLink: String): typings.openui5.sapMLinkMod.default | Null = js.native
    /**
      * Removes a link from the aggregation {@link #getLinks links}.
      *
      * @returns The removed link or `null`
      */
    def removeLink(/**
      * The link to remove or its index or id
      */
    vLink: int): typings.openui5.sapMLinkMod.default | Null = js.native
    def removeLink(/**
      * The link to remove or its index or id
      */
    vLink: typings.openui5.sapMLinkMod.default): typings.openui5.sapMLinkMod.default | Null = js.native
    
    /**
      * Sets the aggregated {@link #getCurrentLocation currentLocation}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCurrentLocation(/**
      * The currentLocation to set
      */
    oCurrentLocation: typings.openui5.sapMTextMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowCurrentLocation showCurrentLocation}.
      *
      * Sets the visibility of the current/last element in the BreadCrumbs path.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowCurrentLocation(): this.type = js.native
    def setShowCurrentLocation(/**
      * New value for property `showCurrentLocation`
      */
    bShowCurrentLocation: Boolean): this.type = js.native
  }
  
  trait BreadCrumbsSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The current/last element in the BreadCrumbs path.
      */
    var currentLocation: js.UndefOr[typings.openui5.sapMTextMod.default] = js.undefined
    
    /**
      * A list of all the active link elements in the BreadCrumbs control.
      */
    var links: js.UndefOr[
        js.Array[typings.openui5.sapMLinkMod.default] | typings.openui5.sapMLinkMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the visibility of the current/last element in the BreadCrumbs path.
      */
    var showCurrentLocation: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object BreadCrumbsSettings {
    
    inline def apply(): BreadCrumbsSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadCrumbsSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreadCrumbsSettings] (val x: Self) extends AnyVal {
      
      inline def setCurrentLocation(value: typings.openui5.sapMTextMod.default): Self = StObject.set(x, "currentLocation", value.asInstanceOf[js.Any])
      
      inline def setCurrentLocationUndefined: Self = StObject.set(x, "currentLocation", js.undefined)
      
      inline def setLinks(
        value: js.Array[typings.openui5.sapMLinkMod.default] | typings.openui5.sapMLinkMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setLinksVarargs(value: typings.openui5.sapMLinkMod.default*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setShowCurrentLocation(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCurrentLocation", value.asInstanceOf[js.Any])
      
      inline def setShowCurrentLocationUndefined: Self = StObject.set(x, "showCurrentLocation", js.undefined)
    }
  }
}
