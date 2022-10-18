package typings.meshoptimizer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshoptEncoderDotmoduleMod {
  
  object MeshoptEncoder {
    
    @JSImport("meshoptimizer/meshopt_encoder.module", "MeshoptEncoder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def encodeFilterExp(source: js.typedarray.Float32Array, count: Double, stride: Double, bits: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeFilterExp")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def encodeFilterOct(source: js.typedarray.Float32Array, count: Double, stride: Double, bits: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeFilterOct")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def encodeFilterQuat(source: js.typedarray.Float32Array, count: Double, stride: Double, bits: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeFilterQuat")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def encodeGltfBuffer(source: js.typedarray.Uint8Array, count: Double, size: Double, mode: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeGltfBuffer")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def encodeIndexBuffer(source: js.typedarray.Uint8Array, count: Double, size: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndexBuffer")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def encodeIndexSequence(source: js.typedarray.Uint8Array, count: Double, size: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndexSequence")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def encodeVertexBuffer(source: js.typedarray.Uint8Array, count: Double, size: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeVertexBuffer")(source.asInstanceOf[js.Any], count.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("meshoptimizer/meshopt_encoder.module", "MeshoptEncoder.ready")
    @js.native
    def ready: js.Promise[Unit] = js.native
    inline def ready_=(x: js.Promise[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ready")(x.asInstanceOf[js.Any])
    
    inline def reorderMesh(indices: js.typedarray.Uint32Array, triangles: Boolean, optsize: Boolean): js.Tuple2[js.typedarray.Uint32Array, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("reorderMesh")(indices.asInstanceOf[js.Any], triangles.asInstanceOf[js.Any], optsize.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.typedarray.Uint32Array, Double]]
    
    @JSImport("meshoptimizer/meshopt_encoder.module", "MeshoptEncoder.supported")
    @js.native
    def supported: Boolean = js.native
    inline def supported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supported")(x.asInstanceOf[js.Any])
  }
}
