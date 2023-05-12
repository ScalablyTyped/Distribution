package typings.playcanvas.mod

import typings.playcanvas.anon.Base
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A graphical primitive. The mesh is defined by a {@link VertexBuffer} and an optional
  * {@link IndexBuffer}. It also contains a primitive definition which controls the type of the
  * primitive and the portion of the vertex or index buffer to use.
  *
  * ## Mesh APIs
  * There are two ways a mesh can be generated or updated.
  *
  * ### Simple Mesh API
  * {@link Mesh} class provides interfaces such as {@link Mesh#setPositions} and {@link Mesh#setUvs}
  * that provide a simple way to provide vertex and index data for the Mesh, and hiding the
  * complexity of creating the {@link VertexFormat}. This is the recommended interface to use.
  *
  * A simple example which creates a Mesh with 3 vertices, containing position coordinates only, to
  * form a single triangle.
  *
  * ```javascript
  * const mesh = new pc.Mesh(device);
  * const positions = [
  *     0, 0, 0, // pos 0
  *     1, 0, 0, // pos 1
  *     1, 1, 0  // pos 2
  * ];
  * mesh.setPositions(positions);
  * mesh.update();
  * ```
  *
  * An example which creates a Mesh with 4 vertices, containing position and uv coordinates in
  * channel 0, and an index buffer to form two triangles. Float32Array is used for positions and uvs.
  *
  * ```javascript
  * const mesh = new pc.Mesh(device);
  * const positions = new Float32Array([
  *     0, 0, 0, // pos 0
  *     1, 0, 0, // pos 1
  *     1, 1, 0, // pos 2
  *     0, 1, 0  // pos 3
  * ]);
  * const uvs = new Float32Array([
  *     0, 0, // uv 0
  *     1, 0, // uv 1
  *     1, 1, // uv 2
  *     0, 1  // uv 3
  * ]);
  * const indices = [
  *     0, 1, 2, // triangle 0
  *     0, 2, 3  // triangle 1
  * ];
  * mesh.setPositions(positions);
  * mesh.setUvs(0, uvs);
  * mesh.setIndices(indices);
  * mesh.update();
  * ```
  *
  * This example demonstrates that vertex attributes such as position and normals, and also indices
  * can be provided using Arrays ([]) and also Typed Arrays (Float32Array and similar). Note that
  * typed arrays have higher performance, and are generally recommended for per-frame operations or
  * larger meshes, but their construction using new operator is costly operation. If you only need
  * to operate on a small number of vertices or indices, consider using Arrays to avoid the overhead
  * associated with allocating Typed Arrays.
  *
  * Follow these links for more complex examples showing the functionality.
  *
  * - {@link http://playcanvas.github.io/#graphics/mesh-decals}
  * - {@link http://playcanvas.github.io/#graphics/mesh-deformation}
  * - {@link http://playcanvas.github.io/#graphics/mesh-generation}
  * - {@link http://playcanvas.github.io/#graphics/point-cloud-simulation}
  *
  * ### Update Vertex and Index buffers
  * This allows greater flexibility, but is more complex to use. It allows more advanced setups, for
  * example sharing a Vertex or Index Buffer between multiple meshes. See {@link VertexBuffer},
  * {@link IndexBuffer} and {@link VertexFormat} for details.
  */
@JSImport("playcanvas", "Mesh")
@js.native
/**
  * Create a new Mesh instance.
  *
  * @param {import('../platform/graphics/graphics-device.js').GraphicsDevice} [graphicsDevice] -
  * The graphics device used to manage this mesh. If it is not provided, a device is obtained
  * from the {@link Application}.
  */
open class Mesh ()
  extends StObject
     with RefCountedObject {
  def this(graphicsDevice: GraphicsDevice) = this()
  
  var _aabb: BoundingBox = js.native
  
  def _buildVertexFormat(vertexCount: Any): VertexFormat = js.native
  
  def _destroyIndexBuffer(index: Any): Unit = js.native
  
  var _geometryData: GeometryData = js.native
  
  def _initBoneAabbs(morphTargets: Any): Unit = js.native
  
  def _initGeometryData(): Unit = js.native
  
  var _morph: Any = js.native
  
  def _updateIndexBuffer(): Unit = js.native
  
  def _updateVertexBuffer(): Unit = js.native
  
  def aabb: BoundingBox = js.native
  /**
    * The axis-aligned bounding box for the object space vertices of this mesh.
    *
    * @type {BoundingBox}
    */
  def aabb_=(arg: BoundingBox): Unit = js.native
  
  var boneAabb: js.Array[Any] = js.native
  
  var boneUsed: js.Array[Any] = js.native
  
  /**
    * Clears the mesh of existing vertices and indices and resets the {@link VertexFormat}
    * associated with the mesh. This call is typically followed by calls to methods such as
    * {@link Mesh#setPositions}, {@link Mesh#setVertexStream} or {@link Mesh#setIndices} and
    * finally {@link Mesh#update} to rebuild the mesh, allowing different {@link VertexFormat}.
    *
    * @param {boolean} [verticesDynamic] - Indicates the {@link VertexBuffer} should be created
    * with {@link BUFFER_DYNAMIC} usage. If not specified, {@link BUFFER_STATIC} is used.
    * @param {boolean} [indicesDynamic] - Indicates the {@link IndexBuffer} should be created with
    * {@link BUFFER_DYNAMIC} usage. If not specified, {@link BUFFER_STATIC} is used.
    * @param {number} [maxVertices] - A {@link VertexBuffer} will be allocated with at least
    * maxVertices, allowing additional vertices to be added to it without the allocation. If no
    * value is provided, a size to fit the provided vertices will be allocated.
    * @param {number} [maxIndices] - An {@link IndexBuffer} will be allocated with at least
    * maxIndices, allowing additional indices to be added to it without the allocation. If no
    * value is provided, a size to fit the provided indices will be allocated.
    */
  def clear(): Unit = js.native
  def clear(verticesDynamic: Boolean): Unit = js.native
  def clear(verticesDynamic: Boolean, indicesDynamic: Boolean): Unit = js.native
  def clear(verticesDynamic: Boolean, indicesDynamic: Boolean, maxVertices: Double): Unit = js.native
  def clear(verticesDynamic: Boolean, indicesDynamic: Boolean, maxVertices: Double, maxIndices: Double): Unit = js.native
  def clear(verticesDynamic: Boolean, indicesDynamic: Boolean, maxVertices: Unit, maxIndices: Double): Unit = js.native
  def clear(verticesDynamic: Boolean, indicesDynamic: Unit, maxVertices: Double): Unit = js.native
  def clear(verticesDynamic: Boolean, indicesDynamic: Unit, maxVertices: Double, maxIndices: Double): Unit = js.native
  def clear(verticesDynamic: Boolean, indicesDynamic: Unit, maxVertices: Unit, maxIndices: Double): Unit = js.native
  def clear(verticesDynamic: Unit, indicesDynamic: Boolean): Unit = js.native
  def clear(verticesDynamic: Unit, indicesDynamic: Boolean, maxVertices: Double): Unit = js.native
  def clear(verticesDynamic: Unit, indicesDynamic: Boolean, maxVertices: Double, maxIndices: Double): Unit = js.native
  def clear(verticesDynamic: Unit, indicesDynamic: Boolean, maxVertices: Unit, maxIndices: Double): Unit = js.native
  def clear(verticesDynamic: Unit, indicesDynamic: Unit, maxVertices: Double): Unit = js.native
  def clear(verticesDynamic: Unit, indicesDynamic: Unit, maxVertices: Double, maxIndices: Double): Unit = js.native
  def clear(verticesDynamic: Unit, indicesDynamic: Unit, maxVertices: Unit, maxIndices: Double): Unit = js.native
  
  /**
    * Destroys {@link VertexBuffer} and {@link IndexBuffer} associate with the mesh. This is
    * normally called by {@link Model#destroy} and does not need to be called manually.
    */
  def destroy(): Unit = js.native
  
  var device: Any = js.native
  
  def generateWireframe(): Unit = js.native
  
  /**
    * Gets the vertex color data.
    *
    * @param {number[]|Int8Array|Uint8Array|Uint8ClampedArray|Int16Array|Uint16Array|Int32Array|Uint32Array|Float32Array} colors - An
    * array to populate with the vertex data. When typed array is supplied, enough space needs to
    * be reserved, otherwise only partial data is copied.
    * @returns {number} Returns the number of vertices populated.
    */
  def getColors(colors: js.Array[Double]): Double = js.native
  def getColors(colors: js.typedarray.Float32Array): Double = js.native
  def getColors(colors: js.typedarray.Int16Array): Double = js.native
  def getColors(colors: js.typedarray.Int32Array): Double = js.native
  def getColors(colors: js.typedarray.Int8Array): Double = js.native
  def getColors(colors: js.typedarray.Uint16Array): Double = js.native
  def getColors(colors: js.typedarray.Uint32Array): Double = js.native
  def getColors(colors: js.typedarray.Uint8Array): Double = js.native
  def getColors(colors: js.typedarray.Uint8ClampedArray): Double = js.native
  
  /**
    * Gets the index data.
    *
    * @param {number[]|Uint8Array|Uint16Array|Uint32Array} indices - An array to populate with the
    * index data. When a typed array is supplied, enough space needs to be reserved, otherwise
    * only partial data is copied.
    * @returns {number} Returns the number of indices populated.
    */
  def getIndices(indices: js.Array[Double]): Double = js.native
  def getIndices(indices: js.typedarray.Uint16Array): Double = js.native
  def getIndices(indices: js.typedarray.Uint32Array): Double = js.native
  def getIndices(indices: js.typedarray.Uint8Array): Double = js.native
  
  /**
    * Gets the vertex normals data.
    *
    * @param {number[]|Int8Array|Uint8Array|Uint8ClampedArray|Int16Array|Uint16Array|Int32Array|Uint32Array|Float32Array} normals - An
    * array to populate with the vertex data. When typed array is supplied, enough space needs to
    * be reserved, otherwise only partial data is copied.
    * @returns {number} Returns the number of vertices populated.
    */
  def getNormals(normals: js.Array[Double]): Double = js.native
  def getNormals(normals: js.typedarray.Float32Array): Double = js.native
  def getNormals(normals: js.typedarray.Int16Array): Double = js.native
  def getNormals(normals: js.typedarray.Int32Array): Double = js.native
  def getNormals(normals: js.typedarray.Int8Array): Double = js.native
  def getNormals(normals: js.typedarray.Uint16Array): Double = js.native
  def getNormals(normals: js.typedarray.Uint32Array): Double = js.native
  def getNormals(normals: js.typedarray.Uint8Array): Double = js.native
  def getNormals(normals: js.typedarray.Uint8ClampedArray): Double = js.native
  
  /**
    * Gets the vertex positions data.
    *
    * @param {number[]|Int8Array|Uint8Array|Uint8ClampedArray|Int16Array|Uint16Array|Int32Array|Uint32Array|Float32Array} positions - An
    * array to populate with the vertex data. When typed array is supplied, enough space needs to
    * be reserved, otherwise only partial data is copied.
    * @returns {number} Returns the number of vertices populated.
    */
  def getPositions(positions: js.Array[Double]): Double = js.native
  def getPositions(positions: js.typedarray.Float32Array): Double = js.native
  def getPositions(positions: js.typedarray.Int16Array): Double = js.native
  def getPositions(positions: js.typedarray.Int32Array): Double = js.native
  def getPositions(positions: js.typedarray.Int8Array): Double = js.native
  def getPositions(positions: js.typedarray.Uint16Array): Double = js.native
  def getPositions(positions: js.typedarray.Uint32Array): Double = js.native
  def getPositions(positions: js.typedarray.Uint8Array): Double = js.native
  def getPositions(positions: js.typedarray.Uint8ClampedArray): Double = js.native
  
  /**
    * Gets the vertex uv data.
    *
    * @param {number} channel - The uv channel in [0..7] range.
    * @param {number[]|Int8Array|Uint8Array|Uint8ClampedArray|Int16Array|Uint16Array|Int32Array|Uint32Array|Float32Array} uvs - An
    * array to populate with the vertex data. When typed array is supplied, enough space needs to
    * be reserved, otherwise only partial data is copied.
    * @returns {number} Returns the number of vertices populated.
    */
  def getUvs(channel: Double, uvs: js.Array[Double]): Double = js.native
  def getUvs(channel: Double, uvs: js.typedarray.Float32Array): Double = js.native
  def getUvs(channel: Double, uvs: js.typedarray.Int16Array): Double = js.native
  def getUvs(channel: Double, uvs: js.typedarray.Int32Array): Double = js.native
  def getUvs(channel: Double, uvs: js.typedarray.Int8Array): Double = js.native
  def getUvs(channel: Double, uvs: js.typedarray.Uint16Array): Double = js.native
  def getUvs(channel: Double, uvs: js.typedarray.Uint32Array): Double = js.native
  def getUvs(channel: Double, uvs: js.typedarray.Uint8Array): Double = js.native
  def getUvs(channel: Double, uvs: js.typedarray.Uint8ClampedArray): Double = js.native
  
  /**
    * Gets the vertex data corresponding to a semantic.
    *
    * @param {string} semantic - The semantic of the vertex element to get. For supported
    * semantics, see SEMANTIC_* in {@link VertexFormat}.
    * @param {number[]|Int8Array|Uint8Array|Uint8ClampedArray|Int16Array|Uint16Array|Int32Array|Uint32Array|Float32Array} data - An
    * array to populate with the vertex data. When typed array is supplied, enough space needs to
    * be reserved, otherwise only partial data is copied.
    * @returns {number} Returns the number of vertices populated.
    */
  def getVertexStream(semantic: String, data: js.Array[Double]): Double = js.native
  def getVertexStream(semantic: String, data: js.typedarray.Float32Array): Double = js.native
  def getVertexStream(semantic: String, data: js.typedarray.Int16Array): Double = js.native
  def getVertexStream(semantic: String, data: js.typedarray.Int32Array): Double = js.native
  def getVertexStream(semantic: String, data: js.typedarray.Int8Array): Double = js.native
  def getVertexStream(semantic: String, data: js.typedarray.Uint16Array): Double = js.native
  def getVertexStream(semantic: String, data: js.typedarray.Uint32Array): Double = js.native
  def getVertexStream(semantic: String, data: js.typedarray.Uint8Array): Double = js.native
  def getVertexStream(semantic: String, data: js.typedarray.Uint8ClampedArray): Double = js.native
  
  var id: Double = js.native
  
  /**
    * An array of index buffers. For unindexed meshes, this array can be empty. The first
    * index buffer in the array is used by {@link MeshInstance}s with a renderStyle property
    * set to {@link RENDERSTYLE_SOLID}. The second index buffer in the array is used if
    * renderStyle is set to {@link RENDERSTYLE_WIREFRAME}.
    *
    * @type {IndexBuffer[]}
    */
  var indexBuffer: js.Array[IndexBuffer] = js.native
  
  def morph: Any = js.native
  /**
    * The morph data (if any) that drives morph target animations for this mesh.
    *
    * @type {import('./morph.js').Morph|null}
    */
  def morph_=(arg: Any): Unit = js.native
  
  def prepareRenderState(renderStyle: Any): Unit = js.native
  
  /**
    * Array of primitive objects defining how vertex (and index) data in the mesh should be
    * interpreted by the graphics device.
    *
    * - `type` is the type of primitive to render. Can be:
    *
    *   - {@link PRIMITIVE_POINTS}
    *   - {@link PRIMITIVE_LINES}
    *   - {@link PRIMITIVE_LINELOOP}
    *   - {@link PRIMITIVE_LINESTRIP}
    *   - {@link PRIMITIVE_TRIANGLES}
    *   - {@link PRIMITIVE_TRISTRIP}
    *   - {@link PRIMITIVE_TRIFAN}
    *
    * - `base` is the offset of the first index or vertex to dispatch in the draw call.
    * - `count` is the number of indices or vertices to dispatch in the draw call.
    * - `indexed` specifies whether to interpret the primitive as indexed, thereby using the
    * currently set index buffer.
    *
    * @type {Array.<{type: number, base: number, count: number, indexed: boolean|undefined}>}
    */
  var primitive: js.Array[Base] = js.native
  
  /**
    * Sets the vertex color array. Colors are stored using {@link TYPE_FLOAT32} format, which is
    * useful for HDR colors.
    *
    * @param {number[]|Int8Array|Uint8Array|Uint8ClampedArray|Int16Array|Uint16Array|Int32Array|Uint32Array|Float32Array} colors - Vertex
    * data containing colors.
    * @param {number} [componentCount] - The number of values that form a single color element.
    * Defaults to 4 if not specified, corresponding to r, g, b and a.
    * @param {number} [numVertices] - The number of vertices to be used from data array. If not
    * provided, the whole data array is used. This allows to use only part of the data array.
    */
  def setColors(colors: js.Array[Double]): Unit = js.native
  def setColors(colors: js.Array[Double], componentCount: Double): Unit = js.native
  def setColors(colors: js.Array[Double], componentCount: Double, numVertices: Double): Unit = js.native
  def setColors(colors: js.Array[Double], componentCount: Unit, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Float32Array): Unit = js.native
  def setColors(colors: js.typedarray.Float32Array, componentCount: Double): Unit = js.native
  def setColors(colors: js.typedarray.Float32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Float32Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Int16Array): Unit = js.native
  def setColors(colors: js.typedarray.Int16Array, componentCount: Double): Unit = js.native
  def setColors(colors: js.typedarray.Int16Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Int16Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Int32Array): Unit = js.native
  def setColors(colors: js.typedarray.Int32Array, componentCount: Double): Unit = js.native
  def setColors(colors: js.typedarray.Int32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Int32Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Int8Array): Unit = js.native
  def setColors(colors: js.typedarray.Int8Array, componentCount: Double): Unit = js.native
  def setColors(colors: js.typedarray.Int8Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Int8Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint16Array): Unit = js.native
  def setColors(colors: js.typedarray.Uint16Array, componentCount: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint16Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint16Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint32Array): Unit = js.native
  def setColors(colors: js.typedarray.Uint32Array, componentCount: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint32Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint8Array): Unit = js.native
  def setColors(colors: js.typedarray.Uint8Array, componentCount: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint8Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint8Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint8ClampedArray): Unit = js.native
  def setColors(colors: js.typedarray.Uint8ClampedArray, componentCount: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint8ClampedArray, componentCount: Double, numVertices: Double): Unit = js.native
  def setColors(colors: js.typedarray.Uint8ClampedArray, componentCount: Unit, numVertices: Double): Unit = js.native
  
  /**
    * Sets the vertex color array. Colors are stored using {@link TYPE_UINT8} format, which is
    * useful for LDR colors. Values in the array are expected in [0..255] range, and are mapped to
    * [0..1] range in the shader.
    *
    * @param {number[]|Int8Array|Uint8Array|Uint8ClampedArray|Int16Array|Uint16Array|Int32Array|Uint32Array|Float32Array} colors - Vertex
    * data containing colors. The array is expected to contain 4 components per vertex,
    * corresponding to r, g, b and a.
    * @param {number} [numVertices] - The number of vertices to be used from data array. If not
    * provided, the whole data array is used. This allows to use only part of the data array.
    */
  def setColors32(colors: js.Array[Double]): Unit = js.native
  def setColors32(colors: js.Array[Double], numVertices: Double): Unit = js.native
  def setColors32(colors: js.typedarray.Float32Array): Unit = js.native
  def setColors32(colors: js.typedarray.Float32Array, numVertices: Double): Unit = js.native
  def setColors32(colors: js.typedarray.Int16Array): Unit = js.native
  def setColors32(colors: js.typedarray.Int16Array, numVertices: Double): Unit = js.native
  def setColors32(colors: js.typedarray.Int32Array): Unit = js.native
  def setColors32(colors: js.typedarray.Int32Array, numVertices: Double): Unit = js.native
  def setColors32(colors: js.typedarray.Int8Array): Unit = js.native
  def setColors32(colors: js.typedarray.Int8Array, numVertices: Double): Unit = js.native
  def setColors32(colors: js.typedarray.Uint16Array): Unit = js.native
  def setColors32(colors: js.typedarray.Uint16Array, numVertices: Double): Unit = js.native
  def setColors32(colors: js.typedarray.Uint32Array): Unit = js.native
  def setColors32(colors: js.typedarray.Uint32Array, numVertices: Double): Unit = js.native
  def setColors32(colors: js.typedarray.Uint8Array): Unit = js.native
  def setColors32(colors: js.typedarray.Uint8Array, numVertices: Double): Unit = js.native
  def setColors32(colors: js.typedarray.Uint8ClampedArray): Unit = js.native
  def setColors32(colors: js.typedarray.Uint8ClampedArray, numVertices: Double): Unit = js.native
  
  /**
    * Sets the index array. Indices are stored using 16-bit format by default, unless more than
    * 65535 vertices are specified, in which case 32-bit format is used.
    *
    * @param {number[]|Uint8Array|Uint16Array|Uint32Array} indices - The array of indices that
    * define primitives (lines, triangles, etc.).
    * @param {number} [numIndices] - The number of indices to be used from data array. If not
    * provided, the whole data array is used. This allows to use only part of the data array.
    */
  def setIndices(indices: js.Array[Double]): Unit = js.native
  def setIndices(indices: js.Array[Double], numIndices: Double): Unit = js.native
  def setIndices(indices: js.typedarray.Uint16Array): Unit = js.native
  def setIndices(indices: js.typedarray.Uint16Array, numIndices: Double): Unit = js.native
  def setIndices(indices: js.typedarray.Uint32Array): Unit = js.native
  def setIndices(indices: js.typedarray.Uint32Array, numIndices: Double): Unit = js.native
  def setIndices(indices: js.typedarray.Uint8Array): Unit = js.native
  def setIndices(indices: js.typedarray.Uint8Array, numIndices: Double): Unit = js.native
  
  /**
    * Sets the vertex normals array. Normals are stored using {@link TYPE_FLOAT32} format.
    *
    * @param {number[]|Int8Array|Uint8Array|Uint8ClampedArray|Int16Array|Uint16Array|Int32Array|Uint32Array|Float32Array} normals - Vertex
    * data containing normals.
    * @param {number} [componentCount] - The number of values that form a single normal element.
    * Defaults to 3 if not specified, corresponding to x, y and z direction.
    * @param {number} [numVertices] - The number of vertices to be used from data array. If not
    * provided, the whole data array is used. This allows to use only part of the data array.
    */
  def setNormals(normals: js.Array[Double]): Unit = js.native
  def setNormals(normals: js.Array[Double], componentCount: Double): Unit = js.native
  def setNormals(normals: js.Array[Double], componentCount: Double, numVertices: Double): Unit = js.native
  def setNormals(normals: js.Array[Double], componentCount: Unit, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Float32Array): Unit = js.native
  def setNormals(normals: js.typedarray.Float32Array, componentCount: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Float32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Float32Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Int16Array): Unit = js.native
  def setNormals(normals: js.typedarray.Int16Array, componentCount: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Int16Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Int16Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Int32Array): Unit = js.native
  def setNormals(normals: js.typedarray.Int32Array, componentCount: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Int32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Int32Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Int8Array): Unit = js.native
  def setNormals(normals: js.typedarray.Int8Array, componentCount: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Int8Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Int8Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint16Array): Unit = js.native
  def setNormals(normals: js.typedarray.Uint16Array, componentCount: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint16Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint16Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint32Array): Unit = js.native
  def setNormals(normals: js.typedarray.Uint32Array, componentCount: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint32Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint8Array): Unit = js.native
  def setNormals(normals: js.typedarray.Uint8Array, componentCount: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint8Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint8Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint8ClampedArray): Unit = js.native
  def setNormals(normals: js.typedarray.Uint8ClampedArray, componentCount: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint8ClampedArray, componentCount: Double, numVertices: Double): Unit = js.native
  def setNormals(normals: js.typedarray.Uint8ClampedArray, componentCount: Unit, numVertices: Double): Unit = js.native
  
  /**
    * Sets the vertex positions array. Vertices are stored using {@link TYPE_FLOAT32} format.
    *
    * @param {number[]|Int8Array|Uint8Array|Uint8ClampedArray|Int16Array|Uint16Array|Int32Array|Uint32Array|Float32Array} positions - Vertex
    * data containing positions.
    * @param {number} [componentCount] - The number of values that form a single position element.
    * Defaults to 3 if not specified, corresponding to x, y and z coordinates.
    * @param {number} [numVertices] - The number of vertices to be used from data array. If not
    * provided, the whole data array is used. This allows to use only part of the data array.
    */
  def setPositions(positions: js.Array[Double]): Unit = js.native
  def setPositions(positions: js.Array[Double], componentCount: Double): Unit = js.native
  def setPositions(positions: js.Array[Double], componentCount: Double, numVertices: Double): Unit = js.native
  def setPositions(positions: js.Array[Double], componentCount: Unit, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Float32Array): Unit = js.native
  def setPositions(positions: js.typedarray.Float32Array, componentCount: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Float32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Float32Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Int16Array): Unit = js.native
  def setPositions(positions: js.typedarray.Int16Array, componentCount: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Int16Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Int16Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Int32Array): Unit = js.native
  def setPositions(positions: js.typedarray.Int32Array, componentCount: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Int32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Int32Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Int8Array): Unit = js.native
  def setPositions(positions: js.typedarray.Int8Array, componentCount: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Int8Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Int8Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint16Array): Unit = js.native
  def setPositions(positions: js.typedarray.Uint16Array, componentCount: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint16Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint16Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint32Array): Unit = js.native
  def setPositions(positions: js.typedarray.Uint32Array, componentCount: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint32Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint8Array): Unit = js.native
  def setPositions(positions: js.typedarray.Uint8Array, componentCount: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint8Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint8Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint8ClampedArray): Unit = js.native
  def setPositions(positions: js.typedarray.Uint8ClampedArray, componentCount: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint8ClampedArray, componentCount: Double, numVertices: Double): Unit = js.native
  def setPositions(positions: js.typedarray.Uint8ClampedArray, componentCount: Unit, numVertices: Double): Unit = js.native
  
  /**
    * Sets the vertex uv array. Uvs are stored using {@link TYPE_FLOAT32} format.
    *
    * @param {number} channel - The uv channel in [0..7] range.
    * @param {number[]|Int8Array|Uint8Array|Uint8ClampedArray|Int16Array|Uint16Array|Int32Array|Uint32Array|Float32Array} uvs - Vertex
    * data containing uv-coordinates.
    * @param {number} [componentCount] - The number of values that form a single uv element.
    * Defaults to 2 if not specified, corresponding to u and v coordinates.
    * @param {number} [numVertices] - The number of vertices to be used from data array. If not
    * provided, the whole data array is used. This allows to use only part of the data array.
    */
  def setUvs(channel: Double, uvs: js.Array[Double]): Unit = js.native
  def setUvs(channel: Double, uvs: js.Array[Double], componentCount: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.Array[Double], componentCount: Double, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.Array[Double], componentCount: Unit, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Float32Array): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Float32Array, componentCount: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Float32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Float32Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int16Array): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int16Array, componentCount: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int16Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int16Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int32Array): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int32Array, componentCount: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int32Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int8Array): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int8Array, componentCount: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int8Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Int8Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint16Array): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint16Array, componentCount: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint16Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint16Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint32Array): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint32Array, componentCount: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint32Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint32Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint8Array): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint8Array, componentCount: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint8Array, componentCount: Double, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint8Array, componentCount: Unit, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint8ClampedArray): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint8ClampedArray, componentCount: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint8ClampedArray, componentCount: Double, numVertices: Double): Unit = js.native
  def setUvs(channel: Double, uvs: js.typedarray.Uint8ClampedArray, componentCount: Unit, numVertices: Double): Unit = js.native
  
  /**
    * Sets the vertex data for any supported semantic.
    *
    * @param {string} semantic - The meaning of the vertex element. For supported semantics, see
    * SEMANTIC_* in {@link VertexFormat}.
    * @param {number[]|Int8Array|Uint8Array|Uint8ClampedArray|Int16Array|Uint16Array|Int32Array|Uint32Array|Float32Array} data - Vertex
    * data for the specified semantic.
    * @param {number} componentCount - The number of values that form a single Vertex element. For
    * example when setting a 3D position represented by 3 numbers per vertex, number 3 should be
    * specified.
    * @param {number} [numVertices] - The number of vertices to be used from data array. If not
    * provided, the whole data array is used. This allows to use only part of the data array.
    * @param {number} [dataType] - The format of data when stored in the {@link VertexBuffer}, see
    * TYPE_* in {@link VertexFormat}. When not specified, {@link TYPE_FLOAT32} is used.
    * @param {boolean} [dataTypeNormalize] - If true, vertex attribute data will be mapped from a
    * 0 to 255 range down to 0 to 1 when fed to a shader. If false, vertex attribute data is left
    * unchanged. If this property is unspecified, false is assumed.
    */
  def setVertexStream(
    semantic: String,
    data: js.Array[Double] | js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array,
    componentCount: Double,
    numVertices: js.UndefOr[Double],
    dataType: js.UndefOr[Double],
    dataTypeNormalize: js.UndefOr[Boolean]
  ): Unit = js.native
  
  /**
    * The skin data (if any) that drives skinned mesh animations for this mesh.
    *
    * @type {import('./skin.js').Skin|null}
    */
  var skin: Skin | Null = js.native
  
  /**
    * Applies any changes to vertex stream and indices to mesh. This allocates or reallocates
    * {@link vertexBuffer} or {@link IndexBuffer} to fit all provided vertices and indices, and
    * fills them with data.
    *
    * @param {number} [primitiveType] - The type of primitive to render.  Can be:
    *
    * - {@link PRIMITIVE_POINTS}
    * - {@link PRIMITIVE_LINES}
    * - {@link PRIMITIVE_LINELOOP}
    * - {@link PRIMITIVE_LINESTRIP}
    * - {@link PRIMITIVE_TRIANGLES}
    * - {@link PRIMITIVE_TRISTRIP}
    * - {@link PRIMITIVE_TRIFAN}
    *
    * Defaults to {@link PRIMITIVE_TRIANGLES} if unspecified.
    * @param {boolean} [updateBoundingBox] - True to update bounding box. Bounding box is updated
    * only if positions were set since last time update was called, and componentCount for
    * position was 3, otherwise bounding box is not updated. See {@link Mesh#setPositions}.
    * Defaults to true if unspecified. Set this to false to avoid update of the bounding box and
    * use aabb property to set it instead.
    */
  def update(): Unit = js.native
  def update(primitiveType: Double): Unit = js.native
  def update(primitiveType: Double, updateBoundingBox: Boolean): Unit = js.native
  def update(primitiveType: Unit, updateBoundingBox: Boolean): Unit = js.native
  
  def updateRenderStates(): Unit = js.native
  
  /**
    * The vertex buffer holding the vertex data of the mesh.
    *
    * @type {VertexBuffer}
    */
  var vertexBuffer: VertexBuffer = js.native
}
