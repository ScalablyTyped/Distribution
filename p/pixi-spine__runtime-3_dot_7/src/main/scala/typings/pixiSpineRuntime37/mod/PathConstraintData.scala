package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.IPathConstraintData
import typings.pixiSpineBase.mod.PositionMode
import typings.pixiSpineBase.mod.RotateMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "PathConstraintData")
@js.native
open class PathConstraintData protected ()
  extends StObject
     with IPathConstraintData {
  def this(name: String) = this()
  
  var bones: js.Array[BoneData] = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var offsetRotation: Double = js.native
  
  /* CompleteClass */
  var order: Double = js.native
  
  /* CompleteClass */
  var position: Double = js.native
  
  /* CompleteClass */
  var positionMode: PositionMode = js.native
  
  var rotateMix: Double = js.native
  
  /* CompleteClass */
  var rotateMode: RotateMode = js.native
  
  /* CompleteClass */
  var spacing: Double = js.native
  
  var spacingMode: SpacingMode = js.native
  
  var target: SlotData = js.native
  
  var translateMix: Double = js.native
}
