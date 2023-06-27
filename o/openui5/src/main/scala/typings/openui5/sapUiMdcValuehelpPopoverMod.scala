package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.PopupInterface
import typings.openui5.sapUiMdcValuehelpBaseContainerMod.ContainerSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcValuehelpPopoverMod {
  
  @JSImport("sap/ui/mdc/valuehelp/Popover", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Popover` container.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Popover {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: PopoverSettings) = this()
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
    mSettings: PopoverSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: PopoverSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_PopupInterface: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/valuehelp/Popover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.valuehelp.Popover with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.mdc.valuehelp.base.Container.extend}.
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
    oClassInfo: ClassInfo[T, Popover]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Popover],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.valuehelp.Popover.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Popover
    extends typings.openui5.sapUiMdcValuehelpBaseContainerMod.default
       with PopupInterface {
    
    /**
      * @since 1.110.0
      *
      * Gets current value of property {@link #getOpensOnClick opensOnClick}.
      *
      * Controls the possibility to open this popover container by clicking on a connected control, even if no
      * content enforces it.
      *
      * **Note:** By default, a typeahead is only shown to provide suggestions when users enter input in a connected
      * control. This property enables scenarios, where popovers need to be shown earlier (e. g. recommendations
      * or recently entered values) Please also see {@link sap.ui.mdc.ValueHelpDelegate.showTypahead showTypahead}
      *
      * Default value is `false`.
      *
      * @returns Value of property `opensOnClick`
      */
    def getOpensOnClick(): Boolean = js.native
    
    /**
      * @since 1.112.0
      *
      * Gets current value of property {@link #getOpensOnFocus opensOnFocus}.
      *
      * Controls the possibility to open this popover container by focussing a connected control
      *
      * **Note:** By default, a typeahead is only shown to provide suggestions when users enter input in a connected
      * control. This property enables scenarios, where popovers need to be shown earlier (e. g. recommendations
      * or recently entered values) Please also see {@link sap.ui.mdc.ValueHelpDelegate.showTypahead showTypahead}
      *
      * Default value is `false`.
      *
      * @returns Value of property `opensOnFocus`
      */
    def getOpensOnFocus(): Boolean = js.native
    
    /**
      * @since 1.110.0
      *
      * Sets a new value for property {@link #getOpensOnClick opensOnClick}.
      *
      * Controls the possibility to open this popover container by clicking on a connected control, even if no
      * content enforces it.
      *
      * **Note:** By default, a typeahead is only shown to provide suggestions when users enter input in a connected
      * control. This property enables scenarios, where popovers need to be shown earlier (e. g. recommendations
      * or recently entered values) Please also see {@link sap.ui.mdc.ValueHelpDelegate.showTypahead showTypahead}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOpensOnClick(): this.type = js.native
    def setOpensOnClick(/**
      * New value for property `opensOnClick`
      */
    bOpensOnClick: Boolean): this.type = js.native
    
    /**
      * @since 1.112.0
      *
      * Sets a new value for property {@link #getOpensOnFocus opensOnFocus}.
      *
      * Controls the possibility to open this popover container by focussing a connected control
      *
      * **Note:** By default, a typeahead is only shown to provide suggestions when users enter input in a connected
      * control. This property enables scenarios, where popovers need to be shown earlier (e. g. recommendations
      * or recently entered values) Please also see {@link sap.ui.mdc.ValueHelpDelegate.showTypahead showTypahead}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOpensOnFocus(): this.type = js.native
    def setOpensOnFocus(/**
      * New value for property `opensOnFocus`
      */
    bOpensOnFocus: Boolean): this.type = js.native
  }
  
  trait PopoverSettings
    extends StObject
       with ContainerSettings {
    
    /**
      * @since 1.110.0
      *
      * Controls the possibility to open this popover container by clicking on a connected control, even if no
      * content enforces it.
      *
      * **Note:** By default, a typeahead is only shown to provide suggestions when users enter input in a connected
      * control. This property enables scenarios, where popovers need to be shown earlier (e. g. recommendations
      * or recently entered values) Please also see {@link sap.ui.mdc.ValueHelpDelegate.showTypahead showTypahead}
      */
    var opensOnClick: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.112.0
      *
      * Controls the possibility to open this popover container by focussing a connected control
      *
      * **Note:** By default, a typeahead is only shown to provide suggestions when users enter input in a connected
      * control. This property enables scenarios, where popovers need to be shown earlier (e. g. recommendations
      * or recently entered values) Please also see {@link sap.ui.mdc.ValueHelpDelegate.showTypahead showTypahead}
      */
    var opensOnFocus: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object PopoverSettings {
    
    inline def apply(): PopoverSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopoverSettings] (val x: Self) extends AnyVal {
      
      inline def setOpensOnClick(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "opensOnClick", value.asInstanceOf[js.Any])
      
      inline def setOpensOnClickUndefined: Self = StObject.set(x, "opensOnClick", js.undefined)
      
      inline def setOpensOnFocus(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "opensOnFocus", value.asInstanceOf[js.Any])
      
      inline def setOpensOnFocusUndefined: Self = StObject.set(x, "opensOnFocus", js.undefined)
    }
  }
}
