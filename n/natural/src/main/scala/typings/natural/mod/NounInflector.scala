package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NounInflector extends StObject {
  
  def pluralize(token: String): String
  
  def singularize(token: String): String
}
object NounInflector {
  
  inline def apply(pluralize: String => String, singularize: String => String): NounInflector = {
    val __obj = js.Dynamic.literal(pluralize = js.Any.fromFunction1(pluralize), singularize = js.Any.fromFunction1(singularize))
    __obj.asInstanceOf[NounInflector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NounInflector] (val x: Self) extends AnyVal {
    
    inline def setPluralize(value: String => String): Self = StObject.set(x, "pluralize", js.Any.fromFunction1(value))
    
    inline def setSingularize(value: String => String): Self = StObject.set(x, "singularize", js.Any.fromFunction1(value))
  }
}
