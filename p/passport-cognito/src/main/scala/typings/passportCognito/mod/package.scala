package typings.passportCognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CognitoVerifyFunction = js.Function5[
    /* accessToken */ java.lang.String, 
    /* idToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* user */ js.Object, 
    /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], scala.Unit], 
    js.Any
  ]
}
