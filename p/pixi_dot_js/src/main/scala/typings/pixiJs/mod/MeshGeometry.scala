package typings.pixiJs.mod

import typings.pixiCore.libGeometryBufferMod.IArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "MeshGeometry")
@js.native
/**
  * @param {Float32Array|number[]} [vertices] - Positional data on geometry.
  * @param {Float32Array|number[]} [uvs] - Texture UVs.
  * @param {Uint16Array|number[]} [index] - IndexBuffer
  */
open class MeshGeometry ()
  extends typings.pixiMesh.mod.MeshGeometry {
  def this(vertices: IArrayBuffer) = this()
  def this(vertices: Unit, uvs: IArrayBuffer) = this()
  def this(vertices: IArrayBuffer, uvs: IArrayBuffer) = this()
  def this(vertices: Unit, uvs: Unit, index: IArrayBuffer) = this()
  def this(vertices: Unit, uvs: IArrayBuffer, index: IArrayBuffer) = this()
  def this(vertices: IArrayBuffer, uvs: Unit, index: IArrayBuffer) = this()
  def this(vertices: IArrayBuffer, uvs: IArrayBuffer, index: IArrayBuffer) = this()
}
