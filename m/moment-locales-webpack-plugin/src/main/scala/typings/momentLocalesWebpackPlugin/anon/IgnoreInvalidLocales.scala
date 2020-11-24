package typings.momentLocalesWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnoreInvalidLocales extends js.Object {
  
  /** Ignore invalid or unsupported locales in `localesToKeep`. */
  var ignoreInvalidLocales: js.UndefOr[Boolean] = js.native
  
  /** An array of locales to keep bundled (other locales are removed). */
  var localesToKeep: js.UndefOr[js.Array[String]] = js.native
}
object IgnoreInvalidLocales {
  
  @scala.inline
  def apply(): IgnoreInvalidLocales = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreInvalidLocales]
  }
  
  @scala.inline
  implicit class IgnoreInvalidLocalesOps[Self <: IgnoreInvalidLocales] (val x: Self) extends AnyVal {
    
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
    def setIgnoreInvalidLocales(value: Boolean): Self = this.set("ignoreInvalidLocales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreInvalidLocales: Self = this.set("ignoreInvalidLocales", js.undefined)
    
    @scala.inline
    def setLocalesToKeepVarargs(value: String*): Self = this.set("localesToKeep", js.Array(value :_*))
    
    @scala.inline
    def setLocalesToKeep(value: js.Array[String]): Self = this.set("localesToKeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalesToKeep: Self = this.set("localesToKeep", js.undefined)
  }
}
