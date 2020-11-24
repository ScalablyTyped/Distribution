package typings.objectHash.mod.ObjectHash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions extends js.Object {
  
  var algorithm: js.UndefOr[String] = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var excludeKeys: js.UndefOr[js.Function1[/* key */ String, Boolean]] = js.native
  
  var excludeValues: js.UndefOr[Boolean] = js.native
  
  var ignoreUnknown: js.UndefOr[Boolean] = js.native
  
  var replacer: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  
  var respectFunctionNames: js.UndefOr[Boolean] = js.native
  
  var respectFunctionProperties: js.UndefOr[Boolean] = js.native
  
  var respectType: js.UndefOr[Boolean] = js.native
  
  var unorderedArrays: js.UndefOr[Boolean] = js.native
  
  var unorderedObjects: js.UndefOr[Boolean] = js.native
  
  var unorderedSets: js.UndefOr[Boolean] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setExcludeKeys(value: /* key */ String => Boolean): Self = this.set("excludeKeys", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExcludeKeys: Self = this.set("excludeKeys", js.undefined)
    
    @scala.inline
    def setExcludeValues(value: Boolean): Self = this.set("excludeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeValues: Self = this.set("excludeValues", js.undefined)
    
    @scala.inline
    def setIgnoreUnknown(value: Boolean): Self = this.set("ignoreUnknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUnknown: Self = this.set("ignoreUnknown", js.undefined)
    
    @scala.inline
    def setReplacer(value: /* value */ js.Any => _): Self = this.set("replacer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReplacer: Self = this.set("replacer", js.undefined)
    
    @scala.inline
    def setRespectFunctionNames(value: Boolean): Self = this.set("respectFunctionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRespectFunctionNames: Self = this.set("respectFunctionNames", js.undefined)
    
    @scala.inline
    def setRespectFunctionProperties(value: Boolean): Self = this.set("respectFunctionProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRespectFunctionProperties: Self = this.set("respectFunctionProperties", js.undefined)
    
    @scala.inline
    def setRespectType(value: Boolean): Self = this.set("respectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRespectType: Self = this.set("respectType", js.undefined)
    
    @scala.inline
    def setUnorderedArrays(value: Boolean): Self = this.set("unorderedArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnorderedArrays: Self = this.set("unorderedArrays", js.undefined)
    
    @scala.inline
    def setUnorderedObjects(value: Boolean): Self = this.set("unorderedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnorderedObjects: Self = this.set("unorderedObjects", js.undefined)
    
    @scala.inline
    def setUnorderedSets(value: Boolean): Self = this.set("unorderedSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnorderedSets: Self = this.set("unorderedSets", js.undefined)
  }
}
