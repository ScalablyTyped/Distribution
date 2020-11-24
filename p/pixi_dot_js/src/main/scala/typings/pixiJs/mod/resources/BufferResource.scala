package typings.pixiJs.mod.resources

import typings.pixiJs.anon.HeightWidth
import typings.std.Float32Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Buffer resource with data of typed array.
  * @class
  * @extends PIXI.resources.Resource
  * @memberof PIXI.resources
  */
@JSImport("pixi.js", "resources.BufferResource")
@js.native
class BufferResource protected ()
  extends typings.pixiJs.PIXI.resources.BufferResource {
  def this(source: Float32Array, options: HeightWidth) = this()
  def this(source: Uint32Array, options: HeightWidth) = this()
  def this(source: Uint8Array, options: HeightWidth) = this()
}
/* static members */
@JSImport("pixi.js", "resources.BufferResource")
@js.native
object BufferResource extends js.Object {
  
  /**
    * Used to auto-detect the type of resource.
    *
    * @static
    * @param {*} source - The source object
    * @return {boolean} `true` if <canvas>
    */
  def test(source: js.Any): Boolean = js.native
}
