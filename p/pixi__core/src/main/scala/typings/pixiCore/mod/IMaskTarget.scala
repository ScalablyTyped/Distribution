package typings.pixiCore.mod

import typings.pixiMath.mod.Matrix
import typings.pixiMath.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMaskTarget
  extends StObject
     with IFilterTarget {
  
  def getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle = js.native
  def getBounds(skipUpdate: Unit, rect: Rectangle): Rectangle = js.native
  
  var isFastRect: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var isSprite: js.UndefOr[Boolean] = js.native
  
  def render(renderer: Renderer): Unit = js.native
  
  var renderable: Boolean = js.native
  
  var worldTransform: Matrix = js.native
}
