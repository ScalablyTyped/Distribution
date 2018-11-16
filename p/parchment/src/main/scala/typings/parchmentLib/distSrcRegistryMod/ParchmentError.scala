package typings
package parchmentLib.distSrcRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/registry", "ParchmentError")
@js.native
class ParchmentError protected ()
  extends stdLib.Error {
  def this(message: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  @JSName("stack")
  var stack_ParchmentError: java.lang.String = js.native
}

