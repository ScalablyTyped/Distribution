package typings.obsoleteWeb.mod

import typings.obsoleteWeb.obsoleteWebStrings.afterbeing
import typings.obsoleteWeb.obsoleteWebStrings.beforened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * If set 'afterbegin', the template will be injected into the start of body.
    * If set 'beforeend', the template will be injected into the end of body
    * @default 'afterbegin'
    */
  var position: js.UndefOr[afterbeing | beforened] = js.native
  
  /**
    * If the current browser useragent doesn't match one of the target browsers, it's considered as unsupported.
    * Thus, the prompt will be shown.
    * @default false
    */
  var promptOnNonTargetBrowser: js.UndefOr[Boolean] = js.native
  
  /**
    * If the current browser useragent is unknown, the prompt will be shown
    * @default true
    */
  var promptOnUnknownBrowser: js.UndefOr[Boolean] = js.native
  
  /**
    * The prompt html template injected to the bottom of body. The default value is:
    * ```html
    * <div>Your browser is not supported. <button id="obsoleteClose">&times;</button></div>
    * ```
    */
  var template: js.UndefOr[String] = js.native
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
    def setPosition(value: afterbeing | beforened): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPromptOnNonTargetBrowser(value: Boolean): Self = this.set("promptOnNonTargetBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromptOnNonTargetBrowser: Self = this.set("promptOnNonTargetBrowser", js.undefined)
    
    @scala.inline
    def setPromptOnUnknownBrowser(value: Boolean): Self = this.set("promptOnUnknownBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromptOnUnknownBrowser: Self = this.set("promptOnUnknownBrowser", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
