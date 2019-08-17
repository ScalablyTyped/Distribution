package typings.overwatchDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object overwatchDashApiMod {
  import typings.std.Error

  type QuickplayGameType = GameType
  type callbackFunc[T] = js.Function2[/* err */ Error | Null, /* data */ T, Unit]
}
