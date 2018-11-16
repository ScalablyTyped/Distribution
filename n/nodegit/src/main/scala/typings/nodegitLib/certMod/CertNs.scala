package typings
package nodegitLib.certMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/cert", "Cert")
@js.native
object CertNs extends js.Object {
  @js.native
  sealed trait SSH extends js.Object
  
  @js.native
  sealed trait TYPE extends js.Object
  
  @js.native
  object SSH extends js.Object {
    @js.native
    sealed trait MD5
      extends nodegitLib.certMod.CertNs.SSH
    
    @js.native
    sealed trait SHA1
      extends nodegitLib.certMod.CertNs.SSH
    
    /* 1 */ val MD5: MD5 with scala.Double = js.native
    /* 2 */ val SHA1: SHA1 with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.certMod.CertNs.SSH with scala.Double] = js.native
  }
  
  @js.native
  object TYPE extends js.Object {
    @js.native
    sealed trait HOSTKEY_LIBSSH2
      extends nodegitLib.certMod.CertNs.TYPE
    
    @js.native
    sealed trait NONE
      extends nodegitLib.certMod.CertNs.TYPE
    
    @js.native
    sealed trait STRARRAY
      extends nodegitLib.certMod.CertNs.TYPE
    
    @js.native
    sealed trait X509
      extends nodegitLib.certMod.CertNs.TYPE
    
    /* 2 */ val HOSTKEY_LIBSSH2: HOSTKEY_LIBSSH2 with scala.Double = js.native
    /* 0 */ val NONE: NONE with scala.Double = js.native
    /* 3 */ val STRARRAY: STRARRAY with scala.Double = js.native
    /* 1 */ val X509: X509 with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.certMod.CertNs.TYPE with scala.Double] = js.native
  }
  
}

