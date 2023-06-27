package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiMdcFieldFieldInfoBaseMod.FieldInfoBaseSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcLinkMod {
  
  @JSImport("sap/ui/mdc/Link", JSImport.Default)
  @js.native
  /**
    * Constructor for the new `Link`
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Link {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: LinkSettings) = this()
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
    mSettings: LinkSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: LinkSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/Link", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.Link with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.mdc.field.FieldInfoBase.extend}.
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
    oClassInfo: ClassInfo[T, Link]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Link],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.Link.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Retrieves the relevant metadata for the panel and returns a property info array.
      *
      * @returns Array of copied property info
      */
    inline def retrieveAllMetadata(/**
      * Instance of a `Panel` control
      */
    oPanel: /* was: sap.ui.mdc.link.Panel */ Any): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("retrieveAllMetadata")(oPanel.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Retrieves the items that are initially part of the baseline which is used when a reset is done.
      *
      * @returns Array containing the `ID` and `visible` property of every {@link sap.ui.mdc.link.LinkItem}
      */
    inline def retrieveBaseline(/**
      * Instance of a `Panel` control
      */
    oPanel: /* was: sap.ui.mdc.link.Panel */ Any): js.Array[BaseLineObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("retrieveBaseline")(oPanel.asInstanceOf[js.Any]).asInstanceOf[js.Array[BaseLineObject]]
  }
  
  trait BaseLineObject extends StObject {
    
    /**
      * ID of a base line {@link sap.ui.mdc.link.LinkItem}
      */
    var id: String
    
    /**
      * Visibility of a base line {@link sap.ui.mdc.link.LinkItem}
      */
    var visible: Boolean
  }
  object BaseLineObject {
    
    inline def apply(id: String, visible: Boolean): BaseLineObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseLineObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseLineObject] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectLinkObject extends StObject {
    
    /**
      * The href of the retrieved direct link
      */
    var href: String
    
    /**
      * The target of the retrieved direct link
      */
    var target: String
  }
  object DirectLinkObject {
    
    inline def apply(href: String, target: String): DirectLinkObject = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectLinkObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectLinkObject] (val x: Self) extends AnyVal {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Link
    extends typings.openui5.sapUiMdcFieldFieldInfoBaseMod.default {
    
    /**
      * Gets current value of property {@link #getEnablePersonalization enablePersonalization}.
      *
      * Enables/disables the personalization settings for users and key users.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enablePersonalization`
      */
    def getEnablePersonalization(): Boolean = js.native
    
    /**
      *
      * @returns Resolves an array of type {@link sap.ui.core.Control}
      */
    def retrieveAdditionalContent(): js.Promise[js.Array[typings.openui5.sapUiCoreControlMod.default]] = js.native
    
    /**
      * Calls the `modifyLinkItems` function of `Delegate` before returning the `LinkItem` objects.
      *
      * @returns Resolves an array of type {@link sap.ui.mdc.link.LinkItem}
      */
    def retrieveLinkItems(): js.Promise[js.Array[typings.openui5.sapUiMdcLinkLinkItemMod.default]] = js.native
    
    /**
      *
      * @returns Returns `undefined` or a {@link sap.ui.mdc.link.LinkType}, once resolved
      */
    def retrieveLinkType(): js.Promise[js.UndefOr[LinkType]] = js.native
    
    /**
      * @experimental
      *
      * Sets a new value for property {@link #getDelegate delegate}.
      *
      * Path to `LinkDelegate` module that provides the required APIs to create content for the `Link` control.
      *  **Note:** Ensure that the related file can be requested (any required library has to be loaded before
      * that).
      *  Do not bind or modify the module. Once the required module is associated, this property might not be
      * needed any longer.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `...see text or source`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDelegate(): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnablePersonalization enablePersonalization}.
      *
      * Enables/disables the personalization settings for users and key users.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnablePersonalization(): this.type = js.native
    def setEnablePersonalization(/**
      * New value for property `enablePersonalization`
      */
    bEnablePersonalization: Boolean): this.type = js.native
    
    def setSourceControl(
      /**
      * ID of an element which becomes the new target of this sourceControl association; alternatively, an element
      * instance may be given
      */
    oSourceControl: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getSourceControl sourceControl}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSourceControl(
      /**
      * ID of an element which becomes the new target of this sourceControl association; alternatively, an element
      * instance may be given
      */
    oSourceControl: ID
    ): this.type = js.native
  }
  
  trait LinkSettings
    extends StObject
       with FieldInfoBaseSettings {
    
    /**
      * Enables/disables the personalization settings for users and key users.
      */
    var enablePersonalization: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Gets the app component required for link personalization. Also, the source control is used to get the
      * binding context.
      */
    var sourceControl: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
  }
  object LinkSettings {
    
    inline def apply(): LinkSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkSettings] (val x: Self) extends AnyVal {
      
      inline def setEnablePersonalization(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enablePersonalization", value.asInstanceOf[js.Any])
      
      inline def setEnablePersonalizationUndefined: Self = StObject.set(x, "enablePersonalization", js.undefined)
      
      inline def setSourceControl(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "sourceControl", value.asInstanceOf[js.Any])
      
      inline def setSourceControlUndefined: Self = StObject.set(x, "sourceControl", js.undefined)
    }
  }
  
  trait LinkType extends StObject {
    
    /**
      * Instance of {@link sap.ui.mdc.link.LinkItem} that is used for direct navigation
      */
    var directLink: typings.openui5.sapUiMdcLinkLinkItemMod.default
    
    /**
      * Text | DirectLink | Popup (default)
      */
    var `type`: typings.openui5.sapUiMdcEnumsLinkTypeMod.LinkType
  }
  object LinkType {
    
    inline def apply(
      directLink: typings.openui5.sapUiMdcLinkLinkItemMod.default,
      `type`: typings.openui5.sapUiMdcEnumsLinkTypeMod.LinkType
    ): LinkType = {
      val __obj = js.Dynamic.literal(directLink = directLink.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkType] (val x: Self) extends AnyVal {
      
      inline def setDirectLink(value: typings.openui5.sapUiMdcLinkLinkItemMod.default): Self = StObject.set(x, "directLink", value.asInstanceOf[js.Any])
      
      inline def setType(value: typings.openui5.sapUiMdcEnumsLinkTypeMod.LinkType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LinkTypeWrapper extends StObject {
    
    /**
      * Initial {@link sap.ui.mdc.link.LinkType}
      */
    var initialType: LinkType
    
    /**
      * Optional `Promise` that resolves into the {@link sap.ui.mdc.link.LinkType} that overwrites the initial
      * {@link sap.ui.mdc.link.LinkType}.
      */
    var runtimeType: js.Promise[LinkType]
  }
  object LinkTypeWrapper {
    
    inline def apply(initialType: LinkType, runtimeType: js.Promise[LinkType]): LinkTypeWrapper = {
      val __obj = js.Dynamic.literal(initialType = initialType.asInstanceOf[js.Any], runtimeType = runtimeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkTypeWrapper]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkTypeWrapper] (val x: Self) extends AnyVal {
      
      inline def setInitialType(value: LinkType): Self = StObject.set(x, "initialType", value.asInstanceOf[js.Any])
      
      inline def setRuntimeType(value: js.Promise[LinkType]): Self = StObject.set(x, "runtimeType", value.asInstanceOf[js.Any])
    }
  }
}
