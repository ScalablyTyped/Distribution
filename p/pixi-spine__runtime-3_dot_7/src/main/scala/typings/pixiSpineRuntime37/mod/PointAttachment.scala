package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.Color
import typings.pixiSpineBase.mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "PointAttachment")
@js.native
open class PointAttachment protected () extends VertexAttachment {
  def this(name: String) = this()
  
  var color: Color = js.native
  
  def computeWorldPosition(bone: Bone, point: Vector2): Vector2 = js.native
  
  def computeWorldRotation(bone: Bone): Double = js.native
  
  var rotation: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
