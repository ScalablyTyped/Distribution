package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewDimensions
  extends /* key */ StringDictionary[js.Any] {
  
  var header: String | Double = js.native
  
  var newDimensions: HeightWidth = js.native
  
  var oldDimensions: HeightWidth = js.native
}
object NewDimensions {
  
  @scala.inline
  def apply(header: String | Double, newDimensions: HeightWidth, oldDimensions: HeightWidth): NewDimensions = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], newDimensions = newDimensions.asInstanceOf[js.Any], oldDimensions = oldDimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewDimensions]
  }
  
  @scala.inline
  implicit class NewDimensionsMutableBuilder[Self <: NewDimensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: String | Double): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewDimensions(value: HeightWidth): Self = StObject.set(x, "newDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldDimensions(value: HeightWidth): Self = StObject.set(x, "oldDimensions", value.asInstanceOf[js.Any])
  }
}
