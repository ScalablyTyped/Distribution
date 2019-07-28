package typings.nodeDashZendesk

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashZendeskMod {
  type ZendeskCallback[TResponse, TResult] = js.Function3[/* error */ js.UndefOr[Error], /* response */ TResponse, /* result */ TResult, Unit]
  type ZendeskID = Double
}
