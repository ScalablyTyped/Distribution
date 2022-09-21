package typings.micromarkExtensionGfmFootnote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntaxMod {
  
  @JSImport("micromark-extension-gfm-footnote/dev/lib/syntax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gfmFootnote(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmFootnote")().asInstanceOf[Extension]
  
  type Event = typings.micromarkUtilTypes.mod.Event
  
  type Exiter = typings.micromarkUtilTypes.mod.Exiter
  
  type Extension = typings.micromarkUtilTypes.mod.Extension
  
  type Resolver = typings.micromarkUtilTypes.mod.Resolver
  
  type State = typings.micromarkUtilTypes.mod.State
  
  type Token = typings.micromarkUtilTypes.mod.Token
  
  type Tokenizer = typings.micromarkUtilTypes.mod.Tokenizer
}
