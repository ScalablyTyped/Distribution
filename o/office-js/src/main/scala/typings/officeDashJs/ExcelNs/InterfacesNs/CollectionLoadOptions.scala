package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides ways to load properties of only a subset of members of a collection.
  */
trait CollectionLoadOptions extends js.Object {
  /**
    * Specify the number of items in the collection that are to be skipped and not included in the result. If top is specified, the selection of result will start after skipping the specified number of items.
    */
  @JSName("$skip")
  var $skip: js.UndefOr[Double] = js.undefined
  /**
    * Specify the number of items in the queried collection to be included in the result.
    */
  @JSName("$top")
  var $top: js.UndefOr[Double] = js.undefined
}

object CollectionLoadOptions {
  @scala.inline
  def apply($skip: Int | Double = null, $top: Int | Double = null): CollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if ($skip != null) __obj.updateDynamic("$skip")($skip.asInstanceOf[js.Any])
    if ($top != null) __obj.updateDynamic("$top")($top.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionLoadOptions]
  }
}

