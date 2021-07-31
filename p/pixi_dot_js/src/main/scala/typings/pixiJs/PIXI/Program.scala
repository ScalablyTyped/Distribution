package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper class to create a shader program.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait Program extends StObject {
  
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
  /* protected */ def extractData(vertexSrc: Unit, fragmentSrc: String): Unit = js.native
  
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
}
