package typings.pWaterfall

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-waterfall", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(tasks: js.Iterable[Task[Any, Any]]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def default(tasks: js.Iterable[Task[Any, Any]], initialValue: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def default[ReturnType](tasks: js.Array[InitialTask[ReturnType]]): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def default[ValueType1, ReturnType](tasks: js.Array[Task[ValueType1, ReturnType]], initialValue: ValueType1): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  inline def default[ValueType1, ReturnType](tasks: js.Tuple2[InitialTask[ValueType1], Task[ValueType1, ReturnType]]): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def default[ValueType1, ValueType2, ReturnType](
    tasks: js.Tuple2[Task[ValueType1, ValueType2], Task[ValueType2, ReturnType]],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  inline def default[ValueType1, ValueType2, ReturnType](
    tasks: js.Tuple3[InitialTask[ValueType1], Task[ValueType1, ValueType2], Task[ValueType2, ReturnType]]
  ): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def default[ValueType1, ValueType2, ValueType3, ReturnType](
    tasks: js.Tuple3[
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  inline def default[ValueType1, ValueType2, ValueType3, ReturnType](
    tasks: js.Tuple4[
      InitialTask[ValueType1], 
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ReturnType]
    ]
  ): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def default[ValueType1, ValueType2, ValueType3, ValueType4, ReturnType](
    tasks: js.Tuple4[
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ValueType4], 
      Task[ValueType4, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  inline def default[ValueType1, ValueType2, ValueType3, ValueType4, ReturnType](
    tasks: js.Tuple5[
      InitialTask[ValueType1], 
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ValueType4], 
      Task[ValueType4, ReturnType]
    ]
  ): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def default[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ReturnType](
    tasks: js.Tuple5[
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ValueType4], 
      Task[ValueType4, ValueType5], 
      Task[ValueType5, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  inline def default[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ReturnType](
    tasks: js.Tuple6[
      InitialTask[ValueType1], 
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ValueType4], 
      Task[ValueType4, ValueType5], 
      Task[ValueType5, ReturnType]
    ]
  ): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def default[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ReturnType](
    tasks: js.Tuple6[
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ValueType4], 
      Task[ValueType4, ValueType5], 
      Task[ValueType5, ValueType6], 
      Task[ValueType6, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  inline def default[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ReturnType](
    tasks: js.Tuple7[
      InitialTask[ValueType1], 
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ValueType4], 
      Task[ValueType4, ValueType5], 
      Task[ValueType5, ValueType6], 
      Task[ValueType6, ReturnType]
    ]
  ): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def default[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ReturnType](
    tasks: js.Tuple7[
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ValueType4], 
      Task[ValueType4, ValueType5], 
      Task[ValueType5, ValueType6], 
      Task[ValueType6, ValueType7], 
      Task[ValueType7, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  inline def default[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ReturnType](
    tasks: js.Tuple8[
      InitialTask[ValueType1], 
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ValueType4], 
      Task[ValueType4, ValueType5], 
      Task[ValueType5, ValueType6], 
      Task[ValueType6, ValueType7], 
      Task[ValueType7, ReturnType]
    ]
  ): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def default[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8, ReturnType](
    tasks: js.Tuple8[
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ValueType4], 
      Task[ValueType4, ValueType5], 
      Task[ValueType5, ValueType6], 
      Task[ValueType6, ValueType7], 
      Task[ValueType7, ValueType8], 
      Task[ValueType8, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  
  type InitialTask[ReturnType] = js.Function0[ReturnType | PromiseLike[ReturnType]]
  
  type Task[ValueType, ReturnType] = js.Function1[/* previousValue */ ValueType, ReturnType | PromiseLike[ReturnType]]
}
