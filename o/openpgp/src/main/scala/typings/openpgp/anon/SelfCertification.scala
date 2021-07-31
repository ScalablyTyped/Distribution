package typings.openpgp.anon

import typings.openpgp.mod.key.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelfCertification extends StObject {
  
  var selfCertification: typings.openpgp.mod.packet.Signature
  
  var user: User
}
object SelfCertification {
  
  @scala.inline
  def apply(selfCertification: typings.openpgp.mod.packet.Signature, user: User): SelfCertification = {
    val __obj = js.Dynamic.literal(selfCertification = selfCertification.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfCertification]
  }
  
  @scala.inline
  implicit class SelfCertificationMutableBuilder[Self <: SelfCertification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelfCertification(value: typings.openpgp.mod.packet.Signature): Self = StObject.set(x, "selfCertification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
