package typings.officeUiFabricReact.listTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPageSpecification extends js.Object {
  /**
    * Data to pass through to the page when rendering.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * The estimated pixel height of the page.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The number of items to allocate to the page.
    */
  var itemCount: js.UndefOr[Double] = js.undefined
  /**
    * The key to use when creating the page.
    */
  var key: js.UndefOr[String] = js.undefined
}

object IPageSpecification {
  @scala.inline
  def apply(
    data: js.Any = null,
    height: js.UndefOr[Double] = js.undefined,
    itemCount: js.UndefOr[Double] = js.undefined,
    key: String = null
  ): IPageSpecification = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemCount)) __obj.updateDynamic("itemCount")(itemCount.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPageSpecification]
  }
}

