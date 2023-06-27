package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMButtonMod.Button$PressEventParameters
import typings.openui5.sapMButtonMod.ButtonSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMToggleButtonMod {
  
  @JSImport("sap/m/ToggleButton", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ToggleButton`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/button/ Toggle Button}
    */
  open class default () extends ToggleButton {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ToggleButtonSettings) = this()
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
    mSettings: ToggleButtonSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ToggleButtonSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ToggleButton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ToggleButton with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.Button.extend}.
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
    oClassInfo: ClassInfo[T, ToggleButton]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ToggleButton],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ToggleButton.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ToggleButton
    extends typings.openui5.sapMButtonMod.default {
    
    def firePress(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ToggleButton$PressEventParameters
    ): this.type = js.native
    
    /**
      * Gets current value of property {@link #getPressed pressed}.
      *
      * The property is “true” when the control is toggled. The default state of this property is "false".
      *
      * Default value is `false`.
      *
      * @returns Value of property `pressed`
      */
    def getPressed(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getPressed pressed}.
      *
      * The property is “true” when the control is toggled. The default state of this property is "false".
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPressed(): this.type = js.native
    def setPressed(/**
      * New value for property `pressed`
      */
    bPressed: Boolean): this.type = js.native
  }
  
  trait ToggleButton$PressEventParameters
    extends StObject
       with Button$PressEventParameters {
    
    /**
      * The current pressed state of the control.
      */
    var pressed: js.UndefOr[Boolean] = js.undefined
  }
  object ToggleButton$PressEventParameters {
    
    inline def apply(): ToggleButton$PressEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleButton$PressEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToggleButton$PressEventParameters] (val x: Self) extends AnyVal {
      
      inline def setPressed(value: Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
      
      inline def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
    }
  }
  
  type ToggleButtonPressEvent = typings.openui5.sapUiBaseEventMod.default[ToggleButton$PressEventParameters]
  
  type ToggleButtonPressEventParameters = ToggleButton$PressEventParameters
  
  trait ToggleButtonSettings
    extends StObject
       with ButtonSettings {
    
    /**
      * Fired when the user clicks or taps on the control.
      */
    @JSName("press")
    var press_ToggleButtonSettings: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ToggleButton$PressEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The property is “true” when the control is toggled. The default state of this property is "false".
      */
    var pressed: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ToggleButtonSettings {
    
    inline def apply(): ToggleButtonSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleButtonSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToggleButtonSettings] (val x: Self) extends AnyVal {
      
      inline def setPress(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ToggleButton$PressEventParameters] => Unit
      ): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setPressed(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
      
      inline def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
    }
  }
}
