package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.Color
import typings.pixiSpineBase.mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "PointAttachment")
@js.native
open class PointAttachment protected () extends VertexAttachment {
  def this(name: String) = this()
  
  /** The color of the point attachment as it was in Spine. Available only when nonessential data was exported. Point attachments
    * are not usually rendered at runtime. */
  var color: Color = js.native
  
  def computeWorldPosition(bone: Bone, point: Vector2): Vector2 = js.native
  
  def computeWorldRotation(bone: Bone): Double = js.native
  
  var rotation: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
