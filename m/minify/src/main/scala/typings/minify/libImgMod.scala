package typings.minify

import typings.minify.anon.PickOptionsimg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libImgMod {
  
  @JSImport("minify/lib/img", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(name: String, data: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def default(name: String, data: String, userOptions: PickOptionsimg): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
