package typings.passportDashSaml

import typings.express.expressMod.Request
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashSamlMod {
  type CertCallback = js.Function1[
    /* callback */ js.Function2[/* err */ Error | Null, /* cert */ js.UndefOr[String | js.Array[String]], Unit], 
    Unit
  ]
  type VerifiedCallback = js.Function3[
    /* err */ Error | Null, 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    Unit
  ]
  type VerifyWithRequest = js.Function3[/* req */ Request, /* profile */ Profile, /* done */ VerifiedCallback, Unit]
  type VerifyWithoutRequest = js.Function2[/* profile */ Profile, /* done */ VerifiedCallback, Unit]
}
