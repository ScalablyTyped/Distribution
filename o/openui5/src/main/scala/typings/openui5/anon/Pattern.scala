package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pattern extends StObject {
  
  /**
    * A data pattern in LDML format; additionally, `"timestamp"` is supported, which means that the source
    * values are timestamps in milliseconds based on the UNIX epoch.
    */
  var pattern: js.UndefOr[String] = js.undefined
}
object Pattern {
  
  inline def apply(): Pattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pattern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pattern] (val x: Self) extends AnyVal {
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
  }
}
