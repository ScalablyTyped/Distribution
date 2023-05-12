package typings.postcssMediaQueryParser

import typings.postcssMediaQueryParser.postcssMediaQueryParserStrings.`media-feature-expression`
import typings.postcssMediaQueryParser.postcssMediaQueryParserStrings.`media-feature`
import typings.postcssMediaQueryParser.postcssMediaQueryParserStrings.`media-query-list`
import typings.postcssMediaQueryParser.postcssMediaQueryParserStrings.`media-query`
import typings.postcssMediaQueryParser.postcssMediaQueryParserStrings.`media-type`
import typings.postcssMediaQueryParser.postcssMediaQueryParserStrings.colon
import typings.postcssMediaQueryParser.postcssMediaQueryParserStrings.keyword
import typings.postcssMediaQueryParser.postcssMediaQueryParserStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("postcss-media-query-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(mediaQuery: String): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(mediaQuery.asInstanceOf[js.Any]).asInstanceOf[Root]
  
  @js.native
  trait Child
    extends StObject
       with Node {
    
    var parent: Node = js.native
    
    @JSName("type")
    var type_Child: `media-query` | `media-feature-expression` | `media-feature` | `media-type` | colon | value | keyword = js.native
  }
  
  @js.native
  trait Node extends StObject {
    
    var after: String = js.native
    
    var before: String = js.native
    
    var nodes: js.UndefOr[js.Array[Child]] = js.native
    
    var sourceIndex: Double = js.native
    
    var `type`: String = js.native
    
    var value: String = js.native
    
    def walk(callback: WalkerCallback): Unit = js.native
    def walk(filter: String, callback: WalkerCallback): Unit = js.native
    def walk(filter: js.RegExp, callback: WalkerCallback): Unit = js.native
  }
  
  @js.native
  trait Root
    extends StObject
       with Node {
    
    @JSName("type")
    var type_Root: `media-query-list` = js.native
  }
  
  type WalkerCallback = js.Function3[/* node */ Child, /* index */ Double, /* nodes */ js.Array[Child], Boolean | Unit]
}
