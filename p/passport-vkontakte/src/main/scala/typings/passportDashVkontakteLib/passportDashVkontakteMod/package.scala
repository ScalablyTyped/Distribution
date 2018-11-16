package typings
package passportDashVkontakteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashVkontakteMod {
  type VerifyCallback = js.Function3[
    /* error */ js.Any, 
    /* user */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type VerifyFunction = js.Function4[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ Profile, 
    /* done */ VerifyCallback, 
    scala.Unit
  ]
  type VerifyFunctionWithParams = js.Function5[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* params */ Params, 
    /* profile */ Profile, 
    /* done */ VerifyCallback, 
    scala.Unit
  ]
}
