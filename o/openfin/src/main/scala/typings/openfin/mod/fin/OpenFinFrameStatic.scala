package typings.openfin.mod.fin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenFinFrameStatic extends StObject {
  
  def getCurrent(): OpenFinFrame = js.native
  
  def wrap(uuid: String, name: String): OpenFinFrame = js.native
}
object OpenFinFrameStatic {
  
  @scala.inline
  def apply(getCurrent: () => OpenFinFrame, wrap: (String, String) => OpenFinFrame): OpenFinFrameStatic = {
    val __obj = js.Dynamic.literal(getCurrent = js.Any.fromFunction0(getCurrent), wrap = js.Any.fromFunction2(wrap))
    __obj.asInstanceOf[OpenFinFrameStatic]
  }
  
  @scala.inline
  implicit class OpenFinFrameStaticMutableBuilder[Self <: OpenFinFrameStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCurrent(value: () => OpenFinFrame): Self = StObject.set(x, "getCurrent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWrap(value: (String, String) => OpenFinFrame): Self = StObject.set(x, "wrap", js.Any.fromFunction2(value))
  }
}
