package typings.netlifyIdentityWidget.mod

import typings.netlifyIdentityWidget.netlifyIdentityWidgetStrings.login
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("netlify-identity-widget", "on")
@js.native
object on_login extends js.Object {
  def apply(event: login, cb: js.Function1[/* user */ User, Unit]): Unit = js.native
}

