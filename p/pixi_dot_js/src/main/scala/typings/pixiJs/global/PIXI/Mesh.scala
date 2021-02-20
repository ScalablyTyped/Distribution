package typings.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSGlobal("PIXI.Mesh")
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
    state: js.UndefOr[scala.Nothing],
    drawMode: Double
  ) = this()
  def this(
    geometry: typings.pixiJs.PIXI.Geometry,
    shader: typings.pixiJs.PIXI.MeshMaterial,
    state: typings.pixiJs.PIXI.State,
    drawMode: Double
  ) = this()
}
object Mesh {
  
  @JSGlobal("PIXI.Mesh")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The maximum number of vertices to consider batchable. Generally, the complexity
    * of the geometry.
    * @memberof PIXI.Mesh
    * @static
    * @member {number} BATCHABLE_SIZE
    */
  /* static member */
  @JSGlobal("PIXI.Mesh.BATCHABLE_SIZE")
  @js.native
  def BATCHABLE_SIZE: Double = js.native
  @scala.inline
  def BATCHABLE_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BATCHABLE_SIZE")(x.asInstanceOf[js.Any])
}
