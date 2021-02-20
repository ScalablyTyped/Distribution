package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Parse.Config")
@js.native
class Config () extends StObject {
  
  def escape(attr: String): js.Any = js.native
  
  def get(attr: String): js.Any = js.native
}
object Config {
  
  /* static member */
  @JSGlobal("Parse.Config.current")
  @js.native
  def current(): Config = js.native
  
  /* static member */
  @JSGlobal("Parse.Config.get")
  @js.native
  def get(): js.Promise[Config] = js.native
  @JSGlobal("Parse.Config.get")
  @js.native
  def get(options: UseMasterKeyOption): js.Promise[Config] = js.native
  
  /* static member */
  @JSGlobal("Parse.Config.save")
  @js.native
  def save(attr: js.Any): js.Promise[Config] = js.native
  @JSGlobal("Parse.Config.save")
  @js.native
  def save(attr: js.Any, options: StringDictionary[Boolean]): js.Promise[Config] = js.native
}
