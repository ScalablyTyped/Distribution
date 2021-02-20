package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renderer for Particles that is designer for speed over feature set.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait ParticleRenderer extends StObject {
  
  /**
    * Destroys the ParticleRenderer.
    */
  def destroy(): Unit = js.native
  
  /**
    * Renders the particle container object.
    *
    * @param {PIXI.ParticleContainer} container - The container to render using this ParticleRenderer
    */
  def render(container: ParticleContainer): Unit = js.native
  
  /**
    * The default shader that is used if a sprite doesn't have a more specific one.
    *
    * @member {PIXI.Shader} PIXI.ParticleRenderer#shader
    */
  var shader: Shader = js.native
  
  /**
    * The WebGL state in which this renderer will work.
    *
    * @member {PIXI.State} PIXI.ParticleRenderer#state
    * @readonly
    */
  val state: State = js.native
  
  /**
    * Uploads the position.
    *
    * @param {PIXI.DisplayObject[]} children - the array of display objects to render
    * @param {number} startIndex - the index to start from in the children array
    * @param {number} amount - the amount of children that will have their positions uploaded
    * @param {number[]} array - The vertices to upload.
    * @param {number} stride - Stride to use for iteration.
    * @param {number} offset - Offset to start at.
    */
  def uploadPosition(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
  
  /**
    * Uploads the rotation.
    *
    * @param {PIXI.DisplayObject[]} children - the array of display objects to render
    * @param {number} startIndex - the index to start from in the children array
    * @param {number} amount - the amount of children that will have their rotation uploaded
    * @param {number[]} array - The vertices to upload.
    * @param {number} stride - Stride to use for iteration.
    * @param {number} offset - Offset to start at.
    */
  def uploadRotation(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
  
  /**
    * Uploads the tint.
    *
    * @param {PIXI.DisplayObject[]} children - the array of display objects to render
    * @param {number} startIndex - the index to start from in the children array
    * @param {number} amount - the amount of children that will have their rotation uploaded
    * @param {number[]} array - The vertices to upload.
    * @param {number} stride - Stride to use for iteration.
    * @param {number} offset - Offset to start at.
    */
  def uploadTint(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
  
  /**
    * Uploads the Uvs
    *
    * @param {PIXI.DisplayObject[]} children - the array of display objects to render
    * @param {number} startIndex - the index to start from in the children array
    * @param {number} amount - the amount of children that will have their rotation uploaded
    * @param {number[]} array - The vertices to upload.
    * @param {number} stride - Stride to use for iteration.
    * @param {number} offset - Offset to start at.
    */
  def uploadUvs(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
  
  /**
    * Uploads the vertices.
    *
    * @param {PIXI.DisplayObject[]} children - the array of display objects to render
    * @param {number} startIndex - the index to start from in the children array
    * @param {number} amount - the amount of children that will have their vertices uploaded
    * @param {number[]} array - The vertices to upload.
    * @param {number} stride - Stride to use for iteration.
    * @param {number} offset - Offset to start at.
    */
  def uploadVertices(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
}
object ParticleRenderer {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    render: ParticleContainer => Unit,
    shader: Shader,
    state: State,
    uploadPosition: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit,
    uploadRotation: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit,
    uploadTint: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit,
    uploadUvs: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit,
    uploadVertices: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit
  ): ParticleRenderer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), render = js.Any.fromFunction1(render), shader = shader.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], uploadPosition = js.Any.fromFunction6(uploadPosition), uploadRotation = js.Any.fromFunction6(uploadRotation), uploadTint = js.Any.fromFunction6(uploadTint), uploadUvs = js.Any.fromFunction6(uploadUvs), uploadVertices = js.Any.fromFunction6(uploadVertices))
    __obj.asInstanceOf[ParticleRenderer]
  }
  
  @scala.inline
  implicit class ParticleRendererMutableBuilder[Self <: ParticleRenderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRender(value: ParticleContainer => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShader(value: Shader): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadPosition(value: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit): Self = StObject.set(x, "uploadPosition", js.Any.fromFunction6(value))
    
    @scala.inline
    def setUploadRotation(value: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit): Self = StObject.set(x, "uploadRotation", js.Any.fromFunction6(value))
    
    @scala.inline
    def setUploadTint(value: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit): Self = StObject.set(x, "uploadTint", js.Any.fromFunction6(value))
    
    @scala.inline
    def setUploadUvs(value: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit): Self = StObject.set(x, "uploadUvs", js.Any.fromFunction6(value))
    
    @scala.inline
    def setUploadVertices(value: (js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double) => Unit): Self = StObject.set(x, "uploadVertices", js.Any.fromFunction6(value))
  }
}
