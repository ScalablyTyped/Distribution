package typings.meshoptimizer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshoptDecoderDotmoduleMod {
  
  object MeshoptDecoder {
    
    @JSImport("meshoptimizer/meshopt_decoder.module", "MeshoptDecoder")
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
    
    @JSImport("meshoptimizer/meshopt_decoder.module", "MeshoptDecoder.ready")
    @js.native
    def ready: js.Promise[Unit] = js.native
    inline def ready_=(x: js.Promise[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ready")(x.asInstanceOf[js.Any])
    
    @JSImport("meshoptimizer/meshopt_decoder.module", "MeshoptDecoder.supported")
    @js.native
    def supported: Boolean = js.native
    inline def supported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supported")(x.asInstanceOf[js.Any])
    
    inline def useWorkers(count: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useWorkers")(count.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
