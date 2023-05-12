package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class for all post effects. Post effects take a a render target as input apply effects to
  * it and then render the result to an output render target or the screen if no output is
  * specified.
  */
@JSImport("playcanvas", "PostEffect")
@js.native
open class PostEffect_ protected ()
  extends StObject
     with PostEffect1 {
  /**
    * Create a new PostEffect instance.
    *
    * @param {import('../../platform/graphics/graphics-device.js').GraphicsDevice} graphicsDevice -
    * The graphics device of the application.
    */
  def this(graphicsDevice: GraphicsDevice) = this()
  
  var effect: Any = js.native
  
  var inputTarget: Any = js.native
  
  var name: Any = js.native
  
  var outputTarget: Any = js.native
}
object PostEffect_ {
  
  @JSImport("playcanvas", "PostEffect")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A simple vertex shader used to render a quad, which requires 'vec2 aPosition' in the vertex
    * buffer, and generates uv coordinates vUv0 for use in the fragment shader.
    *
    * @type {string}
    */
  /* static member */
  @JSImport("playcanvas", "PostEffect.quadVertexShader")
  @js.native
  def quadVertexShader: String = js.native
  inline def quadVertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quadVertexShader")(x.asInstanceOf[js.Any])
}
