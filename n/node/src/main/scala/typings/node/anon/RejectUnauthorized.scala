package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectUnauthorized extends StObject {
  
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  
  var requestCert: js.UndefOr[Boolean] = js.undefined
}
object RejectUnauthorized {
  
  @scala.inline
  def apply(): RejectUnauthorized = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectUnauthorized]
  }
  
  @scala.inline
  implicit class RejectUnauthorizedMutableBuilder[Self <: RejectUnauthorized] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    
    @scala.inline
    def setRequestCert(value: Boolean): Self = StObject.set(x, "requestCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestCertUndefined: Self = StObject.set(x, "requestCert", js.undefined)
  }
}
