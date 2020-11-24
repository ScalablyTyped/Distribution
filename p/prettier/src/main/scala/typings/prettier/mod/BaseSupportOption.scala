package typings.prettier.mod

import typings.prettier.prettierBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseSupportOption[Type /* <: SupportOptionType */] extends js.Object {
  
  var category: String = js.native
  
  /**
    * Indicate that the option is deprecated.
    *
    * Use a string to add an extra message to --help for the option,
    * for example to suggest a replacement option.
    */
  var deprecated: js.UndefOr[`true` | String] = js.native
  
  /**
    * Description to be displayed in --help. If omitted, the option won't be
    * shown at all in --help.
    */
  var description: js.UndefOr[String] = js.native
  
  var since: String = js.native
  
  /**
    * The type of the option.
    *
    * When passing a type other than the ones listed below, the option is
    * treated as taking any string as argument, and `--option <${type}>` will
    * be displayed in --help.
    */
  var `type`: Type = js.native
}
object BaseSupportOption {
  
  @scala.inline
  def apply[Type /* <: SupportOptionType */](category: String, since: String, `type`: Type): BaseSupportOption[Type] = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSupportOption[Type]]
  }
  
  @scala.inline
  implicit class BaseSupportOptionOps[Self <: BaseSupportOption[_], Type /* <: SupportOptionType */] (val x: Self with BaseSupportOption[Type]) extends AnyVal {
    
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSince(value: String): Self = this.set("since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecated(value: `true` | String): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
