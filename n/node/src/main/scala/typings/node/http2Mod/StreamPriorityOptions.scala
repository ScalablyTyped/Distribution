package typings.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamPriorityOptions extends StObject {
  
  var exclusive: js.UndefOr[Boolean] = js.undefined
  
  var parent: js.UndefOr[Double] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var weight: js.UndefOr[Double] = js.undefined
}
object StreamPriorityOptions {
  
  @scala.inline
  def apply(): StreamPriorityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamPriorityOptions]
  }
  
  @scala.inline
  implicit class StreamPriorityOptionsMutableBuilder[Self <: StreamPriorityOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    @scala.inline
    def setParent(value: Double): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
