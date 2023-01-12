package typings.micromark

import typings.micromark.anon.OmitPointindexbufferIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devLibCreateTokenizerMod {
  
  @JSImport("micromark/dev/lib/create-tokenizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTokenizer(parser: ParseContext, initialize: InitialConstruct): TokenizeContext = (^.asInstanceOf[js.Dynamic].applyDynamic("createTokenizer")(parser.asInstanceOf[js.Any], initialize.asInstanceOf[js.Any])).asInstanceOf[TokenizeContext]
  inline def createTokenizer(parser: ParseContext, initialize: InitialConstruct, from: OmitPointindexbufferIndex): TokenizeContext = (^.asInstanceOf[js.Dynamic].applyDynamic("createTokenizer")(parser.asInstanceOf[js.Any], initialize.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[TokenizeContext]
  
  type Chunk = typings.micromarkUtilTypes.mod.Chunk
  
  type Code = typings.micromarkUtilTypes.mod.Code
  
  type Construct = typings.micromarkUtilTypes.mod.Construct
  
  type ConstructRecord = typings.micromarkUtilTypes.mod.ConstructRecord
  
  type Effects = typings.micromarkUtilTypes.mod.Effects
  
  trait Info extends StObject {
    
    var from: Double
    
    def restore(): Unit
  }
  object Info {
    
    inline def apply(from: Double, restore: () => Unit): Info = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], restore = js.Any.fromFunction0(restore))
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setRestore(value: () => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction0(value))
    }
  }
  
  type InitialConstruct = typings.micromarkUtilTypes.mod.InitialConstruct
  
  type ParseContext = typings.micromarkUtilTypes.mod.ParseContext
  
  type Point = typings.micromarkUtilTypes.mod.Point
  
  type ReturnHandle = js.Function2[/* construct */ Construct, /* info */ Info, Unit]
  
  type State = typings.micromarkUtilTypes.mod.State
  
  type Token = typings.micromarkUtilTypes.mod.Token
  
  type TokenizeContext = typings.micromarkUtilTypes.mod.TokenizeContext
}
