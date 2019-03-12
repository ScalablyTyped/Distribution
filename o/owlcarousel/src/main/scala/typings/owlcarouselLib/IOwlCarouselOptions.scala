package typings
package owlcarouselLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOwlCarouselOptions extends js.Object {
  var addClassActive: js.UndefOr[scala.Boolean] = js.undefined
  var afterAction: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var afterInit: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var afterLazyLoad: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var afterMove: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var afterUpdate: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var autoHeight: js.UndefOr[scala.Boolean] = js.undefined
  var autoPlay: js.UndefOr[js.Any] = js.undefined
  var baseClass: js.UndefOr[java.lang.String] = js.undefined
  var beforeInit: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var beforeMove: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  // callbacks
  var beforeUpdate: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var dragBeforeAnimFinish: js.UndefOr[scala.Boolean] = js.undefined
  // options
  var items: js.UndefOr[scala.Double] = js.undefined
  var itemsCustom: js.UndefOr[js.Any] = js.undefined
  var itemsDesktop: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var itemsDesktopSmall: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var itemsMobile: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var itemsScaleUp: js.UndefOr[scala.Boolean] = js.undefined
  var itemsTablet: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var itemsTabletSmall: js.UndefOr[js.Any] = js.undefined
  var jsonPath: js.UndefOr[js.Any] = js.undefined
  var jsonSuccess: js.UndefOr[js.Function1[/* data */ js.Any, scala.Unit]] = js.undefined
  var lazyEffect: js.UndefOr[js.Any] = js.undefined
  var lazyFollow: js.UndefOr[scala.Boolean] = js.undefined
  var lazyLoad: js.UndefOr[scala.Boolean] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var mouseDrag: js.UndefOr[scala.Boolean] = js.undefined
  var nav: js.UndefOr[scala.Boolean] = js.undefined
  var navigation: js.UndefOr[scala.Boolean] = js.undefined
  var navigationText: js.UndefOr[js.Any] = js.undefined
  var pagination: js.UndefOr[scala.Boolean] = js.undefined
  var paginationNumbers: js.UndefOr[scala.Boolean] = js.undefined
  var paginationSpeed: js.UndefOr[scala.Double] = js.undefined
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
  var responsiveBaseWidth: js.UndefOr[JQuery | java.lang.String] = js.undefined
  var responsiveRefreshRate: js.UndefOr[scala.Double] = js.undefined
  var rewindNav: js.UndefOr[scala.Boolean] = js.undefined
  var rewindSpeed: js.UndefOr[scala.Double] = js.undefined
  var scrollPerPage: js.UndefOr[scala.Boolean] = js.undefined
  var singleItem: js.UndefOr[scala.Boolean] = js.undefined
  var slideSpeed: js.UndefOr[scala.Double] = js.undefined
  var startDragging: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var stopOnHover: js.UndefOr[scala.Boolean] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var touchDrag: js.UndefOr[scala.Boolean] = js.undefined
  var transitionStyle: js.UndefOr[js.Any] = js.undefined
}

