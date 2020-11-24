package typings.ol.scaleLineMod

import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.changeColonunits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleLine
  extends typings.ol.controlControlMod.default {
  
  /**
    * Creates a marker at given position
    */
  def createMarker(position: String, i: Double): String = js.native
  
  /**
    * Creates the label for a marker marker at given position
    */
  def createStepText(i: Double, width: Double, isLast: Boolean, scale: Double, suffix: String): String = js.native
  
  /**
    * Returns the appropriate scale for the given resolution and units.
    */
  def getScaleForResolution(): Double = js.native
  
  /**
    * Return the units to use in the scale line.
    */
  def getUnits(): Units = js.native
  
  @JSName("on")
  def on_changeunits(`type`: changeColonunits, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_changeunits(`type`: changeColonunits, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  
  /**
    * Specify the dpi of output device such as printer.
    */
  def setDpi(): Unit = js.native
  def setDpi(dpi: Double): Unit = js.native
  
  /**
    * Set the units to use in the scale line.
    */
  def setUnits(units: Units): Unit = js.native
  
  @JSName("un")
  def un_changeunits(`type`: changeColonunits, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}
