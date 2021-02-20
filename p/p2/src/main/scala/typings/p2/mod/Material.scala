package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Material")
@js.native
class Material () extends StObject {
  def this(id: Double) = this()
  
  var id: Double = js.native
}
/* static members */
object Material {
  
  @JSImport("p2", "Material")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("p2", "Material.idCounter")
  @js.native
  def idCounter: Double = js.native
  @scala.inline
  def idCounter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idCounter")(x.asInstanceOf[js.Any])
}
