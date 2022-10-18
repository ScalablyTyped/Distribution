package typings.playable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesTextMapTypesMod {
  
  @js.native
  trait ITextMap extends StObject {
    
    def destroy(): Unit = js.native
    
    def get(id: String): String = js.native
    def get(id: String, args: Any): String = js.native
    def get(id: String, args: Any, defaultText: String): String = js.native
    def get(id: String, args: Any, defaultText: js.Function): String = js.native
    def get(id: String, args: Unit, defaultText: String): String = js.native
    def get(id: String, args: Unit, defaultText: js.Function): String = js.native
  }
  
  type ITextMapConfig = StringDictionary[String | TextResolver]
  
  type TextResolver = js.Function1[/* args */ Any, String]
}
