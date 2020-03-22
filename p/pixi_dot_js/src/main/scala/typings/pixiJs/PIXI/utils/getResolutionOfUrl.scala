package typings.pixiJs.PIXI.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.utils.getResolutionOfUrl")
@js.native
object getResolutionOfUrl extends js.Object {
  /**
    * get the resolution / device pixel ratio of an asset by looking for the prefix
    * used by spritesheets and image urls
    *
    * @memberof PIXI.utils
    * @function getResolutionOfUrl
    * @param {string} url - the image path
    * @param {number} [defaultValue=1] - the defaultValue if no filename prefix is set.
    * @return {number} resolution / device pixel ratio of an asset
    */
  def apply(url: String): Double = js.native
  def apply(url: String, defaultValue: Double): Double = js.native
}

