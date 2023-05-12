package typings.oojsUi.anon

import typings.oojsUi.OO.ui._ToolExtractionCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group
  extends StObject
     with _ToolExtractionCollection {
  
  var group: String
}
object Group {
  
  inline def apply(group: String): Group = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
