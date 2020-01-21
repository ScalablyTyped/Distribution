package typings.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cookies {
  type CookieChangedEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* changeInfo */ typings.chrome.chrome.cookies.CookieChangeInfo, scala.Unit]
  ]
}
