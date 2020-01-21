package typings.node.childProcessMod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseWithChild[T] extends Promise[T] {
  var child: ChildProcess = js.native
}

