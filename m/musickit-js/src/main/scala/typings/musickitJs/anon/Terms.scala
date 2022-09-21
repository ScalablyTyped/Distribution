package typings.musickitJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Terms extends StObject {
  
  var terms: js.Array[String]
}
object Terms {
  
  inline def apply(terms: js.Array[String]): Terms = {
    val __obj = js.Dynamic.literal(terms = terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Terms]
  }
  
  extension [Self <: Terms](x: Self) {
    
    inline def setTerms(value: js.Array[String]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsVarargs(value: String*): Self = StObject.set(x, "terms", js.Array(value*))
  }
}
