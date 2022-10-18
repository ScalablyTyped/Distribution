package typings.mongodbConnectionStringUrl

import typings.mongodbConnectionStringUrl.anon.Append
import typings.mongodbConnectionStringUrl.libRedactMod.ConnectionStringRedactionOptions
import typings.std.Map
import typings.whatwgUrl.mod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("mongodb-connection-string-url/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mongodb-connection-string-url/lib", JSImport.Default)
  @js.native
  open class default protected () extends ConnectionString {
    def this(uri: String) = this()
    def this(uri: String, options: ConnectionStringParsingOptions) = this()
  }
  
  @JSImport("mongodb-connection-string-url/lib", "CommaAndColonSeparatedRecord")
  @js.native
  open class CommaAndColonSeparatedRecord[K /* <: js.Object */] ()
    extends StObject
       with CaseInsensitiveMap[/* keyof K */ String] {
    def this(from: String) = this()
  }
  
  @JSImport("mongodb-connection-string-url/lib", "ConnectionString")
  @js.native
  open class ConnectionString protected () extends URLWithoutHost {
    def this(uri: String) = this()
    def this(uri: String, options: ConnectionStringParsingOptions) = this()
    
    var _hosts: js.Array[String] = js.native
    
    def hosts: js.Array[String] = js.native
    def hosts_=(list: js.Array[String]): Unit = js.native
    
    def isSRV: Boolean = js.native
    
    def redact(): ConnectionString = js.native
    def redact(options: ConnectionStringRedactionOptions): ConnectionString = js.native
    
    def typedSearchParams[T /* <: js.Object */](): Append[T] = js.native
  }
  
  inline def redactConnectionString(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("redactConnectionString")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def redactConnectionString(uri: String, options: ConnectionStringRedactionOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("redactConnectionString")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @js.native
  trait CaseInsensitiveMap[K /* <: String */]
    extends StObject
       with Map[K, String] {
    
    def _normalizeKey(name: Any): K = js.native
    
    def set(name: K, value: Any): this.type = js.native
  }
  
  trait ConnectionStringParsingOptions extends StObject {
    
    var looseValidation: js.UndefOr[Boolean] = js.undefined
  }
  object ConnectionStringParsingOptions {
    
    inline def apply(): ConnectionStringParsingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionStringParsingOptions]
    }
    
    extension [Self <: ConnectionStringParsingOptions](x: Self) {
      
      inline def setLooseValidation(value: Boolean): Self = StObject.set(x, "looseValidation", value.asInstanceOf[js.Any])
      
      inline def setLooseValidationUndefined: Self = StObject.set(x, "looseValidation", js.undefined)
    }
  }
  
  @js.native
  trait URLWithoutHost extends URL {
    
    def host_=(value: scala.Nothing): Unit = js.native
    
    def hostname_=(value: scala.Nothing): Unit = js.native
    
    def port_=(value: scala.Nothing): Unit = js.native
  }
}
