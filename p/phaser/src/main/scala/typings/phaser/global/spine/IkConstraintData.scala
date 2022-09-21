package typings.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.IkConstraintData")
@js.native
open class IkConstraintData protected ()
  extends StObject
     with typings.phaser.spine.IkConstraintData {
  def this(name: String) = this()
  
  /* CompleteClass */
  var bendDirection: Double = js.native
  
  /* CompleteClass */
  var bones: js.Array[typings.phaser.spine.BoneData] = js.native
  
  /* CompleteClass */
  var compress: Boolean = js.native
  
  /* CompleteClass */
  var mix: Double = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var order: Double = js.native
  
  /* CompleteClass */
  var skinRequired: Boolean = js.native
  
  /* CompleteClass */
  var softness: Double = js.native
  
  /* CompleteClass */
  var stretch: Boolean = js.native
  
  /* CompleteClass */
  var target: typings.phaser.spine.BoneData = js.native
  
  /* CompleteClass */
  var uniform: Boolean = js.native
}
