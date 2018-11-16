package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * @name pc.PostEffect
    * @class Base class for all post effects. Post effects take a a render target as input
    * apply effects to it and then render the result to an output render target or the screen
    * if no output is specified.
    * @description Creates new PostEffect
    * @param {pc.GraphicsDevice} graphicsDevice The graphics device of the application
    */
@JSGlobal("pc.PostEffect")
@js.native
class PostEffect protected () extends js.Object {
  def this(graphicsDevice: GraphicsDevice) = this()
  /**
          * @function
          * @name pc.PostEffect#render
          * @description Render the post effect using the specified inputTarget
          * to the specified outputTarget.
          * @param {pc.RenderTarget} inputTarget The input render target
          * @param {pc.RenderTarget} outputTarget The output render target. If null then this will be the screen.
          * @param {pc.Vec4} rect (Optional) The rect of the current camera. If not specified then it will default to [0,0,1,1]
          */
  def render(inputTarget: RenderTarget, outputTarget: RenderTarget, rect: Vec4): scala.Unit = js.native
}

