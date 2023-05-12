package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkedContentStack extends StObject {
  
  var markedContentStack: js.UndefOr[Null] = js.undefined
  
  var optionalContentConfig: Any
}
object MarkedContentStack {
  
  inline def apply(optionalContentConfig: Any): MarkedContentStack = {
    val __obj = js.Dynamic.literal(optionalContentConfig = optionalContentConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkedContentStack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkedContentStack] (val x: Self) extends AnyVal {
    
    inline def setOptionalContentConfig(value: Any): Self = StObject.set(x, "optionalContentConfig", value.asInstanceOf[js.Any])
  }
}
