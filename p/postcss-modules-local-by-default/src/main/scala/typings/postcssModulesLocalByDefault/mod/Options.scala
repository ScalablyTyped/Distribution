package typings.postcssModulesLocalByDefault.mod

import typings.postcssModulesLocalByDefault.postcssModulesLocalByDefaultStrings.global
import typings.postcssModulesLocalByDefault.postcssModulesLocalByDefaultStrings.local
import typings.postcssModulesLocalByDefault.postcssModulesLocalByDefaultStrings.pure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var mode: js.UndefOr[global | local | pure] = js.native
  
  var rewriteUrl: js.UndefOr[js.Function2[/* global */ Boolean, /* url */ String, String]] = js.native
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
    def setMode(value: global | local | pure): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setRewriteUrl(value: (/* global */ Boolean, /* url */ String) => String): Self = this.set("rewriteUrl", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRewriteUrl: Self = this.set("rewriteUrl", js.undefined)
  }
}
