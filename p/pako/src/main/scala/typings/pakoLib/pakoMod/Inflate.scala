package typings
package pakoLib.pakoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/nodeca/pako/blob/893381abcafa10fa2081ce60dae7d4d8e873a658/lib/inflate.js
@JSImport("pako", "Inflate")
@js.native
class Inflate ()
  extends pakoLib.pakoMod.PakoNs.Inflate {
  def this(options: pakoLib.pakoMod.PakoNs.InflateOptions) = this()
}

