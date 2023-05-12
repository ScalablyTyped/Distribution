package typings.postcssLogical

import typings.postcss.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsParseValueCoupleMod {
  
  @JSImport("postcss-logical/dist/utils/parse-value-couple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseValueCouple(declaration: Declaration): js.Tuple2[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseValueCouple")(declaration.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, String]]
}
