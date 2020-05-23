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
trait MeshBatchUvs extends js.Object {
  /**
    * UV Buffer data
    * @member {Float32Array} PIXI.MeshBatchUvs#data
    * @readonly
    */
  val data: Float32Array
  /**
    * Buffer with normalized UV's
    * @member {PIXI.Buffer} PIXI.MeshBatchUvs#uvBuffer
    */
  var uvBuffer: Buffer
  /**
    * Material UV matrix
    * @member {PIXI.TextureMatrix} PIXI.MeshBatchUvs#uvMatrix
    */
  var uvMatrix: TextureMatrix
  /**
    * updates
    *
    * @param {boolean} forceUpdate - force the update
    */
  def update(forceUpdate: Boolean): Unit
}

object MeshBatchUvs {
  @scala.inline
  def apply(data: Float32Array, update: Boolean => Unit, uvBuffer: Buffer, uvMatrix: TextureMatrix): MeshBatchUvs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), uvBuffer = uvBuffer.asInstanceOf[js.Any], uvMatrix = uvMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshBatchUvs]
  }
}

