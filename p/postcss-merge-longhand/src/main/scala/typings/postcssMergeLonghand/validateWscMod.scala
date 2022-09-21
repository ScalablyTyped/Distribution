package typings.postcssMergeLonghand

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateWscMod {
  
  @JSImport("postcss-merge-longhand/types/lib/validateWsc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isColor(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isColor")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isStyle(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyle")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidWsc(wscs: js.Tuple3[String, String, String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidWsc")(wscs.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWidth(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWidth")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
