package typings.postcssJs

import typings.postcss.libNodeMod.AnyNode
import typings.postcss.mod.Builder
import typings.postcss.mod.Root_
import typings.postcss.mod.SourceMapOptions
import typings.postcss.mod.Stringifier
import typings.postcss.mod.Syntax
import typings.postcssJs.mod.CssInJs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<postcss.postcss.ProcessOptions, 'parser'> & {  parser :(obj : postcss-js.postcss-js.CssInJs): postcss.postcss.Root} */
  trait OmitProcessOptionsparserp extends StObject {
    
    var from: js.UndefOr[String] = js.undefined
    
    var map: js.UndefOr[SourceMapOptions | Boolean] = js.undefined
    
    def parser(obj: CssInJs): Root_
    @JSName("parser")
    var parser_Original: js.Function1[/* obj */ CssInJs, Root_]
    
    var stringifier: js.UndefOr[Syntax | Stringifier] = js.undefined
    
    var syntax: js.UndefOr[Syntax] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
  }
  object OmitProcessOptionsparserp {
    
    inline def apply(parser: /* obj */ CssInJs => Root_): OmitProcessOptionsparserp = {
      val __obj = js.Dynamic.literal(parser = js.Any.fromFunction1(parser))
      __obj.asInstanceOf[OmitProcessOptionsparserp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitProcessOptionsparserp] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setMap(value: SourceMapOptions | Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setParser(value: /* obj */ CssInJs => Root_): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
      
      inline def setStringifier(value: Syntax | Stringifier): Self = StObject.set(x, "stringifier", value.asInstanceOf[js.Any])
      
      inline def setStringifierFunction2(value: (/* node */ AnyNode, /* builder */ Builder) => Unit): Self = StObject.set(x, "stringifier", js.Any.fromFunction2(value))
      
      inline def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
      
      inline def setSyntax(value: Syntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
}
