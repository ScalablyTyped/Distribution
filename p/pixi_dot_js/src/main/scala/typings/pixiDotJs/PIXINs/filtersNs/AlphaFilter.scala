package typings.pixiDotJs.PIXINs.filtersNs

import typings.pixiDotJs.PIXINs.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.filters.AlphaFilter")
@js.native
class AlphaFilter ()
  extends Filter[js.Object] {
  def this(alpha: Double) = this()
  var alpha: Double = js.native
  @JSName("glShaderKey")
  var glShaderKey_AlphaFilter: Double = js.native
}

