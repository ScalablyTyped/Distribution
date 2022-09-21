package typings.minify

import typings.minify.anon.PickOptionscss
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssMod {
  
  @JSImport("minify/lib/css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(data: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def default(data: String, userOptions: PickOptionscss): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
