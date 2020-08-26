package typings.postcssLoadConfig.mod

import typings.postcss.anon.PickProcessOptionsmapfrom
import typings.postcss.mod.Builder
import typings.postcss.mod.Node
import typings.postcss.mod.Parser
import typings.postcss.mod.ParserInput
import typings.postcss.mod.Root_
import typings.postcss.mod.Stringifier
import typings.postcss.mod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// In the ConfigContext, these three options can be instances of the
// appropriate class, or strings. If they are strings, postcss-load-config will
// require() them and pass the instances along.
@js.native
trait ProcessOptionsPreload extends js.Object {
  var parser: js.UndefOr[String | Parser] = js.native
  var stringifier: js.UndefOr[String | Stringifier] = js.native
  var syntax: js.UndefOr[String | Syntax] = js.native
}

object ProcessOptionsPreload {
  @scala.inline
  def apply(): ProcessOptionsPreload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessOptionsPreload]
  }
  @scala.inline
  implicit class ProcessOptionsPreloadOps[Self <: ProcessOptionsPreload] (val x: Self) extends AnyVal {
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
  }
  
}

