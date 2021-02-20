package typings.node.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeTracing {
  
  @js.native
  trait DataCollectedEventDataType extends StObject {
    
    var value: js.Array[js.Object] = js.native
  }
  object DataCollectedEventDataType {
    
    @scala.inline
    def apply(value: js.Array[js.Object]): DataCollectedEventDataType = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataCollectedEventDataType]
    }
    
    @scala.inline
    implicit class DataCollectedEventDataTypeMutableBuilder[Self <: DataCollectedEventDataType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Array[js.Object]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: js.Object*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetCategoriesReturnType extends StObject {
    
    /**
      * A list of supported tracing categories.
      */
    var categories: js.Array[String] = js.native
  }
  object GetCategoriesReturnType {
    
    @scala.inline
    def apply(categories: js.Array[String]): GetCategoriesReturnType = {
      val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCategoriesReturnType]
    }
    
    @scala.inline
    implicit class GetCategoriesReturnTypeMutableBuilder[Self <: GetCategoriesReturnType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    }
  }
  
  @js.native
  trait StartParameterType extends StObject {
    
    var traceConfig: TraceConfig = js.native
  }
  object StartParameterType {
    
    @scala.inline
    def apply(traceConfig: TraceConfig): StartParameterType = {
      val __obj = js.Dynamic.literal(traceConfig = traceConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartParameterType]
    }
    
    @scala.inline
    implicit class StartParameterTypeMutableBuilder[Self <: StartParameterType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTraceConfig(value: TraceConfig): Self = StObject.set(x, "traceConfig", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TraceConfig extends StObject {
    
    /**
      * Included category filters.
      */
    var includedCategories: js.Array[String] = js.native
    
    /**
      * Controls how the trace buffer stores data.
      */
    var recordMode: js.UndefOr[String] = js.native
  }
  object TraceConfig {
    
    @scala.inline
    def apply(includedCategories: js.Array[String]): TraceConfig = {
      val __obj = js.Dynamic.literal(includedCategories = includedCategories.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraceConfig]
    }
    
    @scala.inline
    implicit class TraceConfigMutableBuilder[Self <: TraceConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludedCategories(value: js.Array[String]): Self = StObject.set(x, "includedCategories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludedCategoriesVarargs(value: String*): Self = StObject.set(x, "includedCategories", js.Array(value :_*))
      
      @scala.inline
      def setRecordMode(value: String): Self = StObject.set(x, "recordMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordModeUndefined: Self = StObject.set(x, "recordMode", js.undefined)
    }
  }
}
