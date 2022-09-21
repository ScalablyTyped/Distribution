package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.ArrayLike2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "VertexAttachment")
@js.native
abstract class VertexAttachment protected () extends Attachment {
  def this(name: String) = this()
  
  /** Returns true if a deform originally applied to the specified attachment should be applied to this attachment. */
  def applyDeform(sourceAttachment: VertexAttachment): Boolean = js.native
  
  var bones: js.Array[Double] = js.native
  
  /** Transforms local vertices to world coordinates.
    * @param start The index of the first local vertex value to transform. Each vertex has 2 values, x and y.
    * @param count The number of world vertex values to output. Must be <= {@link #getWorldVerticesLength()} - start.
    * @param worldVertices The output world vertices. Must have a length >= offset + count.
    * @param offset The worldVertices index to begin writing values. */
  def computeWorldVertices(
    slot: Slot,
    start: Double,
    count: Double,
    worldVertices: ArrayLike2[Double],
    offset: Double,
    stride: Double
  ): Unit = js.native
  
  def computeWorldVerticesOld(slot: Slot, worldVertices: ArrayLike2[Double]): Unit = js.native
  
  var id: Double = js.native
  
  var vertices: ArrayLike2[Double] = js.native
  
  var worldVerticesLength: Double = js.native
}
/* static members */
object VertexAttachment {
  
  @JSImport("@pixi-spine/runtime-3.7", "VertexAttachment")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.7", "VertexAttachment.nextID")
  @js.native
  def nextID: Any = js.native
  inline def nextID_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextID")(x.asInstanceOf[js.Any])
}
