package typings.playable

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/text-map/types", JSImport.Namespace)
@js.native
object textMapTypesMod extends js.Object {
  
  @js.native
  trait ITextMap extends js.Object {
    
    def destroy(): Unit = js.native
    
    def get(id: String): String = js.native
    def get(id: String, args: js.UndefOr[scala.Nothing], defaultText: String): String = js.native
    def get(id: String, args: js.UndefOr[scala.Nothing], defaultText: js.Function): String = js.native
    def get(id: String, args: js.Any): String = js.native
    def get(id: String, args: js.Any, defaultText: String): String = js.native
    def get(id: String, args: js.Any, defaultText: js.Function): String = js.native
  }
  
  type ITextMapConfig = StringDictionary[String | TextResolver]
  
  type TextResolver = js.Function1[/* args */ js.Any, String]
}
