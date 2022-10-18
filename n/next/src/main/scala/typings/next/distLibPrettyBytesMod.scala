package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPrettyBytesMod {
  
  @JSImport("next/dist/lib/pretty-bytes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(number: Double, options: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(number.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
