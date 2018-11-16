package typings
package officeDashJsLib.OfficeExtensionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EventInfo[T] extends js.Object {
  def eventArgsTransformFunc(args: js.Any): stdLib.Promise[T]
  def registerFunc(callback: js.Function1[/* args */ js.Any, scala.Unit]): stdLib.Promise[_]
  def unregisterFunc(callback: js.Function1[/* args */ js.Any, scala.Unit]): stdLib.Promise[_]
}

