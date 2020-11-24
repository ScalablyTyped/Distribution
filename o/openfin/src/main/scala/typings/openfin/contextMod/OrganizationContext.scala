package typings.openfin.contextMod

import typings.openfin.anon.LEI
import typings.openfin.openfinStrings.fdc3Dotorganization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationContext extends Context {
  
  /**
    * The organization data. Can contain either or both
    * * `LEI`: [LEI](https://www.gleif.org/en/about-lei/introducing-the-legal-entity-identifier-lei)
    * * `PERMID`: [PERMID](https://permid.org/)
    */
  @JSName("id")
  var id_OrganizationContext: LEI = js.native
  
  /**
    * The context type is always fdc3.organization.
    */
  @JSName("type")
  var type_OrganizationContext: fdc3Dotorganization = js.native
}
object OrganizationContext {
  
  @scala.inline
  def apply(id: LEI, `type`: fdc3Dotorganization): OrganizationContext = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationContext]
  }
  
  @scala.inline
  implicit class OrganizationContextOps[Self <: OrganizationContext] (val x: Self) extends AnyVal {
    
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
    def setId(value: LEI): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: fdc3Dotorganization): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
