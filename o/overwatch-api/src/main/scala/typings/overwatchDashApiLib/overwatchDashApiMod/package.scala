package typings
package overwatchDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object overwatchDashApiMod {
  type QuickplayGameType = GameType
  type callbackFunc[T] = js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ T, scala.Unit]
}
