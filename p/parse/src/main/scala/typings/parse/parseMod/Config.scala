package typings.parse.parseMod

import org.scalablytyped.runtime.StringDictionary
import typings.parse.parseMod._Global_.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse", "Config")
@js.native
class Config ()
  extends typings.parse.parseMod._Global_.Parse.Config

/* static members */
@JSImport("parse", "Config")
@js.native
object Config extends js.Object {
  def current(): typings.parse.parseMod._Global_.Parse.Config = js.native
  def get(): js.Promise[typings.parse.parseMod._Global_.Parse.Config] = js.native
  def get(options: UseMasterKeyOption): js.Promise[typings.parse.parseMod._Global_.Parse.Config] = js.native
  def save(attr: js.Any): js.Promise[typings.parse.parseMod._Global_.Parse.Config] = js.native
  def save(attr: js.Any, options: StringDictionary[Boolean]): js.Promise[typings.parse.parseMod._Global_.Parse.Config] = js.native
}

