package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Cred")
@js.native
object CredNs extends js.Object {
  @js.native
  object TYPE extends js.Object {
    /* 8 */ val DEFAULT: nodegitLib.credMod.CredNs.TYPE.DEFAULT with scala.Double = js.native
    /* 4 */ val SSH_CUSTOM: nodegitLib.credMod.CredNs.TYPE.SSH_CUSTOM with scala.Double = js.native
    /* 16 */ val SSH_INTERACTIVE: nodegitLib.credMod.CredNs.TYPE.SSH_INTERACTIVE with scala.Double = js.native
    /* 2 */ val SSH_KEY: nodegitLib.credMod.CredNs.TYPE.SSH_KEY with scala.Double = js.native
    /* 64 */ val SSH_MEMORY: nodegitLib.credMod.CredNs.TYPE.SSH_MEMORY with scala.Double = js.native
    /* 32 */ val USERNAME: nodegitLib.credMod.CredNs.TYPE.USERNAME with scala.Double = js.native
    /* 1 */ val USERPASS_PLAINTEXT: nodegitLib.credMod.CredNs.TYPE.USERPASS_PLAINTEXT with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.credMod.CredNs.TYPE with scala.Double] = js.native
  }
  
  type TYPE = nodegitLib.credMod.CredNs.TYPE
}

