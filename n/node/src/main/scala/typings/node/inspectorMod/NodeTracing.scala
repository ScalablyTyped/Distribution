package typings.node.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeTracing {
  
  trait DataCollectedEventDataType extends StObject {
    
    var value: js.Array[js.Object]
  }
  object DataCollectedEventDataType {
    
    inline def apply(value: js.Array[js.Object]): DataCollectedEventDataType = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataCollectedEventDataType]
    }
    
    extension [Self <: DataCollectedEventDataType](x: Self) {
      
      inline def setValue(value: js.Array[js.Object]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: js.Object*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  trait GetCategoriesReturnType extends StObject {
    
    /**
      * A list of supported tracing categories.
      */
    var categories: js.Array[String]
  }
  object GetCategoriesReturnType {
    
    inline def apply(categories: js.Array[String]): GetCategoriesReturnType = {
      val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCategoriesReturnType]
    }
    
    extension [Self <: GetCategoriesReturnType](x: Self) {
      
      inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    }
  }
  
  trait StartParameterType extends StObject {
    
    var traceConfig: TraceConfig
  }
  object StartParameterType {
    
    inline def apply(traceConfig: TraceConfig): StartParameterType = {
      val __obj = js.Dynamic.literal(traceConfig = traceConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartParameterType]
    }
    
    extension [Self <: StartParameterType](x: Self) {
      
      inline def setTraceConfig(value: TraceConfig): Self = StObject.set(x, "traceConfig", value.asInstanceOf[js.Any])
    }
  }
  
  trait TraceConfig extends StObject {
    
    /**
      * Included category filters.
      */
    var includedCategories: js.Array[String]
    
    /**
      * Controls how the trace buffer stores data.
      */
    var recordMode: js.UndefOr[String] = js.undefined
  }
  object TraceConfig {
    
    inline def apply(includedCategories: js.Array[String]): TraceConfig = {
      val __obj = js.Dynamic.literal(includedCategories = includedCategories.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraceConfig]
    }
    
    extension [Self <: TraceConfig](x: Self) {
      
      inline def setIncludedCategories(value: js.Array[String]): Self = StObject.set(x, "includedCategories", value.asInstanceOf[js.Any])
      
      inline def setIncludedCategoriesVarargs(value: String*): Self = StObject.set(x, "includedCategories", js.Array(value :_*))
      
      inline def setRecordMode(value: String): Self = StObject.set(x, "recordMode", value.asInstanceOf[js.Any])
      
      inline def setRecordModeUndefined: Self = StObject.set(x, "recordMode", js.undefined)
    }
  }
}
