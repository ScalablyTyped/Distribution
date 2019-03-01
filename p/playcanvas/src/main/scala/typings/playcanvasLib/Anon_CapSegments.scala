package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CapSegments extends js.Object {
  var capSegments: scala.Double
  var height: scala.Double
  var heightSegments: scala.Double
  var radius: scala.Double
}

object Anon_CapSegments {
  @scala.inline
  def apply(
    capSegments: scala.Double,
    height: scala.Double,
    heightSegments: scala.Double,
    radius: scala.Double
  ): Anon_CapSegments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("capSegments")(capSegments)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("heightSegments")(heightSegments)
    __obj.updateDynamic("radius")(radius)
    __obj.asInstanceOf[Anon_CapSegments]
  }
}

