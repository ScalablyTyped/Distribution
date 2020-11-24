package typings.officeUiFabricReact.keytipConfigMod

import typings.officeUiFabricReact.anon.PartialIKeytipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeytipConfigItem extends js.Object {
  
  /**
    * Children keytips of this keytip
    */
  var children: js.UndefOr[js.Array[IKeytipConfigItem]] = js.native
  
  /**
    * Content for the keytip
    */
  var content: String = js.native
  
  /**
    * Identifier for the keytip, to be used to access in the configMap
    */
  var id: String = js.native
  
  /**
    * Optional props in IKeytipProps
    */
  var optionalProps: js.UndefOr[PartialIKeytipProps] = js.native
  
  /**
    * Key Sequence for this keytip only
    * If sequence is not defined it will be derived from the content string
    */
  var sequence: js.UndefOr[String] = js.native
}
object IKeytipConfigItem {
  
  @scala.inline
  def apply(content: String, id: String): IKeytipConfigItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipConfigItem]
  }
  
  @scala.inline
  implicit class IKeytipConfigItemOps[Self <: IKeytipConfigItem] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: IKeytipConfigItem*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[IKeytipConfigItem]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setOptionalProps(value: PartialIKeytipProps): Self = this.set("optionalProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalProps: Self = this.set("optionalProps", js.undefined)
    
    @scala.inline
    def setSequence(value: String): Self = this.set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequence: Self = this.set("sequence", js.undefined)
  }
}
