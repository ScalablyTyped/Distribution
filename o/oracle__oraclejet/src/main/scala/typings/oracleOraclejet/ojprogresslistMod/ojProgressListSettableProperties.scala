package typings.oracleOraclejet.ojprogresslistMod

import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojProgressListSettableProperties extends JetSettableProperties {
  
  var data: (DataProvider[_, _]) | Null = js.native
}
object ojProgressListSettableProperties {
  
  @scala.inline
  def apply(): ojProgressListSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojProgressListSettableProperties]
  }
  
  @scala.inline
  implicit class ojProgressListSettablePropertiesOps[Self <: ojProgressListSettableProperties] (val x: Self) extends AnyVal {
    
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
    def setData(value: DataProvider[_, _]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = this.set("data", null)
  }
}
