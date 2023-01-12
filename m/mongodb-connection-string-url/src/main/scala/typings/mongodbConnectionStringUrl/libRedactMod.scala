package typings.mongodbConnectionStringUrl

import typings.mongodbConnectionStringUrl.anon.Readonlydefault
import typings.mongodbConnectionStringUrl.libMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRedactMod {
  
  @JSImport("mongodb-connection-string-url/lib/redact", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def redactConnectionString(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("redactConnectionString")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def redactConnectionString(uri: String, options: ConnectionStringRedactionOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("redactConnectionString")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def redactValidConnectionString(inputUrl: Readonlydefault): default = ^.asInstanceOf[js.Dynamic].applyDynamic("redactValidConnectionString")(inputUrl.asInstanceOf[js.Any]).asInstanceOf[default]
  inline def redactValidConnectionString(inputUrl: Readonlydefault, options: ConnectionStringRedactionOptions): default = (^.asInstanceOf[js.Dynamic].applyDynamic("redactValidConnectionString")(inputUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[default]
  
  trait ConnectionStringRedactionOptions extends StObject {
    
    var redactUsernames: js.UndefOr[Boolean] = js.undefined
    
    var replacementString: js.UndefOr[String] = js.undefined
  }
  object ConnectionStringRedactionOptions {
    
    inline def apply(): ConnectionStringRedactionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionStringRedactionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionStringRedactionOptions] (val x: Self) extends AnyVal {
      
      inline def setRedactUsernames(value: Boolean): Self = StObject.set(x, "redactUsernames", value.asInstanceOf[js.Any])
      
      inline def setRedactUsernamesUndefined: Self = StObject.set(x, "redactUsernames", js.undefined)
      
      inline def setReplacementString(value: String): Self = StObject.set(x, "replacementString", value.asInstanceOf[js.Any])
      
      inline def setReplacementStringUndefined: Self = StObject.set(x, "replacementString", js.undefined)
    }
  }
}
