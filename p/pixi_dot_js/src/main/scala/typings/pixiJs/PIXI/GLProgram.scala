package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper class to create a WebGL Program
  *
  * @class
  * @memberof PIXI
  */
trait GLProgram extends StObject {
  
  /**
    * Destroys this program
    */
  def destroy(): Unit
}
object GLProgram {
  
  @scala.inline
  def apply(destroy: () => Unit): GLProgram = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[GLProgram]
  }
  
  @scala.inline
  implicit class GLProgramMutableBuilder[Self <: GLProgram] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
