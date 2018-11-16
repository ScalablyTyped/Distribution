package typings
package openjscadLib.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.fuzzyFactory")
@js.native
class fuzzyFactory protected () extends js.Object {
  def this(numdimensions: scala.Double, tolerance: scala.Double) = this()
  var lookuptable: js.Any = js.native
  var multiplier: scala.Double = js.native
  def lookupOrCreate(els: js.Any, creatorCallback: js.Any): js.Any = js.native
}

