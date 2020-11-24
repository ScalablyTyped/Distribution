package typings.officeUiFabricReact.docPageTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITableJson extends js.Object {
  
  var deprecated: js.UndefOr[Boolean] = js.native
  
  var deprecatedMessage: js.UndefOr[String] = js.native
  
  var description: String = js.native
  
  /**
    * Any types the item extends, translated to an array of text elements and links to other types.
    * For classes and interfaces only.
    */
  var extendsTokens: js.Array[ILinkToken] = js.native
  
  var kind: ApiKind = js.native
  
  var members: js.UndefOr[js.Array[IEnumTableRowJson | ITableRowJson]] = js.native
  
  var name: String = js.native
}
object ITableJson {
  
  @scala.inline
  def apply(description: String, extendsTokens: js.Array[ILinkToken], kind: ApiKind, name: String): ITableJson = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], extendsTokens = extendsTokens.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableJson]
  }
  
  @scala.inline
  implicit class ITableJsonOps[Self <: ITableJson] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsTokensVarargs(value: ILinkToken*): Self = this.set("extendsTokens", js.Array(value :_*))
    
    @scala.inline
    def setExtendsTokens(value: js.Array[ILinkToken]): Self = this.set("extendsTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ApiKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    
    @scala.inline
    def setDeprecatedMessage(value: String): Self = this.set("deprecatedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecatedMessage: Self = this.set("deprecatedMessage", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: (IEnumTableRowJson | ITableRowJson)*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[IEnumTableRowJson | ITableRowJson]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
  }
}
