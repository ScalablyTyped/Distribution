package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
////////////////////////////INTERACTION///////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
@JSImport("pixi.js", "interaction")
@js.native
object interactionNs extends js.Object {
  @js.native
  class InteractionData ()
    extends pixiDotJsLib.PIXINs.interactionNs.InteractionData
  
  @js.native
  class InteractionManager protected ()
    extends pixiDotJsLib.PIXINs.interactionNs.InteractionManager {
    def this(renderer: pixiDotJsLib.PIXINs.CanvasRenderer) = this()
    def this(renderer: pixiDotJsLib.PIXINs.SystemRenderer) = this()
    def this(renderer: pixiDotJsLib.PIXINs.WebGLRenderer) = this()
    def this(renderer: pixiDotJsLib.PIXINs.CanvasRenderer, options: pixiDotJsLib.PIXINs.interactionNs.InteractionManagerOptions) = this()
    def this(renderer: pixiDotJsLib.PIXINs.SystemRenderer, options: pixiDotJsLib.PIXINs.interactionNs.InteractionManagerOptions) = this()
    def this(renderer: pixiDotJsLib.PIXINs.WebGLRenderer, options: pixiDotJsLib.PIXINs.interactionNs.InteractionManagerOptions) = this()
  }
  
}

