package typings.micromarkCoreCommonmark

import typings.micromarkCoreCommonmark.anon.Marker
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devLibListMod {
  
  @JSImport("micromark-core-commonmark/dev/lib/list", "list")
  @js.native
  val list: Construct = js.native
  
  type Code = typings.micromarkUtilTypes.mod.Code
  
  type Construct = typings.micromarkUtilTypes.mod.Construct
  
  type Exiter = typings.micromarkUtilTypes.mod.Exiter
  
  type ListContainerState = (Record[String, Any]) & Marker
  
  type State = typings.micromarkUtilTypes.mod.State
  
  type TokenizeContext = typings.micromarkUtilTypes.mod.TokenizeContext
  
  @js.native
  trait TokenizeContextWithState
    extends StObject
       with typings.micromarkUtilTypes.mod.TokenizeContext {
    
    @JSName("containerState")
    var containerState_TokenizeContextWithState: ListContainerState = js.native
  }
  
  type Tokenizer = typings.micromarkUtilTypes.mod.Tokenizer
}
