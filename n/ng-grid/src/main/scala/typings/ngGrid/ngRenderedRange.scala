package typings.ngGrid

import org.scalablytyped.runtime.TopLevel
import typings.ngGrid.ngGrid.IRenderedRange
import typings.ngGrid.ngGrid.IRenderedRangeStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngRenderedRange")
@js.native
class ngRenderedRange protected () extends IRenderedRange {
  def this(top: Double, bottom: Double) = this()
  /* CompleteClass */
  override var bottomRow: Double = js.native
  /* CompleteClass */
  override var topRow: Double = js.native
}

@JSGlobal("ngRenderedRange")
@js.native
object ngRenderedRange extends TopLevel[IRenderedRangeStatic]

