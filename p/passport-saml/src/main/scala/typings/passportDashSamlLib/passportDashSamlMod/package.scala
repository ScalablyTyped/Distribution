package typings
package passportDashSamlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashSamlMod {
  type CertCallback = js.Function1[
    /* callback */ js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* cert */ js.UndefOr[java.lang.String | js.Array[java.lang.String]], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type VerifiedCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* user */ js.Object, 
    /* info */ js.Object, 
    scala.Unit
  ]
  type VerifyWithRequest = js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* profile */ js.Object, 
    /* done */ VerifiedCallback, 
    scala.Unit
  ]
  type VerifyWithoutRequest = js.Function2[/* profile */ js.Object, /* done */ VerifiedCallback, scala.Unit]
}
