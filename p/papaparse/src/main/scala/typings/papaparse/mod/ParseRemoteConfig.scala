package typings.papaparse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.papaparse.mod.ParseRemoteConfigStep[T]
  - typings.papaparse.mod.ParseRemoteConfigNoStep[T]
*/
trait ParseRemoteConfig[T] extends StObject
object ParseRemoteConfig {
  
  inline def ParseRemoteConfigNoStep[T](complete: (ParseResult[T], String) => Unit): typings.papaparse.mod.ParseRemoteConfigNoStep[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction2(complete), download = true)
    __obj.asInstanceOf[typings.papaparse.mod.ParseRemoteConfigNoStep[T]]
  }
  
  inline def ParseRemoteConfigStep[T](step: (ParseStepResult[T], Parser) => Unit): typings.papaparse.mod.ParseRemoteConfigStep[T] = {
    val __obj = js.Dynamic.literal(download = true, step = js.Any.fromFunction2(step))
    __obj.asInstanceOf[typings.papaparse.mod.ParseRemoteConfigStep[T]]
  }
}
