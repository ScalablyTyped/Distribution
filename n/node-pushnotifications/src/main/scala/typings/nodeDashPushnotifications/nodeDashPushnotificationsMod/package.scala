package typings.nodeDashPushnotifications

import typings.webDashPush.webDashPushMod.PushSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashPushnotificationsMod {
  type Callback = js.Function2[/* err */ js.Any, /* result */ js.Any, Unit]
  type PushMethod = js.Function3[/* regIds */ js.Array[String], /* data */ Data, /* settings */ Settings, Unit]
  type RegistrationId = String | PushSubscription
}
