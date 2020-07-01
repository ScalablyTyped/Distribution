package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base mesh class.
  *
  * This class empowers you to have maximum flexibility to render any kind of WebGL visuals you can think of.
  * This class assumes a certain level of WebGL knowledge.
  * If you know a bit this should abstract enough away to make you life easier!
  *
  * Pretty much ALL WebGL can be broken down into the following:
  * - Geometry - The structure and data for the mesh. This can include anything from positions, uvs, normals, colors etc..
  * - Shader - This is the shader that PixiJS will render the geometry with (attributes in the shader must match the geometry)
  * - State - This is the state of WebGL required to render the mesh.
  *
  * Through a combination of the above elements you can render anything you want, 2D or 3D!
  *
  * @class
  * @extends PIXI.Container
  * @memberof PIXI
  */
@JSImport("pixi.js", "Mesh")
@js.native
class Mesh protected ()
  extends typings.pixiJs.PIXI.Mesh {
  def this(geometry: typings.pixiJs.PIXI.Geometry, shader: typings.pixiJs.PIXI.MeshMaterial) = this()
  def this(
    geometry: typings.pixiJs.PIXI.Geometry,
    shader: typings.pixiJs.PIXI.MeshMaterial,
    state: typings.pixiJs.PIXI.State
  ) = this()
  def this(
    geometry: typings.pixiJs.PIXI.Geometry,
    shader: typings.pixiJs.PIXI.MeshMaterial,
    state: typings.pixiJs.PIXI.State,
    drawMode: Double
  ) = this()
}

/* static members */
@JSImport("pixi.js", "Mesh")
@js.native
object Mesh extends js.Object {
  /**
    * The maximum number of vertices to consider batchable. Generally, the complexity
    * of the geometry.
    * @memberof PIXI.Mesh
    * @static
    * @member {number} BATCHABLE_SIZE
    */
  var BATCHABLE_SIZE: Double = js.native
}

