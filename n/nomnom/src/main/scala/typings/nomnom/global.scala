package typings.nomnom

import typings.nomnom.NomnomInternal.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @JSName("_nomnom")
  var nomnom: Parser = js.native
  
  @js.native
  object NomnomInternal extends js.Object {
    
    /**
      * The command-line parser.
      */
    @js.native
    object Parser extends js.Object
  }
}
