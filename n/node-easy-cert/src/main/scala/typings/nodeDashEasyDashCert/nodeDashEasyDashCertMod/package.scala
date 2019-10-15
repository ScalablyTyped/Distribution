package typings.nodeDashEasyDashCert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashEasyDashCertMod {
  import typings.std.Error

  type GenerateCallback = js.Function3[
    /* err */ Error | CertErrors | Null, 
    /* keyPath */ String, 
    /* certPath */ String, 
    js.Any
  ]
  type GetCertificateCallback = js.Function3[
    /* err */ Error | CertErrors | Null, 
    /* keyContent */ String, 
    /* certContent */ String, 
    js.Any
  ]
}
