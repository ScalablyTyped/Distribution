package typings.officeDashUiDashFabricDashReact.libComponentsListListMod

import typings.officeDashUiDashFabricDashReact.libComponentsListListDotTypesMod.IPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListState[T] extends js.Object {
  var isScrolling: js.UndefOr[Boolean] = js.undefined
  /** The last versionstamp for  */
  var measureVersion: js.UndefOr[Double] = js.undefined
  var pages: js.UndefOr[js.Array[IPage[T]]] = js.undefined
}

object IListState {
  @scala.inline
  def apply[T](
    isScrolling: js.UndefOr[Boolean] = js.undefined,
    measureVersion: Int | Double = null,
    pages: js.Array[IPage[T]] = null
  ): IListState[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isScrolling)) __obj.updateDynamic("isScrolling")(isScrolling.asInstanceOf[js.Any])
    if (measureVersion != null) __obj.updateDynamic("measureVersion")(measureVersion.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListState[T]]
  }
}

