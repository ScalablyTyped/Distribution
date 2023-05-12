package typings.playcanvas.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance of {@link Morph}. Contains weights to assign to every {@link MorphTarget}, manages
  * selection of active morph targets.
  */
@JSImport("playcanvas", "MorphInstance")
@js.native
open class MorphInstance protected () extends StObject {
  /**
    * Create a new MorphInstance instance.
    *
    * @param {import('./morph.js').Morph} morph - The {@link Morph} to instance.
    */
  def this(morph: Morph) = this()
  
  var _activeTargets: js.Array[Any] = js.native
  
  var _activeVertexBuffers: js.Array[Any] = js.native
  
  var _dirty: Boolean = js.native
  
  /**
    * Generate fragment shader to blend a number of textures using specified weights.
    *
    * @param {number} numTextures - Number of textures to blend.
    * @returns {string} Fragment shader.
    * @private
    */
  /* private */ var _getFragmentShader: Any = js.native
  
  /**
    * Create complete shader for texture based morphing.
    *
    * @param {number} count - Number of textures to blend.
    * @returns {import('../platform/graphics/shader.js').Shader} Shader.
    * @private
    */
  /* private */ var _getShader: Any = js.native
  
  def _getWeightIndex(key: Any): Any = js.native
  
  var _shaderMorphWeights: js.typedarray.Float32Array = js.native
  
  var _shaderMorphWeightsA: js.typedarray.Float32Array = js.native
  
  var _shaderMorphWeightsB: js.typedarray.Float32Array = js.native
  
  var _textureParams: js.typedarray.Float32Array = js.native
  
  def _updateTextureMorph(): Unit = js.native
  
  def _updateTextureRenderTarget(renderTarget: Any, srcTextureName: Any): Unit = js.native
  
  def _updateVertexMorph(): Unit = js.native
  
  var _weightMap: Map[Any, Any] = js.native
  
  var _weights: js.Array[Any] = js.native
  
  /**
    * Frees video memory allocated by this object.
    */
  def destroy(): Unit = js.native
  
  var device: Any = js.native
  
  /**
    * Gets current weight of the specified morph target.
    *
    * @param {string|number} key - An identifier for the morph target. Either the weight index or
    * the weight name.
    * @returns {number} Weight.
    */
  def getWeight(key: String): Double = js.native
  def getWeight(key: Double): Double = js.native
  
  var maxSubmitCount: Any = js.native
  
  /**
    * The morph with its targets, which is being instanced.
    *
    * @type {import('./morph.js').Morph}
    */
  var morph: Morph = js.native
  
  var morphFactor: Any = js.native
  
  var rtNormals: RenderTarget = js.native
  
  var rtPositions: RenderTarget = js.native
  
  /**
    * Sets weight of the specified morph target.
    *
    * @param {string|number} key - An identifier for the morph target. Either the weight index or
    * the weight name.
    * @param {number} weight - Weight.
    */
  def setWeight(key: String, weight: Double): Unit = js.native
  def setWeight(key: Double, weight: Double): Unit = js.native
  
  var shader: Any = js.native
  
  var textureNormals: Any = js.native
  
  var texturePositions: Any = js.native
  
  /**
    * Selects active morph targets and prepares morph for rendering. Called automatically by
    * renderer.
    */
  def update(): Unit = js.native
  
  var zeroTextures: Boolean = js.native
}
