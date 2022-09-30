package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "Mesh")
@js.native
open class Mesh[T /* <: typings.pixiCore.mod.Shader */] protected ()
  extends typings.pixiMesh.mod.Mesh[T] {
  /**
    * @param geometry - The geometry the mesh will use.
    * @param {PIXI.MeshMaterial} shader - The shader the mesh will use.
    * @param state - The state that the WebGL context is required to be in to render the mesh
    *        if no state is provided, uses {@link PIXI.State.for2d} to create a 2D state for PixiJS.
    * @param drawMode - The drawMode, can be any of the {@link PIXI.DRAW_MODES} constants.
    */
  def this(geometry: typings.pixiCore.mod.Geometry, shader: T) = this()
  def this(geometry: typings.pixiCore.mod.Geometry, shader: T, state: typings.pixiCore.mod.State) = this()
  def this(
    geometry: typings.pixiCore.mod.Geometry,
    shader: T,
    state: Unit,
    drawMode: typings.pixiConstants.mod.DRAW_MODES
  ) = this()
  def this(
    geometry: typings.pixiCore.mod.Geometry,
    shader: T,
    state: typings.pixiCore.mod.State,
    drawMode: typings.pixiConstants.mod.DRAW_MODES
  ) = this()
}
/* static members */
object Mesh {
  
  @JSImport("pixi.js", "Mesh")
  @js.native
  val ^ : js.Any = js.native
  
  /** The maximum number of vertices to consider batchable. Generally, the complexity of the geometry. */
  @JSImport("pixi.js", "Mesh.BATCHABLE_SIZE")
  @js.native
  def BATCHABLE_SIZE: Double = js.native
  inline def BATCHABLE_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BATCHABLE_SIZE")(x.asInstanceOf[js.Any])
}
