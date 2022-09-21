package typings.pixiCore.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.pixiConstants.mod.DRAW_MODES
import typings.std.WebGLVertexArrayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "GeometrySystem")
@js.native
open class GeometrySystem protected ()
  extends StObject
     with ISystem {
  /** @param renderer - The renderer this System works for. */
  def this(renderer: Renderer) = this()
  
  /* protected */ var CONTEXT_UID: Double = js.native
  
  /* protected */ var _activeGeometry: Geometry = js.native
  
  /* protected */ var _activeVao: WebGLVertexArrayObject = js.native
  
  /* protected */ var _boundBuffer: GLBuffer = js.native
  
  /**
    * Activate vertex array object.
    * @param geometry - Geometry instance.
    * @param program - Shader program instance.
    */
  /* protected */ def activateVao(geometry: Geometry, program: Program): Unit = js.native
  
  /**
    * Binds geometry so that is can be drawn. Creating a Vao if required
    * @param geometry - Instance of geometry to bind.
    * @param shader - Instance of shader to use vao for.
    */
  def bind(): Unit = js.native
  def bind(geometry: Unit, shader: Shader): Unit = js.native
  def bind(geometry: Geometry): Unit = js.native
  def bind(geometry: Geometry, shader: Shader): Unit = js.native
  
  /**
    * `true` if support `gl.UNSIGNED_INT` in `gl.drawElements` or `gl.drawElementsInstanced`.
    * @readonly
    */
  var canUseUInt32ElementIndex: Boolean = js.native
  
  /**
    * Check compatibility between a geometry and a program
    * @param geometry - Geometry instance.
    * @param program - Program instance.
    */
  /* protected */ def checkCompatibility(geometry: Geometry, program: Program): Unit = js.native
  
  /** Sets up the renderer context and necessary buffers. */
  /* protected */ def contextChange(): Unit = js.native
  
  /** Generic destroy methods to be overridden by the subclass */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * Dispose all WebGL resources of all managed geometries.
    * @param [contextLost=false] - If context was lost, we suppress `gl.delete` calls
    */
  def disposeAll(): Unit = js.native
  def disposeAll(contextLost: Boolean): Unit = js.native
  
  /**
    * Disposes geometry.
    * @param geometry - Geometry with buffers. Only VAO will be disposed
    * @param [contextLost=false] - If context was lost, we suppress deleteVertexArray
    */
  def disposeGeometry(geometry: Geometry): Unit = js.native
  def disposeGeometry(geometry: Geometry, contextLost: Boolean): Unit = js.native
  
  /**
    * Draws the currently bound geometry.
    * @param type - The type primitive to render.
    * @param size - The number of elements to be rendered. If not specified, all vertices after the
    *  starting vertex will be drawn.
    * @param start - The starting vertex in the geometry to start drawing from. If not specified,
    *  drawing will start from the first vertex.
    * @param instanceCount - The number of instances of the set of elements to execute. If not specified,
    *  all instances will be drawn.
    */
  def draw(`type`: DRAW_MODES): this.type = js.native
  def draw(`type`: DRAW_MODES, size: Double): this.type = js.native
  def draw(`type`: DRAW_MODES, size: Double, start: Double): this.type = js.native
  def draw(`type`: DRAW_MODES, size: Double, start: Double, instanceCount: Double): this.type = js.native
  def draw(`type`: DRAW_MODES, size: Double, start: Unit, instanceCount: Double): this.type = js.native
  def draw(`type`: DRAW_MODES, size: Unit, start: Double): this.type = js.native
  def draw(`type`: DRAW_MODES, size: Unit, start: Double, instanceCount: Double): this.type = js.native
  def draw(`type`: DRAW_MODES, size: Unit, start: Unit, instanceCount: Double): this.type = js.native
  
  /**
    * Takes a geometry and program and generates a unique signature for them.
    * @param geometry - To get signature from.
    * @param program - To test geometry against.
    * @returns - Unique signature of the geometry and program
    */
  /* protected */ def getSignature(geometry: Geometry, program: Program): String = js.native
  
  /* protected */ var gl: IRenderingContext = js.native
  
  /**
    * `true` if has `ANGLE_instanced_arrays` extension.
    * @readonly
    */
  var hasInstance: Boolean = js.native
  
  /**
    * `true` if we has `*_vertex_array_object` extension.
    * @readonly
    */
  var hasVao: Boolean = js.native
  
  /**
    * Creates or gets Vao with the same structure as the geometry and stores it on the geometry.
    * If vao is created, it is bound automatically. We use a shader to infer what and how to set up the
    * attribute locations.
    * @param geometry - Instance of geometry to to generate Vao for.
    * @param shader - Instance of the shader.
    * @param incRefCount - Increment refCount of all geometry buffers.
    */
  /* protected */ def initGeometryVao(geometry: Geometry, shader: Shader): WebGLVertexArrayObject = js.native
  /* protected */ def initGeometryVao(geometry: Geometry, shader: Shader, incRefCount: Boolean): WebGLVertexArrayObject = js.native
  
  /** Cache for all geometries by id, used in case renderer gets destroyed or for profiling. */
  val managedGeometries: NumberDictionary[Geometry] = js.native
  
  /** Renderer that owns this {@link GeometrySystem}. */
  /* private */ var renderer: Any = js.native
  
  /** Reset and unbind any active VAO and geometry. */
  def reset(): Unit = js.native
  
  /** Unbind/reset everything. */
  /* protected */ def unbind(): Unit = js.native
  
  /** Update buffers of the currently bound geometry. */
  def updateBuffers(): Unit = js.native
}
