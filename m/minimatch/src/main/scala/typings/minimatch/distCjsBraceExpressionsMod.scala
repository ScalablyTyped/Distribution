package typings.minimatch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsBraceExpressionsMod {
  
  @JSImport("minimatch/dist/cjs/brace-expressions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseClass(glob: String, position: Double): ParseClassResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parseClass")(glob.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[ParseClassResult]
  
  type ParseClassResult = js.Tuple4[/* src */ String, /* uFlag */ Boolean, /* consumed */ Double, /* hasMagic */ Boolean]
}
