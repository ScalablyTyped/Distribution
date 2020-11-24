package typings.next.anon

import typings.next.loadCustomRoutesMod.Rewrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildId extends js.Object {
  
  var buildId: String = js.native
  
  var modern: Boolean = js.native
  
  var rewrites: js.Array[Rewrite] = js.native
}
object BuildId {
  
  @scala.inline
  def apply(buildId: String, modern: Boolean, rewrites: js.Array[Rewrite]): BuildId = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], modern = modern.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildId]
  }
  
  @scala.inline
  implicit class BuildIdOps[Self <: BuildId] (val x: Self) extends AnyVal {
    
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
    def setBuildId(value: String): Self = this.set("buildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModern(value: Boolean): Self = this.set("modern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewritesVarargs(value: Rewrite*): Self = this.set("rewrites", js.Array(value :_*))
    
    @scala.inline
    def setRewrites(value: js.Array[Rewrite]): Self = this.set("rewrites", value.asInstanceOf[js.Any])
  }
}
