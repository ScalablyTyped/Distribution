package typings.mobxReactLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react-lite/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def isPlainObject(value: js.Any): /* is object */ Boolean = js.native
  def useForceUpdate(): js.Function0[Unit] = js.native
  def useUnmount(fn: js.Function0[Unit]): Unit = js.native
}

