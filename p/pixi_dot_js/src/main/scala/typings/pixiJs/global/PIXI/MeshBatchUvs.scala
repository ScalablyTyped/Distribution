package typings.pixiJs.global.PIXI

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
class MeshBatchUvs protected ()
  extends typings.pixiJs.PIXI.MeshBatchUvs {
  def this(uvBuffer: typings.pixiJs.PIXI.Buffer, uvMatrix: typings.pixiJs.PIXI.TextureMatrix) = this()
  /**
    * UV Buffer data
    * @member {Float32Array} PIXI.MeshBatchUvs#data
    * @readonly
    */
  /* CompleteClass */
  override val data: Float32Array = js.native
  /**
    * Buffer with normalized UV's
    * @member {PIXI.Buffer} PIXI.MeshBatchUvs#uvBuffer
    */
  /* CompleteClass */
  override var uvBuffer: typings.pixiJs.PIXI.Buffer = js.native
  /**
    * Material UV matrix
    * @member {PIXI.TextureMatrix} PIXI.MeshBatchUvs#uvMatrix
    */
  /* CompleteClass */
  override var uvMatrix: typings.pixiJs.PIXI.TextureMatrix = js.native
  /**
    * updates
    *
    * @param {boolean} forceUpdate - force the update
    */
  /* CompleteClass */
  override def update(forceUpdate: Boolean): Unit = js.native
}

