package typings.overwatchDashApi

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object overwatchDashApiMod {
  type QuickplayGameType = GameType
  type callbackFunc[T] = js.Function2[/* err */ Error | Null, /* data */ T, Unit]
}
