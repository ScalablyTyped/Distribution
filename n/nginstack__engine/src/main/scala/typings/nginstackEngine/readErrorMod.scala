package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readErrorMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/xml/ReadError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/xml/ReadError", "CustomError")
  @js.native
  val CustomError: String = js.native
  
  @JSImport("@nginstack/engine/lib/xml/ReadError", "NoError")
  @js.native
  val NoError: String = js.native
  
  @JSImport("@nginstack/engine/lib/xml/ReadError", "NotWellFormedError")
  @js.native
  val NotWellFormedError: String = js.native
  
  @JSImport("@nginstack/engine/lib/xml/ReadError", "PrematureEndOfDocumentError")
  @js.native
  val PrematureEndOfDocumentError: String = js.native
  
  @JSImport("@nginstack/engine/lib/xml/ReadError", "UnexpectedElementError")
  @js.native
  val UnexpectedElementError: String = js.native
  
  type ReadError = Any
}
