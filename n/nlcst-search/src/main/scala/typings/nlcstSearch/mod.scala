package typings.nlcstSearch

import org.scalablytyped.runtime.StringDictionary
import typings.nlcstSearch.nlcstSearchStrings.children
import typings.unist.mod.Data
import typings.unist.mod.NodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nlcst-search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def search(tree: Node, phrases: PhrasesList, handler: Handler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(tree.asInstanceOf[js.Any], phrases.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def search(tree: Node, phrases: PhrasesList, handler: Handler, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(tree.asInstanceOf[js.Any], phrases.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def search(tree: Node, phrases: PhrasesList, handler: Handler, options: SearchOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(tree.asInstanceOf[js.Any], phrases.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def search(tree: Node, phrases: PhrasesMap, handler: Handler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(tree.asInstanceOf[js.Any], phrases.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def search(tree: Node, phrases: PhrasesMap, handler: Handler, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(tree.asInstanceOf[js.Any], phrases.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def search(tree: Node, phrases: PhrasesMap, handler: Handler, options: SearchOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(tree.asInstanceOf[js.Any], phrases.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AllowApostrophes = Boolean
  
  type Content = typings.nlcst.mod.Content
  
  type Handler = js.Function4[
    /* nodes */ js.Array[Content], 
    /* index */ Double, 
    /* parent */ Parent, 
    /* pattern */ String, 
    Unit
  ]
  
  type Node = Root | Content
  
  type NormalizeOptions = typings.nlcstNormalize.mod.NormalizeOptions
  
  /* Inlined std.Extract<nlcst-search.nlcst-search.Node, nlcst-search.nlcst-search.UnistParent> */
  type Parent = children
  
  type PhrasesList = js.Array[String]
  
  type PhrasesMap = StringDictionary[Any]
  
  type Root = typings.nlcst.mod.Root
  
  trait SearchOptions
    extends StObject
       with typings.nlcstNormalize.mod.NormalizeOptions {
    
    var allowLiterals: js.UndefOr[Boolean] = js.undefined
  }
  object SearchOptions {
    
    inline def apply(): SearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOptions]
    }
    
    extension [Self <: SearchOptions](x: Self) {
      
      inline def setAllowLiterals(value: Boolean): Self = StObject.set(x, "allowLiterals", value.asInstanceOf[js.Any])
      
      inline def setAllowLiteralsUndefined: Self = StObject.set(x, "allowLiterals", js.undefined)
    }
  }
  
  type UnistParent = typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]]
  
  type Word = typings.nlcst.mod.Word
}
