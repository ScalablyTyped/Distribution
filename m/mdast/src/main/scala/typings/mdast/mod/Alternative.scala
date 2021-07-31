package typings.mdast.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alternative extends StObject {
  
  var alt: js.UndefOr[String] = js.undefined
}
object Alternative {
  
  @scala.inline
  def apply(): Alternative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alternative]
  }
  
  @scala.inline
  implicit class AlternativeMutableBuilder[Self <: Alternative] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
  }
}
