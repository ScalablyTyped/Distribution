package typings
package mirrorxLib.mirrorxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait defaultOptions extends js.Object {
  var historyMode: js.UndefOr[java.lang.String] = js.undefined
  var initialState: js.UndefOr[js.Object] = js.undefined
  var middlewares: js.Array[_]
  def addEffect(name: java.lang.String, handler: js.Function0[_]): js.Any
}

