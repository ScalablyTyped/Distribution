package typings.passportDashClientDashCert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashClientDashCertMod {
  import typings.express.expressMod.Request
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type VerifyCallback = js.Function3[
    /* error */ js.Any, 
    /* user */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[VerifyOptions], 
    Unit
  ]
  type VerifyFunction = js.Function2[/* clientCert */ PeerCertificate, /* done */ VerifyCallback, Unit]
  type VerifyFunctionWithRequest = js.Function3[
    /* clientCert */ PeerCertificate, 
    /* req */ Request[ParamsDictionary], 
    /* done */ VerifyCallback, 
    Unit
  ]
}
