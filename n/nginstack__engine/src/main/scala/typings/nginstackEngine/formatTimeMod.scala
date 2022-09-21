package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatTimeMod {
  
  inline def apply(time: Double, stringFormat: String): String = (^.asInstanceOf[js.Dynamic].apply(time.asInstanceOf[js.Any], stringFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@nginstack/engine/lib/date/formatTime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
