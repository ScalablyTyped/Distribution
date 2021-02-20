package typings.onsenui.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description Component that adds "pull-to-refresh" to an <ons-page> element
  */
//later should be updated
@js.native
trait OnsPullHookElement extends HTMLElement {
  
  /**
    * @description A boolean value that specifies whether the element is disabled or not.
    */
  var disabled: Boolean = js.native
  
  /**
    * @description The height of the pull hook in pixels. The default value is `64px`.
    */
  var height: String = js.native
  
  /**
    * @description Define the function that will be called in the `"action"` state.
    */
  var onAction: js.UndefOr[js.Function] = js.native
  
  /**
    * @param {Number} ratio Pulled ratio (scroll / height).
    * @param {Object} animationOptions Object containing duration and timing.
    * @description Hook called whenever the user pulls the element.
    **/
  var onPull: js.UndefOr[js.Function] = js.native
  
  /**
    * @description The current number of pixels the pull hook has moved.
    */
  var pullDistance: Double = js.native
  
  /**
    * @description The current number of pixels the pull hook has moved.
    */
  var state: String = js.native
  
  /**
    * @param {Number} thresholdHeight Desired threshold height
    * @description The thresholdHeight of the pull hook in pixels. The default value is `96px`.
    */
  var thresholdHeight: String = js.native
}
