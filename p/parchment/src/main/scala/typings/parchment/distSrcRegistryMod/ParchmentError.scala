package typings.parchment.distSrcRegistryMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/registry", "ParchmentError")
@js.native
class ParchmentError protected () extends Error {
  def this(message: String) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  @JSName("stack")
  var stack_ParchmentError: String = js.native
}

