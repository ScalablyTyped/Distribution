package typings.officeUiFabricReact.contextualMenuTypesMod

import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContextualMenuSection
  extends ClassAttributes[js.Any] {
  
  /**
    * If set to true, the section will display a divider at the bottom of the section.
    */
  var bottomDivider: js.UndefOr[Boolean] = js.native
  
  /**
    * The items to include inside the section.
    */
  var items: js.Array[IContextualMenuItem] = js.native
  
  /**
    * The optional section title.
    */
  var title: js.UndefOr[String | IContextualMenuItem] = js.native
  
  /**
    * If set to true, the section will display a divider at the top of the section.
    */
  var topDivider: js.UndefOr[Boolean] = js.native
}
object IContextualMenuSection {
  
  @scala.inline
  def apply(items: js.Array[IContextualMenuItem]): IContextualMenuSection = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuSection]
  }
  
  @scala.inline
  implicit class IContextualMenuSectionOps[Self <: IContextualMenuSection] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: IContextualMenuItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[IContextualMenuItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomDivider(value: Boolean): Self = this.set("bottomDivider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomDivider: Self = this.set("bottomDivider", js.undefined)
    
    @scala.inline
    def setTitle(value: String | IContextualMenuItem): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTopDivider(value: Boolean): Self = this.set("topDivider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopDivider: Self = this.set("topDivider", js.undefined)
  }
}
