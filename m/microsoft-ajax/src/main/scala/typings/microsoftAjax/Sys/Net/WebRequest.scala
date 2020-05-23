package typings.microsoftAjax.Sys.Net

import org.scalablytyped.runtime.StringDictionary
import typings.microsoftAjax.Sys.EventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the script API to make a Web request.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310979(v=vs.100).aspx}
  */
trait WebRequest extends js.Object {
  /**
    * Registers a handler for the completed request event of the Web request.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310841(v=vs.100).aspx}
    */
  def add_completed(handler: js.Function2[/* reference */ js.Any, /* eventArgs */ EventArgs, Unit]): Unit
  /**
    * Raises the completed event for the associated Sys.Net.WebRequest instance.
    * @param eventArgs
    *           The value to pass to the Web request completed event handler.
    */
  def completed(eventArgs: EventArgs): Unit
  /**
    * Gets the resolved URL of the Sys.Net.WebRequest instance.
    * @returns The resolved URL that the Web request is directed to.
    */
  def getResolvedUrl(): String
  def get_body(): String
  def get_executor(): WebRequestExecutor
  def get_headers(): StringDictionary[String]
  def get_httpVerb(): String
  def get_timeout(): Double
  //#endregion
  //#region Members
  def get_url(): String
  def get_userContext(): js.Any
  /**
    * Executes a Web request.
    */
  def invoke(): Unit
  /**
    * Removes the event handler added by the add_completed method.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397454(v=vs.100).aspx}
    */
  def remove_completed(handler: js.Function2[/* reference */ js.Any, /* eventArgs */ EventArgs, Unit]): Unit
  def set_body(value: String): Unit
  def set_executor(value: WebRequestExecutor): Unit
  def set_httpVerb(value: String): Unit
  def set_timeout(value: Double): Unit
  def set_url(value: String): Unit
  def set_userContext(value: js.Any): Unit
}

object WebRequest {
  @scala.inline
  def apply(
    add_completed: js.Function2[/* reference */ js.Any, /* eventArgs */ EventArgs, Unit] => Unit,
    completed: EventArgs => Unit,
    getResolvedUrl: () => String,
    get_body: () => String,
    get_executor: () => WebRequestExecutor,
    get_headers: () => StringDictionary[String],
    get_httpVerb: () => String,
    get_timeout: () => Double,
    get_url: () => String,
    get_userContext: () => js.Any,
    invoke: () => Unit,
    remove_completed: js.Function2[/* reference */ js.Any, /* eventArgs */ EventArgs, Unit] => Unit,
    set_body: String => Unit,
    set_executor: WebRequestExecutor => Unit,
    set_httpVerb: String => Unit,
    set_timeout: Double => Unit,
    set_url: String => Unit,
    set_userContext: js.Any => Unit
  ): WebRequest = {
    val __obj = js.Dynamic.literal(add_completed = js.Any.fromFunction1(add_completed), completed = js.Any.fromFunction1(completed), getResolvedUrl = js.Any.fromFunction0(getResolvedUrl), get_body = js.Any.fromFunction0(get_body), get_executor = js.Any.fromFunction0(get_executor), get_headers = js.Any.fromFunction0(get_headers), get_httpVerb = js.Any.fromFunction0(get_httpVerb), get_timeout = js.Any.fromFunction0(get_timeout), get_url = js.Any.fromFunction0(get_url), get_userContext = js.Any.fromFunction0(get_userContext), invoke = js.Any.fromFunction0(invoke), remove_completed = js.Any.fromFunction1(remove_completed), set_body = js.Any.fromFunction1(set_body), set_executor = js.Any.fromFunction1(set_executor), set_httpVerb = js.Any.fromFunction1(set_httpVerb), set_timeout = js.Any.fromFunction1(set_timeout), set_url = js.Any.fromFunction1(set_url), set_userContext = js.Any.fromFunction1(set_userContext))
    __obj.asInstanceOf[WebRequest]
  }
}

