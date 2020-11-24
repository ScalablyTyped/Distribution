package typings.ol.controlControlMod

import typings.ol.eventsMod.EventsKey
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Control
  extends typings.ol.objectMod.default {
  
  var element: HTMLElement = js.native
  
  /**
    * Get the map associated with this control.
    */
  def getMap(): typings.ol.pluggableMapMod.default = js.native
  
  var listenerKeys: js.Array[EventsKey] = js.native
  
  /**
    * Renders the control.
    */
  def render(mapEvent: typings.ol.mapEventMod.default): Unit = js.native
  
  /**
    * Remove the control from its current map and attach it to the new map.
    * Subclasses may set up event handlers to get notified about changes to
    * the map here.
    */
  def setMap(map: typings.ol.pluggableMapMod.default): Unit = js.native
  
  def setTarget(target: String): Unit = js.native
  /**
    * This function is used to set a target element for the control. It has no
    * effect if it is called after the control has been added to the map (i.e.
    * after setMap is called on the control). If no target is set in the
    * options passed to the control constructor and if setTarget is not called
    * then the control is added to the map's overlay container.
    */
  def setTarget(target: HTMLElement): Unit = js.native
}
