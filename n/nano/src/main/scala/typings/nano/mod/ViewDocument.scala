package typings.nano.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewDocument[D]
  extends StObject
     with IdentifiedDocument {
  
  var views: StringDictionary[View[D]]
}
object ViewDocument {
  
  inline def apply[D](_id: String, views: StringDictionary[View[D]]): ViewDocument[D] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewDocument[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewDocument[?], D] (val x: Self & ViewDocument[D]) extends AnyVal {
    
    inline def setViews(value: StringDictionary[View[D]]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
  }
}
