package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Cert")
@js.native
object CertNs extends js.Object {
  @js.native
  object SSH extends js.Object {
    /* 1 */ val MD5: nodegitLib.certMod.CertNs.SSH.MD5 with scala.Double = js.native
    /* 2 */ val SHA1: nodegitLib.certMod.CertNs.SSH.SHA1 with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.certMod.CertNs.SSH with scala.Double] = js.native
  }
  
  @js.native
  object TYPE extends js.Object {
    /* 2 */ val HOSTKEY_LIBSSH2: nodegitLib.certMod.CertNs.TYPE.HOSTKEY_LIBSSH2 with scala.Double = js.native
    /* 0 */ val NONE: nodegitLib.certMod.CertNs.TYPE.NONE with scala.Double = js.native
    /* 3 */ val STRARRAY: nodegitLib.certMod.CertNs.TYPE.STRARRAY with scala.Double = js.native
    /* 1 */ val X509: nodegitLib.certMod.CertNs.TYPE.X509 with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.certMod.CertNs.TYPE with scala.Double] = js.native
  }
  
  type SSH = nodegitLib.certMod.CertNs.SSH
  type TYPE = nodegitLib.certMod.CertNs.TYPE
}

