package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfIdfTerm extends StObject {
  
  var term: String
  
  var tfidf: Double
}
object TfIdfTerm {
  
  inline def apply(term: String, tfidf: Double): TfIdfTerm = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any], tfidf = tfidf.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfIdfTerm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TfIdfTerm] (val x: Self) extends AnyVal {
    
    inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTfidf(value: Double): Self = StObject.set(x, "tfidf", value.asInstanceOf[js.Any])
  }
}
