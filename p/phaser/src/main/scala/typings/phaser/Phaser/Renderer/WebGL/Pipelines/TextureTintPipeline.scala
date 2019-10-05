package typings.phaser.Phaser.Renderer.WebGL.Pipelines

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.Components.TransformMatrix
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Image
import typings.phaser.Phaser.GameObjects.Sprite
import typings.phaser.Phaser.Renderer.WebGL.WebGLPipeline
import typings.phaser.Phaser.Textures.Frame
import typings.phaser.integer
import typings.std.Float32Array
import typings.std.Uint32Array
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TextureTintPipeline implements the rendering infrastructure
  * for displaying textured objects
  * The config properties are:
  * - game: Current game instance.
  * - renderer: Current WebGL renderer.
  * - topology: This indicates how the primitives are rendered. The default value is GL_TRIANGLES.
  *              Here is the full list of rendering primitives (https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants).
  * - vertShader: Source for vertex shader as a string.
  * - fragShader: Source for fragment shader as a string.
  * - vertexCapacity: The amount of vertices that shall be allocated
  * - vertexSize: The size of a single vertex in bytes.
  */
@JSGlobal("Phaser.Renderer.WebGL.Pipelines.TextureTintPipeline")
@js.native
class TextureTintPipeline protected () extends WebGLPipeline {
  /**
    * 
    * @param config The configuration options for this Texture Tint Pipeline, as described above.
    */
  def this(config: js.Object) = this()
  /**
    * Collection of batch information
    */
  var batches: js.Array[_] = js.native
  /**
    * Size of the batch.
    */
  var maxQuads: integer = js.native
  /**
    * Float32 view of the array buffer containing the pipeline's vertices.
    */
  var vertexViewF32: Float32Array = js.native
  /**
    * Uint32 view of the array buffer containing the pipeline's vertices.
    */
  var vertexViewU32: Uint32Array = js.native
  /**
    * Adds the given path to the vertex batch for rendering.
    * 
    * It works by taking the array of path data and then passing it through Earcut, which
    * creates a list of polygons. Each polygon is then added to the batch.
    * 
    * The path is always automatically closed because it's filled.
    * @param path Collection of points that represent the path.
    * @param currentMatrix The current transform.
    * @param parentMatrix The parent transform.
    */
  def batchFillPath(path: js.Array[_], currentMatrix: TransformMatrix, parentMatrix: TransformMatrix): Unit = js.native
  /**
    * Pushes a filled rectangle into the vertex batch.
    * Rectangle factors in the given transform matrices before adding to the batch.
    * @param x Horizontal top left coordinate of the rectangle.
    * @param y Vertical top left coordinate of the rectangle.
    * @param width Width of the rectangle.
    * @param height Height of the rectangle.
    * @param currentMatrix The current transform.
    * @param parentMatrix The parent transform.
    */
  def batchFillRect(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    currentMatrix: TransformMatrix,
    parentMatrix: TransformMatrix
  ): Unit = js.native
  /**
    * Pushes a filled triangle into the vertex batch.
    * Triangle factors in the given transform matrices before adding to the batch.
    * @param x0 Point 0 x coordinate.
    * @param y0 Point 0 y coordinate.
    * @param x1 Point 1 x coordinate.
    * @param y1 Point 1 y coordinate.
    * @param x2 Point 2 x coordinate.
    * @param y2 Point 2 y coordinate.
    * @param currentMatrix The current transform.
    * @param parentMatrix The parent transform.
    */
  def batchFillTriangle(
    x0: Double,
    y0: Double,
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    currentMatrix: TransformMatrix,
    parentMatrix: TransformMatrix
  ): Unit = js.native
  /**
    * Creates a quad and adds it to the vertex batch based on the given line values.
    * @param ax X coordinate to the start of the line
    * @param ay Y coordinate to the start of the line
    * @param bx X coordinate to the end of the line
    * @param by Y coordinate to the end of the line
    * @param aLineWidth Width of the start of the line
    * @param bLineWidth Width of the end of the line
    * @param currentMatrix Parent matrix, generally used by containers
    */
  def batchLine(
    ax: Double,
    ay: Double,
    bx: Double,
    by: Double,
    aLineWidth: Double,
    bLineWidth: Double,
    currentMatrix: Float32Array
  ): Unit = js.native
  def batchQuad(
    x0: Double,
    y0: Double,
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    u0: Double,
    v0: Double,
    u1: Double,
    v1: Double,
    tintTL: Double,
    tintTR: Double,
    tintBL: Double,
    tintBR: Double,
    tintEffect: Boolean
  ): Boolean = js.native
  def batchQuad(
    x0: Double,
    y0: Double,
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    u0: Double,
    v0: Double,
    u1: Double,
    v1: Double,
    tintTL: Double,
    tintTR: Double,
    tintBL: Double,
    tintBR: Double,
    tintEffect: Boolean,
    texture: WebGLTexture
  ): Boolean = js.native
  def batchQuad(
    x0: Double,
    y0: Double,
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    u0: Double,
    v0: Double,
    u1: Double,
    v1: Double,
    tintTL: Double,
    tintTR: Double,
    tintBL: Double,
    tintBR: Double,
    tintEffect: Boolean,
    texture: WebGLTexture,
    unit: integer
  ): Boolean = js.native
  /**
    * Adds the vertices data into the batch and flushes if full.
    * 
    * Assumes 6 vertices in the following arrangement:
    * 
    * ```
    * 0----3
    * |\  B|
    * | \  |
    * |  \ |
    * | A \|
    * |    \
    * 1----2
    * ```
    * 
    * Where tx0/ty0 = 0, tx1/ty1 = 1, tx2/ty2 = 2 and tx3/ty3 = 3
    * @param x0 The top-left x position.
    * @param y0 The top-left y position.
    * @param x1 The bottom-left x position.
    * @param y1 The bottom-left y position.
    * @param x2 The bottom-right x position.
    * @param y2 The bottom-right y position.
    * @param x3 The top-right x position.
    * @param y3 The top-right y position.
    * @param u0 UV u0 value.
    * @param v0 UV v0 value.
    * @param u1 UV u1 value.
    * @param v1 UV v1 value.
    * @param tintTL The top-left tint color value.
    * @param tintTR The top-right tint color value.
    * @param tintBL The bottom-left tint color value.
    * @param tintBR The bottom-right tint color value.
    * @param tintEffect The tint effect for the shader to use.
    * @param texture WebGLTexture that will be assigned to the current batch if a flush occurs.
    * @param unit Texture unit to which the texture needs to be bound. Default 0.
    */
  def batchQuad(
    x0: Double,
    y0: Double,
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    u0: Double,
    v0: Double,
    u1: Double,
    v1: Double,
    tintTL: Double,
    tintTR: Double,
    tintBL: Double,
    tintBR: Double,
    tintEffect: Double
  ): Boolean = js.native
  def batchQuad(
    x0: Double,
    y0: Double,
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    u0: Double,
    v0: Double,
    u1: Double,
    v1: Double,
    tintTL: Double,
    tintTR: Double,
    tintBL: Double,
    tintBR: Double,
    tintEffect: Double,
    texture: WebGLTexture
  ): Boolean = js.native
  def batchQuad(
    x0: Double,
    y0: Double,
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    u0: Double,
    v0: Double,
    u1: Double,
    v1: Double,
    tintTL: Double,
    tintTR: Double,
    tintBL: Double,
    tintBR: Double,
    tintEffect: Double,
    texture: WebGLTexture,
    unit: integer
  ): Boolean = js.native
  /**
    * Takes a Sprite Game Object, or any object that extends it, and adds it to the batch.
    * @param sprite The texture based Game Object to add to the batch.
    * @param camera The Camera to use for the rendering transform.
    * @param parentTransformMatrix The transform matrix of the parent container, if set.
    */
  def batchSprite(sprite: Image, camera: Camera): Unit = js.native
  def batchSprite(sprite: Image, camera: Camera, parentTransformMatrix: TransformMatrix): Unit = js.native
  def batchSprite(sprite: Sprite, camera: Camera): Unit = js.native
  def batchSprite(sprite: Sprite, camera: Camera, parentTransformMatrix: TransformMatrix): Unit = js.native
  /**
    * Adds the given path to the vertex batch for rendering.
    * 
    * It works by taking the array of path data and calling `batchLine` for each section
    * of the path.
    * 
    * The path is optionally closed at the end.
    * @param path Collection of points that represent the path.
    * @param lineWidth The width of the line segments in pixels.
    * @param pathOpen Indicates if the path should be closed or left open.
    * @param currentMatrix The current transform.
    * @param parentMatrix The parent transform.
    */
  def batchStrokePath(
    path: js.Array[_],
    lineWidth: Double,
    pathOpen: Boolean,
    currentMatrix: TransformMatrix,
    parentMatrix: TransformMatrix
  ): Unit = js.native
  /**
    * Pushes a stroked triangle into the vertex batch.
    * Triangle factors in the given transform matrices before adding to the batch.
    * The triangle is created from 3 lines and drawn using the `batchStrokePath` method.
    * @param x0 Point 0 x coordinate.
    * @param y0 Point 0 y coordinate.
    * @param x1 Point 1 x coordinate.
    * @param y1 Point 1 y coordinate.
    * @param x2 Point 2 x coordinate.
    * @param y2 Point 2 y coordinate.
    * @param lineWidth The width of the line in pixels.
    * @param currentMatrix The current transform.
    * @param parentMatrix The parent transform.
    */
  def batchStrokeTriangle(
    x0: Double,
    y0: Double,
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    lineWidth: Double,
    currentMatrix: TransformMatrix,
    parentMatrix: TransformMatrix
  ): Unit = js.native
  /**
    * Generic function for batching a textured quad using argument values instead of a Game Object.
    * @param gameObject Source GameObject.
    * @param texture Raw WebGLTexture associated with the quad.
    * @param textureWidth Real texture width.
    * @param textureHeight Real texture height.
    * @param srcX X coordinate of the quad.
    * @param srcY Y coordinate of the quad.
    * @param srcWidth Width of the quad.
    * @param srcHeight Height of the quad.
    * @param scaleX X component of scale.
    * @param scaleY Y component of scale.
    * @param rotation Rotation of the quad.
    * @param flipX Indicates if the quad is horizontally flipped.
    * @param flipY Indicates if the quad is vertically flipped.
    * @param scrollFactorX By which factor is the quad affected by the camera horizontal scroll.
    * @param scrollFactorY By which factor is the quad effected by the camera vertical scroll.
    * @param displayOriginX Horizontal origin in pixels.
    * @param displayOriginY Vertical origin in pixels.
    * @param frameX X coordinate of the texture frame.
    * @param frameY Y coordinate of the texture frame.
    * @param frameWidth Width of the texture frame.
    * @param frameHeight Height of the texture frame.
    * @param tintTL Tint for top left.
    * @param tintTR Tint for top right.
    * @param tintBL Tint for bottom left.
    * @param tintBR Tint for bottom right.
    * @param tintEffect The tint effect.
    * @param uOffset Horizontal offset on texture coordinate.
    * @param vOffset Vertical offset on texture coordinate.
    * @param camera Current used camera.
    * @param parentTransformMatrix Parent container.
    * @param skipFlip Skip the renderTexture check. Default false.
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
    parentTransformMatrix: TransformMatrix,
    skipFlip: Boolean
  ): Unit = js.native
  /**
    * Adds a Texture Frame into the batch for rendering.
    * @param frame The Texture Frame to be rendered.
    * @param x The horizontal position to render the texture at.
    * @param y The vertical position to render the texture at.
    * @param tint The tint color.
    * @param alpha The alpha value.
    * @param transformMatrix The Transform Matrix to use for the texture.
    * @param parentTransformMatrix A parent Transform Matrix.
    */
  def batchTextureFrame(frame: Frame, x: Double, y: Double, tint: Double, alpha: Double, transformMatrix: TransformMatrix): Unit = js.native
  def batchTextureFrame(
    frame: Frame,
    x: Double,
    y: Double,
    tint: Double,
    alpha: Double,
    transformMatrix: TransformMatrix,
    parentTransformMatrix: TransformMatrix
  ): Unit = js.native
  def batchTri(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    u0: Double,
    v0: Double,
    u1: Double,
    v1: Double,
    tintTL: Double,
    tintTR: Double,
    tintBL: Double,
    tintEffect: Boolean
  ): Boolean = js.native
  def batchTri(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    u0: Double,
    v0: Double,
    u1: Double,
    v1: Double,
    tintTL: Double,
    tintTR: Double,
    tintBL: Double,
    tintEffect: Boolean,
    texture: WebGLTexture
  ): Boolean = js.native
  def batchTri(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    u0: Double,
    v0: Double,
    u1: Double,
    v1: Double,
    tintTL: Double,
    tintTR: Double,
    tintBL: Double,
    tintEffect: Boolean,
    texture: WebGLTexture,
    unit: integer
  ): Boolean = js.native
  /**
    * Adds the vertices data into the batch and flushes if full.
    * 
    * Assumes 3 vertices in the following arrangement:
    * 
    * ```
    * 0
    * |\
    * | \
    * |  \
    * |   \
    * |    \
    * 1-----2
    * ```
    * @param x1 The bottom-left x position.
    * @param y1 The bottom-left y position.
    * @param x2 The bottom-right x position.
    * @param y2 The bottom-right y position.
    * @param x3 The top-right x position.
    * @param y3 The top-right y position.
    * @param u0 UV u0 value.
    * @param v0 UV v0 value.
    * @param u1 UV u1 value.
    * @param v1 UV v1 value.
    * @param tintTL The top-left tint color value.
    * @param tintTR The top-right tint color value.
    * @param tintBL The bottom-left tint color value.
    * @param tintEffect The tint effect for the shader to use.
    * @param texture WebGLTexture that will be assigned to the current batch if a flush occurs.
    * @param unit Texture unit to which the texture needs to be bound. Default 0.
    */
  def batchTri(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    u0: Double,
    v0: Double,
    u1: Double,
    v1: Double,
    tintTL: Double,
    tintTR: Double,
    tintBL: Double,
    tintEffect: Double
  ): Boolean = js.native
  def batchTri(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    u0: Double,
    v0: Double,
    u1: Double,
    v1: Double,
    tintTL: Double,
    tintTR: Double,
    tintBL: Double,
    tintEffect: Double,
    texture: WebGLTexture
  ): Boolean = js.native
  def batchTri(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    u0: Double,
    v0: Double,
    u1: Double,
    v1: Double,
    tintTL: Double,
    tintTR: Double,
    tintBL: Double,
    tintEffect: Double,
    texture: WebGLTexture,
    unit: integer
  ): Boolean = js.native
  /**
    * Pushes a filled rectangle into the vertex batch.
    * Rectangle has no transform values and isn't transformed into the local space.
    * Used for directly batching untransformed rectangles, such as Camera background colors.
    * @param x Horizontal top left coordinate of the rectangle.
    * @param y Vertical top left coordinate of the rectangle.
    * @param width Width of the rectangle.
    * @param height Height of the rectangle.
    * @param color Color of the rectangle to draw.
    * @param alpha Alpha value of the rectangle to draw.
    */
  def drawFillRect(x: Double, y: Double, width: Double, height: Double, color: Double, alpha: Double): Unit = js.native
  /**
    * Creates a new batch object and pushes it to a batch array.
    * The batch object contains information relevant to the current 
    * vertex batch like the offset in the vertex buffer, vertex count and 
    * the textures used by that batch.
    * @param texture Optional WebGLTexture that will be assigned to the created batch.
    * @param unit Texture unit to which the texture needs to be bound.
    */
  def pushBatch(texture: WebGLTexture, unit: integer): Unit = js.native
  /**
    * Checks if the current batch has the same texture and texture unit, or if we need to create a new batch.
    * @param texture WebGLTexture that will be assigned to the current batch. If not given uses blankTexture.
    * @param unit Texture unit to which the texture needs to be bound.
    */
  def requireTextureBatch(texture: WebGLTexture, unit: integer): Boolean = js.native
  /**
    * Assigns a texture to the current batch. If a different texture is already set it creates a new batch object.
    * @param texture WebGLTexture that will be assigned to the current batch. If not given uses blankTexture.
    * @param unit Texture unit to which the texture needs to be bound. Default 0.
    */
  def setTexture2D(): TextureTintPipeline = js.native
  def setTexture2D(texture: WebGLTexture): TextureTintPipeline = js.native
  def setTexture2D(texture: WebGLTexture, unit: integer): TextureTintPipeline = js.native
}

