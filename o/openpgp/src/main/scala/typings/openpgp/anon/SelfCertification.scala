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
  
  inline def apply(selfCertification: typings.openpgp.mod.packet.Signature, user: User): SelfCertification = {
    val __obj = js.Dynamic.literal(selfCertification = selfCertification.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfCertification]
  }
  
  extension [Self <: SelfCertification](x: Self) {
    
    inline def setSelfCertification(value: typings.openpgp.mod.packet.Signature): Self = StObject.set(x, "selfCertification", value.asInstanceOf[js.Any])
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
