package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait N extends StObject {
  
  //The total count of documents deleted.
  var n: js.UndefOr[Double] = js.native
  
  //Is 1 if the command executed correctly.
  var ok: js.UndefOr[Double] = js.native
}
object N {
  
  @scala.inline
  def apply(): N = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[N]
  }
  
  @scala.inline
  implicit class NMutableBuilder[Self <: N] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    @scala.inline
    def setOk(value: Double): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
  }
}
