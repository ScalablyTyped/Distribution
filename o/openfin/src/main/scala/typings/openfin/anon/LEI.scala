package typings.openfin.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LEI extends /* key */ StringDictionary[String] {
  
  var LEI: js.UndefOr[String] = js.native
  
  var PERMID: js.UndefOr[String] = js.native
}
object LEI {
  
  @scala.inline
  def apply(): LEI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LEI]
  }
  
  @scala.inline
  implicit class LEIOps[Self <: LEI] (val x: Self) extends AnyVal {
    
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
    def setLEI(value: String): Self = this.set("LEI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLEI: Self = this.set("LEI", js.undefined)
    
    @scala.inline
    def setPERMID(value: String): Self = this.set("PERMID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePERMID: Self = this.set("PERMID", js.undefined)
  }
}
