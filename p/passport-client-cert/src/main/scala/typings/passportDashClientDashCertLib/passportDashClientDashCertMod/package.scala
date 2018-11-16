package typings
package passportDashClientDashCertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashClientDashCertMod {
  type VerifyCallback = js.Function3[
    /* error */ js.Any, 
    /* user */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[VerifyOptions], 
    scala.Unit
  ]
  type VerifyFunction = js.Function2[/* clientCert */ PeerCertificate, /* done */ VerifyCallback, scala.Unit]
  type VerifyFunctionWithRequest = js.Function3[
    /* clientCert */ PeerCertificate, 
    /* req */ expressLib.expressMod.eNs.Request, 
    /* done */ VerifyCallback, 
    scala.Unit
  ]
}
