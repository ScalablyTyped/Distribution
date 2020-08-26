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
@js.native
trait WebRequest extends js.Object {
  /**
    * Registers a handler for the completed request event of the Web request.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310841(v=vs.100).aspx}
    */
  def add_completed(handler: js.Function2[/* reference */ js.Any, /* eventArgs */ EventArgs, Unit]): Unit = js.native
  /**
    * Raises the completed event for the associated Sys.Net.WebRequest instance.
    * @param eventArgs
    *           The value to pass to the Web request completed event handler.
    */
  def completed(eventArgs: EventArgs): Unit = js.native
  /**
    * Gets the resolved URL of the Sys.Net.WebRequest instance.
    * @returns The resolved URL that the Web request is directed to.
    */
  def getResolvedUrl(): String = js.native
  def get_body(): String = js.native
  def get_executor(): WebRequestExecutor = js.native
  def get_headers(): StringDictionary[String] = js.native
  def get_httpVerb(): String = js.native
  def get_timeout(): Double = js.native
  //#endregion
  //#region Members
  def get_url(): String = js.native
  def get_userContext(): js.Any = js.native
  /**
    * Executes a Web request.
    */
  def invoke(): Unit = js.native
  /**
    * Removes the event handler added by the add_completed method.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397454(v=vs.100).aspx}
    */
  def remove_completed(handler: js.Function2[/* reference */ js.Any, /* eventArgs */ EventArgs, Unit]): Unit = js.native
  def set_body(value: String): Unit = js.native
  def set_executor(value: WebRequestExecutor): Unit = js.native
  def set_httpVerb(value: String): Unit = js.native
  def set_timeout(value: Double): Unit = js.native
  def set_url(value: String): Unit = js.native
  def set_userContext(value: js.Any): Unit = js.native
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
  @scala.inline
  implicit class WebRequestOps[Self <: WebRequest] (val x: Self) extends AnyVal {
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
    def setAdd_completed(value: js.Function2[/* reference */ js.Any, /* eventArgs */ EventArgs, Unit] => Unit): Self = this.set("add_completed", js.Any.fromFunction1(value))
    @scala.inline
    def setCompleted(value: EventArgs => Unit): Self = this.set("completed", js.Any.fromFunction1(value))
    @scala.inline
    def setGetResolvedUrl(value: () => String): Self = this.set("getResolvedUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_body(value: () => String): Self = this.set("get_body", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_executor(value: () => WebRequestExecutor): Self = this.set("get_executor", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_headers(value: () => StringDictionary[String]): Self = this.set("get_headers", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_httpVerb(value: () => String): Self = this.set("get_httpVerb", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_timeout(value: () => Double): Self = this.set("get_timeout", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_url(value: () => String): Self = this.set("get_url", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_userContext(value: () => js.Any): Self = this.set("get_userContext", js.Any.fromFunction0(value))
    @scala.inline
    def setInvoke(value: () => Unit): Self = this.set("invoke", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove_completed(value: js.Function2[/* reference */ js.Any, /* eventArgs */ EventArgs, Unit] => Unit): Self = this.set("remove_completed", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_body(value: String => Unit): Self = this.set("set_body", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_executor(value: WebRequestExecutor => Unit): Self = this.set("set_executor", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_httpVerb(value: String => Unit): Self = this.set("set_httpVerb", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_timeout(value: Double => Unit): Self = this.set("set_timeout", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_url(value: String => Unit): Self = this.set("set_url", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_userContext(value: js.Any => Unit): Self = this.set("set_userContext", js.Any.fromFunction1(value))
  }
  
}

