package typings.nodeForge.mod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Attribute members to search on; any one hit will return the attribute
  */
@js.native
trait GetAttributeOpts extends js.Object {
  
  /**
    * Long name
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Short name
    */
  var shortName: js.UndefOr[String] = js.native
  
  /**
    * OID
    */
  var `type`: js.UndefOr[String] = js.native
}
object GetAttributeOpts {
  
  @scala.inline
  def apply(): GetAttributeOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAttributeOpts]
  }
  
  @scala.inline
  implicit class GetAttributeOptsOps[Self <: GetAttributeOpts] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setShortName(value: String): Self = this.set("shortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortName: Self = this.set("shortName", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
