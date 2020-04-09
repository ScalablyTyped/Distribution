package typings.plotlyJs.mod

import typings.plotlyJs.PartialDomain
import typings.plotlyJs.PartialLayoutAxisAngle
import typings.plotlyJs.plotlyJsStrings.circular
import typings.plotlyJs.plotlyJsStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolarLayout extends js.Object {
  var angularaxis: PartialLayoutAxisAngle
  var bgcolor: Color
  var domain: PartialDomain
  var gridshape: circular | linear
  var hole: Double
  var radialaxis: PartialLayoutAxisAngle
  var sector: js.Array[Double]
  var uirevision: String | Double
}

object PolarLayout {
  @scala.inline
  def apply(
    angularaxis: PartialLayoutAxisAngle,
    bgcolor: Color,
    domain: PartialDomain,
    gridshape: circular | linear,
    hole: Double,
    radialaxis: PartialLayoutAxisAngle,
    sector: js.Array[Double],
    uirevision: String | Double
  ): PolarLayout = {
    val __obj = js.Dynamic.literal(angularaxis = angularaxis.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], gridshape = gridshape.asInstanceOf[js.Any], hole = hole.asInstanceOf[js.Any], radialaxis = radialaxis.asInstanceOf[js.Any], sector = sector.asInstanceOf[js.Any], uirevision = uirevision.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PolarLayout]
  }
}

