package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlineOffset extends StObject {
  
  var appearance: String = js.native
  
  var outlineOffset: String = js.native
}
object OutlineOffset {
  
  @scala.inline
  def apply(appearance: String, outlineOffset: String): OutlineOffset = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], outlineOffset = outlineOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlineOffset]
  }
  
  @scala.inline
  implicit class OutlineOffsetMutableBuilder[Self <: OutlineOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppearance(value: String): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineOffset(value: String): Self = StObject.set(x, "outlineOffset", value.asInstanceOf[js.Any])
  }
}
