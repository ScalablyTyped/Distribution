package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderBottom extends StObject {
  
  var borderBottom: String = js.native
  
  var textDecoration: String = js.native
}
object BorderBottom {
  
  @scala.inline
  def apply(borderBottom: String, textDecoration: String): BorderBottom = {
    val __obj = js.Dynamic.literal(borderBottom = borderBottom.asInstanceOf[js.Any], textDecoration = textDecoration.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottom]
  }
  
  @scala.inline
  implicit class BorderBottomMutableBuilder[Self <: BorderBottom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderBottom(value: String): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
  }
}
