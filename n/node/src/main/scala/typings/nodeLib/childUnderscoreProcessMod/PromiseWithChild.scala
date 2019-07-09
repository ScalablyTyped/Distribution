package typings
package nodeLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseWithChild[T]
  extends stdLib.Promise[T] {
  var child: ChildProcess = js.native
}

