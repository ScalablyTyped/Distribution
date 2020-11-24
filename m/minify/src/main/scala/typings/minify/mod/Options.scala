package typings.minify.mod

import typings.minify.anon.MaxSize
import typings.terser.mod.MinifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Full documentation for options that each file type accepts
  * can be found on the pages of the libraries used by minify to process the files
  */
@js.native
trait Options extends js.Object {
  
  /**
    * see {@link https://github.com/jakubpawlowicz/clean-css}
    */
  var css: js.UndefOr[typings.cleanCss.mod.Options] = js.native
  
  /**
    * see {@link https://github.com/kangax/html-minifier}
    */
  var html: js.UndefOr[typings.htmlMinifierTerser.mod.Options] = js.native
  
  /**
    * see {@link https://github.com/Filirom1/css-base64-images}
    */
  var img: js.UndefOr[MaxSize] = js.native
  
  /**
    * see {@link https://github.com/terser/terser}
    */
  @JSName("js")
  var js_ : js.UndefOr[MinifyOptions] = js.native
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
    def setCss(value: typings.cleanCss.mod.Options): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setHtml(value: typings.htmlMinifierTerser.mod.Options): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setImg(value: MaxSize): Self = this.set("img", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImg: Self = this.set("img", js.undefined)
    
    @scala.inline
    def setJs_(value: MinifyOptions): Self = this.set("js", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJs_ : Self = this.set("js", js.undefined)
  }
}
