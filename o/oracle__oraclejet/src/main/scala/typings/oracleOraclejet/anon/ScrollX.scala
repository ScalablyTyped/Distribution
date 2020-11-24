package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
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
  implicit class ScrollXOps[Self <: ScrollX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setScrollX(value: Double): Self = this.set("scrollX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollY(value: Double): Self = this.set("scrollY", value.asInstanceOf[js.Any])
  }
}
