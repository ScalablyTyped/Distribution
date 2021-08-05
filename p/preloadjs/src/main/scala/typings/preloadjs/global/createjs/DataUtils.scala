package typings.preloadjs.global.createjs

import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataUtils {
  
  @JSGlobal("createjs.DataUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseJSON(value: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def parseXML(text: String, `type`: String): XMLDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("parseXML")(text.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[XMLDocument]
}
