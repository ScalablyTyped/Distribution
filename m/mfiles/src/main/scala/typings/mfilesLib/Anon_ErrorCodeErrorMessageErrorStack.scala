package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorCodeErrorMessageErrorStack extends js.Object {
  var Finally: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnError: js.UndefOr[
    js.Function3[
      /* errorCode */ scala.Double, 
      /* errorMessage */ java.lang.String, 
      /* errorStack */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var OnSuccess: js.UndefOr[js.Function1[/* objectVersion */ IObjectVersion, scala.Unit]] = js.undefined
}

