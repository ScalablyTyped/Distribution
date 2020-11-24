package typings.postcssReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Default plugin options
  */
@js.native
trait DefaultOptions extends js.Object {
  
  /**
    * If true, no exclamatory triangle icons will be printed next to warnings.
    * @default false
    */
  var noIcon: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, plugin names will not be printed in brackets after messages.
    * @default false
    */
  var noPlugin: js.UndefOr[Boolean] = js.native
  
  /**
    * If false, messages will not be sorted by line/column position.
    * @default true
    */
  var sortByPosition: js.UndefOr[Boolean] = js.native
}
object DefaultOptions {
  
  @scala.inline
  def apply(): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultOptions]
  }
  
  @scala.inline
  implicit class DefaultOptionsOps[Self <: DefaultOptions] (val x: Self) extends AnyVal {
    
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
    def setNoIcon(value: Boolean): Self = this.set("noIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoIcon: Self = this.set("noIcon", js.undefined)
    
    @scala.inline
    def setNoPlugin(value: Boolean): Self = this.set("noPlugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoPlugin: Self = this.set("noPlugin", js.undefined)
    
    @scala.inline
    def setSortByPosition(value: Boolean): Self = this.set("sortByPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortByPosition: Self = this.set("sortByPosition", js.undefined)
  }
}
