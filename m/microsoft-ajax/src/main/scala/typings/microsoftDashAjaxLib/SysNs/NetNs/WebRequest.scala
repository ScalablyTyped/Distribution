package typings
package microsoftDashAjaxLib.SysNs.NetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
        * Provides the script API to make a Web request.
        * @see {@link http://msdn.microsoft.com/en-us/library/bb310979(v=vs.100).aspx}
        */
@JSGlobal("Sys.Net.WebRequest")
@js.native
class WebRequest () extends js.Object {
  /**
              * Registers a handler for the completed request event of the Web request.
              * @see {@link http://msdn.microsoft.com/en-us/library/bb310841(v=vs.100).aspx}
              */
  def add_completed(
    handler: js.Function2[
      /* reference */ js.Any, 
      /* eventArgs */ microsoftDashAjaxLib.SysNs.EventArgs, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
              * Raises the completed event for the associated Sys.Net.WebRequest instance.
              * @param eventArgs
              *           The value to pass to the Web request completed event handler.
              */
  def completed(eventArgs: microsoftDashAjaxLib.SysNs.EventArgs): scala.Unit = js.native
  /**
              * Gets the resolved URL of the Sys.Net.WebRequest instance.
              * @returns The resolved URL that the Web request is directed to.
              */
  def getResolvedUrl(): java.lang.String = js.native
  def get_body(): java.lang.String = js.native
  def get_executor(): WebRequestExecutor = js.native
  def get_headers(): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def get_httpVerb(): java.lang.String = js.native
  def get_timeout(): scala.Double = js.native
  //#endregion
  //#region Members
  def get_url(): java.lang.String = js.native
  def get_userContext(): js.Any = js.native
  /**
              * Executes a Web request.
              */
  def invoke(): scala.Unit = js.native
  /**
              * Removes the event handler added by the add_completed method.
              * @see {@link http://msdn.microsoft.com/en-us/library/bb397454(v=vs.100).aspx}
              */
  def remove_completed(
    handler: js.Function2[
      /* reference */ js.Any, 
      /* eventArgs */ microsoftDashAjaxLib.SysNs.EventArgs, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def set_body(value: java.lang.String): scala.Unit = js.native
  def set_executor(value: WebRequestExecutor): scala.Unit = js.native
  def set_httpVerb(value: java.lang.String): scala.Unit = js.native
  def set_timeout(value: scala.Double): scala.Unit = js.native
  def set_url(value: java.lang.String): scala.Unit = js.native
  def set_userContext(value: js.Any): scala.Unit = js.native
}

