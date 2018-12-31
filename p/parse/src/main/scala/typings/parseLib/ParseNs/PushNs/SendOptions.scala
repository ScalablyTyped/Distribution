package typings
package parseLib.ParseNs.PushNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendOptions
  extends parseLib.ParseNs.UseMasterKeyOption {
  var error: js.UndefOr[js.Function1[/* error */ parseLib.ParseNs.Error, scala.Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

