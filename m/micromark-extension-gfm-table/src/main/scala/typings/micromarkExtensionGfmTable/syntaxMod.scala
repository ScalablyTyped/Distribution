package typings.micromarkExtensionGfmTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntaxMod {
  
  @JSImport("micromark-extension-gfm-table/dev/lib/syntax", "gfmTable")
  @js.native
  val gfmTable: Extension = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.left
    - typings.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.center
    - typings.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.right
    - typings.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.none
  */
  trait Align extends StObject
  object Align {
    
    inline def center: typings.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.center = "center".asInstanceOf[typings.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.center]
    
    inline def left: typings.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.left = "left".asInstanceOf[typings.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.left]
    
    inline def none: typings.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.none = "none".asInstanceOf[typings.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.none]
    
    inline def right: typings.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.right = "right".asInstanceOf[typings.micromarkExtensionGfmTable.micromarkExtensionGfmTableStrings.right]
  }
  
  type Extension = typings.micromarkUtilTypes.mod.Extension
  
  type Resolver = typings.micromarkUtilTypes.mod.Resolver
  
  type State = typings.micromarkUtilTypes.mod.State
  
  type Token = typings.micromarkUtilTypes.mod.Token
  
  type Tokenizer = typings.micromarkUtilTypes.mod.Tokenizer
}
