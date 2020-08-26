package typings.pixiJs.global.PIXI.resources

import typings.pixiJs.anon.Width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource that contains a number of sources.
  *
  * @class
  * @extends PIXI.resources.Resource
  * @memberof PIXI.resources
  * @param {number|Array<*>} source - Number of items in array or the collection
  *        of image URLs to use. Can also be resources, image elements, canvas, etc.
  * @param {object} [options] - Options to apply to {@link PIXI.resources.autoDetectResource}
  * @param {number} [options.width] - Width of the resource
  * @param {number} [options.height] - Height of the resource
  */
@JSGlobal("PIXI.resources.ArrayResource")
@js.native
class ArrayResource protected ()
  extends typings.pixiJs.PIXI.resources.ArrayResource {
  def this(source: js.Array[_]) = this()
  def this(source: Double) = this()
  def this(source: js.Array[_], options: Width) = this()
  def this(source: Double, options: Width) = this()
}

