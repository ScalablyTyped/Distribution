package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Parse.Config")
@js.native
open class Config () extends StObject {
  
  def escape(attr: String): Any = js.native
  
  def get(attr: String): Any = js.native
}
object Config {
  
  @JSGlobal("Parse.Config")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def current(): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("current")().asInstanceOf[Config]
  
  /* static member */
  inline def get(): js.Promise[Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[Config]]
  inline def get(options: UseMasterKeyOption): js.Promise[Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Config]]
  
  /* static member */
  inline def save(attr: Any): js.Promise[Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("save")(attr.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Config]]
  inline def save(attr: Any, options: StringDictionary[Boolean]): js.Promise[Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(attr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config]]
}
