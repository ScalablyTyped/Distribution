package typings.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.CurveTimeline")
@js.native
abstract class CurveTimeline protected ()
  extends typings.phaser.spine.CurveTimeline {
  def this(frameCount: Double) = this()
}
/* static members */
@JSGlobal("spine.CurveTimeline")
@js.native
object CurveTimeline extends js.Object {
  
  var BEZIER: Double = js.native
  
  var BEZIER_SIZE: Double = js.native
  
  var LINEAR: Double = js.native
  
  var STEPPED: Double = js.native
}
