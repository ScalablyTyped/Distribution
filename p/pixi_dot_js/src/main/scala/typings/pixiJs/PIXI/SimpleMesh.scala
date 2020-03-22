package typings.pixiJs.PIXI

import typings.std.Float32Array
import typings.std.Uint16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Simple Mesh class mimics Mesh in PixiJS v4, providing easy-to-use constructor arguments.
  * For more robust customization, use {@link PIXI.Mesh}.
  *
  * @class
  * @extends PIXI.Mesh
  * @memberof PIXI
  */
@JSGlobal("PIXI.SimpleMesh")
@js.native
class SimpleMesh () extends Mesh {
  def this(texture: Texture) = this()
  def this(texture: Texture, vertices: Float32Array) = this()
  def this(texture: Texture, vertices: Float32Array, uvs: Float32Array) = this()
  def this(texture: Texture, vertices: Float32Array, uvs: Float32Array, indices: Uint16Array) = this()
  def this(
    texture: Texture,
    vertices: Float32Array,
    uvs: Float32Array,
    indices: Uint16Array,
    drawMode: Double
  ) = this()
  /**
    * upload vertices buffer each frame
    * @member {boolean} PIXI.SimpleMesh#autoUpdate
    */
  var autoUpdate: Boolean = js.native
  /**
    * Collection of vertices data.
    * @member {Float32Array}
    */
  var vertices: Float32Array = js.native
}

