package typings.pathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokensToFunctionOptions extends js.Object {
  
  /**
    * Function for encoding input strings for output.
    */
  var encode: js.UndefOr[js.Function2[/* value */ String, /* token */ Key, String]] = js.native
  
  /**
    * When `true` the regexp will be case sensitive. (default: `false`)
    */
  var sensitive: js.UndefOr[Boolean] = js.native
  
  /**
    * When `false` the function can produce an invalid (unmatched) path. (default: `true`)
    */
  var validate: js.UndefOr[Boolean] = js.native
}
object TokensToFunctionOptions {
  
  @scala.inline
  def apply(): TokensToFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokensToFunctionOptions]
  }
  
  @scala.inline
  implicit class TokensToFunctionOptionsOps[Self <: TokensToFunctionOptions] (val x: Self) extends AnyVal {
    
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
    def setEncode(value: (/* value */ String, /* token */ Key) => String): Self = this.set("encode", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    
    @scala.inline
    def setSensitive(value: Boolean): Self = this.set("sensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitive: Self = this.set("sensitive", js.undefined)
    
    @scala.inline
    def setValidate(value: Boolean): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
