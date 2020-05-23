package typings.pixiJs.mod

import typings.pixiJs.anon.Alpha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slightly opinionated default shader for PixiJS 2D objects.
  * @class
  * @memberof PIXI
  * @extends PIXI.Shader
  */
@JSImport("pixi.js", "MeshMaterial")
@js.native
class MeshMaterial protected ()
  extends typings.pixiJs.PIXI.MeshMaterial {
  def this(uSampler: typings.pixiJs.PIXI.Texture) = this()
  def this(uSampler: typings.pixiJs.PIXI.Texture, options: Alpha) = this()
  /**
    * This gets automatically set by the object using this.
    *
    * @default 1
    * @member {number}
    */
  /* CompleteClass */
  override var alpha: Double = js.native
  /**
    * `true` if shader can be batch with the renderer's batch system.
    * @member {boolean} PIXI.MeshMaterial#batchable
    * @default true
    */
  /* CompleteClass */
  override var batchable: Boolean = js.native
  /**
    * Renderer plugin for batching
    *
    * @member {string} PIXI.MeshMaterial#pluginName
    * @default 'batch'
    */
  /* CompleteClass */
  override var pluginName: String = js.native
  /**
    * Program that the shader uses
    *
    * @member {PIXI.Program} PIXI.Shader#program
    */
  /* CompleteClass */
  override var program: typings.pixiJs.PIXI.Program = js.native
  /**
    * Reference to the texture being rendered.
    * @member {PIXI.Texture}
    */
  /* CompleteClass */
  override var texture: typings.pixiJs.PIXI.Texture = js.native
  /**
    * Multiply tint for the material.
    * @member {number}
    * @default 0xFFFFFF
    */
  /* CompleteClass */
  override var tint: Double = js.native
  /**
    * Shader uniform values, shortcut for `uniformGroup.uniforms`
    * @readonly
    * @member {object}
    */
  /* CompleteClass */
  override val uniforms: js.Any = js.native
  /**
    * TextureMatrix instance for this Mesh, used to track Texture changes
    *
    * @member {PIXI.TextureMatrix} PIXI.MeshMaterial#uvMatrix
    * @readonly
    */
  /* CompleteClass */
  override val uvMatrix: typings.pixiJs.PIXI.TextureMatrix = js.native
  /**
    * Gets called automatically by the Mesh. Intended to be overridden for custom
    * MeshMaterial objects.
    */
  /* CompleteClass */
  override def update(): Unit = js.native
}

