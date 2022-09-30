package typings.pixiJs.mod

import typings.pixiCore.mod.ICubeResourceOptions
import typings.pixiJs.pixiJsInts.`6`
import typings.pixiUtils.mod.ArrayFixed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "CubeResource")
@js.native
/**
  * @param {Array<string|PIXI.Resource>} [source] - Collection of URLs or resources
  *        to use as the sides of the cube.
  * @param options - ImageResource options
  * @param {number} [options.width] - Width of resource
  * @param {number} [options.height] - Height of resource
  * @param {number} [options.autoLoad=true] - Whether to auto-load resources
  * @param {number} [options.linkBaseTexture=true] - In case BaseTextures are supplied,
  *   whether to copy them or use
  */
open class CubeResource ()
  extends typings.pixiCore.mod.CubeResource {
  def this(source: ArrayFixed[String | typings.pixiCore.mod.Resource, `6`]) = this()
  def this(source: Unit, options: ICubeResourceOptions) = this()
  def this(source: ArrayFixed[String | typings.pixiCore.mod.Resource, `6`], options: ICubeResourceOptions) = this()
}
/* static members */
object CubeResource {
  
  @JSImport("pixi.js", "CubeResource")
  @js.native
  val ^ : js.Any = js.native
  
  /** Number of texture sides to store for CubeResources. */
  @JSImport("pixi.js", "CubeResource.SIDES")
  @js.native
  def SIDES: Double = js.native
  inline def SIDES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIDES")(x.asInstanceOf[js.Any])
  
  /**
    * Used to auto-detect the type of resource.
    * @param {*} source - The source object
    * @returns {boolean} `true` if source is an array of 6 elements
    */
  inline def test(source: Any): /* is @pixi/utils.@pixi/utils.ArrayFixed<string | @pixi/core.@pixi/core.Resource, 6> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[/* is @pixi/utils.@pixi/utils.ArrayFixed<string | @pixi/core.@pixi/core.Resource, 6> */ Boolean]
}
