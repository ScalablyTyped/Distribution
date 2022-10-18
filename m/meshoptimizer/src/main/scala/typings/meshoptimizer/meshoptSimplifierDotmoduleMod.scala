package typings.meshoptimizer

import typings.meshoptimizer.meshoptimizerStrings.LockBorder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshoptSimplifierDotmoduleMod {
  
  object MeshoptSimplifier {
    
    @JSImport("meshoptimizer/meshopt_simplifier.module", "MeshoptSimplifier")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compactMesh(indices: js.typedarray.Uint32Array): js.Tuple2[js.typedarray.Uint32Array, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compactMesh")(indices.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.typedarray.Uint32Array, Double]]
    
    inline def getScale(vertex_positions: js.typedarray.Float32Array, vertex_positions_stride: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(vertex_positions.asInstanceOf[js.Any], vertex_positions_stride.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("meshoptimizer/meshopt_simplifier.module", "MeshoptSimplifier.ready")
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
    
    @JSImport("meshoptimizer/meshopt_simplifier.module", "MeshoptSimplifier.supported")
    @js.native
    def supported: Boolean = js.native
    inline def supported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supported")(x.asInstanceOf[js.Any])
  }
  
  type Flags = LockBorder
}
