package typings.micromark

import typings.micromarkUtilTypes.mod.Resolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  object resolver {
    
    @JSImport("micromark/dev/lib/initialize/text", "resolver.resolveAll")
    @js.native
    val resolveAll: Resolver = js.native
  }
  
  @JSImport("micromark/dev/lib/initialize/text", "string")
  @js.native
  val string: typings.micromarkUtilTypes.mod.InitialConstruct = js.native
  
  @JSImport("micromark/dev/lib/initialize/text", "text")
  @js.native
  val text: typings.micromarkUtilTypes.mod.InitialConstruct = js.native
  
  type Code = typings.micromarkUtilTypes.mod.Code
  
  type Construct = typings.micromarkUtilTypes.mod.Construct
  
  type InitialConstruct = typings.micromarkUtilTypes.mod.InitialConstruct
  
  type Initializer = typings.micromarkUtilTypes.mod.Initializer
  
  type Resolver_ = Resolver
  
  type State = typings.micromarkUtilTypes.mod.State
}
