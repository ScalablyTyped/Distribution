package typings.postcss.mod

import typings.postcss.anon.PickProcessOptionsmapfrom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessOptions extends StObject {
  
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
  implicit class ProcessOptionsMutableBuilder[Self <: ProcessOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setMap(value: SourceMapOptions | Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setParser(value: (/* css */ ParserInput, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => Root_): Self = StObject.set(x, "parser", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    @scala.inline
    def setStringifier(value: (/* node */ Node, /* builder */ Builder) => Unit): Self = StObject.set(x, "stringifier", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
    
    @scala.inline
    def setSyntax(value: Syntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
