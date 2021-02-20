package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateResponse extends StObject {
  
  /** A list of buckets containing the aggregated data. */
  var bucket: js.UndefOr[js.Array[AggregateBucket]] = js.native
}
object AggregateResponse {
  
  @scala.inline
  def apply(): AggregateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateResponse]
  }
  
  @scala.inline
  implicit class AggregateResponseMutableBuilder[Self <: AggregateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: js.Array[AggregateBucket]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    @scala.inline
    def setBucketVarargs(value: AggregateBucket*): Self = StObject.set(x, "bucket", js.Array(value :_*))
  }
}
