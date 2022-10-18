package typings.minify

import typings.minify.anon.PickOptionshtml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHtmlMod {
  
  @JSImport("minify/lib/html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(data: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def default(data: String, userOptions: PickOptionshtml): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
