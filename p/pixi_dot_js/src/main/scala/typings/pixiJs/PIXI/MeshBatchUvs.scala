package typings.pixiJs.PIXI

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class controls cache for UV mapping from Texture normal space to BaseTexture normal space.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait MeshBatchUvs extends StObject {
  
  /**
    * UV Buffer data
    * @member {Float32Array} PIXI.MeshBatchUvs#data
    * @readonly
    */
  val data: Float32Array = js.native
  
  /**
    * updates
    *
    * @param {boolean} [forceUpdate] - force the update
    */
  def update(): Unit = js.native
  def update(forceUpdate: Boolean): Unit = js.native
  
  /**
    * Buffer with normalized UV's
    * @member {PIXI.Buffer} PIXI.MeshBatchUvs#uvBuffer
    */
  var uvBuffer: Buffer = js.native
  
  /**
    * Material UV matrix
    * @member {PIXI.TextureMatrix} PIXI.MeshBatchUvs#uvMatrix
    */
  var uvMatrix: TextureMatrix = js.native
}
