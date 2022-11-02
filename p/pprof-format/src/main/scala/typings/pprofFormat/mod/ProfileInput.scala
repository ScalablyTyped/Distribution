package typings.pprofFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileInput extends StObject {
  
  var comment: js.UndefOr[js.Array[Numeric]] = js.undefined
  
  var defaultSampleType: js.UndefOr[Numeric] = js.undefined
  
  var dropFrames: js.UndefOr[Numeric] = js.undefined
  
  var durationNanos: js.UndefOr[Numeric] = js.undefined
  
  var function: js.UndefOr[js.Array[FunctionInput]] = js.undefined
  
  var keepFrames: js.UndefOr[Numeric] = js.undefined
  
  var location: js.UndefOr[js.Array[LocationInput]] = js.undefined
  
  var mapping: js.UndefOr[js.Array[MappingInput]] = js.undefined
  
  var period: js.UndefOr[Numeric] = js.undefined
  
  var periodType: js.UndefOr[ValueTypeInput] = js.undefined
  
  var sample: js.UndefOr[js.Array[SampleInput]] = js.undefined
  
  var sampleType: js.UndefOr[js.Array[ValueTypeInput]] = js.undefined
  
  var stringTable: js.UndefOr[StringTable | js.Array[String]] = js.undefined
  
  var timeNanos: js.UndefOr[Numeric] = js.undefined
}
object ProfileInput {
  
  inline def apply(): ProfileInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileInput]
  }
  
  extension [Self <: ProfileInput](x: Self) {
    
    inline def setComment(value: js.Array[Numeric]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCommentVarargs(value: Numeric*): Self = StObject.set(x, "comment", js.Array(value*))
    
    inline def setDefaultSampleType(value: Numeric): Self = StObject.set(x, "defaultSampleType", value.asInstanceOf[js.Any])
    
    inline def setDefaultSampleTypeUndefined: Self = StObject.set(x, "defaultSampleType", js.undefined)
    
    inline def setDropFrames(value: Numeric): Self = StObject.set(x, "dropFrames", value.asInstanceOf[js.Any])
    
    inline def setDropFramesUndefined: Self = StObject.set(x, "dropFrames", js.undefined)
    
    inline def setDurationNanos(value: Numeric): Self = StObject.set(x, "durationNanos", value.asInstanceOf[js.Any])
    
    inline def setDurationNanosUndefined: Self = StObject.set(x, "durationNanos", js.undefined)
    
    inline def setFunction(value: js.Array[FunctionInput]): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setFunctionVarargs(value: FunctionInput*): Self = StObject.set(x, "function", js.Array(value*))
    
    inline def setKeepFrames(value: Numeric): Self = StObject.set(x, "keepFrames", value.asInstanceOf[js.Any])
    
    inline def setKeepFramesUndefined: Self = StObject.set(x, "keepFrames", js.undefined)
    
    inline def setLocation(value: js.Array[LocationInput]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: LocationInput*): Self = StObject.set(x, "location", js.Array(value*))
    
    inline def setMapping(value: js.Array[MappingInput]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setMappingVarargs(value: MappingInput*): Self = StObject.set(x, "mapping", js.Array(value*))
    
    inline def setPeriod(value: Numeric): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodType(value: ValueTypeInput): Self = StObject.set(x, "periodType", value.asInstanceOf[js.Any])
    
    inline def setPeriodTypeUndefined: Self = StObject.set(x, "periodType", js.undefined)
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setSample(value: js.Array[SampleInput]): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
    
    inline def setSampleType(value: js.Array[ValueTypeInput]): Self = StObject.set(x, "sampleType", value.asInstanceOf[js.Any])
    
    inline def setSampleTypeUndefined: Self = StObject.set(x, "sampleType", js.undefined)
    
    inline def setSampleTypeVarargs(value: ValueTypeInput*): Self = StObject.set(x, "sampleType", js.Array(value*))
    
    inline def setSampleUndefined: Self = StObject.set(x, "sample", js.undefined)
    
    inline def setSampleVarargs(value: SampleInput*): Self = StObject.set(x, "sample", js.Array(value*))
    
    inline def setStringTable(value: StringTable | js.Array[String]): Self = StObject.set(x, "stringTable", value.asInstanceOf[js.Any])
    
    inline def setStringTableUndefined: Self = StObject.set(x, "stringTable", js.undefined)
    
    inline def setStringTableVarargs(value: String*): Self = StObject.set(x, "stringTable", js.Array(value*))
    
    inline def setTimeNanos(value: Numeric): Self = StObject.set(x, "timeNanos", value.asInstanceOf[js.Any])
    
    inline def setTimeNanosUndefined: Self = StObject.set(x, "timeNanos", js.undefined)
  }
}
