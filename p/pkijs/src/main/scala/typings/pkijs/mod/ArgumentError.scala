package typings.pkijs.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentError
  extends StObject
     with Error
object ArgumentError {
  
  inline def apply(message: String, name: String): ArgumentError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentError]
  }
}
