package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppslugString extends StObject {
  
  var app_slug: String
}
object AppslugString {
  
  inline def apply(app_slug: String): AppslugString = {
    val __obj = js.Dynamic.literal(app_slug = app_slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppslugString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppslugString] (val x: Self) extends AnyVal {
    
    inline def setApp_slug(value: String): Self = StObject.set(x, "app_slug", value.asInstanceOf[js.Any])
  }
}
