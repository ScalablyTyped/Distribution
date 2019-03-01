package typings
package officeDashJsLib.OfficeExtensionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventInfo[T] extends js.Object {
  def eventArgsTransformFunc(args: js.Any): js.Promise[T]
  def registerFunc(callback: js.Function1[/* args */ js.Any, scala.Unit]): js.Promise[_]
  def unregisterFunc(callback: js.Function1[/* args */ js.Any, scala.Unit]): js.Promise[_]
}

object EventInfo {
  @scala.inline
  def apply[T](
    eventArgsTransformFunc: js.Function1[js.Any, js.Promise[T]],
    registerFunc: js.Function1[js.Function1[/* args */ js.Any, scala.Unit], js.Promise[_]],
    unregisterFunc: js.Function1[js.Function1[/* args */ js.Any, scala.Unit], js.Promise[_]]
  ): EventInfo[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventArgsTransformFunc")(eventArgsTransformFunc)
    __obj.updateDynamic("registerFunc")(registerFunc)
    __obj.updateDynamic("unregisterFunc")(unregisterFunc)
    __obj.asInstanceOf[EventInfo[T]]
  }
}

