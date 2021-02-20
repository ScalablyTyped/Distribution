package typings.memoizeOne

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("memoize-one", JSImport.Default)
  @js.native
  def default[ResultFn /* <: js.ThisFunction1[/* this */ js.Any, /* repeated */ js.Any, ReturnType[ResultFn]] */](resultFn: ResultFn): ResultFn = js.native
  @JSImport("memoize-one", JSImport.Default)
  @js.native
  def default[ResultFn /* <: js.ThisFunction1[/* this */ js.Any, /* repeated */ js.Any, ReturnType[ResultFn]] */](resultFn: ResultFn, isEqual: EqualityFn): ResultFn = js.native
  
  type EqualityFn = js.Function2[/* newArgs */ js.Array[js.Any], /* lastArgs */ js.Array[js.Any], Boolean]
}
