package typings.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.fuzzyFactory")
@js.native
class fuzzyFactory protected ()
  extends typings.openjscad.CSG.fuzzyFactory {
  def this(numdimensions: Double, tolerance: Double) = this()
  /* CompleteClass */
  override var lookuptable: js.Any = js.native
  /* CompleteClass */
  override var multiplier: Double = js.native
  /* CompleteClass */
  override def lookupOrCreate(els: js.Any, creatorCallback: js.Any): js.Any = js.native
}

