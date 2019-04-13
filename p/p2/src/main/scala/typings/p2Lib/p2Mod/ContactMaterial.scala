package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "ContactMaterial")
@js.native
class ContactMaterial protected () extends js.Object {
  def this(materialA: Material, materialB: Material) = this()
  def this(materialA: Material, materialB: Material, options: ContactMaterialOptions) = this()
  var contactSkinSize: scala.Double = js.native
  var friction: scala.Double = js.native
  var frictionRelaxation: scala.Double = js.native
  var frictionStuffness: scala.Double = js.native
  var id: scala.Double = js.native
  var materialA: Material = js.native
  var materialB: Material = js.native
  var relaxation: scala.Double = js.native
  var restitution: scala.Double = js.native
  var stiffness: scala.Double = js.native
  var surfaceVelocity: scala.Double = js.native
}

/* static members */
@JSImport("p2", "ContactMaterial")
@js.native
object ContactMaterial extends js.Object {
  var idCounter: scala.Double = js.native
}

