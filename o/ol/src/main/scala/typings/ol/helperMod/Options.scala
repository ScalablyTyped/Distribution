package typings.ol.helperMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var postProcesses: js.UndefOr[js.Array[PostProcessesOptions]] = js.native
  
  var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setPostProcessesVarargs(value: PostProcessesOptions*): Self = this.set("postProcesses", js.Array(value :_*))
    
    @scala.inline
    def setPostProcesses(value: js.Array[PostProcessesOptions]): Self = this.set("postProcesses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostProcesses: Self = this.set("postProcesses", js.undefined)
    
    @scala.inline
    def setUniforms(value: StringDictionary[UniformValue]): Self = this.set("uniforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniforms: Self = this.set("uniforms", js.undefined)
  }
}
