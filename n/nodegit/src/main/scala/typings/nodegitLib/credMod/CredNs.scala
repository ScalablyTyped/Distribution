package typings
package nodegitLib.credMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/cred", "Cred")
@js.native
object CredNs extends js.Object {
  @js.native
  sealed trait TYPE extends js.Object
  
  @js.native
  object TYPE extends js.Object {
    @js.native
    sealed trait DEFAULT
      extends nodegitLib.credMod.CredNs.TYPE
    
    @js.native
    sealed trait SSH_CUSTOM
      extends nodegitLib.credMod.CredNs.TYPE
    
    @js.native
    sealed trait SSH_INTERACTIVE
      extends nodegitLib.credMod.CredNs.TYPE
    
    @js.native
    sealed trait SSH_KEY
      extends nodegitLib.credMod.CredNs.TYPE
    
    @js.native
    sealed trait SSH_MEMORY
      extends nodegitLib.credMod.CredNs.TYPE
    
    @js.native
    sealed trait USERNAME
      extends nodegitLib.credMod.CredNs.TYPE
    
    @js.native
    sealed trait USERPASS_PLAINTEXT
      extends nodegitLib.credMod.CredNs.TYPE
    
    /* 8 */ val DEFAULT: DEFAULT with scala.Double = js.native
    /* 4 */ val SSH_CUSTOM: SSH_CUSTOM with scala.Double = js.native
    /* 16 */ val SSH_INTERACTIVE: SSH_INTERACTIVE with scala.Double = js.native
    /* 2 */ val SSH_KEY: SSH_KEY with scala.Double = js.native
    /* 64 */ val SSH_MEMORY: SSH_MEMORY with scala.Double = js.native
    /* 32 */ val USERNAME: USERNAME with scala.Double = js.native
    /* 1 */ val USERPASS_PLAINTEXT: USERPASS_PLAINTEXT with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.credMod.CredNs.TYPE with scala.Double] = js.native
  }
  
}

