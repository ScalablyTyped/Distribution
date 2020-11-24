package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConductCode extends js.Object {
  
  var getAllCodesOfConduct: `673` = js.native
  
  var getConductCode: `674` = js.native
  
  var getForRepo: `675` = js.native
}
object GetConductCode {
  
  @scala.inline
  def apply(getAllCodesOfConduct: `673`, getConductCode: `674`, getForRepo: `675`): GetConductCode = {
    val __obj = js.Dynamic.literal(getAllCodesOfConduct = getAllCodesOfConduct.asInstanceOf[js.Any], getConductCode = getConductCode.asInstanceOf[js.Any], getForRepo = getForRepo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConductCode]
  }
  
  @scala.inline
  implicit class GetConductCodeOps[Self <: GetConductCode] (val x: Self) extends AnyVal {
    
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
    def setGetAllCodesOfConduct(value: `673`): Self = this.set("getAllCodesOfConduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetConductCode(value: `674`): Self = this.set("getConductCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetForRepo(value: `675`): Self = this.set("getForRepo", value.asInstanceOf[js.Any])
  }
}
