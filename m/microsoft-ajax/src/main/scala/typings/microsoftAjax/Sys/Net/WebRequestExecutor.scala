package typings.microsoftAjax.Sys.Net

import typings.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the abstract base class from which network executors derive.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397434(v=vs.100).aspx}
  */
@js.native
trait WebRequestExecutor extends js.Object {
  //#endregion
  //#region Methods
  /**
    * Stops the pending network request issued by the executor.
    * The specifics of aborting a request vary depending on how an executor is implemented.
    * However, all executors that derive from WebRequestExecutor must set their state to aborted and must raise the completed event of the associated Sys.Net.WebRequest object.
    * The executor properties do not contain consistent data after abort has been called.
    */
  def abort(): Unit = js.native
  /**
    * Instructs the executor to execute a Web request.
    * When this method is called, the executor packages the content of the Web request instance and initiates processing.
    * This method is intended to be used by a custom executor. If you are implementing a custom executor, you instantiate the executor, assign it to the Web request instance, and then invoke the method on the executor instance.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb383834(v=vs.100).aspx}
    */
  def executeRequest(): Unit = js.native
  /**
    * Gets all the response headers for the current request.
    * If a request finished successfully and with valid response data, this method returns all the response headers.
    * @return All the response headers
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310805(v=vs.100).aspx}
    */
  def getAllResponseHeaders(): String = js.native
  /**
    * Gets the value of the specified response header.
    * @return The specified response header.
    */
  def getResponseHeader(key: String): String = js.native
  /**
    * Gets a value indicating whether the request associated with the executor was aborted.
    * When the current instance of the Sys.Net.WebRequestExecutor class is aborted, it must set its state to aborted and it must raise the completed event of the associated request object.
    * @return true if the request associated with the executor was aborted; otherwise, false.
    */
  def get_aborted(): Boolean = js.native
  /**
    * Gets a value indicating whether the request completed successfully.
    * Successful completion usually means a well-formed response was received by the executor.
    * If a response was received, the current instance of the Sys.Net.WebRequestExecutor class must set its state to completed.
    * It must also raise the completed event of the associated request object.
    * @return true if the request completed successfully; otherwise, false.
    */
  def get_responseAvailable(): Boolean = js.native
  /**
    * Gets the text representation of the response body. When a request has completed successfully with valid response data, this property returns the text that is contained in the response body.
    * @return The text representation of the response body.
    */
  def get_responseData(): String = js.native
  /**
    * Returns a value indicating whether the executor has started processing the request.
    * The executor returns true if substantial processing of the request has started. For executors that make network calls, substantial processing means that a network call has been started.
    * @return true if the executor has started processing the request; otherwise, false.
    */
  def get_started(): Boolean = js.native
  /**
    * Gets a success status code.
    * The statusCode property returns an integer that specifies that a request completed successfully and with valid response data.
    * @return An integer that represents a status code.
    */
  def get_statusCode(): Double = js.native
  /**
    * Gets status information about a request that completed successfully.
    * The statusText property returns status information if a request completed successfully and with valid response data.
    * @return the status text
    */
  def get_statusText(): String = js.native
  /**
    * Gets a value indicating whether the request timed out.
    * Executors use the time-out information associated with the request to raise the completed event on the associated WebRequest object.
    * @return true if the request timed out; otherwise, false.
    */
  def get_timedOut(): Boolean = js.native
  /**
    * Gets the WebRequest object associated with the executor.
    * @return The WebRequest object associated with the current executor instance.
    */
  def get_webRequest(): WebRequest = js.native
  /**
    * Attempts to get the response to the current request as an XMLDOM object.
    * If a request finished successfully with valid response data, this method tries to get the response as an XMLDOM object.
    */
  def get_xml(): XMLDocument = js.native
  //#endregion
  //#region Properties
  /**
    * Gets the JSON-evaluated object from the response.
    * @return The JSON-evaluated response object.
    */
  def `object`(): js.Any = js.native
}

object WebRequestExecutor {
  @scala.inline
  def apply(
    abort: () => Unit,
    executeRequest: () => Unit,
    getAllResponseHeaders: () => String,
    getResponseHeader: String => String,
    get_aborted: () => Boolean,
    get_responseAvailable: () => Boolean,
    get_responseData: () => String,
    get_started: () => Boolean,
    get_statusCode: () => Double,
    get_statusText: () => String,
    get_timedOut: () => Boolean,
    get_webRequest: () => WebRequest,
    get_xml: () => XMLDocument,
    `object`: () => js.Any
  ): WebRequestExecutor = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), executeRequest = js.Any.fromFunction0(executeRequest), getAllResponseHeaders = js.Any.fromFunction0(getAllResponseHeaders), getResponseHeader = js.Any.fromFunction1(getResponseHeader), get_aborted = js.Any.fromFunction0(get_aborted), get_responseAvailable = js.Any.fromFunction0(get_responseAvailable), get_responseData = js.Any.fromFunction0(get_responseData), get_started = js.Any.fromFunction0(get_started), get_statusCode = js.Any.fromFunction0(get_statusCode), get_statusText = js.Any.fromFunction0(get_statusText), get_timedOut = js.Any.fromFunction0(get_timedOut), get_webRequest = js.Any.fromFunction0(get_webRequest), get_xml = js.Any.fromFunction0(get_xml))
    __obj.updateDynamic("object")(js.Any.fromFunction0(`object`))
    __obj.asInstanceOf[WebRequestExecutor]
  }
  @scala.inline
  implicit class WebRequestExecutorOps[Self <: WebRequestExecutor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    @scala.inline
    def setExecuteRequest(value: () => Unit): Self = this.set("executeRequest", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAllResponseHeaders(value: () => String): Self = this.set("getAllResponseHeaders", js.Any.fromFunction0(value))
    @scala.inline
    def setGetResponseHeader(value: String => String): Self = this.set("getResponseHeader", js.Any.fromFunction1(value))
    @scala.inline
    def setGet_aborted(value: () => Boolean): Self = this.set("get_aborted", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_responseAvailable(value: () => Boolean): Self = this.set("get_responseAvailable", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_responseData(value: () => String): Self = this.set("get_responseData", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_started(value: () => Boolean): Self = this.set("get_started", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_statusCode(value: () => Double): Self = this.set("get_statusCode", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_statusText(value: () => String): Self = this.set("get_statusText", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_timedOut(value: () => Boolean): Self = this.set("get_timedOut", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_webRequest(value: () => WebRequest): Self = this.set("get_webRequest", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_xml(value: () => XMLDocument): Self = this.set("get_xml", js.Any.fromFunction0(value))
    @scala.inline
    def setObject(value: () => js.Any): Self = this.set("object", js.Any.fromFunction0(value))
  }
  
}

