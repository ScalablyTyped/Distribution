package typings.nodeObjectHash.objectSorterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Advanced sort options
  */
trait SortOptions extends js.Object {
  /**
    * If `true` sort array entries before hash
    */
  var array: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true` sort map entries before hash
    */
  var map: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true` sort object entries before hash
    */
  var `object`: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true` sort set entries before hash
    */
  var set: js.UndefOr[Boolean] = js.undefined
}

object SortOptions {
  @scala.inline
  def apply(
    array: js.UndefOr[Boolean] = js.undefined,
    map: js.UndefOr[Boolean] = js.undefined,
    `object`: js.UndefOr[Boolean] = js.undefined,
    set: js.UndefOr[Boolean] = js.undefined
  ): SortOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(array)) __obj.updateDynamic("array")(array.asInstanceOf[js.Any])
    if (!js.isUndefined(map)) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(`object`)) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (!js.isUndefined(set)) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortOptions]
  }
}

