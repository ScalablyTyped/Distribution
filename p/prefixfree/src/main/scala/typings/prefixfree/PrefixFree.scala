package typings.prefixfree

import org.scalablytyped.runtime.StringDictionary
import typings.prefixfree.PrefixFree.KnownPrefixCSS
import typings.prefixfree.PrefixFree.KnownPrefixJS
import typings.prefixfree.StyleFix.StyleFixer
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixFree extends StObject {
  
  /**
    * The prefix used for CSS properties in `CSSStyleDeclaration`.
    *
    * Eg.: `Moz`, `Ms`, `O` or `Webkit`.
    */
  var Prefix: KnownPrefixJS | String = js.native
  
  var atrules: js.Array[String] = js.native
  
  var functions: js.Array[String] = js.native
  
  var keywords: js.Array[String] = js.native
  
  /**
    * The prefix used for CSS properties.
    *
    * Eg.: `-moz-`, `-ms-`, `-o-` or `-webkit-`.
    */
  var prefix: KnownPrefixCSS | String = js.native
  
  def prefixCSS(css: String, raw: Boolean, element: Element): String = js.native
  @JSName("prefixCSS")
  var prefixCSS_Original: StyleFixer = js.native
  
  def prefixProperty(property: String): String = js.native
  def prefixProperty(property: String, camelCase: Boolean): String = js.native
  
  def prefixSelector(selector: String): String = js.native
  
  var properties: js.Array[String] = js.native
  
  def property(property: String): String = js.native
  
  var selectorMap: StringDictionary[String] = js.native
  
  var selectors: js.Array[String] = js.native
  
  def value(value: String): String = js.native
  def value(value: String, property: String): String = js.native
  
  var valueProperties: js.Array[String] = js.native
}
// PrefixFree
object PrefixFree {
  
  /** The known prefixes used for CSS properties. */
  /* Rewritten from type alias, can be one of: 
    - typings.prefixfree.prefixfreeStrings.`-moz-`
    - typings.prefixfree.prefixfreeStrings.`-ms-`
    - typings.prefixfree.prefixfreeStrings.`-o-`
    - typings.prefixfree.prefixfreeStrings.`-webkit-`
  */
  trait KnownPrefixCSS extends StObject
  object KnownPrefixCSS {
    
    @scala.inline
    def `-moz-`: typings.prefixfree.prefixfreeStrings.`-moz-` = "-moz-".asInstanceOf[typings.prefixfree.prefixfreeStrings.`-moz-`]
    
    @scala.inline
    def `-ms-`: typings.prefixfree.prefixfreeStrings.`-ms-` = "-ms-".asInstanceOf[typings.prefixfree.prefixfreeStrings.`-ms-`]
    
    @scala.inline
    def `-o-`: typings.prefixfree.prefixfreeStrings.`-o-` = "-o-".asInstanceOf[typings.prefixfree.prefixfreeStrings.`-o-`]
    
    @scala.inline
    def `-webkit-`: typings.prefixfree.prefixfreeStrings.`-webkit-` = "-webkit-".asInstanceOf[typings.prefixfree.prefixfreeStrings.`-webkit-`]
  }
  
  /** The known prefixes used for CSS properties in `CSSStyleDeclaration`. */
  /* Rewritten from type alias, can be one of: 
    - typings.prefixfree.prefixfreeStrings.Moz
    - typings.prefixfree.prefixfreeStrings.Ms
    - typings.prefixfree.prefixfreeStrings.O
    - typings.prefixfree.prefixfreeStrings.Webkit
  */
  trait KnownPrefixJS extends StObject
  object KnownPrefixJS {
    
    @scala.inline
    def Moz: typings.prefixfree.prefixfreeStrings.Moz = "Moz".asInstanceOf[typings.prefixfree.prefixfreeStrings.Moz]
    
    @scala.inline
    def Ms: typings.prefixfree.prefixfreeStrings.Ms = "Ms".asInstanceOf[typings.prefixfree.prefixfreeStrings.Ms]
    
    @scala.inline
    def O: typings.prefixfree.prefixfreeStrings.O = "O".asInstanceOf[typings.prefixfree.prefixfreeStrings.O]
    
    @scala.inline
    def Webkit: typings.prefixfree.prefixfreeStrings.Webkit = "Webkit".asInstanceOf[typings.prefixfree.prefixfreeStrings.Webkit]
  }
}
