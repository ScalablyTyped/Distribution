package typings.passportDashCognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashCognitoMod {
  type CognitoVerifyFunction = js.Function5[
    /* accessToken */ String, 
    /* idToken */ String, 
    /* refreshToken */ String, 
    /* user */ js.Object, 
    /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit], 
    js.Any
  ]
}
