package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginStore extends js.Object {
  var model: js.UndefOr[Model] = js.undefined
  var modelClass: ModelClass
  def dispatch(arg: js.Any): js.Any
  def getState(): State
}

