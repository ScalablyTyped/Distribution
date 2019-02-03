package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "ContactMaterial")
@js.native
class ContactMaterial protected ()
  extends p2Lib.p2Mod.p2Ns.ContactMaterial {
  def this(materialA: p2Lib.p2Mod.p2Ns.Material, materialB: p2Lib.p2Mod.p2Ns.Material) = this()
  def this(materialA: p2Lib.p2Mod.p2Ns.Material, materialB: p2Lib.p2Mod.p2Ns.Material, options: p2Lib.p2Mod.p2Ns.ContactMaterialOptions) = this()
  /* CompleteClass */
  override var contactSkinSize: scala.Double = js.native
  /* CompleteClass */
  override var friction: scala.Double = js.native
  /* CompleteClass */
  override var frictionRelaxation: scala.Double = js.native
  /* CompleteClass */
  override var frictionStiffness: scala.Double = js.native
  /* CompleteClass */
  override var id: scala.Double = js.native
  /* CompleteClass */
  override var materialA: p2Lib.p2Mod.p2Ns.Material = js.native
  /* CompleteClass */
  override var materialB: p2Lib.p2Mod.p2Ns.Material = js.native
  /* CompleteClass */
  override var relaxation: scala.Double = js.native
  /* CompleteClass */
  override var restitution: scala.Double = js.native
  /* CompleteClass */
  override var stiffness: scala.Double = js.native
  /* CompleteClass */
  override var surfaceVelocity: scala.Double = js.native
}

/* static members */
@JSImport("p2", "ContactMaterial")
@js.native
object ContactMaterial extends js.Object {
  var idCounter: scala.Double = js.native
}

