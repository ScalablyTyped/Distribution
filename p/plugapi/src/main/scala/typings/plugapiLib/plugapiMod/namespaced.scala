package typings
package plugapiLib.plugapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plugapi", JSImport.Namespace)
@js.native
class namespaced protected () extends PlugAPI {
  def this(login: plugapiLib.plugapiMod.PlugAPINs.PlugLogin) = this()
  def this(login: plugapiLib.plugapiMod.PlugAPINs.PlugLogin, callback: js.Function2[
      /* error */ stdLib.Error, 
      /* bot */ PlugAPI, 
      scala.Unit | (js.Function1[/* bot */ PlugAPI, scala.Unit])
    ]) = this()
}

