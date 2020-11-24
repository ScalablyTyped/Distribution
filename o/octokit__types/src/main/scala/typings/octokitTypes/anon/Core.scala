package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Core extends js.Object {
  
  var core: Limit = js.native
  
  var graphql: Limit = js.native
  
  var integration_manifest: Limit = js.native
  
  var search: Limit = js.native
}
object Core {
  
  @scala.inline
  def apply(core: Limit, graphql: Limit, integration_manifest: Limit, search: Limit): Core = {
    val __obj = js.Dynamic.literal(core = core.asInstanceOf[js.Any], graphql = graphql.asInstanceOf[js.Any], integration_manifest = integration_manifest.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Core]
  }
  
  @scala.inline
  implicit class CoreOps[Self <: Core] (val x: Self) extends AnyVal {
    
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
    def setCore(value: Limit): Self = this.set("core", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphql(value: Limit): Self = this.set("graphql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegration_manifest(value: Limit): Self = this.set("integration_manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: Limit): Self = this.set("search", value.asInstanceOf[js.Any])
  }
}
