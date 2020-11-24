package typings.oracleOraclejet.ojlabelvalueMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.inherit
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojlabelvalue.ojLabelValueSettableProperties> */
@js.native
trait ojLabelValueSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var labelEdge: js.UndefOr[start | top | inherit] = js.native
  
  var labelWidth: js.UndefOr[String] = js.native
}
object ojLabelValueSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojLabelValueSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojLabelValueSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojLabelValueSettablePropertiesLenientOps[Self <: ojLabelValueSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
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
    def setLabelEdge(value: start | top | inherit): Self = this.set("labelEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelEdge: Self = this.set("labelEdge", js.undefined)
    
    @scala.inline
    def setLabelWidth(value: String): Self = this.set("labelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelWidth: Self = this.set("labelWidth", js.undefined)
  }
}
