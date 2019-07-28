package typings.mobx.libApiActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/action", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val action: IActionFactory = js.native
  def defineBoundAction(target: js.Any, propertyName: String, fn: js.Function): Unit = js.native
  def isAction(thing: js.Any): Boolean = js.native
  def runInAction[T](block: js.Function0[T]): T = js.native
  def runInAction[T](name: String, block: js.Function0[T]): T = js.native
}

