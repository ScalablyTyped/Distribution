package typings.nomnom

import typings.nomnom.NomnomInternal.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("_nomnom")
  @js.native
  def nomnom: Parser = js.native
  
  inline def nomnom_=(x: Parser): Unit = js.Dynamic.global.updateDynamic("_nomnom")(x.asInstanceOf[js.Any])
  
  object NomnomInternal {
    
    /**
      * The command-line parser.
      */
    object Parser
  }
}
