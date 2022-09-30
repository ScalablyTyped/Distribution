package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "ViewableBuffer")
@js.native
open class ViewableBuffer protected ()
  extends typings.pixiCore.mod.ViewableBuffer {
  /**
    * @param arrayBuffer - The source array buffer.
    */
  def this(arrayBuffer: js.typedarray.ArrayBuffer) = this()
  /**
    * @param length - The size of the buffer in bytes.
    */
  def this(length: Double) = this()
}
/* static members */
object ViewableBuffer {
  
  @JSImport("pixi.js", "ViewableBuffer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def sizeOf(`type`: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
}
