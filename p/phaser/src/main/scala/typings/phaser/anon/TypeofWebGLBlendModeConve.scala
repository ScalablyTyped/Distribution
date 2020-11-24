package typings.phaser.anon

import org.scalablytyped.runtime.Instantiable0
import typings.phaser.spine.BlendMode
import typings.phaser.spine.webgl.WebGLBlendModeConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofWebGLBlendModeConve extends Instantiable0[WebGLBlendModeConverter] {
  
  var DST_ALPHA: Double = js.native
  
  var DST_COLOR: Double = js.native
  
  var ONE: Double = js.native
  
  var ONE_MINUS_DST_ALPHA: Double = js.native
  
  var ONE_MINUS_SRC_ALPHA: Double = js.native
  
  var ONE_MINUS_SRC_COLOR: Double = js.native
  
  var SRC_ALPHA: Double = js.native
  
  var SRC_COLOR: Double = js.native
  
  var ZERO: Double = js.native
  
  def getDestGLBlendMode(blendMode: BlendMode): Double = js.native
  
  def getSourceGLBlendMode(blendMode: BlendMode): Double = js.native
  def getSourceGLBlendMode(blendMode: BlendMode, premultipliedAlpha: Boolean): Double = js.native
}
