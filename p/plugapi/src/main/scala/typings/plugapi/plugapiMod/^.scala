package typings.plugapi.plugapiMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plugapi", JSImport.Namespace)
@js.native
class ^ protected () extends PlugAPI {
  def this(login: PlugLogin) = this()
  def this(
    login: PlugLogin,
    callback: js.Function2[/* error */ Error, /* bot */ PlugAPI, Unit | (js.Function1[/* bot */ PlugAPI, Unit])]
  ) = this()
}

