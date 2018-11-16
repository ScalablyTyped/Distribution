package typings
package microsoftDashAjaxLib.SysNs.NetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
        * Provides the abstract base class from which network executors derive.
        * @see {@link http://msdn.microsoft.com/en-us/library/bb397434(v=vs.100).aspx}
        */
@JSGlobal("Sys.Net.WebRequestExecutor")
@js.native
class WebRequestExecutor () extends js.Object {
  //#endregion
  //#region Methods
  /**
              * Stops the pending network request issued by the executor.
              * The specifics of aborting a request vary depending on how an executor is implemented.
              * However, all executors that derive from WebRequestExecutor must set their state to aborted and must raise the completed event of the associated Sys.Net.WebRequest object.
              * The executor properties do not contain consistent data after abort has been called.
              */
  def abort(): scala.Unit = js.native
  /**
              * Instructs the executor to execute a Web request.
              * When this method is called, the executor packages the content of the Web request instance and initiates processing.
              * This method is intended to be used by a custom executor. If you are implementing a custom executor, you instantiate the executor, assign it to the Web request instance, and then invoke the method on the executor instance.
              * @see {@link http://msdn.microsoft.com/en-us/library/bb383834(v=vs.100).aspx}
              */
  def executeRequest(): scala.Unit = js.native
  /**
              * Gets all the response headers for the current request.
              * If a request finished successfully and with valid response data, this method returns all the response headers.
              * @return All the response headers
              * @see {@link http://msdn.microsoft.com/en-us/library/bb310805(v=vs.100).aspx}
              */
  def getAllResponseHeaders(): java.lang.String = js.native
  /**
              * Gets the value of the specified response header.
              * @return The specified response header.
              */
  def getResponseHeader(key: java.lang.String): java.lang.String = js.native
  /**
              * Gets a value indicating whether the request associated with the executor was aborted.
              * When the current instance of the Sys.Net.WebRequestExecutor class is aborted, it must set its state to aborted and it must raise the completed event of the associated request object.
              * @return true if the request associated with the executor was aborted; otherwise, false.
              */
  def get_aborted(): scala.Boolean = js.native
  /**
              * Gets a value indicating whether the request completed successfully.
              * Successful completion usually means a well-formed response was received by the executor.
              * If a response was received, the current instance of the Sys.Net.WebRequestExecutor class must set its state to completed.
              * It must also raise the completed event of the associated request object.
              * @return true if the request completed successfully; otherwise, false.
              */
  def get_responseAvailable(): scala.Boolean = js.native
  /**
              * Gets the text representation of the response body. When a request has completed successfully with valid response data, this property returns the text that is contained in the response body.
              * @return The text representation of the response body.
              */
  def get_responseData(): java.lang.String = js.native
  /**
              * Returns a value indicating whether the executor has started processing the request.
              * The executor returns true if substantial processing of the request has started. For executors that make network calls, substantial processing means that a network call has been started.
              * @return true if the executor has started processing the request; otherwise, false.
              */
  def get_started(): scala.Boolean = js.native
  /**
              * Gets a success status code.
              * The statusCode property returns an integer that specifies that a request completed successfully and with valid response data.
              * @return An integer that represents a status code.
              */
  def get_statusCode(): scala.Double = js.native
  /**
              * Gets status information about a request that completed successfully.
              * The statusText property returns status information if a request completed successfully and with valid response data.
              * @return the status text
              */
  def get_statusText(): java.lang.String = js.native
  /**
              * Gets a value indicating whether the request timed out.
              * Executors use the time-out information associated with the request to raise the completed event on the associated WebRequest object.
              * @return true if the request timed out; otherwise, false.
              */
  def get_timedOut(): scala.Boolean = js.native
  /**
              * Gets the WebRequest object associated with the executor.
              * @return The WebRequest object associated with the current executor instance.
              */
  def get_webRequest(): WebRequest = js.native
  /**
              * Attempts to get the response to the current request as an XMLDOM object.
              * If a request finished successfully with valid response data, this method tries to get the response as an XMLDOM object.
              */
  def get_xml(): stdLib.XMLDocument = js.native
  //#endregion
  //#region Properties
  /**
              * Gets the JSON-evaluated object from the response.
              * @return The JSON-evaluated response object.
              */
  def `object`(): js.Any = js.native
}

