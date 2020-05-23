package typings.openfin.mod.fin

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.openfin.anon.HttpResponseCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFinWindowStatic
  extends /**
  * Class: Window
  *
  * new Window(options, callbackopt, errorCallbackopt)
  *
  * Creates a new OpenFin Window
  *
  * A basic window that wraps a native HTML window. Provides more fine-grained control over the window state such as the ability to minimize,
  * maximize, restore, etc. By default a window does not show upon instantiation; instead the window's show() method must be invoked manually.
  * The new window appears in the same process as the parent window.
  * @param options - The options of the window
  * @param [callback] - Called if the window creation was successful
  * @param [callback.successObj] - httpResponseCode
  */
Instantiable1[/* options */ WindowOption, OpenFinWindow]
     with Instantiable2[
      /* options */ WindowOption, 
      /* callback */ js.Function1[/* successObj */ HttpResponseCode, Unit], 
      OpenFinWindow
    ]
     with Instantiable3[
      /* options */ WindowOption, 
      /* callback */ js.Function1[/* successObj */ HttpResponseCode, Unit], 
      /* errorCallback */ js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit], 
      OpenFinWindow
    ] {
  /**
    * Returns an instance of the current window.
    * @returns Current window
    */
  def getCurrent(): OpenFinWindow = js.native
  /**
    * Returns a Window object that wraps an existing window.
    */
  def wrap(appUuid: String, windowName: String): OpenFinWindow = js.native
}

