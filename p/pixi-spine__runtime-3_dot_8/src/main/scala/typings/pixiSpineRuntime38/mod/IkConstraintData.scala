package typings.pixiSpineRuntime38.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.pixiSpineBase.mod.IConstraintData because var conflicts: name, order. Inlined 
- typings.pixiSpineBase.mod.IIkConstraintData because var conflicts: name, order. Inlined bendDirection, mix, compress, uniform, stretch */ @JSImport("@pixi-spine/runtime-3.8", "IkConstraintData")
@js.native
open class IkConstraintData protected () extends ConstraintData {
  def this(name: String) = this()
  
  var bendDirection: Double = js.native
  
  var bones: js.Array[BoneData] = js.native
  
  var compress: Boolean = js.native
  
  var mix: Double = js.native
  
  var softness: Double = js.native
  
  var stretch: Boolean = js.native
  
  var target: BoneData = js.native
  
  var uniform: Boolean = js.native
}
