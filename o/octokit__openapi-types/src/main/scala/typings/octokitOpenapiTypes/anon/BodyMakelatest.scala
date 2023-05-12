package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyMakelatest extends StObject {
  
  var body: js.UndefOr[FromString] = js.undefined
  
  var make_latest: js.UndefOr[ToBoolean] = js.undefined
  
  var name: js.UndefOr[FromString] = js.undefined
}
object BodyMakelatest {
  
  inline def apply(): BodyMakelatest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyMakelatest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodyMakelatest] (val x: Self) extends AnyVal {
    
    inline def setBody(value: FromString): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setMake_latest(value: ToBoolean): Self = StObject.set(x, "make_latest", value.asInstanceOf[js.Any])
    
    inline def setMake_latestUndefined: Self = StObject.set(x, "make_latest", js.undefined)
    
    inline def setName(value: FromString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
