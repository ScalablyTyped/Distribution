package typings.nestedErrorStacks.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nested-error-stacks", JSImport.Namespace)
@js.native
class ^ () extends Error {
  def this(message: js.Any) = this()
  def this(message: js.Any, nested: Error) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

