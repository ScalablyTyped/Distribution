package typings.postcss.mod

import typings.postcss.anon.PickProcessOptionsmapfrom
import typings.postcss.anon.ToString
import typings.postcss.libNodeMod.AnyNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessOptions extends StObject {
  
  /**
    * The path of the CSS source file. You should always set `from`,
    * because it is used in source map generation and syntax error messages.
    */
  var from: js.UndefOr[String] = js.undefined
  
  /**
    * Source map options
    */
  var map: js.UndefOr[SourceMapOptions | Boolean] = js.undefined
  
  /**
    * Function to generate AST by string.
    */
  var parser: js.UndefOr[
    Syntax | (Parser[typings.postcss.libRootMod.default | typings.postcss.libDocumentMod.default])
  ] = js.undefined
  
  /**
    * Class to generate string by AST.
    */
  var stringifier: js.UndefOr[Syntax | Stringifier] = js.undefined
  
  /**
    * Object with parse and stringify.
    */
  var syntax: js.UndefOr[Syntax] = js.undefined
  
  /**
    * The path where you'll put the output CSS file. You should always set `to`
    * to generate correct source maps.
    */
  var to: js.UndefOr[String] = js.undefined
}
object ProcessOptions {
  
  inline def apply(): ProcessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessOptions]
  }
  
  extension [Self <: ProcessOptions](x: Self) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setMap(value: SourceMapOptions | Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setParser(
      value: Syntax | (Parser[typings.postcss.libRootMod.default | typings.postcss.libDocumentMod.default])
    ): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setParserFunction2(
      value: (/* css */ String | ToString, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => typings.postcss.libRootMod.default | typings.postcss.libDocumentMod.default
    ): Self = StObject.set(x, "parser", js.Any.fromFunction2(value))
    
    inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    inline def setStringifier(value: Syntax | Stringifier): Self = StObject.set(x, "stringifier", value.asInstanceOf[js.Any])
    
    inline def setStringifierFunction2(value: (/* node */ AnyNode, /* builder */ Builder) => Unit): Self = StObject.set(x, "stringifier", js.Any.fromFunction2(value))
    
    inline def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
    
    inline def setSyntax(value: Syntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
