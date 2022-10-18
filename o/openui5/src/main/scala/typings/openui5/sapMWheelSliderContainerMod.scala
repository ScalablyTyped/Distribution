package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMWheelSliderContainerMod {
  
  @JSImport("sap/m/WheelSliderContainer", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `WheelSliderContainer`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends WheelSliderContainer {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: WheelSliderContainerSettings) = this()
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
    mSettings: WheelSliderContainerSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: WheelSliderContainerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/WheelSliderContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.WheelSliderContainer with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, WheelSliderContainer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, WheelSliderContainer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.WheelSliderContainer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait WheelSliderContainer
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some slider to the aggregation {@link #getSliders sliders}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSlider(
      /**
      * The slider to add; if empty, nothing is inserted
      */
    oSlider: typings.openui5.sapMWheelSliderMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the sliders in the aggregation {@link #getSliders sliders}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySliders(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Sets the height of the container. If percentage value is used, the parent container must have specified
      * height.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getLabelText labelText}.
      *
      * Defines the text of the picker label.
      *
      * @returns Value of property `labelText`
      */
    def getLabelText(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getSliders sliders}.
      *
      * The sliders in the container.
      */
    def getSliders(): js.Array[typings.openui5.sapMWheelSliderMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Sets the width of the container. The minimum width is 320px.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.m.WheelSlider` in the aggregation {@link #getSliders sliders}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSlider(
      /**
      * The slider whose index is looked for
      */
    oSlider: typings.openui5.sapMWheelSliderMod.default
    ): int = js.native
    
    /**
      * Inserts a slider into the aggregation {@link #getSliders sliders}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSlider(
      /**
      * The slider to insert; if empty, nothing is inserted
      */
    oSlider: typings.openui5.sapMWheelSliderMod.default,
      /**
      * The `0`-based index the slider should be inserted at; for a negative value of `iIndex`, the slider is
      * inserted at position 0; for a value greater than the current size of the aggregation, the slider is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSliders sliders}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSliders(): js.Array[typings.openui5.sapMWheelSliderMod.default] = js.native
    
    def removeSlider(/**
      * The slider to remove or its index or id
      */
    vSlider: String): typings.openui5.sapMWheelSliderMod.default | Null = js.native
    /**
      * Removes a slider from the aggregation {@link #getSliders sliders}.
      *
      * @returns The removed slider or `null`
      */
    def removeSlider(/**
      * The slider to remove or its index or id
      */
    vSlider: int): typings.openui5.sapMWheelSliderMod.default | Null = js.native
    def removeSlider(
      /**
      * The slider to remove or its index or id
      */
    vSlider: typings.openui5.sapMWheelSliderMod.default
    ): typings.openui5.sapMWheelSliderMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Sets the height of the container. If percentage value is used, the parent container must have specified
      * height.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLabelText labelText}.
      *
      * Defines the text of the picker label.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabelText(/**
      * New value for property `labelText`
      */
    sLabelText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Sets the width of the container. The minimum width is 320px.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait WheelSliderContainerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Sets the height of the container. If percentage value is used, the parent container must have specified
      * height.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the text of the picker label.
      */
    var labelText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The sliders in the container.
      */
    var sliders: js.UndefOr[
        js.Array[typings.openui5.sapMWheelSliderMod.default] | typings.openui5.sapMWheelSliderMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the width of the container. The minimum width is 320px.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object WheelSliderContainerSettings {
    
    inline def apply(): WheelSliderContainerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WheelSliderContainerSettings]
    }
    
    extension [Self <: WheelSliderContainerSettings](x: Self) {
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLabelText(value: String | PropertyBindingInfo): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      inline def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
      
      inline def setSliders(
        value: js.Array[typings.openui5.sapMWheelSliderMod.default] | typings.openui5.sapMWheelSliderMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "sliders", value.asInstanceOf[js.Any])
      
      inline def setSlidersUndefined: Self = StObject.set(x, "sliders", js.undefined)
      
      inline def setSlidersVarargs(value: typings.openui5.sapMWheelSliderMod.default*): Self = StObject.set(x, "sliders", js.Array(value*))
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
