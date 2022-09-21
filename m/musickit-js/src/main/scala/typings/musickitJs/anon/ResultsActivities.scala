package typings.musickitJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultsActivities extends StObject {
  
  var results: Activities
}
object ResultsActivities {
  
  inline def apply(results: Activities): ResultsActivities = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultsActivities]
  }
  
  extension [Self <: ResultsActivities](x: Self) {
    
    inline def setResults(value: Activities): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
