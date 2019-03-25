package typings
package pakoLib.pakoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/nodeca/pako/blob/893381abcafa10fa2081ce60dae7d4d8e873a658/lib/deflate.js
@JSImport("pako", "Deflate")
@js.native
class Deflate ()
  extends pakoLib.pakoMod.PakoNs.Deflate {
  def this(options: pakoLib.pakoMod.PakoNs.DeflateOptions) = this()
}

