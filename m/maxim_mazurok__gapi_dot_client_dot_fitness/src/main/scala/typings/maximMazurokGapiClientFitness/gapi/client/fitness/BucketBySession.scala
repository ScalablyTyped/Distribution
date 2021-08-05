package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketBySession extends StObject {
  
  /** Specifies that only sessions of duration longer than minDurationMillis are considered and used as a container for aggregated data. */
  var minDurationMillis: js.UndefOr[String] = js.undefined
}
object BucketBySession {
  
  inline def apply(): BucketBySession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketBySession]
  }
  
  extension [Self <: BucketBySession](x: Self) {
    
    inline def setMinDurationMillis(value: String): Self = StObject.set(x, "minDurationMillis", value.asInstanceOf[js.Any])
    
    inline def setMinDurationMillisUndefined: Self = StObject.set(x, "minDurationMillis", js.undefined)
  }
}
