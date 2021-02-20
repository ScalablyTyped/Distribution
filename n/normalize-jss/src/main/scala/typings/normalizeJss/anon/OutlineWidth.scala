package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlineWidth extends StObject {
  
  var outlineWidth: Double = js.native
}
object OutlineWidth {
  
  @scala.inline
  def apply(outlineWidth: Double): OutlineWidth = {
    val __obj = js.Dynamic.literal(outlineWidth = outlineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlineWidth]
  }
  
  @scala.inline
  implicit class OutlineWidthMutableBuilder[Self <: OutlineWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutlineWidth(value: Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
  }
}
