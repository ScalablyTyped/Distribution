package typings.passportClientCert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type VerifyCallback = js.Function3[
    /* error */ js.Any, 
    /* user */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[typings.passportClientCert.mod.VerifyOptions], 
    scala.Unit
  ]
  type VerifyFunction = js.Function2[
    /* clientCert */ typings.passportClientCert.mod.PeerCertificate, 
    /* done */ typings.passportClientCert.mod.VerifyCallback, 
    scala.Unit
  ]
  type VerifyFunctionWithRequest = js.Function3[
    /* clientCert */ typings.passportClientCert.mod.PeerCertificate, 
    /* req */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    /* done */ typings.passportClientCert.mod.VerifyCallback, 
    scala.Unit
  ]
}
