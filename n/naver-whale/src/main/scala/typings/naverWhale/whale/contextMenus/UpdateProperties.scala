package typings.naverWhale.whale.contextMenus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProperties extends js.Object {
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var contexts: js.UndefOr[js.Array[String]] = js.native
  
  var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. Since Chrome 20.  */
  var enabled: js.UndefOr[Boolean] = js.native
  
  var onclick: js.UndefOr[js.Function] = js.native
  
  /** Optional. Note: You cannot change an item to be a child of one of its own descendants.  */
  var parentId: js.UndefOr[js.Any] = js.native
  
  var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Optional.
    * @since Chrome 62.
    * Whether the item is visible in the menu.
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object UpdateProperties {
  
  @scala.inline
  def apply(): UpdateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProperties]
  }
  
  @scala.inline
  implicit class UpdatePropertiesOps[Self <: UpdateProperties] (val x: Self) extends AnyVal {
    
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: String*): Self = this.set("contexts", js.Array(value :_*))
    
    @scala.inline
    def setContexts(value: js.Array[String]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContexts: Self = this.set("contexts", js.undefined)
    
    @scala.inline
    def setDocumentUrlPatternsVarargs(value: String*): Self = this.set("documentUrlPatterns", js.Array(value :_*))
    
    @scala.inline
    def setDocumentUrlPatterns(value: js.Array[String]): Self = this.set("documentUrlPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentUrlPatterns: Self = this.set("documentUrlPatterns", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setOnclick(value: js.Function): Self = this.set("onclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    
    @scala.inline
    def setParentId(value: js.Any): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    
    @scala.inline
    def setTargetUrlPatternsVarargs(value: String*): Self = this.set("targetUrlPatterns", js.Array(value :_*))
    
    @scala.inline
    def setTargetUrlPatterns(value: js.Array[String]): Self = this.set("targetUrlPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetUrlPatterns: Self = this.set("targetUrlPatterns", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
