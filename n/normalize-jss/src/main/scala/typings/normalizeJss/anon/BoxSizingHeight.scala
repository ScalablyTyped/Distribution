package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxSizingHeight extends StObject {
  
  var boxSizing: String = js.native
  
  var height: Double = js.native
  
  var overflow: String = js.native
}
object BoxSizingHeight {
  
  @scala.inline
  def apply(boxSizing: String, height: Double, overflow: String): BoxSizingHeight = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxSizingHeight]
  }
  
  @scala.inline
  implicit class BoxSizingHeightMutableBuilder[Self <: BoxSizingHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoxSizing(value: String): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
  }
}
