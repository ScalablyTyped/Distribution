package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxSizing extends StObject {
  
  var boxSizing: String = js.native
  
  var padding: Double = js.native
}
object BoxSizing {
  
  @scala.inline
  def apply(boxSizing: String, padding: Double): BoxSizing = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxSizing]
  }
  
  @scala.inline
  implicit class BoxSizingMutableBuilder[Self <: BoxSizing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoxSizing(value: String): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
  }
}
