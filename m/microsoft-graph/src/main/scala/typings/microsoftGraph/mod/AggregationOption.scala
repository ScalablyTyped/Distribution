package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationOption extends StObject {
  
  // Specifies the criteria to compute an aggregation. Optional.
  var bucketDefinition: js.UndefOr[BucketAggregationDefinition] = js.undefined
  
  // Computes aggregation on the field while the field exists in current entity type. Required.
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * The number of searchBucket resources to be returned. This is not required when the range is provided manually in the
    * search request. Optional.
    */
  var size: js.UndefOr[NullableOption[Double]] = js.undefined
}
object AggregationOption {
  
  inline def apply(): AggregationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationOption]
  }
  
  extension [Self <: AggregationOption](x: Self) {
    
    inline def setBucketDefinition(value: BucketAggregationDefinition): Self = StObject.set(x, "bucketDefinition", value.asInstanceOf[js.Any])
    
    inline def setBucketDefinitionUndefined: Self = StObject.set(x, "bucketDefinition", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setSize(value: NullableOption[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
