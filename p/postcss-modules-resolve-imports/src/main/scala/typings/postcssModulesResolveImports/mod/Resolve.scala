package typings.postcssModulesResolveImports.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resolve extends js.Object {
  
  var alias: js.UndefOr[StringDictionary[String]] = js.native
  
  var extensions: js.UndefOr[js.Array[String]] = js.native
  
  var mainFile: js.UndefOr[String] = js.native
  
  var modules: js.UndefOr[js.Array[String]] = js.native
  
  var preserveSymlinks: js.UndefOr[Boolean] = js.native
}
object Resolve {
  
  @scala.inline
  def apply(): Resolve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resolve]
  }
  
  @scala.inline
  implicit class ResolveOps[Self <: Resolve] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: StringDictionary[String]): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setMainFile(value: String): Self = this.set("mainFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainFile: Self = this.set("mainFile", js.undefined)
    
    @scala.inline
    def setModulesVarargs(value: String*): Self = this.set("modules", js.Array(value :_*))
    
    @scala.inline
    def setModules(value: js.Array[String]): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    
    @scala.inline
    def setPreserveSymlinks(value: Boolean): Self = this.set("preserveSymlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveSymlinks: Self = this.set("preserveSymlinks", js.undefined)
  }
}
