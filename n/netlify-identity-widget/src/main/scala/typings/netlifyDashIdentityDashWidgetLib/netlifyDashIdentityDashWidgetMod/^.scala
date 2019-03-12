package typings
package netlifyDashIdentityDashWidgetLib.netlifyDashIdentityDashWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("netlify-identity-widget", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def close(): scala.Unit = js.native
  def currentUser(): User | scala.Null = js.native
  def init(): scala.Unit = js.native
  def init(opts: InitOptions): scala.Unit = js.native
  def logout(): js.UndefOr[js.Promise[scala.Unit]] = js.native
  @JSName("on")
  def on_close(
    event: netlifyDashIdentityDashWidgetLib.netlifyDashIdentityDashWidgetLibStrings.close,
    cb: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_error(
    event: netlifyDashIdentityDashWidgetLib.netlifyDashIdentityDashWidgetLibStrings.error,
    cb: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_init(
    event: netlifyDashIdentityDashWidgetLib.netlifyDashIdentityDashWidgetLibStrings.init,
    cb: js.Function1[/* user */ User | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_login(
    event: netlifyDashIdentityDashWidgetLib.netlifyDashIdentityDashWidgetLibStrings.login,
    cb: js.Function1[/* user */ User, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_logout(
    event: netlifyDashIdentityDashWidgetLib.netlifyDashIdentityDashWidgetLibStrings.logout,
    cb: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_open(
    event: netlifyDashIdentityDashWidgetLib.netlifyDashIdentityDashWidgetLibStrings.open,
    cb: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def open(): scala.Unit = js.native
  @JSName("open")
  def open_login(tabName: netlifyDashIdentityDashWidgetLib.netlifyDashIdentityDashWidgetLibStrings.login): scala.Unit = js.native
  @JSName("open")
  def open_signup(tabName: netlifyDashIdentityDashWidgetLib.netlifyDashIdentityDashWidgetLibStrings.signup): scala.Unit = js.native
}

