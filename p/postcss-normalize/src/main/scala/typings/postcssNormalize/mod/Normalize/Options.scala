package typings.postcssNormalize.mod.Normalize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * @default false
    */
  var allowDuplicates: js.UndefOr[Boolean] = js.native
  
  /**
    * @default null
    */
  var browsers: js.UndefOr[String] = js.native
  
  /**
    * @default null
    */
  var forceImport: js.UndefOr[Boolean | String] = js.native
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
    def setAllowDuplicates(value: Boolean): Self = this.set("allowDuplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDuplicates: Self = this.set("allowDuplicates", js.undefined)
    
    @scala.inline
    def setBrowsers(value: String): Self = this.set("browsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowsers: Self = this.set("browsers", js.undefined)
    
    @scala.inline
    def setForceImport(value: Boolean | String): Self = this.set("forceImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceImport: Self = this.set("forceImport", js.undefined)
  }
}
