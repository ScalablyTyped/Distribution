package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.PositionMode
import typings.pixiSpineBase.mod.RotateMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "PathConstraintData")
@js.native
open class PathConstraintData protected () extends ConstraintData {
  def this(name: String) = this()
  
  var bones: js.Array[BoneData] = js.native
  
  var offsetRotation: Double = js.native
  
  var position: Double = js.native
  
  var positionMode: PositionMode = js.native
  
  var rotateMix: Double = js.native
  
  var rotateMode: RotateMode = js.native
  
  var spacing: Double = js.native
  
  var spacingMode: SpacingMode = js.native
  
  var target: SlotData = js.native
  
  var translateMix: Double = js.native
}
