package typings.phaser.Phaser.Renderer.WebGL.Pipelines

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.Components.TransformMatrix
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.integer
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ForwardDiffuseLightPipeline implements a forward rendering approach for 2D lights.
  * This pipeline extends TextureTintPipeline so it implements all it's rendering functions
  * and batching system.
  */
@js.native
trait ForwardDiffuseLightPipeline extends TextureTintPipeline {
  /**
    * Generic function for batching a textured quad
    * @param gameObject Source GameObject
    * @param texture Raw WebGLTexture associated with the quad
    * @param textureWidth Real texture width
    * @param textureHeight Real texture height
    * @param srcX X coordinate of the quad
    * @param srcY Y coordinate of the quad
    * @param srcWidth Width of the quad
    * @param srcHeight Height of the quad
    * @param scaleX X component of scale
    * @param scaleY Y component of scale
    * @param rotation Rotation of the quad
    * @param flipX Indicates if the quad is horizontally flipped
    * @param flipY Indicates if the quad is vertically flipped
    * @param scrollFactorX By which factor is the quad affected by the camera horizontal scroll
    * @param scrollFactorY By which factor is the quad effected by the camera vertical scroll
    * @param displayOriginX Horizontal origin in pixels
    * @param displayOriginY Vertical origin in pixels
    * @param frameX X coordinate of the texture frame
    * @param frameY Y coordinate of the texture frame
    * @param frameWidth Width of the texture frame
    * @param frameHeight Height of the texture frame
    * @param tintTL Tint for top left
    * @param tintTR Tint for top right
    * @param tintBL Tint for bottom left
    * @param tintBR Tint for bottom right
    * @param tintEffect The tint effect (0 for additive, 1 for replacement)
    * @param uOffset Horizontal offset on texture coordinate
    * @param vOffset Vertical offset on texture coordinate
    * @param camera Current used camera
    * @param parentTransformMatrix Parent container
    */
  def batchTexture(
    gameObject: GameObject,
    texture: WebGLTexture,
    textureWidth: integer,
    textureHeight: integer,
    srcX: Double,
    srcY: Double,
    srcWidth: Double,
    srcHeight: Double,
    scaleX: Double,
    scaleY: Double,
    rotation: Double,
    flipX: Boolean,
    flipY: Boolean,
    scrollFactorX: Double,
    scrollFactorY: Double,
    displayOriginX: Double,
    displayOriginY: Double,
    frameX: Double,
    frameY: Double,
    frameWidth: Double,
    frameHeight: Double,
    tintTL: integer,
    tintTR: integer,
    tintBL: integer,
    tintBR: integer,
    tintEffect: Double,
    uOffset: Double,
    vOffset: Double,
    camera: Camera,
    parentTransformMatrix: TransformMatrix
  ): Unit = js.native
  /**
    * Sets the Game Objects normal map as the active texture.
    * @param gameObject The Game Object to update.
    */
  def setNormalMap(gameObject: GameObject): Unit = js.native
  /**
    * Rotates the normal map vectors inversely by the given angle.
    * Only works in 2D space.
    * @param rotation The angle of rotation in radians.
    */
  def setNormalMapRotation(rotation: Double): Unit = js.native
}

