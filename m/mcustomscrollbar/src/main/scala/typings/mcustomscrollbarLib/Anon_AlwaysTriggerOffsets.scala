package typings
package mcustomscrollbarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_AlwaysTriggerOffsets extends js.Object {
  /**
              * Set the behavior of calling onTotalScroll and onTotalScrollBack offsets.
              * By default, callback offsets will trigger repeatedly while content is scrolling within the offsets.
              * Set alwaysTriggerOffsets: false when you need to trigger onTotalScroll and onTotalScrollBack callbacks once, each time scroll end or beginning is reached.
              */
  var alwaysTriggerOffsets: js.UndefOr[scala.Boolean] = js.undefined
  /**
              * A function to call right before scrollbar(s) are updated.
              */
  var onBeforeUpdate: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
              * A function to call when plugin markup is created.
              */
  var onCreate: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
              * A function to call each time an image inside the element is fully loaded and scrollbar(s) are updated.
              */
  var onImageLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
              * A function to call when scrollbars have initialized
              */
  var onInit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
              * A function to call when content becomes wide enough and horizontal scrollbar is added.
              */
  var onOverflowX: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
              * A function to call when content becomes narrow enough and horizontal scrollbar is removed.
              */
  var onOverflowXNone: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
              * A function to call when content becomes long enough and vertical scrollbar is added.
              */
  var onOverflowY: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
              * A function to call when content becomes short enough and vertical scrollbar is removed.
              */
  var onOverflowYNone: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
              * User defined callback function, triggered on scroll event. Call your own function(s) each time a scroll event completes
              */
  var onScroll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
              * User defined callback function, triggered on scroll start event. You can call your own function(s) each time a scroll event begins
              */
  var onScrollStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
              * A function to call each time a type of element is added, removed or changes its size and scrollbar(s) are updated.
              */
  var onSelectorChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
              * A function to call when scrolling is completed and content is scrolled all the way to the end (bottom/right)
              */
  var onTotalScroll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
              * A function to call when scrolling is completed and content is scrolled back to the beginning (top/left)
              */
  var onTotalScrollBack: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
              * Set an offset for which the onTotalScrollBack callback is triggered.
              * Its value is in pixels
              */
  var onTotalScrollBackOffset: js.UndefOr[scala.Double] = js.undefined
  /**
              * Set an offset for which the onTotalScroll callback is triggered.
              * Its value is in pixels.
              */
  var onTotalScrollOffset: js.UndefOr[scala.Double] = js.undefined
  /**
              * A function to call when scrollbar(s) are updated.
              */
  var onUpdate: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
              * User defined callback function, triggered while scrolling
              */
  var whileScrolling: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

