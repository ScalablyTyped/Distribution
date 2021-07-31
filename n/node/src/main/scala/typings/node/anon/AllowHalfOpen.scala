package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowHalfOpen extends StObject {
  
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  
  var pauseOnConnect: js.UndefOr[Boolean] = js.undefined
}
object AllowHalfOpen {
  
  @scala.inline
  def apply(): AllowHalfOpen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowHalfOpen]
  }
  
  @scala.inline
  implicit class AllowHalfOpenMutableBuilder[Self <: AllowHalfOpen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
    
    @scala.inline
    def setPauseOnConnect(value: Boolean): Self = StObject.set(x, "pauseOnConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseOnConnectUndefined: Self = StObject.set(x, "pauseOnConnect", js.undefined)
  }
}
