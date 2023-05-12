package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The standard material options define a set of options used to control the shader frontend shader
  * generation, such as textures, tints and multipliers.
  */
@JSImport("playcanvas", "StandardMaterialOptions")
@js.native
open class StandardMaterialOptions () extends StObject {
  
  /** @private */
  /* private */ var _isForwardPass: Any = js.native
  
  /** @private */
  /* private */ var _pass: Any = js.native
  
  /**
    * The value of {@link StandardMaterial#ambientTint}.
    *
    * @type {boolean}
    */
  var ambientTint: Boolean = js.native
  
  var chunks: js.Array[Any] = js.native
  
  /**
    * Invert the clearcoat gloss channel.
    *
    * @type {boolean}
    */
  var clearCoatGlossInvert: Boolean = js.native
  
  /**
    * Defines if {@link StandardMaterial#diffuse} constant should affect diffuse color.
    *
    * @type {boolean}
    */
  var diffuseTint: Boolean = js.native
  
  var emissiveEncoding: String = js.native
  
  /**
    * Defines if {@link StandardMaterial#emissive} constant should affect emissive color.
    *
    * @type {boolean}
    */
  var emissiveTint: Boolean = js.native
  
  /**
    * If UV1 (second set of texture coordinates) is required in the shader. Will be declared as
    * "vUv1" and passed to the fragment shader.
    *
    * @type {boolean}
    */
  var forceUv1: Boolean = js.native
  
  /**
    * Invert the gloss channel.
    *
    * @type {boolean}
    */
  var glossInvert: Boolean = js.native
  
  /**
    * Defines if {@link StandardMaterial#gloss} constant should affect glossiness value.
    *
    * @type {boolean}
    */
  var glossTint: Boolean = js.native
  
  def isForwardPass: Boolean = js.native
  def isForwardPass_=(arg: Boolean): Unit = js.native
  
  var lightMapEncoding: String = js.native
  
  var litOptions: LitOptions = js.native
  
  /**
    * Defines if {@link StandardMaterial#metalness} constant should affect metalness value.
    *
    * @type {boolean}
    */
  var metalnessTint: Boolean = js.native
  
  /**
    * Defines if {@link StandardMaterial#opacity} constant should affect opacity value.
    *
    * @type {boolean}
    */
  var opacityTint: Boolean = js.native
  
  /**
    * If normal map contains X in RGB, Y in Alpha, and Z must be reconstructed.
    *
    * @type {boolean}
    */
  var packedNormal: Boolean = js.native
  
  def pass: Double = js.native
  /**
    * Value of {@link Layer#shaderPass} of the Layer being rendered. Must be set to the same in
    * {@link LitOptions#pass}.
    *
    * @type {number}
    */
  def pass_=(arg: Double): Unit = js.native
  
  /**
    * Invert the sheen gloss channel.
    *
    * @type {boolean}
    */
  var sheenGlossInvert: Boolean = js.native
  
  /**
    * Defines if {@link StandardMaterial#specular} constant should affect specular color.
    *
    * @type {boolean}
    */
  var specularTint: Boolean = js.native
}
