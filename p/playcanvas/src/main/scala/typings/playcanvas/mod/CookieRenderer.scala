package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookieRenderer extends StObject {
  
  var blitShader2d: Any = js.native
  
  var blitShaderCube: Any = js.native
  
  var blitTextureId: Any = js.native
  
  def destroy(): Unit = js.native
  
  var device: Any = js.native
  
  def getShader(shader: Any, fragment: Any): Any = js.native
  
  def initInvViewProjMatrices(): Unit = js.native
  
  var invViewProjId: Any = js.native
  
  var lightTextureAtlas: Any = js.native
  
  def render(light: Any, renderTarget: Any): Unit = js.native
  
  def shader2d: Any = js.native
  
  def shaderCube: Any = js.native
}
