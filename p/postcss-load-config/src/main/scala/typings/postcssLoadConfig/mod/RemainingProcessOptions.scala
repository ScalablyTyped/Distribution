package typings.postcssLoadConfig.mod

import typings.postcss.mod.SourceMapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// The remaining ProcessOptions, sans the three above.
/* Inlined std.Pick<postcss.postcss.ProcessOptions, std.Exclude<keyof postcss.postcss.ProcessOptions, keyof postcss-load-config.postcss-load-config.ProcessOptionsPreload>> */
@js.native
trait RemainingProcessOptions extends js.Object {
  
  var from: js.UndefOr[String] = js.native
  
  var map: js.UndefOr[SourceMapOptions | Boolean] = js.native
  
  var to: js.UndefOr[String] = js.native
}
object RemainingProcessOptions {
  
  @scala.inline
  def apply(): RemainingProcessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemainingProcessOptions]
  }
  
  @scala.inline
  implicit class RemainingProcessOptionsOps[Self <: RemainingProcessOptions] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setMap(value: SourceMapOptions | Boolean): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
