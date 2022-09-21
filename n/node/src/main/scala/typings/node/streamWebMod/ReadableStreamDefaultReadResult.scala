package typings.node.streamWebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.node.streamWebMod.ReadableStreamDefaultReadValueResult[T]
  - typings.node.streamWebMod.ReadableStreamDefaultReadDoneResult
*/
trait ReadableStreamDefaultReadResult[T] extends StObject
object ReadableStreamDefaultReadResult {
  
  inline def ReadableStreamDefaultReadDoneResult(value: Unit): typings.node.streamWebMod.ReadableStreamDefaultReadDoneResult = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.node.streamWebMod.ReadableStreamDefaultReadDoneResult]
  }
  
  inline def ReadableStreamDefaultReadValueResult[T](value: T): typings.node.streamWebMod.ReadableStreamDefaultReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.node.streamWebMod.ReadableStreamDefaultReadValueResult[T]]
  }
}
