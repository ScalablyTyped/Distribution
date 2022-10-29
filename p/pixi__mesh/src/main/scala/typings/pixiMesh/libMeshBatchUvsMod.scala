package typings.pixiMesh

import typings.pixiCore.mod.Buffer
import typings.pixiCore.mod.TextureMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMeshBatchUvsMod {
  
  @JSImport("@pixi/mesh/lib/MeshBatchUvs", "MeshBatchUvs")
  @js.native
  open class MeshBatchUvs protected () extends StObject {
    /**
      * @param uvBuffer - Buffer with normalized uv's
      * @param uvMatrix - Material UV matrix
      */
    def this(uvBuffer: Buffer, uvMatrix: TextureMatrix) = this()
    
    /* private */ var _bufferUpdateId: Any = js.native
    
    /* private */ var _textureUpdateId: Any = js.native
    
    var _updateID: Double = js.native
    
    /** UV Buffer data. */
    val data: js.typedarray.Float32Array = js.native
    
    /**
      * Updates
      * @param forceUpdate - force the update
      */
    def update(): Unit = js.native
    def update(forceUpdate: Boolean): Unit = js.native
    
    /** Buffer with normalized UV's. */
    var uvBuffer: Buffer = js.native
    
    /** Material UV matrix. */
    var uvMatrix: TextureMatrix = js.native
  }
}
