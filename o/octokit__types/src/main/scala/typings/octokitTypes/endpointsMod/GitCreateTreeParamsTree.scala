package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`040000`
import typings.octokitTypes.octokitTypesStrings.`100644`
import typings.octokitTypes.octokitTypesStrings.`100755`
import typings.octokitTypes.octokitTypesStrings.`120000`
import typings.octokitTypes.octokitTypesStrings.`160000`
import typings.octokitTypes.octokitTypesStrings.blob
import typings.octokitTypes.octokitTypesStrings.commit
import typings.octokitTypes.octokitTypesStrings.tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitCreateTreeParamsTree extends js.Object {
  
  var content: js.UndefOr[String] = js.native
  
  var mode: js.UndefOr[`100644` | `100755` | `040000` | `160000` | `120000`] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var sha: js.UndefOr[String | Null] = js.native
  
  var `type`: js.UndefOr[blob | tree | commit] = js.native
}
object GitCreateTreeParamsTree {
  
  @scala.inline
  def apply(): GitCreateTreeParamsTree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitCreateTreeParamsTree]
  }
  
  @scala.inline
  implicit class GitCreateTreeParamsTreeOps[Self <: GitCreateTreeParamsTree] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setMode(value: `100644` | `100755` | `040000` | `160000` | `120000`): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha: Self = this.set("sha", js.undefined)
    
    @scala.inline
    def setShaNull: Self = this.set("sha", null)
    
    @scala.inline
    def setType(value: blob | tree | commit): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
