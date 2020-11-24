package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetForRepo extends js.Object {
  
  var get: `757` = js.native
  
  var getAllCommonlyUsed: `758` = js.native
  
  var getForRepo: `759` = js.native
}
object GetForRepo {
  
  @scala.inline
  def apply(get: `757`, getAllCommonlyUsed: `758`, getForRepo: `759`): GetForRepo = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], getAllCommonlyUsed = getAllCommonlyUsed.asInstanceOf[js.Any], getForRepo = getForRepo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetForRepo]
  }
  
  @scala.inline
  implicit class GetForRepoOps[Self <: GetForRepo] (val x: Self) extends AnyVal {
    
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
    def setGet(value: `757`): Self = this.set("get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAllCommonlyUsed(value: `758`): Self = this.set("getAllCommonlyUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetForRepo(value: `759`): Self = this.set("getForRepo", value.asInstanceOf[js.Any])
  }
}
