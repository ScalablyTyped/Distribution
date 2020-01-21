package typings.passportGoogleOauth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type VerifyFunction = js.Function3[
    /* error */ js.Any, 
    /* user */ js.UndefOr[js.Any], 
    /* msg */ js.UndefOr[typings.passportGoogleOauth.mod.VerifyOptions], 
    scala.Unit
  ]
}
