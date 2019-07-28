package typings.ol.mapBrowserEventTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapBrowserEventType extends js.Object

@JSImport("ol/MapBrowserEventType", "MapBrowserEventType")
@js.native
object MapBrowserEventType extends js.Object {
  @js.native
  sealed trait CLICK extends MapBrowserEventType
  
  @js.native
  sealed trait DBLCLICK extends MapBrowserEventType
  
  @js.native
  sealed trait POINTERCANCEL extends MapBrowserEventType
  
  @js.native
  sealed trait POINTERDOWN extends MapBrowserEventType
  
  @js.native
  sealed trait POINTERDRAG extends MapBrowserEventType
  
  @js.native
  sealed trait POINTERENTER extends MapBrowserEventType
  
  @js.native
  sealed trait POINTERLEAVE extends MapBrowserEventType
  
  @js.native
  sealed trait POINTERMOVE extends MapBrowserEventType
  
  @js.native
  sealed trait POINTEROUT extends MapBrowserEventType
  
  @js.native
  sealed trait POINTEROVER extends MapBrowserEventType
  
  @js.native
  sealed trait POINTERUP extends MapBrowserEventType
  
  @js.native
  sealed trait SINGLECLICK extends MapBrowserEventType
  
}

