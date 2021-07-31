package typings.memoizeOne

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("memoize-one", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[ResultFn /* <: js.ThisFunction1[/* this */ js.Any, /* repeated */ js.Any, ReturnType[ResultFn]] */](resultFn: ResultFn): ResultFn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(resultFn.asInstanceOf[js.Any]).asInstanceOf[ResultFn]
  @scala.inline
  def default[ResultFn /* <: js.ThisFunction1[/* this */ js.Any, /* repeated */ js.Any, ReturnType[ResultFn]] */](resultFn: ResultFn, isEqual: EqualityFn): ResultFn = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(resultFn.asInstanceOf[js.Any], isEqual.asInstanceOf[js.Any])).asInstanceOf[ResultFn]
  
  type EqualityFn = js.Function2[/* newArgs */ js.Array[js.Any], /* lastArgs */ js.Array[js.Any], Boolean]
}
