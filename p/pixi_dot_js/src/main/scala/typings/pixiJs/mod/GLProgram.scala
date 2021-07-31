package typings.pixiJs.mod

import typings.std.WebGLProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper class to create a WebGL Program
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "GLProgram")
@js.native
class GLProgram protected ()
  extends StObject
     with typings.pixiJs.PIXI.GLProgram {
  def this(program: WebGLProgram, uniformData: js.Any) = this()
  
  /**
    * Destroys this program
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
}
