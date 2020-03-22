package typings.pixiJs.PIXI

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class controls cache for UV mapping from Texture normal space to BaseTexture normal space.
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.MeshBatchUvs")
@js.native
class MeshBatchUvs protected () extends js.Object {
  def this(uvBuffer: Buffer, uvMatrix: TextureMatrix) = this()
  /**
    * UV Buffer data
    * @member {Float32Array} PIXI.MeshBatchUvs#data
    * @readonly
    */
  val data: Float32Array = js.native
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
  /**
    * updates
    *
    * @param {boolean} forceUpdate - force the update
    */
  def update(forceUpdate: Boolean): Unit = js.native
}

