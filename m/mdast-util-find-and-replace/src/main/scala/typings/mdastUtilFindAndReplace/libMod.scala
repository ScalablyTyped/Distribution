package typings.mdastUtilFindAndReplace

import typings.mdastUtilFindAndReplace.mdastUtilFindAndReplaceBooleans.`false`
import typings.mdastUtilFindAndReplace.mdastUtilFindAndReplaceStrings.children
import typings.std.Record
import typings.unistUtilIs.mod.Props
import typings.unistUtilIs.mod.TestFunctionAnything
import typings.unistUtilIs.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("mdast-util-find-and-replace/lib", "findAndReplace")
  @js.native
  val findAndReplace: (js.Function4[
    /* tree */ Node, 
    /* find */ Find, 
    /* replace */ js.UndefOr[Replace], 
    /* options */ js.UndefOr[Options], 
    Node
  ]) & (js.Function3[
    /* tree */ Node, 
    /* schema */ FindAndReplaceSchema | FindAndReplaceList, 
    /* options */ js.UndefOr[Options], 
    Node
  ]) = js.native
  
  type Content = typings.mdast.mod.Content
  
  type Find = String | js.RegExp
  
  type FindAndReplaceList = js.Array[js.Tuple2[Find, Replace]]
  
  type FindAndReplaceSchema = Record[String, Replace]
  
  type FindAndReplaceTuple = js.Tuple2[Find, Replace]
  
  type Node = Content | Root
  
  trait Options extends StObject {
    
    /**
      * `unist-util-is` test used to assert parents
      */
    var ignore: js.UndefOr[Test] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIgnore(value: Test): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFunction3(
        value: (/* node */ typings.unistUtilIs.mod.Node, /* index */ js.UndefOr[Double | Null], /* parent */ js.UndefOr[typings.unistUtilIs.mod.Parent | Null]) => Boolean | Unit
      ): Self = StObject.set(x, "ignore", js.Any.fromFunction3(value))
      
      inline def setIgnoreNull: Self = StObject.set(x, "ignore", null)
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: (Type | Props | TestFunctionAnything)*): Self = StObject.set(x, "ignore", js.Array(value*))
    }
  }
  
  type Pair = js.Tuple2[js.RegExp, ReplaceFunction]
  
  type Pairs = js.Array[js.Tuple2[js.RegExp, ReplaceFunction]]
  
  /* Inlined std.Exclude<std.Extract<mdast-util-find-and-replace.mdast-util-find-and-replace/lib.Node, mdast.mdast.Parent>, mdast-util-find-and-replace.mdast-util-find-and-replace/lib.Root> */
  type Parent = children
  
  type PhrasingContent = typings.mdast.mod.PhrasingContent
  
  trait RegExpMatchObject extends StObject {
    
    var index: Double
    
    var input: String
    
    var stack: Array[Root | Text | Parent]
  }
  object RegExpMatchObject {
    
    inline def apply(index: Double, input: String, stack: Array[Root | Text | Parent]): RegExpMatchObject = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegExpMatchObject]
    }
    
    extension [Self <: RegExpMatchObject](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setStack(value: Array[Root | Text | Parent]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  type Replace = String | ReplaceFunction
  
  @js.native
  trait ReplaceFunction extends StObject {
    
    def apply(parameters: Any*): js.UndefOr[js.Array[PhrasingContent] | PhrasingContent | String | `false` | Null] = js.native
  }
  
  type Root = typings.mdast.mod.Root
  
  type Test = typings.unistUtilVisitParents.mod.Test
  
  type Text = typings.mdast.mod.Text
  
  type VisitorResult = typings.unistUtilVisitParents.mod.VisitorResult
}
