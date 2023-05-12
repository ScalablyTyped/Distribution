package typings.miscUtilsOfMineGeneric

import typings.miscUtilsOfMineGeneric.anon.Pos
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStringChangeMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/string/change", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def changeText(text: String, toInsert: js.Array[Pos]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("changeText")(text.asInstanceOf[js.Any], toInsert.asInstanceOf[js.Any])).asInstanceOf[String]
}
