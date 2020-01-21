package typings.officeJsPreview.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventInfo[T] extends js.Object {
  def eventArgsTransformFunc(args: js.Any): js.Promise[T]
  def registerFunc(callback: js.Function1[/* args */ js.Any, Unit]): js.Promise[_]
  def unregisterFunc(callback: js.Function1[/* args */ js.Any, Unit]): js.Promise[_]
}

object EventInfo {
  @scala.inline
  def apply[T](
    eventArgsTransformFunc: js.Any => js.Promise[T],
    registerFunc: js.Function1[/* args */ js.Any, Unit] => js.Promise[_],
    unregisterFunc: js.Function1[/* args */ js.Any, Unit] => js.Promise[_]
  ): EventInfo[T] = {
    val __obj = js.Dynamic.literal(eventArgsTransformFunc = js.Any.fromFunction1(eventArgsTransformFunc), registerFunc = js.Any.fromFunction1(registerFunc), unregisterFunc = js.Any.fromFunction1(unregisterFunc))
  
    __obj.asInstanceOf[EventInfo[T]]
  }
}

