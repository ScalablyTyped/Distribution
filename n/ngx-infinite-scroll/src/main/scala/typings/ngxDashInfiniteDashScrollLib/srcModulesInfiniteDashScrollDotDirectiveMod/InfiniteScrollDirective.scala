package typings
package ngxDashInfiniteDashScrollLib.srcModulesInfiniteDashScrollDotDirectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ngx-infinite-scroll/src/modules/infinite-scroll.directive", "InfiniteScrollDirective")
@js.native
class InfiniteScrollDirective protected ()
  extends atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.OnDestroy
     with atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.OnChanges
     with atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.AfterViewInit {
  def this(element: atAngularCoreLib.coreMod.ElementRef[_], zone: atAngularCoreLib.coreMod.NgZone) = this()
  var alwaysCallback: scala.Boolean = js.native
  var disposeScroller: js.Any = js.native
  var element: js.Any = js.native
  var fromRoot: scala.Boolean = js.native
  var horizontal: scala.Boolean = js.native
  var immediateCheck: scala.Boolean = js.native
  var infiniteScrollContainer: js.Any = js.native
  var infiniteScrollDisabled: scala.Boolean = js.native
  var infiniteScrollDistance: scala.Double = js.native
  var infiniteScrollThrottle: scala.Double = js.native
  var infiniteScrollUpDistance: scala.Double = js.native
  var scrollWindow: scala.Boolean = js.native
  var scrolled: atAngularCoreLib.coreMod.EventEmitter[ngxDashInfiniteDashScrollLib.srcModelsMod.InfiniteScrollEvent] = js.native
  var scrolledUp: atAngularCoreLib.coreMod.EventEmitter[ngxDashInfiniteDashScrollLib.srcModelsMod.InfiniteScrollEvent] = js.native
  var zone: js.Any = js.native
  def destroyScroller(): scala.Unit = js.native
  def handleOnScroll(hasTypePayload: ngxDashInfiniteDashScrollLib.srcModelsMod.IInfiniteScrollAction): scala.Unit = js.native
  /**
       * A callback method that is invoked immediately after
       * Angular has completed initialization of a component's view.
       * It is invoked only once when the view is instantiated.
       *
       */
  /* CompleteClass */
  override def ngAfterViewInit(): scala.Unit = js.native
  /**
       * A callback method that is invoked immediately after the
       * default change detector has checked data-bound properties
       * if at least one has changed, and before the view and content
       * children are checked.
       * @param changes The changed properties.
       */
  /* CompleteClass */
  override def ngOnChanges(changes: atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.SimpleChanges): scala.Unit = js.native
  /**
       * A callback method that performs custom clean-up, invoked immediately
       * after a directive, pipe, or service instance is destroyed.
       */
  /* CompleteClass */
  override def ngOnDestroy(): scala.Unit = js.native
  def setup(): scala.Unit = js.native
}

