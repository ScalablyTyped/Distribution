package typings.next.buildManifestPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildManifestPlugin extends js.Object {
  
  @JSName("apply")
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
  ): Unit = js.native
  
  var buildId: js.Any = js.native
  
  def createAssets(compilation: js.Any, assets: js.Any): js.Any = js.native
  
  var modern: js.Any = js.native
  
  var rewrites: js.Any = js.native
}
object BuildManifestPlugin {
  
  @scala.inline
  def apply(
    apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit,
    buildId: js.Any,
    createAssets: (js.Any, js.Any) => js.Any,
    modern: js.Any,
    rewrites: js.Any
  ): BuildManifestPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), buildId = buildId.asInstanceOf[js.Any], createAssets = js.Any.fromFunction2(createAssets), modern = modern.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildManifestPlugin]
  }
  
  @scala.inline
  implicit class BuildManifestPluginOps[Self <: BuildManifestPlugin] (val x: Self) extends AnyVal {
    
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
    def setApply(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
    ): Self = this.set("apply", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBuildId(value: js.Any): Self = this.set("buildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateAssets(value: (js.Any, js.Any) => js.Any): Self = this.set("createAssets", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModern(value: js.Any): Self = this.set("modern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewrites(value: js.Any): Self = this.set("rewrites", value.asInstanceOf[js.Any])
  }
}
