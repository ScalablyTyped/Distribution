package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class for all post effects. Post effects take a a render target as input apply effects to
  * it and then render the result to an output render target or the screen if no output is
  * specified.
  */
@JSGlobal("pc.PostEffect")
@js.native
open class PostEffect_ protected ()
  extends typings.playcanvas.mod.PostEffect_ {
  /**
    * Create a new PostEffect instance.
    *
    * @param {import('../../platform/graphics/graphics-device.js').GraphicsDevice} graphicsDevice -
    * The graphics device of the application.
    */
  def this(graphicsDevice: typings.playcanvas.mod.GraphicsDevice) = this()
}
object PostEffect_ {
  
  @JSGlobal("pc.PostEffect")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A simple vertex shader used to render a quad, which requires 'vec2 aPosition' in the vertex
    * buffer, and generates uv coordinates vUv0 for use in the fragment shader.
    *
    * @type {string}
    */
  /* static member */
  @JSGlobal("pc.PostEffect.quadVertexShader")
  @js.native
  def quadVertexShader: String = js.native
  inline def quadVertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quadVertexShader")(x.asInstanceOf[js.Any])
}
