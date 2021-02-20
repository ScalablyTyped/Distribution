package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonOtherPrimeInfo extends StObject {
  
  var d: String = js.native
  
  var r: String = js.native
  
  var t: String = js.native
}
object JsonOtherPrimeInfo {
  
  @scala.inline
  def apply(d: String, r: String, t: String): JsonOtherPrimeInfo = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonOtherPrimeInfo]
  }
  
  @scala.inline
  implicit class JsonOtherPrimeInfoMutableBuilder[Self <: JsonOtherPrimeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
