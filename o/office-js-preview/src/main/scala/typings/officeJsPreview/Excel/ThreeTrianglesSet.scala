package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreeTrianglesSet extends /* index */ NumberDictionary[Icon] {
  
  var greenUpTriangle: Icon = js.native
  
  var redDownTriangle: Icon = js.native
  
  var yellowDash: Icon = js.native
}
object ThreeTrianglesSet {
  
  @scala.inline
  def apply(greenUpTriangle: Icon, redDownTriangle: Icon, yellowDash: Icon): ThreeTrianglesSet = {
    val __obj = js.Dynamic.literal(greenUpTriangle = greenUpTriangle.asInstanceOf[js.Any], redDownTriangle = redDownTriangle.asInstanceOf[js.Any], yellowDash = yellowDash.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeTrianglesSet]
  }
  
  @scala.inline
  implicit class ThreeTrianglesSetMutableBuilder[Self <: ThreeTrianglesSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGreenUpTriangle(value: Icon): Self = StObject.set(x, "greenUpTriangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedDownTriangle(value: Icon): Self = StObject.set(x, "redDownTriangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellowDash(value: Icon): Self = StObject.set(x, "yellowDash", value.asInstanceOf[js.Any])
  }
}
