package typings.musickitJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultsTerms extends StObject {
  
  var results: Terms
}
object ResultsTerms {
  
  inline def apply(results: Terms): ResultsTerms = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultsTerms]
  }
  
  extension [Self <: ResultsTerms](x: Self) {
    
    inline def setResults(value: Terms): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
