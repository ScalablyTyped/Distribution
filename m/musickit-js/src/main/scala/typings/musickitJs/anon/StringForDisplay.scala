package typings.musickitJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringForDisplay extends StObject {
  
  var stringForDisplay: String
}
object StringForDisplay {
  
  inline def apply(stringForDisplay: String): StringForDisplay = {
    val __obj = js.Dynamic.literal(stringForDisplay = stringForDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringForDisplay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringForDisplay] (val x: Self) extends AnyVal {
    
    inline def setStringForDisplay(value: String): Self = StObject.set(x, "stringForDisplay", value.asInstanceOf[js.Any])
  }
}
