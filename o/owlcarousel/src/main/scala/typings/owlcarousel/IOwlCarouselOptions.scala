package typings.owlcarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOwlCarouselOptions extends js.Object {
  
  var addClassActive: js.UndefOr[Boolean] = js.native
  
  var afterAction: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  
  var afterInit: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  
  var afterLazyLoad: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  
  var afterMove: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  
  var afterUpdate: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  
  var autoHeight: js.UndefOr[Boolean] = js.native
  
  var autoPlay: js.UndefOr[js.Any] = js.native
  
  var baseClass: js.UndefOr[String] = js.native
  
  var beforeInit: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  
  var beforeMove: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  
  // callbacks
  var beforeUpdate: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  
  var dragBeforeAnimFinish: js.UndefOr[Boolean] = js.native
  
  // options
  var items: js.UndefOr[Double] = js.native
  
  var itemsCustom: js.UndefOr[js.Any] = js.native
  
  var itemsDesktop: js.UndefOr[js.Array[Double]] = js.native
  
  var itemsDesktopSmall: js.UndefOr[js.Array[Double]] = js.native
  
  var itemsMobile: js.UndefOr[js.Array[Double]] = js.native
  
  var itemsScaleUp: js.UndefOr[Boolean] = js.native
  
  var itemsTablet: js.UndefOr[js.Array[Double]] = js.native
  
  var itemsTabletSmall: js.UndefOr[js.Any] = js.native
  
  var jsonPath: js.UndefOr[js.Any] = js.native
  
  var jsonSuccess: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  
  var lazyEffect: js.UndefOr[js.Any] = js.native
  
  var lazyFollow: js.UndefOr[Boolean] = js.native
  
  var lazyLoad: js.UndefOr[Boolean] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var mouseDrag: js.UndefOr[Boolean] = js.native
  
  var nav: js.UndefOr[Boolean] = js.native
  
  var navigation: js.UndefOr[Boolean] = js.native
  
  var navigationText: js.UndefOr[js.Any] = js.native
  
  var pagination: js.UndefOr[Boolean] = js.native
  
  var paginationNumbers: js.UndefOr[Boolean] = js.native
  
  var paginationSpeed: js.UndefOr[Double] = js.native
  
  var responsive: js.UndefOr[Boolean] = js.native
  
  var responsiveBaseWidth: js.UndefOr[JQuery | String] = js.native
  
  var responsiveRefreshRate: js.UndefOr[Double] = js.native
  
  var rewindNav: js.UndefOr[Boolean] = js.native
  
  var rewindSpeed: js.UndefOr[Double] = js.native
  
  var scrollPerPage: js.UndefOr[Boolean] = js.native
  
  var singleItem: js.UndefOr[Boolean] = js.native
  
  var slideSpeed: js.UndefOr[Double] = js.native
  
  var startDragging: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  
  var stopOnHover: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var touchDrag: js.UndefOr[Boolean] = js.native
  
  var transitionStyle: js.UndefOr[js.Any] = js.native
}
object IOwlCarouselOptions {
  
