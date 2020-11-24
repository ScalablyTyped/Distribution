package typings.pixiJs.global.PIXI.resources

import typings.pixiJs.anon.AutoLoad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource for a CubeTexture which contains six resources.
  *
  * @class
  * @extends PIXI.resources.ArrayResource
  * @memberof PIXI.resources
  * @param {Array<string|PIXI.resources.Resource>} [source] - Collection of URLs or resources
  *        to use as the sides of the cube.
  * @param {object} [options] - ImageResource options
  * @param {number} [options.width] - Width of resource
  * @param {number} [options.height] - Height of resource
  * @param {number} [options.autoLoad=true] - Whether to auto-load resources
  * @param {number} [options.linkBaseTexture=true] - In case BaseTextures are supplied,
  *   whether to copy them or use
  */
@JSGlobal("PIXI.resources.CubeResource")
@js.native
class CubeResource ()
  extends typings.pixiJs.PIXI.resources.CubeResource {
  def this(source: js.Array[String | typings.pixiJs.PIXI.resources.Resource]) = this()
  def this(source: js.UndefOr[scala.Nothing], options: AutoLoad) = this()
  def this(source: js.Array[String | typings.pixiJs.PIXI.resources.Resource], options: AutoLoad) = this()
}
/* static members */
@JSGlobal("PIXI.resources.CubeResource")
@js.native
object CubeResource extends js.Object {
  
  /**
    * Number of texture sides to store for CubeResources
    *
    * @name PIXI.resources.CubeResource.SIDES
    * @static
    * @member {number}
    * @default 6
    */
  var SIDES: Double = js.native
  
  /**
    * Used to auto-detect the type of resource.
    *
    * @static
    * @param {object} source - The source object
    * @return {boolean} `true` if source is an array of 6 elements
    */
  def test(source: js.Any): Boolean = js.native
}
