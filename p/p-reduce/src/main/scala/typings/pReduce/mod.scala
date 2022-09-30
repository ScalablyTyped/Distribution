package typings.pReduce

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-reduce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ValueType, ReducedValueType](
    input: js.Iterable[PromiseLike[ValueType] | ValueType],
    reducer: ReducerFunction[ValueType, ReducedValueType]
  ): js.Promise[ReducedValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReducedValueType]]
  inline def default[ValueType, ReducedValueType](
    input: js.Iterable[PromiseLike[ValueType] | ValueType],
    reducer: ReducerFunction[ValueType, ReducedValueType],
    initialValue: ReducedValueType
  ): js.Promise[ReducedValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReducedValueType]]
  
  type ReducerFunction[ValueType, ReducedValueType] = js.Function3[
    /* previousValue */ ReducedValueType, 
    /* currentValue */ ValueType, 
    /* index */ Double, 
    PromiseLike[ReducedValueType] | ReducedValueType
  ]
}
