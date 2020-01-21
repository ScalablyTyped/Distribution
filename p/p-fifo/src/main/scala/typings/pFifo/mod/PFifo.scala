package typings.pFifo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PFifo[T] extends js.Object {
  def isEmpty(): Boolean
  def push(chunk: T): js.Promise[Unit]
  def shift(): js.Promise[T]
}

object PFifo {
  @scala.inline
  def apply[T](isEmpty: () => Boolean, push: T => js.Promise[Unit], shift: () => js.Promise[T]): PFifo[T] = {
    val __obj = js.Dynamic.literal(isEmpty = js.Any.fromFunction0(isEmpty), push = js.Any.fromFunction1(push), shift = js.Any.fromFunction0(shift))
  
    __obj.asInstanceOf[PFifo[T]]
  }
}

