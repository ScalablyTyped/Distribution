package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PresentVerbInflector extends StObject {
  
  def pluralize(token: String): String = js.native
  
  def singularize(token: String): String = js.native
}
object PresentVerbInflector {
  
  @scala.inline
  def apply(pluralize: String => String, singularize: String => String): PresentVerbInflector = {
    val __obj = js.Dynamic.literal(pluralize = js.Any.fromFunction1(pluralize), singularize = js.Any.fromFunction1(singularize))
    __obj.asInstanceOf[PresentVerbInflector]
  }
  
  @scala.inline
  implicit class PresentVerbInflectorMutableBuilder[Self <: PresentVerbInflector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPluralize(value: String => String): Self = StObject.set(x, "pluralize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSingularize(value: String => String): Self = StObject.set(x, "singularize", js.Any.fromFunction1(value))
  }
}
