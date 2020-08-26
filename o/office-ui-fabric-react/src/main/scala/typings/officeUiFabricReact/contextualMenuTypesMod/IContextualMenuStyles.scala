package typings.officeUiFabricReact.contextualMenuTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualMenuStyles extends js.Object {
  /**
    * Style for the container which parents all menu items.
    */
  var container: IStyle = js.native
  /**
    * Styles for the header item of a ContextualMenu
    */
  var header: IStyle = js.native
  /**
    * Styles for the list that contains all menuItems.
    */
  var list: IStyle = js.native
  /**
    * Base styles for the root element of all ContextualMenus.
    */
  var root: IStyle = js.native
  /**
    * SubComponent styles.
    */
  var subComponentStyles: IContextualMenuSubComponentStyles = js.native
  /**
    * Style override for the contextual menu title.
    */
  var title: IStyle = js.native
}

object IContextualMenuStyles {
  @scala.inline
  def apply(subComponentStyles: IContextualMenuSubComponentStyles): IContextualMenuStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuStyles]
  }
  @scala.inline
  implicit class IContextualMenuStylesOps[Self <: IContextualMenuStyles] (val x: Self) extends AnyVal {
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
    def setSubComponentStyles(value: IContextualMenuSubComponentStyles): Self = this.set("subComponentStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: IStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    @scala.inline
    def setHeader(value: IStyle): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeaderNull: Self = this.set("header", null)
    @scala.inline
    def setList(value: IStyle): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setListNull: Self = this.set("list", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setTitle(value: IStyle): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
  }
  
}

