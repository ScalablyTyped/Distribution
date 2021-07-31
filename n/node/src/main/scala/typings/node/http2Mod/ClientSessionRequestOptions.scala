package typings.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientSessionRequestOptions extends StObject {
  
  var endStream: js.UndefOr[Boolean] = js.undefined
  
  var exclusive: js.UndefOr[Boolean] = js.undefined
  
  var parent: js.UndefOr[Double] = js.undefined
  
  var waitForTrailers: js.UndefOr[Boolean] = js.undefined
  
  var weight: js.UndefOr[Double] = js.undefined
}
object ClientSessionRequestOptions {
  
  @scala.inline
  def apply(): ClientSessionRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSessionRequestOptions]
  }
  
  @scala.inline
  implicit class ClientSessionRequestOptionsMutableBuilder[Self <: ClientSessionRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndStream(value: Boolean): Self = StObject.set(x, "endStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndStreamUndefined: Self = StObject.set(x, "endStream", js.undefined)
    
    @scala.inline
    def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    @scala.inline
    def setParent(value: Double): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setWaitForTrailers(value: Boolean): Self = StObject.set(x, "waitForTrailers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForTrailersUndefined: Self = StObject.set(x, "waitForTrailers", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
