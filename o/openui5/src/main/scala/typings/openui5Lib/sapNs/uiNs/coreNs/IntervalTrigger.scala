package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.IntervalTrigger")
@js.native
class IntervalTrigger protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.Object {
  /**
           * Creates an instance of EventBus.
           * @param iInterval is the interval the trigger should be used. If the           trigger is >0
           * triggering starts/runs and if the interval is           set to <=0 triggering stops.
          */
  def this(iInterval: scala.Double) = this()
  /**
           * Adds a listener to the list that should be triggered.
           * @param fnFunction is the called function that should be called when           the trigger want to
           * trigger the listener.
           * @param oListener that should be triggered.
          */
  def addListener(fnFunction: js.Any): scala.Unit = js.native
  /**
           * Adds a listener to the list that should be triggered.
           * @param fnFunction is the called function that should be called when           the trigger want to
           * trigger the listener.
           * @param oListener that should be triggered.
          */
  def addListener(fnFunction: js.Any, oListener: js.Any): scala.Unit = js.native
  /**
           * Removes corresponding listener from list.
           * @param fnFunction is the previously registered function
           * @param oListener that should be removed
          */
  def removeListener(fnFunction: js.Any): scala.Unit = js.native
  /**
           * Removes corresponding listener from list.
           * @param fnFunction is the previously registered function
           * @param oListener that should be removed
          */
  def removeListener(fnFunction: js.Any, oListener: js.Any): scala.Unit = js.native
  /**
           * Sets the trigger interval. If the value is >0 triggering will start ifthere are any registered
           * listeners. If the interval is set to <=0triggering will stop.
           * @param iInterval sets the interval in milliseconds when a new           triggering should occur.
          */
  def setInterval(iInterval: scala.Double): scala.Unit = js.native
}

