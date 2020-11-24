package typings.pixiJs.PIXI

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Simple Mesh class mimics Mesh in PixiJS v4, providing easy-to-use constructor arguments.
  * For more robust customization, use {@link PIXI.Mesh}.
  *
  * @class
  * @extends PIXI.Mesh
  * @memberof PIXI
  */
@js.native
trait SimpleMesh extends Mesh {
  
  /**
    * upload vertices buffer each frame
    * @member {boolean} PIXI.SimpleMesh#autoUpdate
    */
  var autoUpdate: Boolean = js.native
  
  /**
    * Collection of vertices data.
    * @member {Float32Array}
    */
  var vertices: Float32Array = js.native
}
