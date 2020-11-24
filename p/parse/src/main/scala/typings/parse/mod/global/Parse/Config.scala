package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Parse.Config")
@js.native
class Config () extends js.Object {
  
  def escape(attr: String): js.Any = js.native
  
  def get(attr: String): js.Any = js.native
}
/* static members */
@JSGlobal("Parse.Config")
@js.native
object Config extends js.Object {
  
  def current(): Config = js.native
  
  def get(): js.Promise[Config] = js.native
  def get(options: UseMasterKeyOption): js.Promise[Config] = js.native
  
  def save(attr: js.Any): js.Promise[Config] = js.native
  def save(attr: js.Any, options: StringDictionary[Boolean]): js.Promise[Config] = js.native
}
