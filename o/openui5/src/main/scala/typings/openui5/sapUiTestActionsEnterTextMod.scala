package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiTestActionsActionMod.ActionSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestActionsEnterTextMod {
  
  @JSImport("sap/ui/test/actions/EnterText", JSImport.Default)
  @js.native
  /**
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends EnterText {
    def this(/**
      * Optional object with initial settings for the new instance
      */
    mSettings: EnterTextSettings) = this()
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
    mSettings: EnterTextSettings
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
    mSettings: EnterTextSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/test/actions/EnterText", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @SINCE 1.70
      *
      * A map of ID suffixes for controls that require a special DOM reference for `EnterText` interaction.
      *
      * You can specify an ID suffix for specific controls in this map. The enter text action will be triggered
      * on the DOM element with the specified suffix.
      *
      * Here is a sublist of supported controls and their `EnterText` control adapter:
      * 	 - sap.m.StepInput - internal Input
      */
    @JSImport("sap/ui/test/actions/EnterText", "default.controlAdapters")
    @js.native
    def controlAdapters: Record[String, String | (js.Function1[/* p1 */ this.type, String])] = js.native
    inline def controlAdapters_=(x: Record[String, String | (js.Function1[/* p1 */ this.type, String])]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlAdapters")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a new subclass of class sap.ui.test.actions.EnterText with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, EnterText]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, EnterText],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.test.actions.EnterText.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait EnterText
    extends typings.openui5.sapUiTestActionsActionMod.default {
    
    /**
      * @SINCE 1.38.0
      *
      * Gets current value of property {@link #getClearTextFirst clearTextFirst}.
      *
      * If it is set to `false`, the current text of the control will be preserved. By default, the current text
      * of the control will be cleared. When the text is going to be cleared, a delete character event will be
      * fired and then the value of the input is emptied. This will trigger a `liveChange` event on the input
      * with an empty value.
      *
      * Default value is `true`.
      *
      * @returns Value of property `clearTextFirst`
      */
    def getClearTextFirst(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getKeepFocus keepFocus}.
      *
      * Default value is `false`.
      *
      * @returns Value of property `keepFocus`
      */
    def getKeepFocus(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getPressEnterKey pressEnterKey}.
      *
      * Default value is `false`.
      *
      * @returns Value of property `pressEnterKey`
      */
    def getPressEnterKey(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * The Text that is going to be typed to the control. If you are entering an empty string, the value will
      * be cleared.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Sets a new value for property {@link #getClearTextFirst clearTextFirst}.
      *
      * If it is set to `false`, the current text of the control will be preserved. By default, the current text
      * of the control will be cleared. When the text is going to be cleared, a delete character event will be
      * fired and then the value of the input is emptied. This will trigger a `liveChange` event on the input
      * with an empty value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setClearTextFirst(): this.type = js.native
    def setClearTextFirst(/**
      * New value for property `clearTextFirst`
      */
    bClearTextFirst: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getKeepFocus keepFocus}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setKeepFocus(): this.type = js.native
    def setKeepFocus(/**
      * New value for property `keepFocus`
      */
    bKeepFocus: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPressEnterKey pressEnterKey}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPressEnterKey(): this.type = js.native
    def setPressEnterKey(/**
      * New value for property `pressEnterKey`
      */
    bPressEnterKey: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * The Text that is going to be typed to the control. If you are entering an empty string, the value will
      * be cleared.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
  }
  
  trait EnterTextSettings
    extends StObject
       with ActionSettings {
    
    /**
      * @SINCE 1.38.0
      *
      * If it is set to `false`, the current text of the control will be preserved. By default, the current text
      * of the control will be cleared. When the text is going to be cleared, a delete character event will be
      * fired and then the value of the input is emptied. This will trigger a `liveChange` event on the input
      * with an empty value.
      */
    var clearTextFirst: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    var keepFocus: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    var pressEnterKey: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The Text that is going to be typed to the control. If you are entering an empty string, the value will
      * be cleared.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object EnterTextSettings {
    
    inline def apply(): EnterTextSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnterTextSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnterTextSettings] (val x: Self) extends AnyVal {
      
      inline def setClearTextFirst(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "clearTextFirst", value.asInstanceOf[js.Any])
      
      inline def setClearTextFirstUndefined: Self = StObject.set(x, "clearTextFirst", js.undefined)
      
      inline def setKeepFocus(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "keepFocus", value.asInstanceOf[js.Any])
      
      inline def setKeepFocusUndefined: Self = StObject.set(x, "keepFocus", js.undefined)
      
      inline def setPressEnterKey(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "pressEnterKey", value.asInstanceOf[js.Any])
      
      inline def setPressEnterKeyUndefined: Self = StObject.set(x, "pressEnterKey", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
