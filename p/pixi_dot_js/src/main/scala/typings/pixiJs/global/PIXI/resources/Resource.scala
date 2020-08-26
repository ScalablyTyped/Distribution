package typings.pixiJs.global.PIXI.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base resource class for textures that manages validation and uploading, depending on its type.
  *
  * Uploading of a base texture to the GPU is required.
  *
  * @class
  * @memberof PIXI.resources
  */
@JSGlobal("PIXI.resources.Resource")
@js.native
class Resource ()
  extends typings.pixiJs.PIXI.resources.Resource {
  def this(width: Double) = this()
  def this(width: js.UndefOr[scala.Nothing], height: Double) = this()
  def this(width: Double, height: Double) = this()
}

/* static members */
@JSGlobal("PIXI.resources.Resource")
@js.native
object Resource extends js.Object {
  /**
    * Abstract, used to auto-detect resource type
    *
    * @static
    * @param {*} source - The source object
    * @param {string} extension - The extension of source, if set
    */
  def test(source: js.Any, extension: String): Unit = js.native
}

