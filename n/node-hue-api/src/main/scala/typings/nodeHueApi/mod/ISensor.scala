package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeHueApi.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISensor extends js.Object {
  
  var config: StringDictionary[Double | String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var manufacturername: String = js.native
  
  var modelid: String = js.native
  
  var name: String = js.native
  
  var state: Dictkey = js.native
  
  var swversion: String = js.native
  
  var `type`: String = js.native
  
  var uniqueid: js.UndefOr[String] = js.native
}
object ISensor {
  
  @scala.inline
  def apply(
    config: StringDictionary[Double | String],
    manufacturername: String,
    modelid: String,
    name: String,
    state: Dictkey,
    swversion: String,
    `type`: String
  ): ISensor = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], manufacturername = manufacturername.asInstanceOf[js.Any], modelid = modelid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], swversion = swversion.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISensor]
  }
  
  @scala.inline
  implicit class ISensorOps[Self <: ISensor] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: StringDictionary[Double | String]): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturername(value: String): Self = this.set("manufacturername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelid(value: String): Self = this.set("modelid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Dictkey): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwversion(value: String): Self = this.set("swversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setUniqueid(value: String): Self = this.set("uniqueid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueid: Self = this.set("uniqueid", js.undefined)
  }
}
