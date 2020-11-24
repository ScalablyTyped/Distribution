package typings.nedb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnsureIndexOptions extends js.Object {
  
  var expireAfterSeconds: js.UndefOr[Double] = js.native
  
  var fieldName: String = js.native
  
  var sparse: js.UndefOr[Boolean] = js.native
  
  var unique: js.UndefOr[Boolean] = js.native
}
object EnsureIndexOptions {
  
  @scala.inline
  def apply(fieldName: String): EnsureIndexOptions = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnsureIndexOptions]
  }
  
  @scala.inline
  implicit class EnsureIndexOptionsOps[Self <: EnsureIndexOptions] (val x: Self) extends AnyVal {
    
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
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireAfterSeconds(value: Double): Self = this.set("expireAfterSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireAfterSeconds: Self = this.set("expireAfterSeconds", js.undefined)
    
    @scala.inline
    def setSparse(value: Boolean): Self = this.set("sparse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSparse: Self = this.set("sparse", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
}
