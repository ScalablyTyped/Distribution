package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactMaterial extends js.Object {
  var contactSkinSize: scala.Double
  var friction: scala.Double
  var frictionRelaxation: scala.Double
  var frictionStuffness: scala.Double
  var id: scala.Double
  var materialA: Material
  var materialB: Material
  var relaxation: scala.Double
  var restitution: scala.Double
  var stiffness: scala.Double
  var surfaceVelocity: scala.Double
}

object ContactMaterial {
  @scala.inline
  def apply(
    contactSkinSize: scala.Double,
    friction: scala.Double,
    frictionRelaxation: scala.Double,
    frictionStuffness: scala.Double,
    id: scala.Double,
    materialA: Material,
    materialB: Material,
    relaxation: scala.Double,
    restitution: scala.Double,
    stiffness: scala.Double,
    surfaceVelocity: scala.Double
  ): ContactMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contactSkinSize")(contactSkinSize)
    __obj.updateDynamic("friction")(friction)
    __obj.updateDynamic("frictionRelaxation")(frictionRelaxation)
    __obj.updateDynamic("frictionStuffness")(frictionStuffness)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("materialA")(materialA)
    __obj.updateDynamic("materialB")(materialB)
    __obj.updateDynamic("relaxation")(relaxation)
    __obj.updateDynamic("restitution")(restitution)
    __obj.updateDynamic("stiffness")(stiffness)
    __obj.updateDynamic("surfaceVelocity")(surfaceVelocity)
    __obj.asInstanceOf[ContactMaterial]
  }
}

