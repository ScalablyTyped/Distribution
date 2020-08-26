package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.Buffer
import typings.pixiJs.PIXI.Geometry
import typings.pixiJs.PIXI.Program
import typings.pixiJs.PIXI.Shader
import typings.pixiJs.PIXI.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage geometry.
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
@js.native
trait GeometrySystem extends System {
  /**
    * `true` if support `gl.UNSIGNED_INT` in `gl.drawElements` or `gl.drawElementsInstanced`
    * @member {boolean} PIXI.systems.GeometrySystem#canUseUInt32ElementIndex
    * @readonly
    */
  val canUseUInt32ElementIndex: Boolean = js.native
  /**
    * `true` if has `ANGLE_instanced_arrays` extension
    * @member {boolean} PIXI.systems.GeometrySystem#hasInstance
    * @readonly
    */
  val hasInstance: Boolean = js.native
  /**
    * `true` if we has `*_vertex_array_object` extension
    * @member {boolean} PIXI.systems.GeometrySystem#hasVao
    * @readonly
    */
  val hasVao: Boolean = js.native
  /**
    * Cache for all buffers by id, used in case renderer gets destroyed or for profiling
    * @member {object} PIXI.systems.GeometrySystem#managedBuffers
    * @readonly
    */
  val managedBuffers: js.Any = js.native
  /**
    * Cache for all geometries by id, used in case renderer gets destroyed or for profiling
    * @member {object} PIXI.systems.GeometrySystem#managedGeometries
    * @readonly
    */
  val managedGeometries: js.Any = js.native
  /**
    * Activate vertex array object
    *
    * @protected
    * @param {PIXI.Geometry} geometry - Geometry instance
    * @param {PIXI.Program} program - Shader program instance
    */
  /* protected */ def activateVao(geometry: Geometry, program: Program): Unit = js.native
  /**
    * Binds geometry so that is can be drawn. Creating a Vao if required
    *
    * @param {PIXI.Geometry} geometry - instance of geometry to bind
    * @param {PIXI.Shader} [shader] - instance of shader to use vao for
    */
  def bind(geometry: Geometry): Unit = js.native
  def bind(geometry: Geometry, shader: Shader): Unit = js.native
  /**
    * Check compability between a geometry and a program
    * @protected
    * @param {PIXI.Geometry} geometry - Geometry instance
    * @param {PIXI.Program} program - Program instance
    */
  /* protected */ def checkCompatibility(geometry: Geometry, program: Program): Unit = js.native
  /**
    * Sets up the renderer context and necessary buffers.
    */
  def contextChange(): Unit = js.native
  /**
    * dispose all WebGL resources of all managed geometries and buffers
    * @param {boolean} [contextLost=false] - If context was lost, we suppress `gl.delete` calls
    */
  def disposeAll(): Unit = js.native
  def disposeAll(contextLost: Boolean): Unit = js.native
  /**
    * Disposes buffer
    * @param {PIXI.Buffer} buffer - buffer with data
    * @param {boolean} [contextLost=false] - If context was lost, we suppress deleteVertexArray
    */
  def disposeBuffer(buffer: Buffer): Unit = js.native
  def disposeBuffer(buffer: Buffer, contextLost: Boolean): Unit = js.native
  /**
    * Disposes geometry
    * @param {PIXI.Geometry} geometry - Geometry with buffers. Only VAO will be disposed
    * @param {boolean} [contextLost=false] - If context was lost, we suppress deleteVertexArray
    */
  def disposeGeometry(geometry: Geometry): Unit = js.native
  def disposeGeometry(geometry: Geometry, contextLost: Boolean): Unit = js.native
  /**
    * Draw the geometry
    *
    * @param {Number} type - the type primitive to render
    * @param {Number} [size] - the number of elements to be rendered
    * @param {Number} [start] - Starting index
    * @param {Number} [instanceCount] - the number of instances of the set of elements to execute
    */
  def draw(`type`: Double): Unit = js.native
  def draw(
    `type`: Double,
    size: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    instanceCount: Double
  ): Unit = js.native
  def draw(`type`: Double, size: js.UndefOr[scala.Nothing], start: Double): Unit = js.native
  def draw(`type`: Double, size: js.UndefOr[scala.Nothing], start: Double, instanceCount: Double): Unit = js.native
  def draw(`type`: Double, size: Double): Unit = js.native
  def draw(`type`: Double, size: Double, start: js.UndefOr[scala.Nothing], instanceCount: Double): Unit = js.native
  def draw(`type`: Double, size: Double, start: Double): Unit = js.native
  def draw(`type`: Double, size: Double, start: Double, instanceCount: Double): Unit = js.native
  /**
    * Takes a geometry and program and generates a unique signature for them.
    *
    * @param {PIXI.Geometry} geometry - to get signature from
    * @param {PIXI.Program} program - to test geometry against
    * @returns {String} Unique signature of the geometry and program
    * @protected
    */
  /* protected */ def getSignature(geometry: Geometry, program: Program): String = js.native
  /**
    * Creates or gets Vao with the same structure as the geometry and stores it on the geometry.
    * If vao is created, it is bound automatically.
    *
    * @protected
    * @param {PIXI.Geometry} geometry - Instance of geometry to to generate Vao for
    * @param {PIXI.Program} program - Instance of program
    */
  /* protected */ def initGeometryVao(geometry: Geometry, program: Program): Unit = js.native
  /**
    * Reset and unbind any active VAO and geometry
    */
  def reset(): Unit = js.native
  /**
    * Unbind/reset everything
    * @protected
    */
  /* protected */ def unbind(): Unit = js.native
  /**
    * Update buffers
    * @protected
    */
  /* protected */ def updateBuffers(): Unit = js.native
}

