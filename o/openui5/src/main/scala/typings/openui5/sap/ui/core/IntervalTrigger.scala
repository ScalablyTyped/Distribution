package typings.openui5.sap.ui.core

import typings.openui5.sap.ui.base.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntervalTrigger extends Object {
  
  /**
    * Adds a listener to the list that should be triggered.
    * @param fnFunction is the called function that should be called when           the trigger want to
    * trigger the listener.
    * @param oListener that should be triggered.
    */
  def addListener(fnFunction: js.Any): Unit = js.native
  def addListener(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Removes corresponding listener from list.
    * @param fnFunction is the previously registered function
    * @param oListener that should be removed
    */
  def removeListener(fnFunction: js.Any): Unit = js.native
  def removeListener(fnFunction: js.Any, oListener: js.Any): Unit = js.native
  
  /**
    * Sets the trigger interval. If the value is >0 triggering will start ifthere are any registered
    * listeners. If the interval is set to <=0triggering will stop.
    * @param iInterval sets the interval in milliseconds when a new           triggering should occur.
    */
  def setInterval(iInterval: Double): Unit = js.native
}
