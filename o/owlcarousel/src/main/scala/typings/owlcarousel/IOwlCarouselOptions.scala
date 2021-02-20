package typings.owlcarousel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOwlCarouselOptions extends StObject {
  
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
  implicit class IOwlCarouselOptionsMutableBuilder[Self <: IOwlCarouselOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddClassActive(value: Boolean): Self = StObject.set(x, "addClassActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddClassActiveUndefined: Self = StObject.set(x, "addClassActive", js.undefined)
    
    @scala.inline
    def setAfterAction(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterActionUndefined: Self = StObject.set(x, "afterAction", js.undefined)
    
    @scala.inline
    def setAfterInit(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
    
    @scala.inline
    def setAfterLazyLoad(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterLazyLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterLazyLoadUndefined: Self = StObject.set(x, "afterLazyLoad", js.undefined)
    
    @scala.inline
    def setAfterMove(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterMoveUndefined: Self = StObject.set(x, "afterMove", js.undefined)
    
    @scala.inline
    def setAfterUpdate(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterUpdateUndefined: Self = StObject.set(x, "afterUpdate", js.undefined)
    
    @scala.inline
    def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
    
    @scala.inline
    def setAutoPlay(value: js.Any): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    @scala.inline
    def setBaseClass(value: String): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
    
    @scala.inline
    def setBeforeInit(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeInitUndefined: Self = StObject.set(x, "beforeInit", js.undefined)
    
    @scala.inline
    def setBeforeMove(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeMoveUndefined: Self = StObject.set(x, "beforeMove", js.undefined)
    
    @scala.inline
    def setBeforeUpdate(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
    
    @scala.inline
    def setDragBeforeAnimFinish(value: Boolean): Self = StObject.set(x, "dragBeforeAnimFinish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragBeforeAnimFinishUndefined: Self = StObject.set(x, "dragBeforeAnimFinish", js.undefined)
    
    @scala.inline
    def setItems(value: Double): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsCustom(value: js.Any): Self = StObject.set(x, "itemsCustom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsCustomUndefined: Self = StObject.set(x, "itemsCustom", js.undefined)
    
    @scala.inline
    def setItemsDesktop(value: js.Array[Double]): Self = StObject.set(x, "itemsDesktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsDesktopSmall(value: js.Array[Double]): Self = StObject.set(x, "itemsDesktopSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsDesktopSmallUndefined: Self = StObject.set(x, "itemsDesktopSmall", js.undefined)
    
    @scala.inline
    def setItemsDesktopSmallVarargs(value: Double*): Self = StObject.set(x, "itemsDesktopSmall", js.Array(value :_*))
    
    @scala.inline
    def setItemsDesktopUndefined: Self = StObject.set(x, "itemsDesktop", js.undefined)
    
    @scala.inline
    def setItemsDesktopVarargs(value: Double*): Self = StObject.set(x, "itemsDesktop", js.Array(value :_*))
    
    @scala.inline
    def setItemsMobile(value: js.Array[Double]): Self = StObject.set(x, "itemsMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsMobileUndefined: Self = StObject.set(x, "itemsMobile", js.undefined)
    
    @scala.inline
    def setItemsMobileVarargs(value: Double*): Self = StObject.set(x, "itemsMobile", js.Array(value :_*))
    
    @scala.inline
    def setItemsScaleUp(value: Boolean): Self = StObject.set(x, "itemsScaleUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsScaleUpUndefined: Self = StObject.set(x, "itemsScaleUp", js.undefined)
    
    @scala.inline
    def setItemsTablet(value: js.Array[Double]): Self = StObject.set(x, "itemsTablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsTabletSmall(value: js.Any): Self = StObject.set(x, "itemsTabletSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsTabletSmallUndefined: Self = StObject.set(x, "itemsTabletSmall", js.undefined)
    
    @scala.inline
    def setItemsTabletUndefined: Self = StObject.set(x, "itemsTablet", js.undefined)
    
    @scala.inline
    def setItemsTabletVarargs(value: Double*): Self = StObject.set(x, "itemsTablet", js.Array(value :_*))
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setJsonPath(value: js.Any): Self = StObject.set(x, "jsonPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonPathUndefined: Self = StObject.set(x, "jsonPath", js.undefined)
    
    @scala.inline
    def setJsonSuccess(value: /* data */ js.Any => Unit): Self = StObject.set(x, "jsonSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJsonSuccessUndefined: Self = StObject.set(x, "jsonSuccess", js.undefined)
    
    @scala.inline
    def setLazyEffect(value: js.Any): Self = StObject.set(x, "lazyEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyEffectUndefined: Self = StObject.set(x, "lazyEffect", js.undefined)
    
    @scala.inline
    def setLazyFollow(value: Boolean): Self = StObject.set(x, "lazyFollow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyFollowUndefined: Self = StObject.set(x, "lazyFollow", js.undefined)
    
    @scala.inline
    def setLazyLoad(value: Boolean): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setMouseDrag(value: Boolean): Self = StObject.set(x, "mouseDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseDragUndefined: Self = StObject.set(x, "mouseDrag", js.undefined)
    
    @scala.inline
    def setNav(value: Boolean): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
    
    @scala.inline
    def setNavigation(value: Boolean): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationText(value: js.Any): Self = StObject.set(x, "navigationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationTextUndefined: Self = StObject.set(x, "navigationText", js.undefined)
    
    @scala.inline
    def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    @scala.inline
    def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationNumbers(value: Boolean): Self = StObject.set(x, "paginationNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationNumbersUndefined: Self = StObject.set(x, "paginationNumbers", js.undefined)
    
    @scala.inline
    def setPaginationSpeed(value: Double): Self = StObject.set(x, "paginationSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationSpeedUndefined: Self = StObject.set(x, "paginationSpeed", js.undefined)
    
    @scala.inline
    def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    @scala.inline
    def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveBaseWidth(value: JQuery | String): Self = StObject.set(x, "responsiveBaseWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveBaseWidthUndefined: Self = StObject.set(x, "responsiveBaseWidth", js.undefined)
    
    @scala.inline
    def setResponsiveRefreshRate(value: Double): Self = StObject.set(x, "responsiveRefreshRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveRefreshRateUndefined: Self = StObject.set(x, "responsiveRefreshRate", js.undefined)
    
    @scala.inline
    def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    @scala.inline
    def setRewindNav(value: Boolean): Self = StObject.set(x, "rewindNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewindNavUndefined: Self = StObject.set(x, "rewindNav", js.undefined)
    
    @scala.inline
    def setRewindSpeed(value: Double): Self = StObject.set(x, "rewindSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewindSpeedUndefined: Self = StObject.set(x, "rewindSpeed", js.undefined)
    
    @scala.inline
    def setScrollPerPage(value: Boolean): Self = StObject.set(x, "scrollPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPerPageUndefined: Self = StObject.set(x, "scrollPerPage", js.undefined)
    
    @scala.inline
    def setSingleItem(value: Boolean): Self = StObject.set(x, "singleItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleItemUndefined: Self = StObject.set(x, "singleItem", js.undefined)
    
    @scala.inline
    def setSlideSpeed(value: Double): Self = StObject.set(x, "slideSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideSpeedUndefined: Self = StObject.set(x, "slideSpeed", js.undefined)
    
    @scala.inline
    def setStartDragging(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "startDragging", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartDraggingUndefined: Self = StObject.set(x, "startDragging", js.undefined)
    
    @scala.inline
    def setStopOnHover(value: Boolean): Self = StObject.set(x, "stopOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopOnHoverUndefined: Self = StObject.set(x, "stopOnHover", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTouchDrag(value: Boolean): Self = StObject.set(x, "touchDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchDragUndefined: Self = StObject.set(x, "touchDrag", js.undefined)
    
    @scala.inline
    def setTransitionStyle(value: js.Any): Self = StObject.set(x, "transitionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionStyleUndefined: Self = StObject.set(x, "transitionStyle", js.undefined)
  }
}
