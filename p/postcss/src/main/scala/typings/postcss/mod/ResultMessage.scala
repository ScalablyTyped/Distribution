package typings.postcss.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultMessage
  extends StObject
     with /* others */ StringDictionary[js.Any] {
  
  var plugin: String
  
  var `type`: String
}
object ResultMessage {
  
  @scala.inline
  def apply(plugin: String, `type`: String): ResultMessage = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultMessage]
  }
  
  @scala.inline
  implicit class ResultMessageMutableBuilder[Self <: ResultMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
