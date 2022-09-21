package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stripUnitMod {
  
  @JSImport("polished/lib/helpers/stripUnit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  inline def default(value: Double): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[String | Double]
}
