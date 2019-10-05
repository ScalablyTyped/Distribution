package typings.openui5.sap.ui.model.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.BatchResponseCollector")
@js.native
class BatchResponseCollector protected () extends js.Object {
  /**
    * Constructor for a batch response collecting component.
    * @param mParams optional Setup-Parameter, @see BatchResponseCollector#setup
    */
  def this(mParams: js.Any) = this()
  /**
    * Collects responses of type BatchResponseCollector.TYPE_SUCCESS and
    * BatchResponseCollector.TYPE_ERROR.Keeps track of all collected responses and fires the necessary
    * events after all responses for therequests, given in the constructor, have returned.
    * @param oResponse the response which should be collected
    * @param sResponseType the type of the response, either BatchResponseCollector.TYPE_SUCCESS									or
    * BatchResponseCollector.TYPE_ERROR
    */
  def collect(oResponse: js.Any): Unit = js.native
  def collect(oResponse: js.Any, sResponseType: String): Unit = js.native
  /**
    * Convenience function to collect an error response.Internally BatchResponseCollector#collect is
    * called, the second parameter is set to BatchResponseCollector.TYPE_ERROR
    * @param oResponse the erroneous response object
    */
  def error(oResponse: js.Any): Unit = js.native
  /**
    * Setup-Function to initialize/reset the BatchResponseCollector.
    * @param mParams optional Setup-Parameter
    */
  def setup(mParams: js.Any): Unit = js.native
  /**
    * Convenience function to collect a success response.Internally BatchResponseCollector#collect is
    * called with second parameter BatchResponseCollector.TYPE_SUCCESS
    * @param oResponse the successful response, which should be collected
    */
  def success(oResponse: js.Any): Unit = js.native
}