object IOwlCarouselOptions {
  @scala.inline
  def apply(
    addClassActive: js.UndefOr[scala.Boolean] = js.undefined,
    afterAction: /* params */ js.UndefOr[js.Any] => scala.Unit = null,
    afterInit: /* params */ js.UndefOr[js.Any] => scala.Unit = null,
    afterLazyLoad: /* params */ js.UndefOr[js.Any] => scala.Unit = null,
    afterMove: /* params */ js.UndefOr[js.Any] => scala.Unit = null,
    afterUpdate: /* params */ js.UndefOr[js.Any] => scala.Unit = null,
    autoHeight: js.UndefOr[scala.Boolean] = js.undefined,
    autoPlay: js.Any = null,
    baseClass: java.lang.String = null,
    beforeInit: /* params */ js.UndefOr[js.Any] => scala.Unit = null,
    beforeMove: /* params */ js.UndefOr[js.Any] => scala.Unit = null,
    beforeUpdate: /* params */ js.UndefOr[js.Any] => scala.Unit = null,
    dragBeforeAnimFinish: js.UndefOr[scala.Boolean] = js.undefined,
    items: scala.Int | scala.Double = null,
    itemsCustom: js.Any = null,
    itemsDesktop: js.Array[scala.Double] = null,
    itemsDesktopSmall: js.Array[scala.Double] = null,
    itemsMobile: js.Array[scala.Double] = null,
    itemsScaleUp: js.UndefOr[scala.Boolean] = js.undefined,
    itemsTablet: js.Array[scala.Double] = null,
    itemsTabletSmall: js.Any = null,
    jsonPath: js.Any = null,
    jsonSuccess: /* data */ js.Any => scala.Unit = null,
    lazyEffect: js.Any = null,
    lazyFollow: js.UndefOr[scala.Boolean] = js.undefined,
    lazyLoad: js.UndefOr[scala.Boolean] = js.undefined,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    mouseDrag: js.UndefOr[scala.Boolean] = js.undefined,
    nav: js.UndefOr[scala.Boolean] = js.undefined,
    navigation: js.UndefOr[scala.Boolean] = js.undefined,
    navigationText: js.Any = null,
    pagination: js.UndefOr[scala.Boolean] = js.undefined,
    paginationNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    paginationSpeed: scala.Int | scala.Double = null,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    responsiveBaseWidth: JQuery | java.lang.String = null,
    responsiveRefreshRate: scala.Int | scala.Double = null,
    rewindNav: js.UndefOr[scala.Boolean] = js.undefined,
    rewindSpeed: scala.Int | scala.Double = null,
    scrollPerPage: js.UndefOr[scala.Boolean] = js.undefined,
    singleItem: js.UndefOr[scala.Boolean] = js.undefined,
    slideSpeed: scala.Int | scala.Double = null,
    startDragging: /* params */ js.UndefOr[js.Any] => scala.Unit = null,
    stopOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    theme: java.lang.String = null,
    touchDrag: js.UndefOr[scala.Boolean] = js.undefined,
    transitionStyle: js.Any = null
  ): IOwlCarouselOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addClassActive)) __obj.updateDynamic("addClassActive")(addClassActive)
    if (afterAction != null) __obj.updateDynamic("afterAction")(js.Any.fromFunction1(afterAction))
    if (afterInit != null) __obj.updateDynamic("afterInit")(js.Any.fromFunction1(afterInit))
    if (afterLazyLoad != null) __obj.updateDynamic("afterLazyLoad")(js.Any.fromFunction1(afterLazyLoad))
    if (afterMove != null) __obj.updateDynamic("afterMove")(js.Any.fromFunction1(afterMove))
    if (afterUpdate != null) __obj.updateDynamic("afterUpdate")(js.Any.fromFunction1(afterUpdate))
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (autoPlay != null) __obj.updateDynamic("autoPlay")(autoPlay)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (beforeInit != null) __obj.updateDynamic("beforeInit")(js.Any.fromFunction1(beforeInit))
    if (beforeMove != null) __obj.updateDynamic("beforeMove")(js.Any.fromFunction1(beforeMove))
    if (beforeUpdate != null) __obj.updateDynamic("beforeUpdate")(js.Any.fromFunction1(beforeUpdate))
    if (!js.isUndefined(dragBeforeAnimFinish)) __obj.updateDynamic("dragBeforeAnimFinish")(dragBeforeAnimFinish)
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (itemsCustom != null) __obj.updateDynamic("itemsCustom")(itemsCustom)
    if (itemsDesktop != null) __obj.updateDynamic("itemsDesktop")(itemsDesktop)
    if (itemsDesktopSmall != null) __obj.updateDynamic("itemsDesktopSmall")(itemsDesktopSmall)
    if (itemsMobile != null) __obj.updateDynamic("itemsMobile")(itemsMobile)
    if (!js.isUndefined(itemsScaleUp)) __obj.updateDynamic("itemsScaleUp")(itemsScaleUp)
    if (itemsTablet != null) __obj.updateDynamic("itemsTablet")(itemsTablet)
    if (itemsTabletSmall != null) __obj.updateDynamic("itemsTabletSmall")(itemsTabletSmall)
    if (jsonPath != null) __obj.updateDynamic("jsonPath")(jsonPath)
    if (jsonSuccess != null) __obj.updateDynamic("jsonSuccess")(js.Any.fromFunction1(jsonSuccess))
    if (lazyEffect != null) __obj.updateDynamic("lazyEffect")(lazyEffect)
    if (!js.isUndefined(lazyFollow)) __obj.updateDynamic("lazyFollow")(lazyFollow)
    if (!js.isUndefined(lazyLoad)) __obj.updateDynamic("lazyLoad")(lazyLoad)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(mouseDrag)) __obj.updateDynamic("mouseDrag")(mouseDrag)
    if (!js.isUndefined(nav)) __obj.updateDynamic("nav")(nav)
    if (!js.isUndefined(navigation)) __obj.updateDynamic("navigation")(navigation)
    if (navigationText != null) __obj.updateDynamic("navigationText")(navigationText)
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination)
    if (!js.isUndefined(paginationNumbers)) __obj.updateDynamic("paginationNumbers")(paginationNumbers)
    if (paginationSpeed != null) __obj.updateDynamic("paginationSpeed")(paginationSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (responsiveBaseWidth != null) __obj.updateDynamic("responsiveBaseWidth")(responsiveBaseWidth.asInstanceOf[js.Any])
    if (responsiveRefreshRate != null) __obj.updateDynamic("responsiveRefreshRate")(responsiveRefreshRate.asInstanceOf[js.Any])
    if (!js.isUndefined(rewindNav)) __obj.updateDynamic("rewindNav")(rewindNav)
    if (rewindSpeed != null) __obj.updateDynamic("rewindSpeed")(rewindSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollPerPage)) __obj.updateDynamic("scrollPerPage")(scrollPerPage)
    if (!js.isUndefined(singleItem)) __obj.updateDynamic("singleItem")(singleItem)
    if (slideSpeed != null) __obj.updateDynamic("slideSpeed")(slideSpeed.asInstanceOf[js.Any])
    if (startDragging != null) __obj.updateDynamic("startDragging")(js.Any.fromFunction1(startDragging))
    if (!js.isUndefined(stopOnHover)) __obj.updateDynamic("stopOnHover")(stopOnHover)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(touchDrag)) __obj.updateDynamic("touchDrag")(touchDrag)
    if (transitionStyle != null) __obj.updateDynamic("transitionStyle")(transitionStyle)
    __obj.asInstanceOf[IOwlCarouselOptions]
  }
}

