package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "ContactMaterial")
@js.native
open class ContactMaterial protected () extends StObject {
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
object ContactMaterial {
  
  @JSImport("p2", "ContactMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("p2", "ContactMaterial.idCounter")
  @js.native
  def idCounter: Double = js.native
  inline def idCounter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idCounter")(x.asInstanceOf[js.Any])
}
