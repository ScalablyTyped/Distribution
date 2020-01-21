package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "ContactMaterial")
@js.native
class ContactMaterial protected () extends js.Object {
  def this(materialA: Material, materialB: Material) = this()
  def this(materialA: Material, materialB: Material, options: ContactMaterialOptions) = this()
  var contactSkinSize: Double = js.native
  var friction: Double = js.native
  var frictionRelaxation: Double = js.native
  var frictionStuffness: Double = js.native
  var id: Double = js.native
  var materialA: Material = js.native
  var materialB: Material = js.native
  var relaxation: Double = js.native
  var restitution: Double = js.native
  var stiffness: Double = js.native
  var surfaceVelocity: Double = js.native
}

/* static members */
@JSImport("p2", "ContactMaterial")
@js.native
object ContactMaterial extends js.Object {
  var idCounter: Double = js.native
}

