package typings.meteor.meteorMod.Meteor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Global props **/
/** Settings **/
trait Settings_
  extends StObject
     with /* id */ StringDictionary[Any] {
  
  var public: StringDictionary[Any]
}
object Settings_ {
  
  inline def apply(public: StringDictionary[Any]): Settings_ = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Settings_] (val x: Self) extends AnyVal {
    
    inline def setPublic(value: StringDictionary[Any]): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
  }
}
