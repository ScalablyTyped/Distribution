package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.NumberArrayLike
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "VertexAttachment")
@js.native
abstract class VertexAttachment protected () extends Attachment {
  def this(name: String) = this()
  
  /** The bones which affect the {@link #getVertices()}. The array entries are, for each vertex, the number of bones affecting
    * the vertex followed by that many bone indices, which is the index of the bone in {@link Skeleton#bones}. Will be null
    * if this attachment has no weights. */
  var bones: js.Array[Double] | Null = js.native
  
  /** Transforms the attachment's local {@link #vertices} to world coordinates. If the slot's {@link Slot#deform} is
    * not empty, it is used to deform the vertices.
    *
    * See [World transforms](http://esotericsoftware.com/spine-runtime-skeletons#World-transforms) in the Spine
    * Runtimes Guide.
    * @param start The index of the first {@link #vertices} value to transform. Each vertex has 2 values, x and y.
    * @param count The number of world vertex values to output. Must be <= {@link #worldVerticesLength} - `start`.
    * @param worldVertices The output world vertices. Must have a length >= `offset` + `count` *
    *           `stride` / 2.
    * @param offset The `worldVertices` index to begin writing values.
    * @param stride The number of `worldVertices` entries between the value pairs written. */
  def computeWorldVertices(
    slot: Slot,
    start: Double,
    count: Double,
    worldVertices: NumberArrayLike,
    offset: Double,
    stride: Double
  ): Unit = js.native
  
  def computeWorldVerticesOld(slot: Slot, worldVertices: ArrayLike[Double]): Unit = js.native
  
  /** Does not copy id (generated) or name (set on construction). **/
  def copyTo(attachment: VertexAttachment): Unit = js.native
  
  /** The unique ID for this attachment. */
  var id: Double = js.native
  
  /** Timelines for the timeline attachment are also applied to this attachment.
    * May be null if no attachment-specific timelines should be applied. */
  var timelineAttachment: Attachment = js.native
  
  /** The vertex positions in the bone's coordinate system. For a non-weighted attachment, the values are `x,y`
    * entries for each vertex. For a weighted attachment, the values are `x,y,weight` entries for each bone affecting
    * each vertex. */
  var vertices: NumberArrayLike = js.native
  
  /** The maximum number of world vertex values that can be output by
    * {@link #computeWorldVertices()} using the `count` parameter. */
  var worldVerticesLength: Double = js.native
}
/* static members */
object VertexAttachment {
  
  @JSImport("@pixi-spine/runtime-4.1", "VertexAttachment")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-4.1", "VertexAttachment.nextID")
  @js.native
  def nextID: Any = js.native
  inline def nextID_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextID")(x.asInstanceOf[js.Any])
}
