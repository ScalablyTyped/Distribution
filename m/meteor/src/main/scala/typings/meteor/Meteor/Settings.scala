package typings.meteor.Meteor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Global props **/
/** Settings **/
@js.native
trait Settings
  extends /* id */ StringDictionary[js.Any] {
  
  var public: StringDictionary[js.Any] = js.native
}
object Settings {
  
  @scala.inline
  def apply(public: StringDictionary[js.Any]): Settings = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublic(value: StringDictionary[js.Any]): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
  }
}
