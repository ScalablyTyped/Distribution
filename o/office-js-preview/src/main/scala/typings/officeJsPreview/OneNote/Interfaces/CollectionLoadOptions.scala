package typings.officeJsPreview.OneNote.Interfaces

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
  def apply($skip: js.UndefOr[Double] = js.undefined, $top: js.UndefOr[Double] = js.undefined): CollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($skip)) __obj.updateDynamic("$skip")($skip.get.asInstanceOf[js.Any])
    if (!js.isUndefined($top)) __obj.updateDynamic("$top")($top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionLoadOptions]
  }
}

