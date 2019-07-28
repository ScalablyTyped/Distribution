package typings.officeDashJsDashPreview.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of Page objects that are part of the document.
  *
  * [Api set:  1.1]
  */
trait PageCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the height of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Index of the Page. Read-only.
    *
    * [Api set:  1.1]
    */
  var index: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Whether the page is a background page or not. Read-only.
    *
    * [Api set:  1.1]
    */
  var isBackground: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Page name. Read-only.
    *
    * [Api set:  1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the view of the page.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[PageViewLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns the width of the page. Read-only.
    *
    * [Api set:  1.1]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}

object PageCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[Boolean] = js.undefined,
    isBackground: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    view: PageViewLoadOptions = null,
    width: js.UndefOr[Boolean] = js.undefined
  ): PageCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index)
    if (!js.isUndefined(isBackground)) __obj.updateDynamic("isBackground")(isBackground)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (view != null) __obj.updateDynamic("view")(view)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PageCollectionLoadOptions]
  }
}

