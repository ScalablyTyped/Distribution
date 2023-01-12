package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiTestActionsActionMod.ActionSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestActionsPressMod {
  
  @JSImport("sap/ui/test/actions/Press", JSImport.Default)
  @js.native
  /**
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Press {
    def this(/**
      * Optional object with initial settings for the new instance
      */
    mSettings: PressSettings) = this()
    def this(/**
      * Optional ID for the new instance; generated automatically if no non-empty ID is given. Note: this can
      * be omitted, no matter whether `mSettings` are given or not!
      */
    sId: String) = this()
    def this(
      /**
      * Optional ID for the new instance; generated automatically if no non-empty ID is given. Note: this can
      * be omitted, no matter whether `mSettings` are given or not!
      */
    sId: String,
      /**
      * Optional object with initial settings for the new instance
      */
    mSettings: PressSettings
    ) = this()
    def this(
      /**
      * Optional ID for the new instance; generated automatically if no non-empty ID is given. Note: this can
      * be omitted, no matter whether `mSettings` are given or not!
      */
    sId: Unit,
      /**
      * Optional object with initial settings for the new instance
      */
    mSettings: PressSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/test/actions/Press", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @SINCE 1.63
      *
      * A map of ID suffixes for controls that require a special DOM reference for `Press` interaction.
      *
      * You can specify an ID suffix for specific controls in this map. The press action will be triggered on
      * the DOM element with the specified suffix.
      *
      * Here is a sublist of supported controls and their `Press` control adapter:
      * 	 - sap.m.ComboBox - Arrow button
      * 	 - sap.m.SearchField - Search Button
      * 	 - sap.m.Input - Value help
      * 	 - sap.m.List - More Button
      * 	 - sap.m.Table - More Button
      * 	 - sap.m.ObjectIdentifier - Title
      * 	 - sap.m.ObjectAttribute - Text
      * 	 - sap.m.Page - Back Button
      * 	 - sap.m.semantic.FullscreenPage - Back Button
      * 	 - sap.m.semantic.DetailPage - Back Button
      * 	 - sap.ui.comp.smartfilterbar.SmartFilterBar - Go Button
      */
    @JSImport("sap/ui/test/actions/Press", "default.controlAdapters")
    @js.native
    def controlAdapters: Record[String, String | (js.Function1[/* p1 */ this.type, String])] = js.native
    inline def controlAdapters_=(x: Record[String, String | (js.Function1[/* p1 */ this.type, String])]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlAdapters")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a new subclass of class sap.ui.test.actions.Press with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.test.actions.Action.extend}.
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
    oClassInfo: ClassInfo[T, Press]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Press],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.test.actions.Press.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait Press
    extends typings.openui5.sapUiTestActionsActionMod.default {
    
    /**
      * @SINCE 1.97
      *
      * Gets current value of property {@link #getAltKey altKey}.
      *
      * If it is set to `true`, the Alt Key modifier will be used
      *
      * @returns Value of property `altKey`
      */
    def getAltKey(): Boolean = js.native
    
    /**
      * @SINCE 1.97
      *
      * Gets current value of property {@link #getCtrlKey ctrlKey}.
      *
      * If it is set to `true`, the Control Key modifier will be used
      *
      * @returns Value of property `ctrlKey`
      */
    def getCtrlKey(): Boolean = js.native
    
    /**
      * @SINCE 1.97
      *
      * Gets current value of property {@link #getShiftKey shiftKey}.
      *
      * If it is set to `true`, the Shift Key modifier will be used
      *
      * @returns Value of property `shiftKey`
      */
    def getShiftKey(): Boolean = js.native
    
    /**
      * @SINCE 1.98
      *
      * Gets current value of property {@link #getXPercentage xPercentage}.
      *
      * Provide percent value for the X coordinate axis to calculate the position of the click event. The value
      * must be in the range [0 - 100]
      *
      * @returns Value of property `xPercentage`
      */
    def getXPercentage(): float = js.native
    
    /**
      * @SINCE 1.98
      *
      * Gets current value of property {@link #getYPercentage yPercentage}.
      *
      * Provide percent value for the Y coordinate axis to calculate the position of the click event. The value
      * must be in the range [0 - 100]
      *
      * @returns Value of property `yPercentage`
      */
    def getYPercentage(): float = js.native
    
    /**
      * @SINCE 1.97
      *
      * Sets a new value for property {@link #getAltKey altKey}.
      *
      * If it is set to `true`, the Alt Key modifier will be used
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAltKey(/**
      * New value for property `altKey`
      */
    bAltKey: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.97
      *
      * Sets a new value for property {@link #getCtrlKey ctrlKey}.
      *
      * If it is set to `true`, the Control Key modifier will be used
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCtrlKey(/**
      * New value for property `ctrlKey`
      */
    bCtrlKey: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.97
      *
      * Sets a new value for property {@link #getShiftKey shiftKey}.
      *
      * If it is set to `true`, the Shift Key modifier will be used
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShiftKey(/**
      * New value for property `shiftKey`
      */
    bShiftKey: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.98
      *
      * Sets a new value for property {@link #getXPercentage xPercentage}.
      *
      * Provide percent value for the X coordinate axis to calculate the position of the click event. The value
      * must be in the range [0 - 100]
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setXPercentage(/**
      * New value for property `xPercentage`
      */
    fXPercentage: float): this.type = js.native
    
    /**
      * @SINCE 1.98
      *
      * Sets a new value for property {@link #getYPercentage yPercentage}.
      *
      * Provide percent value for the Y coordinate axis to calculate the position of the click event. The value
      * must be in the range [0 - 100]
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setYPercentage(/**
      * New value for property `yPercentage`
      */
    fYPercentage: float): this.type = js.native
  }
  
  trait PressSettings
    extends StObject
       with ActionSettings {
    
    /**
      * @SINCE 1.97
      *
      * If it is set to `true`, the Alt Key modifier will be used
      */
    var altKey: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.97
      *
      * If it is set to `true`, the Control Key modifier will be used
      */
    var ctrlKey: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.97
      *
      * If it is set to `true`, the Shift Key modifier will be used
      */
    var shiftKey: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.98
      *
      * Provide percent value for the X coordinate axis to calculate the position of the click event. The value
      * must be in the range [0 - 100]
      */
    var xPercentage: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.98
      *
      * Provide percent value for the Y coordinate axis to calculate the position of the click event. The value
      * must be in the range [0 - 100]
      */
    var yPercentage: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object PressSettings {
    
    inline def apply(): PressSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PressSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PressSettings] (val x: Self) extends AnyVal {
      
      inline def setAltKey(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
      
      inline def setCtrlKey(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
      
      inline def setShiftKey(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
      
      inline def setXPercentage(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "xPercentage", value.asInstanceOf[js.Any])
      
      inline def setXPercentageUndefined: Self = StObject.set(x, "xPercentage", js.undefined)
      
      inline def setYPercentage(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "yPercentage", value.asInstanceOf[js.Any])
      
      inline def setYPercentageUndefined: Self = StObject.set(x, "yPercentage", js.undefined)
    }
  }
}
