package typings.pixiJs.PIXI.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.utils.decomposeDataUri")
@js.native
object decomposeDataUri extends js.Object {
  /**
    * Split a data URI into components. Returns undefined if
    * parameter `dataUri` is not a valid data URI.
    *
    * @memberof PIXI.utils
    * @function decomposeDataUri
    * @param {string} dataUri - the data URI to check
    * @return {PIXI.utils.DecomposedDataUri|undefined} The decomposed data uri or undefined
    */
  def apply(dataUri: String): js.UndefOr[DecomposedDataUri] = js.native
}

