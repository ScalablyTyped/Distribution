package typings.polyfillService.mod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolyfillSpec extends js.Object {
  
  var aliasOf: js.UndefOr[Set[String]] = js.native
  
  var flags: Set[PolyfillFlag] = js.native
}
object PolyfillSpec {
  
  @scala.inline
  def apply(flags: Set[PolyfillFlag]): PolyfillSpec = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyfillSpec]
  }
  
  @scala.inline
  implicit class PolyfillSpecOps[Self <: PolyfillSpec] (val x: Self) extends AnyVal {
    
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
    def setFlags(value: Set[PolyfillFlag]): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasOf(value: Set[String]): Self = this.set("aliasOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasOf: Self = this.set("aliasOf", js.undefined)
  }
}
