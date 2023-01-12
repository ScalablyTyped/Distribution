package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaIndeterminateProgressText extends StObject {
  
  var ariaIndeterminateProgressText: js.UndefOr[String] = js.undefined
}
object AriaIndeterminateProgressText {
  
  inline def apply(): AriaIndeterminateProgressText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaIndeterminateProgressText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaIndeterminateProgressText] (val x: Self) extends AnyVal {
    
    inline def setAriaIndeterminateProgressText(value: String): Self = StObject.set(x, "ariaIndeterminateProgressText", value.asInstanceOf[js.Any])
    
    inline def setAriaIndeterminateProgressTextUndefined: Self = StObject.set(x, "ariaIndeterminateProgressText", js.undefined)
  }
}
