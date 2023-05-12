package typings.momentGuess

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(date: Date): js.Array[Format] | Format = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[Format] | Format]
  inline def apply(date: Date, format: String): js.Array[Format] | Format = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Array[Format] | Format]
  
  @JSImport("moment-guess", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Date = String
  
  type Format = String
}
