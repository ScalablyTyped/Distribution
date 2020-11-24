package typings.ol.mouseWheelZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouseWheelZoom
  extends typings.ol.interactionInteractionMod.default {
  
  /**
    * Enable or disable using the mouse's location as an anchor when zooming
    */
  def setMouseAnchor(useAnchor: Boolean): Unit = js.native
}
