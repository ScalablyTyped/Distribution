package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "PathAttachment")
@js.native
open class PathAttachment protected () extends VertexAttachment {
  def this(name: String) = this()
  
  /** If true, the start and end knots are connected. */
  var closed: Boolean = js.native
  
  /** The color of the path as it was in Spine. Available only when nonessential data was exported. Paths are not usually
    * rendered at runtime. */
  var color: Color = js.native
  
  /** If true, additional calculations are performed to make calculating positions along the path more accurate. If false, fewer
    * calculations are performed but calculating positions along the path is less accurate. */
  var constantSpeed: Boolean = js.native
  
  /** The lengths along the path in the setup pose from the start of the path to the end of each Bezier curve. */
  var lengths: js.Array[Double] = js.native
}
