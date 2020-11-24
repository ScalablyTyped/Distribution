package typings.openfin.GoldenLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemConfig extends ItemConfigType {
  
  /**
    * An array of configurations for items that will be created as children of this item.
    */
  var content: js.UndefOr[js.Array[ItemConfigType]] = js.native
  
  /**
    * The height of this item, relative to the other children of its parent in percent
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * A String or an Array of Strings. Used to retrieve the item using item.getItemsById()
    */
  var id: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Determines if the item is closable. If false, the x on the items tab will be hidden and container.close()
    * will return false
    * Default: true
    */
  var isClosable: js.UndefOr[Boolean] = js.native
  
  /**
    * The title of the item as displayed on its tab and on popout windows
    * Default: componentName or ''
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The type of the item. Possible values are 'row', 'column', 'stack', 'component' and 'react-component'.
    */
  var `type`: String = js.native
  
  /**
    * The width of this item, relative to the other children of its parent in percent
    */
  var width: js.UndefOr[Double] = js.native
}
object ItemConfig {
  
  @scala.inline
  def apply(`type`: String): ItemConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemConfig]
  }
  
  @scala.inline
  implicit class ItemConfigOps[Self <: ItemConfig] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentVarargs(value: ItemConfigType*): Self = this.set("content", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: js.Array[ItemConfigType]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIdVarargs(value: String*): Self = this.set("id", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String | js.Array[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsClosable(value: Boolean): Self = this.set("isClosable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsClosable: Self = this.set("isClosable", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
