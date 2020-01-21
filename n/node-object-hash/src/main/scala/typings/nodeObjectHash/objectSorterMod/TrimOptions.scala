package typings.nodeObjectHash.objectSorterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Advanced trim options
  */
trait TrimOptions extends js.Object {
  /**
    * If `true` replaces multiple space with one and trims whitespaces in function body
    */
  var function: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true` replaces multiple space with one and trims whitespaces in strings
    */
  var string: js.UndefOr[Boolean] = js.undefined
}

object TrimOptions {
  @scala.inline
  def apply(function: js.UndefOr[Boolean] = js.undefined, string: js.UndefOr[Boolean] = js.undefined): TrimOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(function)) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (!js.isUndefined(string)) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrimOptions]
  }
}

