package typings.openjscad.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.fuzzyFactory")
@js.native
class fuzzyFactory protected () extends js.Object {
  def this(numdimensions: Double, tolerance: Double) = this()
  var lookuptable: js.Any = js.native
  var multiplier: Double = js.native
  def lookupOrCreate(els: js.Any, creatorCallback: js.Any): js.Any = js.native
}

