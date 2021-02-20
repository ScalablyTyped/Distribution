package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollX
  extends /* key */ StringDictionary[js.Any] {
  
  var scrollX: Double = js.native
  
  var scrollY: Double = js.native
}
object ScrollX {
  
  @scala.inline
  def apply(scrollX: Double, scrollY: Double): ScrollX = {
    val __obj = js.Dynamic.literal(scrollX = scrollX.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollX]
  }
  
  @scala.inline
  implicit class ScrollXMutableBuilder[Self <: ScrollX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollX(value: Double): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollY(value: Double): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
  }
}
