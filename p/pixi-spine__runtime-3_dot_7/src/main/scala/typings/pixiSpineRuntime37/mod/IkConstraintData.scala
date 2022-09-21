package typings.pixiSpineRuntime37.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "IkConstraintData")
@js.native
open class IkConstraintData protected () extends StObject {
  def this(name: String) = this()
  
  var bendDirection: Double = js.native
  
  var bones: js.Array[BoneData] = js.native
  
  var compress: Boolean = js.native
  
  var mix: Double = js.native
  
  var name: String = js.native
  
  var order: Double = js.native
  
  var stretch: Boolean = js.native
  
  var target: BoneData = js.native
  
  var uniform: Boolean = js.native
}
