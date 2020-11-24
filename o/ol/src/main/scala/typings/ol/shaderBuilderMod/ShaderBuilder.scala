package typings.ol.shaderBuilderMod

import typings.ol.olStrings.float
import typings.ol.olStrings.vec2
import typings.ol.olStrings.vec3
import typings.ol.olStrings.vec4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/webgl/ShaderBuilder", "ShaderBuilder")
@js.native
class ShaderBuilder () extends js.Object {
  
  /**
    * Adds an attribute accessible in the vertex shader, read from the geometry buffer.
    * The given name should include a type, such as vec2 a_position.
    */
  def addAttribute(name: String): ShaderBuilder = js.native
  
  /**
    * Adds a uniform accessible in both fragment and vertex shaders.
    * The given name should include a type, such as sampler2D u_texture.
    */
  def addUniform(name: String): ShaderBuilder = js.native
  
  /**
    * Adds a varying defined in the vertex shader and accessible from the fragment shader.
    * The type and expression of the varying have to be specified separately.
    */
  @JSName("addVarying")
  def addVarying_float(name: String, `type`: float, expression: String): ShaderBuilder = js.native
  @JSName("addVarying")
  def addVarying_vec2(name: String, `type`: vec2, expression: String): ShaderBuilder = js.native
  @JSName("addVarying")
  def addVarying_vec3(name: String, `type`: vec3, expression: String): ShaderBuilder = js.native
  @JSName("addVarying")
  def addVarying_vec4(name: String, `type`: vec4, expression: String): ShaderBuilder = js.native
  
  def getColorExpression(): String = js.native
  
  def getFragmentDiscardExpression(): String = js.native
  
  def getOffsetExpression(): String = js.native
  
  def getSizeExpression(): String = js.native
  
  /**
    * Generates a symbol fragment shader from the builder parameters,
    * intended to be used on point geometries.
    * Expects the following varyings to be transmitted by the vertex shader:
    * vec2 v_quadCoord, vec2 v_texCoord
    */
  def getSymbolFragmentShader(): String = js.native
  def getSymbolFragmentShader(forHitDetection: Boolean): String = js.native
  
  /**
    * Generates a symbol vertex shader from the builder parameters,
    * intended to be used on point geometries.
    * Three uniforms are hardcoded in all shaders: u_projectionMatrix, u_offsetScaleMatrix,
    * u_offsetRotateMatrix, u_time.
    * The following attributes are hardcoded and expected to be present in the vertex buffers:
    * vec2 a_position, float a_index (being the index of the vertex in the quad, 0 to 3).
    * The following varyings are hardcoded and gives the coordinate of the pixel both in the quad and on the texture:
    * vec2 v_quadCoord, vec2 v_texCoord
    */
  def getSymbolVertexShader(): String = js.native
  def getSymbolVertexShader(forHitDetection: Boolean): String = js.native
  
  def getTextureCoordinateExpression(): String = js.native
  
  /**
    * Sets an expression to compute the color of the shape.
    * This expression can use all the uniforms, varyings and attributes available
    * in the fragment shader, and should evaluate to a vec4 value.
    */
  def setColorExpression(expression: String): ShaderBuilder = js.native
  
  /**
    * Sets an expression to determine whether a fragment (pixel) should be discarded,
    * i.e. not drawn at all.
    * This expression can use all the uniforms, varyings and attributes available
    * in the fragment shader, and should evaluate to a bool value (it will be
    * used in an if statement)
    */
  def setFragmentDiscardExpression(expression: String): ShaderBuilder = js.native
  
  /**
    * Sets an expression to compute the rotation of the shape.
    * This expression can use all the uniforms and attributes available
    * in the vertex shader, and should evaluate to a float value in radians.
    */
  def setRotationExpression(expression: String): ShaderBuilder = js.native
  
  /**
    * Sets an expression to compute the size of the shape.
    * This expression can use all the uniforms and attributes available
    * in the vertex shader, and should evaluate to a vec2 value.
    */
  def setSizeExpression(expression: String): ShaderBuilder = js.native
  
  /**
    * Sets an expression to compute the offset of the symbol from the point center.
    * This expression can use all the uniforms and attributes available
    * in the vertex shader, and should evaluate to a vec2 value.
    * Note: will only be used for point geometry shaders.
    */
  def setSymbolOffsetExpression(expression: String): ShaderBuilder = js.native
  
  /**
    * Sets whether the symbols should rotate with the view or stay aligned with the map.
    * Note: will only be used for point geometry shaders.
    */
  def setSymbolRotateWithView(rotateWithView: Boolean): ShaderBuilder = js.native
  
  /**
    * Sets an expression to compute the texture coordinates of the vertices.
    * This expression can use all the uniforms and attributes available
    * in the vertex shader, and should evaluate to a vec4 value.
    */
  def setTextureCoordinateExpression(expression: String): ShaderBuilder = js.native
}
