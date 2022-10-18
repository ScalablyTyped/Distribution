package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibDetectTypoMod {
  
  @JSImport("next/dist/lib/detect-typo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectTypo(input: String, options: js.Array[String]): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("detectTypo")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def detectTypo(input: String, options: js.Array[String], threshold: Double): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("detectTypo")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