  @scala.inline
  def apply(): IOwlCarouselOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOwlCarouselOptions]
  }
  
  @scala.inline
  implicit class IOwlCarouselOptionsOps[Self <: IOwlCarouselOptions] (val x: Self) extends AnyVal {
    
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
    def setAddClassActive(value: Boolean): Self = this.set("addClassActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddClassActive: Self = this.set("addClassActive", js.undefined)
    
    @scala.inline
    def setAfterAction(value: /* params */ js.UndefOr[js.Any] => Unit): Self = this.set("afterAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterAction: Self = this.set("afterAction", js.undefined)
    
    @scala.inline
    def setAfterInit(value: /* params */ js.UndefOr[js.Any] => Unit): Self = this.set("afterInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterInit: Self = this.set("afterInit", js.undefined)
    
    @scala.inline
    def setAfterLazyLoad(value: /* params */ js.UndefOr[js.Any] => Unit): Self = this.set("afterLazyLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterLazyLoad: Self = this.set("afterLazyLoad", js.undefined)
    
    @scala.inline
    def setAfterMove(value: /* params */ js.UndefOr[js.Any] => Unit): Self = this.set("afterMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterMove: Self = this.set("afterMove", js.undefined)
    
    @scala.inline
    def setAfterUpdate(value: /* params */ js.UndefOr[js.Any] => Unit): Self = this.set("afterUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterUpdate: Self = this.set("afterUpdate", js.undefined)
    
    @scala.inline
    def setAutoHeight(value: Boolean): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHeight: Self = this.set("autoHeight", js.undefined)
    
    @scala.inline
    def setAutoPlay(value: js.Any): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    
    @scala.inline
    def setBaseClass(value: String): Self = this.set("baseClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseClass: Self = this.set("baseClass", js.undefined)
    
    @scala.inline
    def setBeforeInit(value: /* params */ js.UndefOr[js.Any] => Unit): Self = this.set("beforeInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeInit: Self = this.set("beforeInit", js.undefined)
    
    @scala.inline
    def setBeforeMove(value: /* params */ js.UndefOr[js.Any] => Unit): Self = this.set("beforeMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeMove: Self = this.set("beforeMove", js.undefined)
    
    @scala.inline
    def setBeforeUpdate(value: /* params */ js.UndefOr[js.Any] => Unit): Self = this.set("beforeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeUpdate: Self = this.set("beforeUpdate", js.undefined)
    
    @scala.inline
    def setDragBeforeAnimFinish(value: Boolean): Self = this.set("dragBeforeAnimFinish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragBeforeAnimFinish: Self = this.set("dragBeforeAnimFinish", js.undefined)
    
    @scala.inline
    def setItems(value: Double): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setItemsCustom(value: js.Any): Self = this.set("itemsCustom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsCustom: Self = this.set("itemsCustom", js.undefined)
    
    @scala.inline
    def setItemsDesktopVarargs(value: Double*): Self = this.set("itemsDesktop", js.Array(value :_*))
    
    @scala.inline
    def setItemsDesktop(value: js.Array[Double]): Self = this.set("itemsDesktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsDesktop: Self = this.set("itemsDesktop", js.undefined)
    
    @scala.inline
    def setItemsDesktopSmallVarargs(value: Double*): Self = this.set("itemsDesktopSmall", js.Array(value :_*))
    
    @scala.inline
    def setItemsDesktopSmall(value: js.Array[Double]): Self = this.set("itemsDesktopSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsDesktopSmall: Self = this.set("itemsDesktopSmall", js.undefined)
    
    @scala.inline
    def setItemsMobileVarargs(value: Double*): Self = this.set("itemsMobile", js.Array(value :_*))
    
    @scala.inline
    def setItemsMobile(value: js.Array[Double]): Self = this.set("itemsMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsMobile: Self = this.set("itemsMobile", js.undefined)
    
    @scala.inline
    def setItemsScaleUp(value: Boolean): Self = this.set("itemsScaleUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsScaleUp: Self = this.set("itemsScaleUp", js.undefined)
    
    @scala.inline
    def setItemsTabletVarargs(value: Double*): Self = this.set("itemsTablet", js.Array(value :_*))
    
    @scala.inline
    def setItemsTablet(value: js.Array[Double]): Self = this.set("itemsTablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsTablet: Self = this.set("itemsTablet", js.undefined)
    
    @scala.inline
    def setItemsTabletSmall(value: js.Any): Self = this.set("itemsTabletSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsTabletSmall: Self = this.set("itemsTabletSmall", js.undefined)
    
    @scala.inline
    def setJsonPath(value: js.Any): Self = this.set("jsonPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonPath: Self = this.set("jsonPath", js.undefined)
    
    @scala.inline
    def setJsonSuccess(value: /* data */ js.Any => Unit): Self = this.set("jsonSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteJsonSuccess: Self = this.set("jsonSuccess", js.undefined)
    
    @scala.inline
    def setLazyEffect(value: js.Any): Self = this.set("lazyEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazyEffect: Self = this.set("lazyEffect", js.undefined)
    
    @scala.inline
    def setLazyFollow(value: Boolean): Self = this.set("lazyFollow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazyFollow: Self = this.set("lazyFollow", js.undefined)
    
    @scala.inline
    def setLazyLoad(value: Boolean): Self = this.set("lazyLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazyLoad: Self = this.set("lazyLoad", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setMouseDrag(value: Boolean): Self = this.set("mouseDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseDrag: Self = this.set("mouseDrag", js.undefined)
    
    @scala.inline
    def setNav(value: Boolean): Self = this.set("nav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNav: Self = this.set("nav", js.undefined)
    
    @scala.inline
    def setNavigation(value: Boolean): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    
    @scala.inline
    def setNavigationText(value: js.Any): Self = this.set("navigationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigationText: Self = this.set("navigationText", js.undefined)
    
    @scala.inline
    def setPagination(value: Boolean): Self = this.set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    
    @scala.inline
    def setPaginationNumbers(value: Boolean): Self = this.set("paginationNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationNumbers: Self = this.set("paginationNumbers", js.undefined)
    
    @scala.inline
    def setPaginationSpeed(value: Double): Self = this.set("paginationSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationSpeed: Self = this.set("paginationSpeed", js.undefined)
    
    @scala.inline
    def setResponsive(value: Boolean): Self = this.set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    
    @scala.inline
    def setResponsiveBaseWidth(value: JQuery | String): Self = this.set("responsiveBaseWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsiveBaseWidth: Self = this.set("responsiveBaseWidth", js.undefined)
    
    @scala.inline
    def setResponsiveRefreshRate(value: Double): Self = this.set("responsiveRefreshRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsiveRefreshRate: Self = this.set("responsiveRefreshRate", js.undefined)
    
    @scala.inline
    def setRewindNav(value: Boolean): Self = this.set("rewindNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRewindNav: Self = this.set("rewindNav", js.undefined)
    
    @scala.inline
    def setRewindSpeed(value: Double): Self = this.set("rewindSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRewindSpeed: Self = this.set("rewindSpeed", js.undefined)
    
    @scala.inline
    def setScrollPerPage(value: Boolean): Self = this.set("scrollPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPerPage: Self = this.set("scrollPerPage", js.undefined)
    
    @scala.inline
    def setSingleItem(value: Boolean): Self = this.set("singleItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleItem: Self = this.set("singleItem", js.undefined)
    
    @scala.inline
    def setSlideSpeed(value: Double): Self = this.set("slideSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideSpeed: Self = this.set("slideSpeed", js.undefined)
    
    @scala.inline
    def setStartDragging(value: /* params */ js.UndefOr[js.Any] => Unit): Self = this.set("startDragging", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStartDragging: Self = this.set("startDragging", js.undefined)
    
    @scala.inline
    def setStopOnHover(value: Boolean): Self = this.set("stopOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopOnHover: Self = this.set("stopOnHover", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTouchDrag(value: Boolean): Self = this.set("touchDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchDrag: Self = this.set("touchDrag", js.undefined)
    
    @scala.inline
    def setTransitionStyle(value: js.Any): Self = this.set("transitionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionStyle: Self = this.set("transitionStyle", js.undefined)
  }
}
