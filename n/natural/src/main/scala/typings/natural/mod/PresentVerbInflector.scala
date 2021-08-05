package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PresentVerbInflector extends StObject {
  
  def pluralize(token: String): String
  
  def singularize(token: String): String
}
object PresentVerbInflector {
  
  inline def apply(pluralize: String => String, singularize: String => String): PresentVerbInflector = {
    val __obj = js.Dynamic.literal(pluralize = js.Any.fromFunction1(pluralize), singularize = js.Any.fromFunction1(singularize))
    __obj.asInstanceOf[PresentVerbInflector]
  }
  
  extension [Self <: PresentVerbInflector](x: Self) {
    
    inline def setPluralize(value: String => String): Self = StObject.set(x, "pluralize", js.Any.fromFunction1(value))
    
    inline def setSingularize(value: String => String): Self = StObject.set(x, "singularize", js.Any.fromFunction1(value))
  }
}
