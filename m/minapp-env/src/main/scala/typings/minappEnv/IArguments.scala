package typings.minappEnv

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IArguments
  extends StObject
     with /* index */ NumberDictionary[Any] {
  
  var callee: Function = js.native
  
  /** Iterator */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Any]] = js.native
  
  var length: Double = js.native
}
