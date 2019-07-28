package typings.pixiDotJs.pixiDotJsMod

import typings.pixiDotJs.PIXINs.interactionNs.InteractionManagerOptions
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
    extends typings.pixiDotJs.PIXINs.interactionNs.InteractionData
  
  @js.native
  class InteractionManager protected ()
    extends typings.pixiDotJs.PIXINs.interactionNs.InteractionManager {
    def this(renderer: typings.pixiDotJs.PIXINs.CanvasRenderer) = this()
    def this(renderer: typings.pixiDotJs.PIXINs.SystemRenderer) = this()
    def this(renderer: typings.pixiDotJs.PIXINs.WebGLRenderer) = this()
    def this(renderer: typings.pixiDotJs.PIXINs.CanvasRenderer, options: InteractionManagerOptions) = this()
    def this(renderer: typings.pixiDotJs.PIXINs.SystemRenderer, options: InteractionManagerOptions) = this()
    def this(renderer: typings.pixiDotJs.PIXINs.WebGLRenderer, options: InteractionManagerOptions) = this()
  }
  
}

