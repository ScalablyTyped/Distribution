package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayVerticalAlign extends StObject {
  
  var display: String = js.native
  
  var verticalAlign: String = js.native
}
object DisplayVerticalAlign {
  
  @scala.inline
  def apply(display: String, verticalAlign: String): DisplayVerticalAlign = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], verticalAlign = verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayVerticalAlign]
  }
  
  @scala.inline
  implicit class DisplayVerticalAlignMutableBuilder[Self <: DisplayVerticalAlign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
  }
}
