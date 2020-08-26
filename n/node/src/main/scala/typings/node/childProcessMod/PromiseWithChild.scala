package typings.node.childProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseWithChild[T]
  extends js.Promise[T] {
  var child: ChildProcess = js.native
}

