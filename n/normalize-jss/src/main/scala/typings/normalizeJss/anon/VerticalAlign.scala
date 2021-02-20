package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerticalAlign extends StObject {
  
  var borderStyle: String = js.native
  
  var verticalAlign: String = js.native
}
object VerticalAlign {
  
  @scala.inline
  def apply(borderStyle: String, verticalAlign: String): VerticalAlign = {
    val __obj = js.Dynamic.literal(borderStyle = borderStyle.asInstanceOf[js.Any], verticalAlign = verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalAlign]
  }
  
  @scala.inline
  implicit class VerticalAlignMutableBuilder[Self <: VerticalAlign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
  }
}
