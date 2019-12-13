package typings.parse.reactDashNativeMod

import org.scalablytyped.runtime.StringDictionary
import typings.parse.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/react-native", "Config")
@js.native
class Config ()
  extends typings.parse.nodeMod.Config

/* static members */
@JSImport("parse/react-native", "Config")
@js.native
object Config extends js.Object {
  def current(): typings.parse.Parse.Config = js.native
  def get(): js.Promise[typings.parse.Parse.Config] = js.native
  def get(options: UseMasterKeyOption): js.Promise[typings.parse.Parse.Config] = js.native
  def save(attr: js.Any): js.Promise[typings.parse.Parse.Config] = js.native
  def save(attr: js.Any, options: StringDictionary[Boolean]): js.Promise[typings.parse.Parse.Config] = js.native
}

