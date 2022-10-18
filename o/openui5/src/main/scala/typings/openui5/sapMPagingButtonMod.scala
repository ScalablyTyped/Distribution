package typings.openui5

import typings.openui5.anon.NewPosition
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMPagingButtonMod {
  
  @JSImport("sap/m/PagingButton", JSImport.Default)
  @js.native
  /**
    * Constructor for a new PagingButton.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends PagingButton {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: PagingButtonSettings) = this()
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
    mSettings: PagingButtonSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: PagingButtonSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/PagingButton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.PagingButton with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, PagingButton]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, PagingButton],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.PagingButton.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait PagingButton
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:positionChange positionChange} event of this
      * `sap.m.PagingButton`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PagingButton` itself.
      *
      * Fired when the current position is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPositionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPositionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.PagingButton` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:positionChange positionChange} event of this
      * `sap.m.PagingButton`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PagingButton` itself.
      *
      * Fired when the current position is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPositionChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPositionChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.PagingButton` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:positionChange positionChange} event of this
      * `sap.m.PagingButton`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPositionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPositionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Fires event {@link #event:positionChange positionChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePositionChange(): this.type = js.native
    def firePositionChange(/**
      * Parameters to pass along with the event
      */
    mParameters: NewPosition): this.type = js.native
    
    /**
      * Gets current value of property {@link #getCount count}.
      *
      * Determines the total count of items/entities that the control navigates through. The minimum number of
      * items/entities is 1.
      *
      * Default value is `1`.
      *
      * @returns Value of property `count`
      */
    def getCount(): int = js.native
    
    /**
      * @SINCE 1.36
      *
      * Gets current value of property {@link #getNextButtonTooltip nextButtonTooltip}.
      *
      * Determines the tooltip of the next button.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `nextButtonTooltip`
      */
    def getNextButtonTooltip(): String = js.native
    
    /**
      * Gets current value of property {@link #getPosition position}.
      *
      * Determines the current position in the items/entities that the control navigates through. Starting (minimum)
      * number is 1.
      *
      * Default value is `1`.
      *
      * @returns Value of property `position`
      */
    def getPosition(): int = js.native
    
    /**
      * @SINCE 1.36
      *
      * Gets current value of property {@link #getPreviousButtonTooltip previousButtonTooltip}.
      *
      * Determines the tooltip of the previous button.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `previousButtonTooltip`
      */
    def getPreviousButtonTooltip(): String = js.native
    
    /**
      * Sets a new value for property {@link #getCount count}.
      *
      * Determines the total count of items/entities that the control navigates through. The minimum number of
      * items/entities is 1.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCount(): this.type = js.native
    def setCount(/**
      * New value for property `count`
      */
    iCount: int): this.type = js.native
    
    /**
      * @SINCE 1.36
      *
      * Sets a new value for property {@link #getNextButtonTooltip nextButtonTooltip}.
      *
      * Determines the tooltip of the next button.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNextButtonTooltip(): this.type = js.native
    def setNextButtonTooltip(/**
      * New value for property `nextButtonTooltip`
      */
    sNextButtonTooltip: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPosition position}.
      *
      * Determines the current position in the items/entities that the control navigates through. Starting (minimum)
      * number is 1.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPosition(): this.type = js.native
    def setPosition(/**
      * New value for property `position`
      */
    iPosition: int): this.type = js.native
    
    /**
      * @SINCE 1.36
      *
      * Sets a new value for property {@link #getPreviousButtonTooltip previousButtonTooltip}.
      *
      * Determines the tooltip of the previous button.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPreviousButtonTooltip(): this.type = js.native
    def setPreviousButtonTooltip(/**
      * New value for property `previousButtonTooltip`
      */
    sPreviousButtonTooltip: String): this.type = js.native
  }
  
  trait PagingButtonSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Determines the total count of items/entities that the control navigates through. The minimum number of
      * items/entities is 1.
      */
    var count: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.36
      *
      * Determines the tooltip of the next button.
      */
    var nextButtonTooltip: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the current position in the items/entities that the control navigates through. Starting (minimum)
      * number is 1.
      */
    var position: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Fired when the current position is changed.
      */
    var positionChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.36
      *
      * Determines the tooltip of the previous button.
      */
    var previousButtonTooltip: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object PagingButtonSettings {
    
    inline def apply(): PagingButtonSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagingButtonSettings]
    }
    
    extension [Self <: PagingButtonSettings](x: Self) {
      
      inline def setCount(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setNextButtonTooltip(value: String | PropertyBindingInfo): Self = StObject.set(x, "nextButtonTooltip", value.asInstanceOf[js.Any])
      
      inline def setNextButtonTooltipUndefined: Self = StObject.set(x, "nextButtonTooltip", js.undefined)
      
      inline def setPosition(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "positionChange", js.Any.fromFunction1(value))
      
      inline def setPositionChangeUndefined: Self = StObject.set(x, "positionChange", js.undefined)
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPreviousButtonTooltip(value: String | PropertyBindingInfo): Self = StObject.set(x, "previousButtonTooltip", value.asInstanceOf[js.Any])
      
      inline def setPreviousButtonTooltipUndefined: Self = StObject.set(x, "previousButtonTooltip", js.undefined)
    }
  }
}
