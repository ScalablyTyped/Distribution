package typings.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.ConstraintData")
@js.native
abstract class ConstraintData protected ()
  extends StObject
     with typings.phaser.spine.ConstraintData {
  def this(name: String, order: Double, skinRequired: Boolean) = this()
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var order: Double = js.native
  
  /* CompleteClass */
  var skinRequired: Boolean = js.native
}
