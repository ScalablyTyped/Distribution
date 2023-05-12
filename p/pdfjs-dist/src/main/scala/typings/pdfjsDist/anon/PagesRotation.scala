package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagesRotation extends StObject {
  
  var pagesRotation: Any
}
object PagesRotation {
  
  inline def apply(pagesRotation: Any): PagesRotation = {
    val __obj = js.Dynamic.literal(pagesRotation = pagesRotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagesRotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PagesRotation] (val x: Self) extends AnyVal {
    
    inline def setPagesRotation(value: Any): Self = StObject.set(x, "pagesRotation", value.asInstanceOf[js.Any])
  }
}
