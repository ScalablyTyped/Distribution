package typings.moment.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandaloneFormatSpec extends StObject {
  
  var format: js.Array[String]
  
  var isFormat: js.UndefOr[js.RegExp] = js.undefined
  
  var standalone: js.Array[String]
}
object StandaloneFormatSpec {
  
  inline def apply(format: js.Array[String], standalone: js.Array[String]): StandaloneFormatSpec = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandaloneFormatSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandaloneFormatSpec] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: js.Array[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatVarargs(value: String*): Self = StObject.set(x, "format", js.Array(value*))
    
    inline def setIsFormat(value: js.RegExp): Self = StObject.set(x, "isFormat", value.asInstanceOf[js.Any])
    
    inline def setIsFormatUndefined: Self = StObject.set(x, "isFormat", js.undefined)
    
    inline def setStandalone(value: js.Array[String]): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setStandaloneVarargs(value: String*): Self = StObject.set(x, "standalone", js.Array(value*))
  }
}
