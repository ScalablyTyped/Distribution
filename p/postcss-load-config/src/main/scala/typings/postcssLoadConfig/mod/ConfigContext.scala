package typings.postcssLoadConfig.mod

import typings.postcss.anon.PickProcessOptionsmapfrom
import typings.postcss.mod.Builder
import typings.postcss.mod.Node
import typings.postcss.mod.Parser
import typings.postcss.mod.ParserInput
import typings.postcss.mod.Root_
import typings.postcss.mod.SourceMapOptions
import typings.postcss.mod.Stringifier
import typings.postcss.mod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// The full shape of the ConfigContext.
/* Inlined postcss-load-config.postcss-load-config.Context & postcss-load-config.postcss-load-config.ProcessOptionsPreload & postcss-load-config.postcss-load-config.RemainingProcessOptions */
@js.native
trait ConfigContext extends js.Object {
  
  var cwd: js.UndefOr[String] = js.native
  
  var env: js.UndefOr[String] = js.native
  
  var from: js.UndefOr[String] = js.native
  
  var map: js.UndefOr[SourceMapOptions | Boolean] = js.native
  
  var parser: js.UndefOr[String | Parser] = js.native
  
  var stringifier: js.UndefOr[String | Stringifier] = js.native
  
  var syntax: js.UndefOr[String | Syntax] = js.native
  
  var to: js.UndefOr[String] = js.native
}
object ConfigContext {
  
  @scala.inline
  def apply(): ConfigContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigContext]
  }
  
  @scala.inline
  implicit class ConfigContextOps[Self <: ConfigContext] (val x: Self) extends AnyVal {
    
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setMap(value: SourceMapOptions | Boolean): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setParserFunction2(value: (/* css */ ParserInput, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => Root_): Self = this.set("parser", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParser(value: String | Parser): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    
    @scala.inline
    def setStringifierFunction2(value: (/* node */ Node, /* builder */ Builder) => Unit): Self = this.set("stringifier", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStringifier(value: String | Stringifier): Self = this.set("stringifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringifier: Self = this.set("stringifier", js.undefined)
    
    @scala.inline
    def setSyntax(value: String | Syntax): Self = this.set("syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyntax: Self = this.set("syntax", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
