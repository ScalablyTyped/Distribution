package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stream extends StObject {
  
  var stream: js.UndefOr[Boolean] = js.undefined
}
object Stream {
  
  @scala.inline
  def apply(): Stream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stream]
  }
  
  @scala.inline
  implicit class StreamMutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
