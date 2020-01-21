package typings.nodeObjectHash.objectSorterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object sorter options
  */
trait SorterOptions extends js.Object {
  /**
    * If `true` enables type coercion.
    * Advanced coerce options could be provided as object
    * @default true
    */
  var coerce: js.UndefOr[Boolean | CoerceOptions] = js.undefined
  /**
    * If `true` enables sorting.
    * Advanced sorting options could be provided as object
    * @default true
    */
  var sort: js.UndefOr[Boolean | SortOptions] = js.undefined
  /**
    * If `true` enables trimming and multiple whitespace replacement.
    * Advanced sorting options could be provided as object.
    * @default false
    */
  var trim: js.UndefOr[Boolean | TrimOptions] = js.undefined
}

object SorterOptions {
  @scala.inline
  def apply(
    coerce: Boolean | CoerceOptions = null,
    sort: Boolean | SortOptions = null,
    trim: Boolean | TrimOptions = null
  ): SorterOptions = {
    val __obj = js.Dynamic.literal()
    if (coerce != null) __obj.updateDynamic("coerce")(coerce.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (trim != null) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    __obj.asInstanceOf[SorterOptions]
  }
}

