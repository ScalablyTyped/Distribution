package typings.parenthesis

import typings.parenthesis.anon.Flat
import typings.parenthesis.anon.Optsflatfalseundefined
import typings.parenthesis.anon.Optsflattrue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // Parse parentheses from a string, return folded arrays
  inline def apply(str: String): ArrayTree = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[ArrayTree]
  inline def apply(str: String, opts: String): ArrayTree = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ArrayTree]
  inline def apply(str: String, opts: js.Array[String]): ArrayTree = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ArrayTree]
  inline def apply(str: String, opts: Optsflatfalseundefined): ArrayTree = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ArrayTree]
  // Parse parentheses from a string, return flat array
  inline def apply(str: String, opts: Optsflattrue): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def apply(tokens: ArrayTree): String = ^.asInstanceOf[js.Dynamic].apply(tokens.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(tokens: ArrayTree, opts: Flat): String = (^.asInstanceOf[js.Dynamic].apply(tokens.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("parenthesis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // Parse parentheses from a string, return folded arrays
  inline def parse(str: String): ArrayTree = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[ArrayTree]
  inline def parse(str: String, opts: String): ArrayTree = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ArrayTree]
  inline def parse(str: String, opts: js.Array[String]): ArrayTree = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ArrayTree]
  inline def parse(str: String, opts: Optsflatfalseundefined): ArrayTree = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ArrayTree]
  // Parse parentheses from a string, return flat array
  inline def parse(str: String, opts: Optsflattrue): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  // Stringify tokens back. Pass {flat: true} flag for flat tokens array.
  inline def stringify(tokens: ArrayTree): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(tokens.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(tokens: ArrayTree, opts: Flat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(tokens.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  // A nested array of strings
  type ArrayTree = js.Array[Node]
  
  // One entry in the returned nested array
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Node = string | parenthesis.parenthesis.ArrayTree
  }}}
  to avoid circular code involving: 
  - parenthesis.parenthesis.ArrayTree
  - parenthesis.parenthesis.Node
  */
  type Node = String | Any
  
  // Second-argument options used by the function
  trait Opts extends StObject {
    
    // Single brackets string or list of strings to detect brackets. Can be repeating brackets eg. "" or ''.
    var brackets: js.UndefOr[String | js.Array[String]] = js.undefined
    
    // Escape prefix for flat references.
    var escape: js.UndefOr[String] = js.undefined
  }
  object Opts {
    
    inline def apply(): Opts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Opts] (val x: Self) extends AnyVal {
      
      inline def setBrackets(value: String | js.Array[String]): Self = StObject.set(x, "brackets", value.asInstanceOf[js.Any])
      
      inline def setBracketsUndefined: Self = StObject.set(x, "brackets", js.undefined)
      
      inline def setBracketsVarargs(value: String*): Self = StObject.set(x, "brackets", js.Array(value*))
      
      inline def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    }
  }
}
