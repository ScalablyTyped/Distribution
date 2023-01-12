package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFFlexibleColumnLayoutAccessibleLandmarkInfoMod {
  
  @JSImport("sap/f/FlexibleColumnLayoutAccessibleLandmarkInfo", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.f.FlexibleColumnLayoutAccessibleLandmarkInfo` element.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FlexibleColumnLayoutAccessibleLandmarkInfo {
    def this(/**
      * Initial settings for the new element
      */
    mSettings: FlexibleColumnLayoutAccessibleLandmarkInfoSettings) = this()
    def this(/**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new element
      */
    mSettings: FlexibleColumnLayoutAccessibleLandmarkInfoSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new element
      */
    mSettings: FlexibleColumnLayoutAccessibleLandmarkInfoSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/FlexibleColumnLayoutAccessibleLandmarkInfo", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.FlexibleColumnLayoutAccessibleLandmarkInfo with name `sClassName`
      * and enriches it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, FlexibleColumnLayoutAccessibleLandmarkInfo]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FlexibleColumnLayoutAccessibleLandmarkInfo],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.FlexibleColumnLayoutAccessibleLandmarkInfo.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FlexibleColumnLayoutAccessibleLandmarkInfo
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Gets current value of property {@link #getFirstColumnBackArrowLabel firstColumnBackArrowLabel}.
      *
      * Text that describes the landmark of the back arrow of the first column in the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      *
      * @returns Value of property `firstColumnBackArrowLabel`
      */
    def getFirstColumnBackArrowLabel(): String = js.native
    
    /**
      * Gets current value of property {@link #getFirstColumnLabel firstColumnLabel}.
      *
      * Text that describes the landmark of the first column of the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      *
      * @returns Value of property `firstColumnLabel`
      */
    def getFirstColumnLabel(): String = js.native
    
    /**
      * Gets current value of property {@link #getLastColumnForwardArrowLabel lastColumnForwardArrowLabel}.
      *
      * Text that describes the landmark of forward arrow of the last column in the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      *
      * @returns Value of property `lastColumnForwardArrowLabel`
      */
    def getLastColumnForwardArrowLabel(): String = js.native
    
    /**
      * Gets current value of property {@link #getLastColumnLabel lastColumnLabel}.
      *
      * Text that describes the landmark of the last column of the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      *
      * @returns Value of property `lastColumnLabel`
      */
    def getLastColumnLabel(): String = js.native
    
    /**
      * Gets current value of property {@link #getMiddleColumnBackArrowLabel middleColumnBackArrowLabel}.
      *
      * Text that describes the landmark of back arrow of the middle column in the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      *
      * @returns Value of property `middleColumnBackArrowLabel`
      */
    def getMiddleColumnBackArrowLabel(): String = js.native
    
    /**
      * Gets current value of property {@link #getMiddleColumnForwardArrowLabel middleColumnForwardArrowLabel}.
      *
      * Text that describes the landmark of forward arrow of the middle column in the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      *
      * @returns Value of property `middleColumnForwardArrowLabel`
      */
    def getMiddleColumnForwardArrowLabel(): String = js.native
    
    /**
      * Gets current value of property {@link #getMiddleColumnLabel middleColumnLabel}.
      *
      * Text that describes the landmark of the middle column of the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      *
      * @returns Value of property `middleColumnLabel`
      */
    def getMiddleColumnLabel(): String = js.native
    
    /**
      * Sets a new value for property {@link #getFirstColumnBackArrowLabel firstColumnBackArrowLabel}.
      *
      * Text that describes the landmark of the back arrow of the first column in the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFirstColumnBackArrowLabel(): this.type = js.native
    def setFirstColumnBackArrowLabel(/**
      * New value for property `firstColumnBackArrowLabel`
      */
    sFirstColumnBackArrowLabel: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFirstColumnLabel firstColumnLabel}.
      *
      * Text that describes the landmark of the first column of the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFirstColumnLabel(): this.type = js.native
    def setFirstColumnLabel(/**
      * New value for property `firstColumnLabel`
      */
    sFirstColumnLabel: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLastColumnForwardArrowLabel lastColumnForwardArrowLabel}.
      *
      * Text that describes the landmark of forward arrow of the last column in the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLastColumnForwardArrowLabel(): this.type = js.native
    def setLastColumnForwardArrowLabel(
      /**
      * New value for property `lastColumnForwardArrowLabel`
      */
    sLastColumnForwardArrowLabel: String
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLastColumnLabel lastColumnLabel}.
      *
      * Text that describes the landmark of the last column of the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLastColumnLabel(): this.type = js.native
    def setLastColumnLabel(/**
      * New value for property `lastColumnLabel`
      */
    sLastColumnLabel: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMiddleColumnBackArrowLabel middleColumnBackArrowLabel}.
      *
      * Text that describes the landmark of back arrow of the middle column in the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMiddleColumnBackArrowLabel(): this.type = js.native
    def setMiddleColumnBackArrowLabel(
      /**
      * New value for property `middleColumnBackArrowLabel`
      */
    sMiddleColumnBackArrowLabel: String
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMiddleColumnForwardArrowLabel middleColumnForwardArrowLabel}.
      *
      * Text that describes the landmark of forward arrow of the middle column in the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMiddleColumnForwardArrowLabel(): this.type = js.native
    def setMiddleColumnForwardArrowLabel(
      /**
      * New value for property `middleColumnForwardArrowLabel`
      */
    sMiddleColumnForwardArrowLabel: String
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMiddleColumnLabel middleColumnLabel}.
      *
      * Text that describes the landmark of the middle column of the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMiddleColumnLabel(): this.type = js.native
    def setMiddleColumnLabel(/**
      * New value for property `middleColumnLabel`
      */
    sMiddleColumnLabel: String): this.type = js.native
  }
  
  trait FlexibleColumnLayoutAccessibleLandmarkInfoSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Text that describes the landmark of the back arrow of the first column in the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      */
    var firstColumnBackArrowLabel: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Text that describes the landmark of the first column of the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      */
    var firstColumnLabel: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Text that describes the landmark of forward arrow of the last column in the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      */
    var lastColumnForwardArrowLabel: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Text that describes the landmark of the last column of the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      */
    var lastColumnLabel: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Text that describes the landmark of back arrow of the middle column in the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      */
    var middleColumnBackArrowLabel: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Text that describes the landmark of forward arrow of the middle column in the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      */
    var middleColumnForwardArrowLabel: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Text that describes the landmark of the middle column of the corresponding `sap.f.FlexibleColumnLayout`
      * control.
      *
      * If not set, a predefined text is used.
      */
    var middleColumnLabel: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object FlexibleColumnLayoutAccessibleLandmarkInfoSettings {
    
    inline def apply(): FlexibleColumnLayoutAccessibleLandmarkInfoSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexibleColumnLayoutAccessibleLandmarkInfoSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlexibleColumnLayoutAccessibleLandmarkInfoSettings] (val x: Self) extends AnyVal {
      
      inline def setFirstColumnBackArrowLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "firstColumnBackArrowLabel", value.asInstanceOf[js.Any])
      
      inline def setFirstColumnBackArrowLabelUndefined: Self = StObject.set(x, "firstColumnBackArrowLabel", js.undefined)
      
      inline def setFirstColumnLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "firstColumnLabel", value.asInstanceOf[js.Any])
      
      inline def setFirstColumnLabelUndefined: Self = StObject.set(x, "firstColumnLabel", js.undefined)
      
      inline def setLastColumnForwardArrowLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "lastColumnForwardArrowLabel", value.asInstanceOf[js.Any])
      
      inline def setLastColumnForwardArrowLabelUndefined: Self = StObject.set(x, "lastColumnForwardArrowLabel", js.undefined)
      
      inline def setLastColumnLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "lastColumnLabel", value.asInstanceOf[js.Any])
      
      inline def setLastColumnLabelUndefined: Self = StObject.set(x, "lastColumnLabel", js.undefined)
      
      inline def setMiddleColumnBackArrowLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "middleColumnBackArrowLabel", value.asInstanceOf[js.Any])
      
      inline def setMiddleColumnBackArrowLabelUndefined: Self = StObject.set(x, "middleColumnBackArrowLabel", js.undefined)
      
      inline def setMiddleColumnForwardArrowLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "middleColumnForwardArrowLabel", value.asInstanceOf[js.Any])
      
      inline def setMiddleColumnForwardArrowLabelUndefined: Self = StObject.set(x, "middleColumnForwardArrowLabel", js.undefined)
      
      inline def setMiddleColumnLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "middleColumnLabel", value.asInstanceOf[js.Any])
      
      inline def setMiddleColumnLabelUndefined: Self = StObject.set(x, "middleColumnLabel", js.undefined)
    }
  }
}
