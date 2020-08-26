package typings.openjscad.anon

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import typings.three.materialMod.Material
import typings.three.mod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundLen extends js.Object {
  var boundLen: Double = js.native
  var colorMesh: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]] = js.native
  var wireframe: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]] = js.native
}

object BoundLen {
  @scala.inline
  def apply(
    boundLen: Double,
    colorMesh: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]],
    wireframe: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]]
  ): BoundLen = {
    val __obj = js.Dynamic.literal(boundLen = boundLen.asInstanceOf[js.Any], colorMesh = colorMesh.asInstanceOf[js.Any], wireframe = wireframe.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundLen]
  }
  @scala.inline
  implicit class BoundLenOps[Self <: BoundLen] (val x: Self) extends AnyVal {
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
    def setBoundLen(value: Double): Self = this.set("boundLen", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorMesh(value: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]]): Self = this.set("colorMesh", value.asInstanceOf[js.Any])
    @scala.inline
    def setWireframe(value: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]]): Self = this.set("wireframe", value.asInstanceOf[js.Any])
  }
  
}

