package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper class to create a shader program.
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.Program")
@js.native
class Program () extends js.Object {
  def this(vertexSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String, name: String) = this()
  /**
    * The fragment shader.
    *
    * @member {string} PIXI.Program#fragmentSrc
    */
  var fragmentSrc: String = js.native
  /**
    * The vertex shader.
    *
    * @member {string} PIXI.Program#vertexSrc
    */
  var vertexSrc: String = js.native
  /**
    * Extracts the data for a buy creating a small test program
    * or reading the src directly.
    * @protected
    *
    * @param {string} [vertexSrc] - The source of the vertex shader.
    * @param {string} [fragmentSrc] - The source of the fragment shader.
    */
  /* protected */ def extractData(): Unit = js.native
  /* protected */ def extractData(vertexSrc: String): Unit = js.native
  /* protected */ def extractData(vertexSrc: String, fragmentSrc: String): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.Program")
@js.native
object Program extends js.Object {
  /**
    * The default fragment shader source
    *
    * @static
    * @constant
    * @member {string}
    */
  var defaultFragmentSrc: String = js.native
  /**
    * The default vertex shader source
    *
    * @static
    * @constant
    * @member {string}
    */
  var defaultVertexSrc: String = js.native
  /**
    * A short hand function to create a program based of a vertex and fragment shader
    * this method will also check to see if there is a cached program.
    *
    * @param {string} [vertexSrc] - The source of the vertex shader.
    * @param {string} [fragmentSrc] - The source of the fragment shader.
    * @param {string} [name=pixi-shader] - Name for shader
    *
    * @returns {PIXI.Program} an shiny new Pixi shader!
    */
  def from(): Program = js.native
  def from(vertexSrc: String): Program = js.native
  def from(vertexSrc: String, fragmentSrc: String): Program = js.native
  def from(vertexSrc: String, fragmentSrc: String, name: String): Program = js.native
}

