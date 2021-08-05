package typings.meteor.Meteor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Global props **/
/** Settings **/
trait Settings
  extends StObject
     with /* id */ StringDictionary[js.Any] {
  
  var public: StringDictionary[js.Any]
}
object Settings {
  
  inline def apply(public: StringDictionary[js.Any]): Settings = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  extension [Self <: Settings](x: Self) {
    
    inline def setPublic(value: StringDictionary[js.Any]): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
  }
}
