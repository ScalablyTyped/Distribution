package typings.phaser.anon

import typings.phaser.spine.BlendMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofWebGLBlendModeConve extends StObject {
  
  /* static member */
  var DST_ALPHA: Double = js.native
  
  /* static member */
  var DST_COLOR: Double = js.native
  
  /* static member */
  var ONE: Double = js.native
  
  /* static member */
  var ONE_MINUS_DST_ALPHA: Double = js.native
  
  /* static member */
  var ONE_MINUS_SRC_ALPHA: Double = js.native
  
  /* static member */
  var ONE_MINUS_SRC_COLOR: Double = js.native
  
  /* static member */
  var SRC_ALPHA: Double = js.native
  
  /* static member */
  var SRC_COLOR: Double = js.native
  
  /* static member */
  var ZERO: Double = js.native
  
  /* static member */
  def getDestGLBlendMode(blendMode: BlendMode): Double = js.native
  
  /* static member */
  def getSourceGLBlendMode(blendMode: BlendMode): Double = js.native
  def getSourceGLBlendMode(blendMode: BlendMode, premultipliedAlpha: Boolean): Double = js.native
}
