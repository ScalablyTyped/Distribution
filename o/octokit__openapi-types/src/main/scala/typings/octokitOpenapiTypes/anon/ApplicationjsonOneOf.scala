package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.mod.OneOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonOneOf extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: OneOf[js.Tuple2[Note, Contentid]]
}
object ApplicationjsonOneOf {
  
  inline def apply(applicationSlashjson: OneOf[js.Tuple2[Note, Contentid]]): ApplicationjsonOneOf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonOneOf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonOneOf] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: OneOf[js.Tuple2[Note, Contentid]]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
