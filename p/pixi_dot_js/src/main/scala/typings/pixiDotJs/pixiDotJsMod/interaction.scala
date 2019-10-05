package typings.pixiDotJs.pixiDotJsMod

import typings.pixiDotJs.PIXI.interaction.InteractionManagerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
////////////////////////////INTERACTION///////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
@JSImport("pixi.js", "interaction")
@js.native
object interaction extends js.Object {
  @js.native
  class InteractionData ()
    extends typings.pixiDotJs.PIXI.interaction.InteractionData
  
  @js.native
  class InteractionManager protected ()
    extends typings.pixiDotJs.PIXI.interaction.InteractionManager {
    def this(renderer: typings.pixiDotJs.PIXI.CanvasRenderer) = this()
    def this(renderer: typings.pixiDotJs.PIXI.SystemRenderer) = this()
    def this(renderer: typings.pixiDotJs.PIXI.WebGLRenderer) = this()
    def this(renderer: typings.pixiDotJs.PIXI.CanvasRenderer, options: InteractionManagerOptions) = this()
    def this(renderer: typings.pixiDotJs.PIXI.SystemRenderer, options: InteractionManagerOptions) = this()
    def this(renderer: typings.pixiDotJs.PIXI.WebGLRenderer, options: InteractionManagerOptions) = this()
  }
  
}

