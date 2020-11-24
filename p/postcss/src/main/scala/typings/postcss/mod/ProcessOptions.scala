package typings.postcss.mod

import typings.postcss.anon.PickProcessOptionsmapfrom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessOptions extends js.Object {
  
  /**
    * The path of the CSS source file. You should always set "from", because it is
    * used in source map generation and syntax error messages.
    */
  var from: js.UndefOr[String] = js.native
  
  /**
    * Source map options
    */
  var map: js.UndefOr[SourceMapOptions | Boolean] = js.native
  
  /**
    * Function to generate AST by string.
    */
  var parser: js.UndefOr[Parser] = js.native
  
  /**
    * Class to generate string by AST.
    */
  var stringifier: js.UndefOr[Stringifier] = js.native
  
  /**
    * Object with parse and stringify.
    */
  var syntax: js.UndefOr[Syntax] = js.native
  
  /**
    * The path where you'll put the output CSS file. You should always set "to"
    * to generate correct source maps.
    */
  var to: js.UndefOr[String] = js.native
}
object ProcessOptions {
  
  @scala.inline
  def apply(): ProcessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessOptions]
  }
  
  @scala.inline
  implicit class ProcessOptionsOps[Self <: ProcessOptions] (val x: Self) extends AnyVal {
    
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
    def setParser(value: (/* css */ ParserInput, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => Root_): Self = this.set("parser", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    
    @scala.inline
    def setStringifier(value: (/* node */ Node, /* builder */ Builder) => Unit): Self = this.set("stringifier", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStringifier: Self = this.set("stringifier", js.undefined)
    
    @scala.inline
    def setSyntax(value: Syntax): Self = this.set("syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyntax: Self = this.set("syntax", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
