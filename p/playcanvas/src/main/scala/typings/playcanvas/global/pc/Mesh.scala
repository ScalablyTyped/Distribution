package typings.playcanvas.global.pc

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
@JSGlobal("pc.Mesh")
@js.native
/**
  * Create a new Mesh instance.
  *
  * @param {import('../platform/graphics/graphics-device.js').GraphicsDevice} [graphicsDevice] -
  * The graphics device used to manage this mesh. If it is not provided, a device is obtained
  * from the {@link Application}.
  */
open class Mesh ()
  extends typings.playcanvas.mod.Mesh {
  def this(graphicsDevice: typings.playcanvas.mod.GraphicsDevice) = this()
}
