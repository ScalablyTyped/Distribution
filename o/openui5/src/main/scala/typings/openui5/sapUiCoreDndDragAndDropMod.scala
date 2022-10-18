package typings.openui5

import typings.openui5.sapUiCoreElementMod.default
import typings.openui5.sapUiCoreLibraryMod.dnd.RelativeDropPosition
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreDndDragAndDropMod {
  
  trait DragSession extends StObject {
    
    var __implements__sap_ui_core_dnd_DragSession: Boolean
    
    /**
      * Returns the data that has been set via `setComplexData` method.
      *
      * @returns The previously set data or undefined
      */
    def getComplexData(/**
      * The key of the data
      */
    sKey: String): js.UndefOr[Any]
    
    /**
      * Returns the data that has been set via `setData` method.
      *
      * @returns Data
      */
    def getData(/**
      * The key of the data
      */
    sKey: String): String
    
    /**
      * Returns the dragged control, if available within the same UI5 application frame.
      */
    def getDragControl(): default | Null
    
    /**
      * The valid drop target underneath the dragged control.
      */
    def getDropControl(): default | Null
    
    /**
      * Returns the drop configuration corresponding to the drop control.
      */
    def getDropInfo(): typings.openui5.sapUiCoreDndDropInfoMod.default | Null
    
    /**
      * Returns the calculated position of the drop action relative to the valid dropped control.
      */
    def getDropPosition(): RelativeDropPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dnd.RelativeDropPosition * / any */ String)
    
    /**
      * Returns the drop indicator.
      *
      * @returns Drop indicator's DOM reference
      */
    def getIndicator(): HTMLElement | Null
    
    /**
      * Returns the visual configuration of the drop indicator.
      *
      * @returns Drop indicator configuration
      */
    def getIndicatorConfig(): js.Object
    
    /**
      * Returns the data that has been set via `setTextData` method.
      *
      * @returns Data
      */
    def getTextData(): String
    
    /**
      * Sets any type of data (even functions, pointers, anything non-serializable) with any MIME type. **Note:**
      * This works only within a UI5 application within the same window/frame.
      */
    def setComplexData(/**
      * The key of the data
      */
    sKey: String, /**
      * Data
      */
    vData: Any): Unit
    
    /**
      * Sets string data with any MIME type. **Note:** This works if you navigate between different windows.
      */
    def setData(/**
      * The key of the data
      */
    sKey: String, /**
      * Data
      */
    sData: String): Unit
    
    /**
      * Set the valid drop control.
      */
    def setDropControl(): Unit
    
    /**
      * Defines the visual configuration of the drop indicator for the current `DropInfo`.
      */
    def setIndicatorConfig(/**
      * Custom styles of the drop indicator.
      */
    mConfig: js.Object): Unit
    
    /**
      * Sets string data with plain text MIME type. **Note:** This works if you navigate between different windows.
      */
    def setTextData(/**
      * Data
      */
    sData: String): Unit
  }
  object DragSession {
    
    inline def apply(
      __implements__sap_ui_core_dnd_DragSession: Boolean,
      getComplexData: String => js.UndefOr[Any],
      getData: String => String,
      getDragControl: () => default | Null,
      getDropControl: () => default | Null,
      getDropInfo: () => typings.openui5.sapUiCoreDndDropInfoMod.default | Null,
      getDropPosition: () => RelativeDropPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dnd.RelativeDropPosition * / any */ String),
      getIndicator: () => HTMLElement | Null,
      getIndicatorConfig: () => js.Object,
      getTextData: () => String,
      setComplexData: (String, Any) => Unit,
      setData: (String, String) => Unit,
      setDropControl: () => Unit,
      setIndicatorConfig: js.Object => Unit,
      setTextData: String => Unit
    ): DragSession = {
      val __obj = js.Dynamic.literal(__implements__sap_ui_core_dnd_DragSession = __implements__sap_ui_core_dnd_DragSession.asInstanceOf[js.Any], getComplexData = js.Any.fromFunction1(getComplexData), getData = js.Any.fromFunction1(getData), getDragControl = js.Any.fromFunction0(getDragControl), getDropControl = js.Any.fromFunction0(getDropControl), getDropInfo = js.Any.fromFunction0(getDropInfo), getDropPosition = js.Any.fromFunction0(getDropPosition), getIndicator = js.Any.fromFunction0(getIndicator), getIndicatorConfig = js.Any.fromFunction0(getIndicatorConfig), getTextData = js.Any.fromFunction0(getTextData), setComplexData = js.Any.fromFunction2(setComplexData), setData = js.Any.fromFunction2(setData), setDropControl = js.Any.fromFunction0(setDropControl), setIndicatorConfig = js.Any.fromFunction1(setIndicatorConfig), setTextData = js.Any.fromFunction1(setTextData))
      __obj.asInstanceOf[DragSession]
    }
    
    extension [Self <: DragSession](x: Self) {
      
      inline def setGetComplexData(value: String => js.UndefOr[Any]): Self = StObject.set(x, "getComplexData", js.Any.fromFunction1(value))
      
      inline def setGetData(value: String => String): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
      
      inline def setGetDragControl(value: () => default | Null): Self = StObject.set(x, "getDragControl", js.Any.fromFunction0(value))
      
      inline def setGetDropControl(value: () => default | Null): Self = StObject.set(x, "getDropControl", js.Any.fromFunction0(value))
      
      inline def setGetDropInfo(value: () => typings.openui5.sapUiCoreDndDropInfoMod.default | Null): Self = StObject.set(x, "getDropInfo", js.Any.fromFunction0(value))
      
      inline def setGetDropPosition(
        value: () => RelativeDropPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dnd.RelativeDropPosition * / any */ String)
      ): Self = StObject.set(x, "getDropPosition", js.Any.fromFunction0(value))
      
      inline def setGetIndicator(value: () => HTMLElement | Null): Self = StObject.set(x, "getIndicator", js.Any.fromFunction0(value))
      
      inline def setGetIndicatorConfig(value: () => js.Object): Self = StObject.set(x, "getIndicatorConfig", js.Any.fromFunction0(value))
      
      inline def setGetTextData(value: () => String): Self = StObject.set(x, "getTextData", js.Any.fromFunction0(value))
      
      inline def setSetComplexData(value: (String, Any) => Unit): Self = StObject.set(x, "setComplexData", js.Any.fromFunction2(value))
      
      inline def setSetData(value: (String, String) => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction2(value))
      
      inline def setSetDropControl(value: () => Unit): Self = StObject.set(x, "setDropControl", js.Any.fromFunction0(value))
      
      inline def setSetIndicatorConfig(value: js.Object => Unit): Self = StObject.set(x, "setIndicatorConfig", js.Any.fromFunction1(value))
      
      inline def setSetTextData(value: String => Unit): Self = StObject.set(x, "setTextData", js.Any.fromFunction1(value))
      
      inline def set__implements__sap_ui_core_dnd_DragSession(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_core_dnd_DragSession", value.asInstanceOf[js.Any])
    }
  }
}
