package typings.obeliskJs.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("obelisk.js", "CanvasManager")
@js.native
class CanvasManager () extends StObject
/* static members */
object CanvasManager {
  
  @JSImport("obelisk.js", "CanvasManager")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("obelisk.js", "CanvasManager.defaultCanvas")
  @js.native
  def defaultCanvas: HTMLCanvasElement = js.native
  @scala.inline
  def defaultCanvas_=(x: HTMLCanvasElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultCanvas")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def getDefaultCanvas(): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultCanvas")().asInstanceOf[HTMLCanvasElement]
  
  @scala.inline
  def getNewCanvas(): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getNewCanvas")().asInstanceOf[HTMLCanvasElement]
}
