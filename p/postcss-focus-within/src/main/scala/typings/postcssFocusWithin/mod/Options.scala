package typings.postcssFocusWithin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://github.com/csstools/postcss-focus-within#options}
  */
@js.native
trait Options extends js.Object {
  
  /**
    * The preserve option defines whether the original selector should remain.
    * By default, the original selector is preserved.
    * @default true
    */
  var preserve: js.UndefOr[Boolean] = js.native
  
  /**
    * The replaceWith option defines the selector to replace `:focus-within`.
    * By default, the replacement selector is `[focus-within]`.
    * @default `[focus-within]`
    */
  var replaceWith: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setPreserve(value: Boolean): Self = this.set("preserve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserve: Self = this.set("preserve", js.undefined)
    
    @scala.inline
    def setReplaceWith(value: String): Self = this.set("replaceWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceWith: Self = this.set("replaceWith", js.undefined)
  }
}
