package typings.pixiJs.PIXI

import typings.pixiJs.AnonPluginName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slightly opinionated default shader for PixiJS 2D objects.
  * @class
  * @memberof PIXI
  * @extends PIXI.Shader
  */
@JSGlobal("PIXI.MeshMaterial")
@js.native
class MeshMaterial protected () extends Shader {
  def this(uSampler: Texture) = this()
  def this(uSampler: Texture, options: AnonPluginName) = this()
  /**
    * This gets automatically set by the object using this.
    *
    * @default 1
    * @member {number}
    */
  var alpha: Double = js.native
  /**
    * `true` if shader can be batch with the renderer's batch system.
    * @member {boolean} PIXI.MeshMaterial#batchable
    * @default true
    */
  var batchable: Boolean = js.native
  /**
    * Renderer plugin for batching
    *
    * @member {string} PIXI.MeshMaterial#pluginName
    * @default 'batch'
    */
  var pluginName: String = js.native
  /**
    * Reference to the texture being rendered.
    * @member {PIXI.Texture}
    */
  var texture: Texture = js.native
  /**
    * Multiply tint for the material.
    * @member {number}
    * @default 0xFFFFFF
    */
  var tint: Double = js.native
  /**
    * TextureMatrix instance for this Mesh, used to track Texture changes
    *
    * @member {PIXI.TextureMatrix} PIXI.MeshMaterial#uvMatrix
    * @readonly
    */
  val uvMatrix: TextureMatrix = js.native
  /**
    * Gets called automatically by the Mesh. Intended to be overridden for custom
    * MeshMaterial objects.
    */
  def update(): Unit = js.native
}

