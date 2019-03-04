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
    val __obj = js.Dynamic.literal(contactSkinSize = contactSkinSize, friction = friction, frictionRelaxation = frictionRelaxation, frictionStuffness = frictionStuffness, id = id, materialA = materialA, materialB = materialB, relaxation = relaxation, restitution = restitution, stiffness = stiffness, surfaceVelocity = surfaceVelocity)
  
    __obj.asInstanceOf[ContactMaterial]
  }
}

