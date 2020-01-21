package typings.pFifo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-fifo", JSImport.Namespace)
@js.native
class ^[T] () extends PFifo[T] {
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /* CompleteClass */
  override def push(chunk: T): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def shift(): js.Promise[T] = js.native
}

