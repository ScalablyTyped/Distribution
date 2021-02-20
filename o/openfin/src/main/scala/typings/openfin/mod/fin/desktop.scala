package typings.openfin.mod.fin

import org.scalablytyped.runtime.Shortcut
import typings.openfin.anon.HttpResponseCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object desktop extends Shortcut {
  
  @JSImport("openfin", "fin.desktop")
  @js.native
  val ^ : OpenFinDesktop = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("openfin", "fin.desktop.Application")
  @js.native
  class Application protected () extends OpenFinApplication {
    /**
      * Creates a new Application.
      * An object representing an application. Allows the developer to create, execute, show/close an application as well as listen to application events.
      */
    def this(options: ApplicationOption) = this()
    def this(options: ApplicationOption, callback: js.Function1[/* successObj */ HttpResponseCode, Unit]) = this()
    def this(
      options: ApplicationOption,
      callback: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit]
    ) = this()
    def this(
      options: ApplicationOption,
      callback: js.Function1[/* successObj */ HttpResponseCode, Unit],
      errorCallback: js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit]
    ) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("openfin", "fin.desktop.Notification")
  @js.native
  class Notification protected () extends OpenFinNotification {
    /**
      * ctor
      */
    def this(options: NotificationOptions) = this()
    def this(options: NotificationOptions, callback: js.Function0[Unit]) = this()
    def this(
      options: NotificationOptions,
      callback: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit]
    ) = this()
    def this(
      options: NotificationOptions,
      callback: js.Function0[Unit],
      errorCallback: js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit]
    ) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("openfin", "fin.desktop.Window")
  @js.native
  class Window protected () extends OpenFinWindow {
    /**
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
    def this(options: WindowOption) = this()
    def this(options: WindowOption, callback: js.Function1[/* successObj */ HttpResponseCode, Unit]) = this()
    def this(
      options: WindowOption,
      callback: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit]
    ) = this()
    def this(
      options: WindowOption,
      callback: js.Function1[/* successObj */ HttpResponseCode, Unit],
      errorCallback: js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit]
    ) = this()
  }
  
  type _To = OpenFinDesktop
  
  /* This means you don't have to write `^`, but can instead just say `desktop.foo` */
  override def _to: OpenFinDesktop = ^
}
