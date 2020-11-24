package typings.pirates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * The extensions to hook. Should start with '.' (ex. ['.js']).
    *
    * @default ['.js']
    */
  var exts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Auto-ignore node_modules. Independent of any matcher.
    *
    * @default true
    */
  var ignoreNodeModules: js.UndefOr[Boolean] = js.native
  
  /** A matcher function, will be called with path to a file. Should return truthy if the file should be hooked, falsy otherwise. */
  var matcher: js.UndefOr[Matcher] = js.native
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
    def setExtsVarargs(value: String*): Self = this.set("exts", js.Array(value :_*))
    
    @scala.inline
    def setExts(value: js.Array[String]): Self = this.set("exts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExts: Self = this.set("exts", js.undefined)
    
    @scala.inline
    def setIgnoreNodeModules(value: Boolean): Self = this.set("ignoreNodeModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreNodeModules: Self = this.set("ignoreNodeModules", js.undefined)
    
    @scala.inline
    def setMatcher(value: /* code */ String => Boolean): Self = this.set("matcher", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMatcher: Self = this.set("matcher", js.undefined)
  }
}
