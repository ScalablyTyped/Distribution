package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slightly opinionated default shader for PixiJS 2D objects.
  * @class
  * @memberof PIXI
  * @extends PIXI.Shader
  */
trait MeshMaterial extends Shader {
  /**
    * This gets automatically set by the object using this.
    *
    * @default 1
    * @member {number}
    */
  var alpha: Double
  /**
    * `true` if shader can be batch with the renderer's batch system.
    * @member {boolean} PIXI.MeshMaterial#batchable
    * @default true
    */
  var batchable: Boolean
  /**
    * Renderer plugin for batching
    *
    * @member {string} PIXI.MeshMaterial#pluginName
    * @default 'batch'
    */
  var pluginName: String
  /**
    * Reference to the texture being rendered.
    * @member {PIXI.Texture}
    */
  var texture: Texture
  /**
    * Multiply tint for the material.
    * @member {number}
    * @default 0xFFFFFF
    */
  var tint: Double
  /**
    * TextureMatrix instance for this Mesh, used to track Texture changes
    *
    * @member {PIXI.TextureMatrix} PIXI.MeshMaterial#uvMatrix
    * @readonly
    */
  val uvMatrix: TextureMatrix
  /**
    * Gets called automatically by the Mesh. Intended to be overridden for custom
    * MeshMaterial objects.
    */
  def update(): Unit
}

object MeshMaterial {
  @scala.inline
  def apply(
    alpha: Double,
    batchable: Boolean,
    pluginName: String,
    program: Program,
    texture: Texture,
    tint: Double,
    uniforms: js.Any,
    update: () => Unit,
    uvMatrix: TextureMatrix
  ): MeshMaterial = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], batchable = batchable.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], tint = tint.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), uvMatrix = uvMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshMaterial]
  }
}

