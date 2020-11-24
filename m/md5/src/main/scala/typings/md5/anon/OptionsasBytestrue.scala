package typings.md5.anon

import typings.md5.md5Booleans.`true`
import typings.md5.md5Strings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined md5.md5.Options & {  asBytes :true} */
@js.native
trait OptionsasBytestrue extends js.Object {
  
  var asBytes: js.UndefOr[Boolean] with `true` = js.native
  
  var asString: js.UndefOr[Boolean] = js.native
  
  var encoding: js.UndefOr[binary | String] = js.native
}
object OptionsasBytestrue {
  
  @scala.inline
  def apply(asBytes: js.UndefOr[Boolean] with `true`): OptionsasBytestrue = {
    val __obj = js.Dynamic.literal(asBytes = asBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsasBytestrue]
  }
  
  @scala.inline
  implicit class OptionsasBytestrueOps[Self <: OptionsasBytestrue] (val x: Self) extends AnyVal {
    
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
    def setAsBytes(value: js.UndefOr[Boolean] with `true`): Self = this.set("asBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsString(value: Boolean): Self = this.set("asString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsString: Self = this.set("asString", js.undefined)
    
    @scala.inline
    def setEncoding(value: binary | String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
  }
}
