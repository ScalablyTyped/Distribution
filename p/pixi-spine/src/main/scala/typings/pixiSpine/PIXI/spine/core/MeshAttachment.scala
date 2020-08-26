package typings.pixiSpine.PIXI.spine.core

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshAttachment extends VertexAttachment {
  var color: Color = js.native
  var edges: js.Array[Double] = js.native
  var height: Double = js.native
  var hullLength: Double = js.native
  var parentMesh: js.Any = js.native
  var path: String = js.native
  var region: TextureRegion = js.native
  var regionUVs: Float32Array = js.native
  var tempColor: Color = js.native
  var triangles: js.Array[Double] = js.native
  var uvs: ArrayLike[Double] = js.native
  var width: Double = js.native
  def getParentMesh(): MeshAttachment = js.native
  def newLinkedMesh(): MeshAttachment = js.native
  def setParentMesh(parentMesh: MeshAttachment): Unit = js.native
}

object MeshAttachment {
  @scala.inline
  def apply(
    bones: js.Array[Double],
    color: Color,
    computeWorldVertices: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit,
    computeWorldVerticesOld: (Slot, ArrayLike[Double]) => Unit,
    copy: () => Attachment,
    copyTo: VertexAttachment => Unit,
    deformAttachment: VertexAttachment,
    edges: js.Array[Double],
    getParentMesh: () => MeshAttachment,
    height: Double,
    hullLength: Double,
    id: Double,
    name: String,
    newLinkedMesh: () => MeshAttachment,
    parentMesh: js.Any,
    path: String,
    region: TextureRegion,
    regionUVs: Float32Array,
    setParentMesh: MeshAttachment => Unit,
    tempColor: Color,
    triangles: js.Array[Double],
    uvs: ArrayLike[Double],
    vertices: ArrayLike[Double],
    width: Double,
    worldVerticesLength: Double
  ): MeshAttachment = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], computeWorldVertices = js.Any.fromFunction6(computeWorldVertices), computeWorldVerticesOld = js.Any.fromFunction2(computeWorldVerticesOld), copy = js.Any.fromFunction0(copy), copyTo = js.Any.fromFunction1(copyTo), deformAttachment = deformAttachment.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], getParentMesh = js.Any.fromFunction0(getParentMesh), height = height.asInstanceOf[js.Any], hullLength = hullLength.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newLinkedMesh = js.Any.fromFunction0(newLinkedMesh), parentMesh = parentMesh.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], regionUVs = regionUVs.asInstanceOf[js.Any], setParentMesh = js.Any.fromFunction1(setParentMesh), tempColor = tempColor.asInstanceOf[js.Any], triangles = triangles.asInstanceOf[js.Any], uvs = uvs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshAttachment]
  }
  @scala.inline
  implicit class MeshAttachmentOps[Self <: MeshAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdgesVarargs(value: Double*): Self = this.set("edges", js.Array(value :_*))
    @scala.inline
    def setEdges(value: js.Array[Double]): Self = this.set("edges", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetParentMesh(value: () => MeshAttachment): Self = this.set("getParentMesh", js.Any.fromFunction0(value))
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setHullLength(value: Double): Self = this.set("hullLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewLinkedMesh(value: () => MeshAttachment): Self = this.set("newLinkedMesh", js.Any.fromFunction0(value))
    @scala.inline
    def setParentMesh(value: js.Any): Self = this.set("parentMesh", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: TextureRegion): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegionUVs(value: Float32Array): Self = this.set("regionUVs", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetParentMesh(value: MeshAttachment => Unit): Self = this.set("setParentMesh", js.Any.fromFunction1(value))
    @scala.inline
    def setTempColor(value: Color): Self = this.set("tempColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrianglesVarargs(value: Double*): Self = this.set("triangles", js.Array(value :_*))
    @scala.inline
    def setTriangles(value: js.Array[Double]): Self = this.set("triangles", value.asInstanceOf[js.Any])
    @scala.inline
    def setUvs(value: ArrayLike[Double]): Self = this.set("uvs", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

