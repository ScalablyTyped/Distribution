package typings.meshoptimizer

import typings.meshoptimizer.meshoptSimplifierDotmoduleMod.Flags
import typings.meshoptimizer.meshoptimizerStrings.Separate
import typings.meshoptimizer.meshoptimizerStrings.SharedComponent
import typings.meshoptimizer.meshoptimizerStrings.SharedVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object MeshoptDecoder {
    
    @JSImport("meshoptimizer", "MeshoptDecoder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decodeGltfBuffer(
      target: js.typedarray.Uint8Array,
      count: Double,
      size: Double,
      source: js.typedarray.Uint8Array,
      mode: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeGltfBuffer")(target.asInstanceOf[js.Any], count.asInstanceOf[js.Any], size.asInstanceOf[js.Any], source.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def decodeGltfBuffer(
      target: js.typedarray.Uint8Array,
      count: Double,
      size: Double,
      source: js.typedarray.Uint8Array,
      mode: String,
      filter: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeGltfBuffer")(target.asInstanceOf[js.Any], count.asInstanceOf[js.Any], size.asInstanceOf[js.Any], source.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def decodeGltfBufferAsync(count: Double, size: Double, source: js.typedarray.Uint8Array, mode: String): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeGltfBufferAsync")(count.asInstanceOf[js.Any], size.asInstanceOf[js.Any], source.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    inline def decodeGltfBufferAsync(count: Double, size: Double, source: js.typedarray.Uint8Array, mode: String, filter: String): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeGltfBufferAsync")(count.asInstanceOf[js.Any], size.asInstanceOf[js.Any], source.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
    
    inline def decodeIndexBuffer(target: js.typedarray.Uint8Array, count: Double, size: Double, source: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeIndexBuffer")(target.asInstanceOf[js.Any], count.asInstanceOf[js.Any], size.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def decodeIndexSequence(target: js.typedarray.Uint8Array, count: Double, size: Double, source: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeIndexSequence")(target.asInstanceOf[js.Any], count.asInstanceOf[js.Any], size.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def decodeVertexBuffer(target: js.typedarray.Uint8Array, count: Double, size: Double, source: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeVertexBuffer")(target.asInstanceOf[js.Any], count.asInstanceOf[js.Any], size.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def decodeVertexBuffer(
      target: js.typedarray.Uint8Array,
      count: Double,
      size: Double,
      source: js.typedarray.Uint8Array,
      filter: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeVertexBuffer")(target.asInstanceOf[js.Any], count.asInstanceOf[js.Any], size.asInstanceOf[js.Any], source.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("meshoptimizer", "MeshoptDecoder.ready")
    @js.native
    def ready: js.Promise[Unit] = js.native
    inline def ready_=(x: js.Promise[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ready")(x.asInstanceOf[js.Any])
    
    @JSImport("meshoptimizer", "MeshoptDecoder.supported")
    @js.native
    def supported: Boolean = js.native
    inline def supported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supported")(x.asInstanceOf[js.Any])
    
    inline def useWorkers(count: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useWorkers")(count.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object MeshoptEncoder {
    
    @JSImport("meshoptimizer", "MeshoptEncoder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def encodeFilterExp(source: js.typedarray.Float32Array, count: Double, stride: Double, bits: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeFilterExp")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def encodeFilterExp(
      source: js.typedarray.Float32Array,
      count: Double,
      stride: Double,
      bits: Double,
      mode: Separate | SharedVector | SharedComponent
    ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeFilterExp")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def encodeFilterOct(source: js.typedarray.Float32Array, count: Double, stride: Double, bits: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeFilterOct")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def encodeFilterQuat(source: js.typedarray.Float32Array, count: Double, stride: Double, bits: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeFilterQuat")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def encodeGltfBuffer(source: js.typedarray.Uint8Array, count: Double, size: Double, mode: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeGltfBuffer")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def encodeIndexBuffer(source: js.typedarray.Uint8Array, count: Double, size: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndexBuffer")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def encodeIndexSequence(source: js.typedarray.Uint8Array, count: Double, size: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndexSequence")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def encodeVertexBuffer(source: js.typedarray.Uint8Array, count: Double, size: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeVertexBuffer")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("meshoptimizer", "MeshoptEncoder.ready")
    @js.native
    def ready: js.Promise[Unit] = js.native
    inline def ready_=(x: js.Promise[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ready")(x.asInstanceOf[js.Any])
    
    inline def reorderMesh(indices: js.typedarray.Uint32Array, triangles: Boolean, optsize: Boolean): js.Tuple2[js.typedarray.Uint32Array, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("reorderMesh")(indices.asInstanceOf[js.Any], triangles.asInstanceOf[js.Any], optsize.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.typedarray.Uint32Array, Double]]
    
    @JSImport("meshoptimizer", "MeshoptEncoder.supported")
    @js.native
    def supported: Boolean = js.native
    inline def supported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supported")(x.asInstanceOf[js.Any])
  }
  
  object MeshoptSimplifier {
    
    @JSImport("meshoptimizer", "MeshoptSimplifier")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compactMesh(indices: js.typedarray.Uint32Array): js.Tuple2[js.typedarray.Uint32Array, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compactMesh")(indices.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.typedarray.Uint32Array, Double]]
    
    inline def getScale(vertex_positions: js.typedarray.Float32Array, vertex_positions_stride: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(vertex_positions.asInstanceOf[js.Any], vertex_positions_stride.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("meshoptimizer", "MeshoptSimplifier.ready")
    @js.native
    def ready: js.Promise[Unit] = js.native
    inline def ready_=(x: js.Promise[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ready")(x.asInstanceOf[js.Any])
    
    inline def simplify(
      indices: js.typedarray.Uint32Array,
      vertex_positions: js.typedarray.Float32Array,
      vertex_positions_stride: Double,
      target_index_count: Double,
      target_error: Double
    ): js.Tuple2[js.typedarray.Uint32Array, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplify")(indices.asInstanceOf[js.Any], vertex_positions.asInstanceOf[js.Any], vertex_positions_stride.asInstanceOf[js.Any], target_index_count.asInstanceOf[js.Any], target_error.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.typedarray.Uint32Array, Double]]
    inline def simplify(
      indices: js.typedarray.Uint32Array,
      vertex_positions: js.typedarray.Float32Array,
      vertex_positions_stride: Double,
      target_index_count: Double,
      target_error: Double,
      flags: js.Array[Flags]
    ): js.Tuple2[js.typedarray.Uint32Array, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplify")(indices.asInstanceOf[js.Any], vertex_positions.asInstanceOf[js.Any], vertex_positions_stride.asInstanceOf[js.Any], target_index_count.asInstanceOf[js.Any], target_error.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.typedarray.Uint32Array, Double]]
    
    @JSImport("meshoptimizer", "MeshoptSimplifier.supported")
    @js.native
    def supported: Boolean = js.native
    inline def supported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supported")(x.asInstanceOf[js.Any])
  }
}
