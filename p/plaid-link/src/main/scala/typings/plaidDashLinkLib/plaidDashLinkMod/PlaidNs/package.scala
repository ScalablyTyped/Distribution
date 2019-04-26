package typings
package plaidDashLinkLib.plaidDashLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PlaidNs {
  type OnEvent = js.Function2[/* eventName */ EventName, /* metadata */ OnEventMetaData, scala.Unit]
  type OnExit = js.Function2[/* error */ Error | scala.Null, /* metadata */ OnExitMetaData, scala.Unit]
  type OnLoad = js.Function0[scala.Unit]
  type OnSuccess = js.Function2[/* public_token */ java.lang.String, /* metadata */ OnSuccessMetaData, scala.Unit]
}
