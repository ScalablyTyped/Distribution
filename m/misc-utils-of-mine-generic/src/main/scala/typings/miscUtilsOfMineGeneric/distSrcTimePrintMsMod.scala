package typings.miscUtilsOfMineGeneric

import typings.miscUtilsOfMineGeneric.anon.Minutes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTimePrintMsMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/time/printMs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def printMs(ms: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printMs")(ms.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def printMs(ms: Double, config: Minutes): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printMs")(ms.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
}
