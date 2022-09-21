package typings.parse.mod

import org.scalablytyped.runtime.StringDictionary
import typings.parse.mod.global.Parse.UseMasterKeyOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parse", "Config")
@js.native
open class Config ()
  extends typings.parse.mod.global.Parse.Config
object Config {
  
  @JSImport("parse", "Config")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def current(): typings.parse.mod.global.Parse.Config = ^.asInstanceOf[js.Dynamic].applyDynamic("current")().asInstanceOf[typings.parse.mod.global.Parse.Config]
  
  /* static member */
  inline def get(): js.Promise[typings.parse.mod.global.Parse.Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[typings.parse.mod.global.Parse.Config]]
  inline def get(options: UseMasterKeyOption): js.Promise[typings.parse.mod.global.Parse.Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.parse.mod.global.Parse.Config]]
  
  /* static member */
  inline def save(attr: Any): js.Promise[typings.parse.mod.global.Parse.Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("save")(attr.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.parse.mod.global.Parse.Config]]
  inline def save(attr: Any, options: StringDictionary[Boolean]): js.Promise[typings.parse.mod.global.Parse.Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(attr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parse.mod.global.Parse.Config]]
}
