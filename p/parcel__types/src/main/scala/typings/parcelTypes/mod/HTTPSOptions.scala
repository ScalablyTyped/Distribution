package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTTPSOptions extends StObject {
  
  val cert: FilePath
  
  val key: FilePath
}
object HTTPSOptions {
  
  inline def apply(cert: FilePath, key: FilePath): HTTPSOptions = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPSOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTTPSOptions] (val x: Self) extends AnyVal {
    
    inline def setCert(value: FilePath): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setKey(value: FilePath): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
