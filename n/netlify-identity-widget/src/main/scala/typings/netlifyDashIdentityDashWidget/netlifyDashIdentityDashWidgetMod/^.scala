package typings.netlifyDashIdentityDashWidget.netlifyDashIdentityDashWidgetMod

import typings.netlifyDashIdentityDashWidget.netlifyDashIdentityDashWidgetStrings.close
import typings.netlifyDashIdentityDashWidget.netlifyDashIdentityDashWidgetStrings.error
import typings.netlifyDashIdentityDashWidget.netlifyDashIdentityDashWidgetStrings.init
import typings.netlifyDashIdentityDashWidget.netlifyDashIdentityDashWidgetStrings.login
import typings.netlifyDashIdentityDashWidget.netlifyDashIdentityDashWidgetStrings.logout
import typings.netlifyDashIdentityDashWidget.netlifyDashIdentityDashWidgetStrings.open
import typings.netlifyDashIdentityDashWidget.netlifyDashIdentityDashWidgetStrings.signup
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("netlify-identity-widget", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def close(): Unit = js.native
  def currentUser(): User | Null = js.native
  def init(): Unit = js.native
  def init(opts: InitOptions): Unit = js.native
  def logout(): js.UndefOr[js.Promise[Unit]] = js.native
  @JSName("on")
  def on_close(event: close, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSName("on")
  def on_init(event: init, cb: js.Function1[/* user */ User | Null, Unit]): Unit = js.native
  @JSName("on")
  def on_login(event: login, cb: js.Function1[/* user */ User, Unit]): Unit = js.native
  @JSName("on")
  def on_logout(event: logout, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_open(event: open, cb: js.Function0[Unit]): Unit = js.native
  def open(): Unit = js.native
  @JSName("open")
  def open_login(tabName: login): Unit = js.native
  @JSName("open")
  def open_signup(tabName: signup): Unit = js.native
}

