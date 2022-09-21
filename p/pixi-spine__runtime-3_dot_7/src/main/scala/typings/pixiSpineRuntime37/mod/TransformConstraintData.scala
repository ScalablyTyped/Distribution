package typings.pixiSpineRuntime37.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "TransformConstraintData")
@js.native
open class TransformConstraintData protected () extends StObject {
  def this(name: String) = this()
  
  var bones: js.Array[BoneData] = js.native
  
  var local: Boolean = js.native
  
  var name: String = js.native
  
  var offsetRotation: Double = js.native
  
  var offsetScaleX: Double = js.native
  
  var offsetScaleY: Double = js.native
  
  var offsetShearY: Double = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
  
  var order: Double = js.native
  
  var relative: Boolean = js.native
  
  var rotateMix: Double = js.native
  
  var scaleMix: Double = js.native
  
  var shearMix: Double = js.native
  
  var target: BoneData = js.native
  
  var translateMix: Double = js.native
}
