package typings.officeJsPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides ways to load properties of only a subset of members of a collection.
  */
@js.native
trait CollectionLoadOptions extends js.Object {
  /**
    * Specify the number of items in the collection that are to be skipped and not included in the result. If top is specified, the selection of result will start after skipping the specified number of items.
    */
  @JSName("$skip")
  var $skip: js.UndefOr[Double] = js.native
  /**
    * Specify the number of items in the queried collection to be included in the result.
    */
  @JSName("$top")
  var $top: js.UndefOr[Double] = js.native
}

object CollectionLoadOptions {
  @scala.inline
  def apply(): CollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionLoadOptions]
  }
  @scala.inline
  implicit class CollectionLoadOptionsOps[Self <: CollectionLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$skip(value: Double): Self = this.set("$skip", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$skip: Self = this.set("$skip", js.undefined)
    @scala.inline
    def set$top(value: Double): Self = this.set("$top", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$top: Self = this.set("$top", js.undefined)
  }
  
}

