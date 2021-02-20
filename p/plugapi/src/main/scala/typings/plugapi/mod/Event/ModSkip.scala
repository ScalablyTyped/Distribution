package typings.plugapi.mod.Event

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModSkip extends StObject {
  
  var m: String = js.native
  
  var mi: Double = js.native
}
object ModSkip {
  
  @scala.inline
  def apply(m: String, mi: Double): ModSkip = {
    val __obj = js.Dynamic.literal(m = m.asInstanceOf[js.Any], mi = mi.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModSkip]
  }
  
  @scala.inline
  implicit class ModSkipMutableBuilder[Self <: ModSkip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setM(value: String): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMi(value: Double): Self = StObject.set(x, "mi", value.asInstanceOf[js.Any])
  }
}
