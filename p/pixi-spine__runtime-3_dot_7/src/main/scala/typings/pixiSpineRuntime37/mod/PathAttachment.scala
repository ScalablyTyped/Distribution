package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "PathAttachment")
@js.native
open class PathAttachment protected () extends VertexAttachment {
  def this(name: String) = this()
  
  var closed: Boolean = js.native
  
  var color: Color = js.native
  
  var constantSpeed: Boolean = js.native
  
  var lengths: js.Array[Double] = js.native
}
