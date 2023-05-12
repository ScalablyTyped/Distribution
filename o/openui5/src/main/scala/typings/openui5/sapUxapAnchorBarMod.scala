package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.BackgroundDesign
import typings.openui5.sapMToolbarMod.ToolbarSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUxapAnchorBarMod {
  
  @JSImport("sap/uxap/AnchorBar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `AnchorBar`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:370b67986497463187336fa130aebbf1 Anchor Bar}
    */
  open class default () extends AnchorBar {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: AnchorBarSettings) = this()
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
    mSettings: AnchorBarSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: AnchorBarSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/uxap/AnchorBar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.uxap.AnchorBar with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.Toolbar.extend}.
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
    oClassInfo: ClassInfo[T, AnchorBar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, AnchorBar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.uxap.AnchorBar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait AnchorBar
    extends typings.openui5.sapMToolbarMod.default {
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * This method is a hook for the RenderManager that gets called during the rendering of child Controls.
      * It allows to add, remove and update existing accessibility attributes (ARIA) of those controls.
      */
    def enhanceAccessibilityState(
      /**
      * The Control that gets rendered by the RenderManager
      */
    oElement: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The mapping of "aria-" prefixed attributes
      */
    mAriaProps: js.Object
    ): Unit = js.native
    
    /**
      * @SINCE 1.58
      *
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Determines the background color of the `AnchorBar`.
      *
      * **Note:** The default value of `backgroundDesign` property is null. If the property is not set, the color
      * of the background is `@sapUiObjectHeaderBackground`, which depends on the specific theme.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) = js.native
    
    /**
      * Returns an sap.ui.core.delegate.ScrollEnablement object used to handle scrolling.
      *
      * @returns The `sap.ui.core.delegate.ScrollEnablement` instance
      */
    def getScrollDelegate(): typings.openui5.sapUiCoreDelegateScrollEnablementMod.default = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getSelectedButton selectedButton},
      * or `null`.
      */
    def getSelectedButton(): ID = js.native
    
    /**
      * Gets current value of property {@link #getShowPopover showPopover}.
      *
      * Determines whether to show a Popover with Subsection links when clicking on Section links in the Anchor
      * bar.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showPopover`
      */
    def getShowPopover(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getUpperCase upperCase}.
      *
      * Determines whether the Anchor bar items are displayed in upper case.
      *
      * Default value is `false`.
      *
      * @returns Value of property `upperCase`
      */
    def getUpperCase(): Boolean = js.native
    
    /**
      * Scrolls to the currently selected Section tab, when the header titles is snapped/unsnapped
      */
    def scrollToCurrentlySelectedSection(): Unit = js.native
    
    /**
      * Scroll to a specific Section.
      */
    def scrollToSection(/**
      * The Section ID to scroll to
      */
    sId: String): Unit = js.native
    def scrollToSection(
      /**
      * The Section ID to scroll to
      */
    sId: String,
      /**
      * Scroll duration (in ms)
      */
    iDuration: int
    ): Unit = js.native
    
    def setBackgroundDesign(
      /**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String
    ): this.type = js.native
    /**
      * @SINCE 1.58
      *
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Determines the background color of the `AnchorBar`.
      *
      * **Note:** The default value of `backgroundDesign` property is null. If the property is not set, the color
      * of the background is `@sapUiObjectHeaderBackground`, which depends on the specific theme.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundDesign(/**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: BackgroundDesign): this.type = js.native
    
    def setSelectedButton(
      /**
      * ID of an element which becomes the new target of this selectedButton association; alternatively, an element
      * instance may be given
      */
    oSelectedButton: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getSelectedButton selectedButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectedButton(
      /**
      * ID of an element which becomes the new target of this selectedButton association; alternatively, an element
      * instance may be given
      */
    oSelectedButton: ID
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowPopover showPopover}.
      *
      * Determines whether to show a Popover with Subsection links when clicking on Section links in the Anchor
      * bar.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowPopover(): this.type = js.native
    def setShowPopover(/**
      * New value for property `showPopover`
      */
    bShowPopover: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUpperCase upperCase}.
      *
      * Determines whether the Anchor bar items are displayed in upper case.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUpperCase(): this.type = js.native
    def setUpperCase(/**
      * New value for property `upperCase`
      */
    bUpperCase: Boolean): this.type = js.native
  }
  
  trait AnchorBarSettings
    extends StObject
       with ToolbarSettings {
    
    /**
      * @SINCE 1.58
      *
      * Determines the background color of the `AnchorBar`.
      *
      * **Note:** The default value of `backgroundDesign` property is null. If the property is not set, the color
      * of the background is `@sapUiObjectHeaderBackground`, which depends on the specific theme.
      */
    var backgroundDesign: js.UndefOr[
        BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The button that represents the Section being scrolled by the user.
      */
    var selectedButton: js.UndefOr[typings.openui5.sapMButtonMod.default | String] = js.undefined
    
    /**
      * Determines whether to show a Popover with Subsection links when clicking on Section links in the Anchor
      * bar.
      */
    var showPopover: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the Anchor bar items are displayed in upper case.
      */
    var upperCase: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object AnchorBarSettings {
    
    inline def apply(): AnchorBarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorBarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnchorBarSettings] (val x: Self) extends AnyVal {
      
      inline def setBackgroundDesign(
        value: BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setSelectedButton(value: typings.openui5.sapMButtonMod.default | String): Self = StObject.set(x, "selectedButton", value.asInstanceOf[js.Any])
      
      inline def setSelectedButtonUndefined: Self = StObject.set(x, "selectedButton", js.undefined)
      
      inline def setShowPopover(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showPopover", value.asInstanceOf[js.Any])
      
      inline def setShowPopoverUndefined: Self = StObject.set(x, "showPopover", js.undefined)
      
      inline def setUpperCase(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "upperCase", value.asInstanceOf[js.Any])
      
      inline def setUpperCaseUndefined: Self = StObject.set(x, "upperCase", js.undefined)
    }
  }
}
