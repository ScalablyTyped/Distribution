package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.distServerWebTypesMod.CookieSerializeOptions
import typings.std.Map
import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebSpecExtensionCookiesMod {
  
  @JSImport("next/dist/server/web/spec-extension/cookies", "Cookies")
  @js.native
  open class Cookies ()
    extends StObject
       with Map[String, String] {
    def this(input: String) = this()
    
    def set(key: String, value: Any): this.type = js.native
    def set(key: String, value: Any, options: CookieSerializeOptions): this.type = js.native
  }
  
  @JSImport("next/dist/server/web/spec-extension/cookies", "NextCookies")
  @js.native
  open class NextCookies protected () extends Cookies {
    def this(response: Request) = this()
    def this(response: Response) = this()
    
    def clear(options: CookieSerializeOptions): Unit = js.native
    
    def delete(key: String, options: CookieSerializeOptions): Boolean = js.native
    
    def getWithOptions(key: String): GetWithOptionsOutput = js.native
    
    var response: Request | Response = js.native
  }
  
  trait GetWithOptionsOutput extends StObject {
    
    var options: StringDictionary[String]
    
    var value: js.UndefOr[String] = js.undefined
  }
  object GetWithOptionsOutput {
    
    inline def apply(options: StringDictionary[String]): GetWithOptionsOutput = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetWithOptionsOutput]
    }
    
    extension [Self <: GetWithOptionsOutput](x: Self) {
      
      inline def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
