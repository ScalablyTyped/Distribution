package typings.oneIniWasm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@one-ini/wasm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait TokenTypes extends StObject
  @JSImport("@one-ini/wasm", "TokenTypes")
  @js.native
  object TokenTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TokenTypes & Double] = js.native
    
    @js.native
    sealed trait CommentIndicator
      extends StObject
         with TokenTypes
    /* 3 */ val CommentIndicator: typings.oneIniWasm.mod.TokenTypes.CommentIndicator & Double = js.native
    
    @js.native
    sealed trait CommentValue
      extends StObject
         with TokenTypes
    /* 4 */ val CommentValue: typings.oneIniWasm.mod.TokenTypes.CommentValue & Double = js.native
    
    @js.native
    sealed trait Key
      extends StObject
         with TokenTypes
    /* 0 */ val Key: typings.oneIniWasm.mod.TokenTypes.Key & Double = js.native
    
    @js.native
    sealed trait Section
      extends StObject
         with TokenTypes
    /* 2 */ val Section: typings.oneIniWasm.mod.TokenTypes.Section & Double = js.native
    
    @js.native
    sealed trait Value
      extends StObject
         with TokenTypes
    /* 1 */ val Value: typings.oneIniWasm.mod.TokenTypes.Value & Double = js.native
  }
  
  inline def parseToJson(contents: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_to_json")(contents.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def parseToUint32array(contents: js.typedarray.Uint8Array): js.typedarray.Uint32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_to_uint32array")(contents.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint32Array]
  
  inline def version(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("version")().asInstanceOf[String]
}
