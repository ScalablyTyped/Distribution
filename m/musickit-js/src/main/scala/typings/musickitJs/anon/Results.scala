package typings.musickitJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Results extends StObject {
  
  var results: Songs
}
object Results {
  
  inline def apply(results: Songs): Results = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  
  extension [Self <: Results](x: Self) {
    
    inline def setResults(value: Songs): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
