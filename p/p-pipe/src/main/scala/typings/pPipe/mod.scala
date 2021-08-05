package typings.pPipe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // Fallbacks if more than 9 functions are passed as input (not type-safe).
  inline def apply(functions: (UnaryFunction[js.Any, js.Any])*): Pipeline[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].apply(functions.asInstanceOf[js.Any]).asInstanceOf[Pipeline[js.Any, js.Any]]
  /**
  Compose promise-returning & async functions into a reusable pipeline.
  @param ...input - Iterated over sequentially when returned `function` is called.
  @returns The `input` functions are applied from left to right.
  @example
  ```
  import pPipe = require('p-pipe');
  const addUnicorn = async string => `${string} Unicorn`;
  const addRainbow = async string => `${string} Rainbow`;
  const pipeline = pPipe(addUnicorn, addRainbow);
  (async () => {
  	console.log(await pipeline('❤️'));
  	//=> '❤️ Unicorn Rainbow'
  })();
  ```
  */
  inline def apply[ValueType, ReturnType](f1: UnaryFunction[ValueType, ReturnType]): Pipeline[ValueType, ReturnType] = ^.asInstanceOf[js.Dynamic].apply(f1.asInstanceOf[js.Any]).asInstanceOf[Pipeline[ValueType, ReturnType]]
  inline def apply[ValueType, ResultValue1, ReturnType](f1: UnaryFunction[ValueType, ResultValue1], f2: UnaryFunction[ResultValue1, ReturnType]): Pipeline[ValueType, ReturnType] = (^.asInstanceOf[js.Dynamic].apply(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any])).asInstanceOf[Pipeline[ValueType, ReturnType]]
  inline def apply[ValueType, ResultValue1, ResultValue2, ReturnType](
    f1: UnaryFunction[ValueType, ResultValue1],
    f2: UnaryFunction[ResultValue1, ResultValue2],
    f3: UnaryFunction[ResultValue2, ReturnType]
  ): Pipeline[ValueType, ReturnType] = (^.asInstanceOf[js.Dynamic].apply(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], f3.asInstanceOf[js.Any])).asInstanceOf[Pipeline[ValueType, ReturnType]]
  inline def apply[ValueType, ResultValue1, ResultValue2, ResultValue3, ReturnType](
    f1: UnaryFunction[ValueType, ResultValue1],
    f2: UnaryFunction[ResultValue1, ResultValue2],
    f3: UnaryFunction[ResultValue2, ResultValue3],
    f4: UnaryFunction[ResultValue3, ReturnType]
  ): Pipeline[ValueType, ReturnType] = (^.asInstanceOf[js.Dynamic].apply(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], f3.asInstanceOf[js.Any], f4.asInstanceOf[js.Any])).asInstanceOf[Pipeline[ValueType, ReturnType]]
  inline def apply[ValueType, ResultValue1, ResultValue2, ResultValue3, ResultValue4, ReturnType](
    f1: UnaryFunction[ValueType, ResultValue1],
    f2: UnaryFunction[ResultValue1, ResultValue2],
    f3: UnaryFunction[ResultValue2, ResultValue3],
    f4: UnaryFunction[ResultValue3, ResultValue4],
    f5: UnaryFunction[ResultValue4, ReturnType]
  ): Pipeline[ValueType, ReturnType] = (^.asInstanceOf[js.Dynamic].apply(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], f3.asInstanceOf[js.Any], f4.asInstanceOf[js.Any], f5.asInstanceOf[js.Any])).asInstanceOf[Pipeline[ValueType, ReturnType]]
  inline def apply[ValueType, ResultValue1, ResultValue2, ResultValue3, ResultValue4, ResultValue5, ReturnType](
    f1: UnaryFunction[ValueType, ResultValue1],
    f2: UnaryFunction[ResultValue1, ResultValue2],
    f3: UnaryFunction[ResultValue2, ResultValue3],
    f4: UnaryFunction[ResultValue3, ResultValue4],
    f5: UnaryFunction[ResultValue4, ResultValue5],
    f6: UnaryFunction[ResultValue5, ReturnType]
  ): Pipeline[ValueType, ReturnType] = (^.asInstanceOf[js.Dynamic].apply(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], f3.asInstanceOf[js.Any], f4.asInstanceOf[js.Any], f5.asInstanceOf[js.Any], f6.asInstanceOf[js.Any])).asInstanceOf[Pipeline[ValueType, ReturnType]]
  inline def apply[ValueType, ResultValue1, ResultValue2, ResultValue3, ResultValue4, ResultValue5, ResultValue6, ReturnType](
    f1: UnaryFunction[ValueType, ResultValue1],
    f2: UnaryFunction[ResultValue1, ResultValue2],
    f3: UnaryFunction[ResultValue2, ResultValue3],
    f4: UnaryFunction[ResultValue3, ResultValue4],
    f5: UnaryFunction[ResultValue4, ResultValue5],
    f6: UnaryFunction[ResultValue5, ResultValue6],
    f7: UnaryFunction[ResultValue6, ReturnType]
  ): Pipeline[ValueType, ReturnType] = (^.asInstanceOf[js.Dynamic].apply(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], f3.asInstanceOf[js.Any], f4.asInstanceOf[js.Any], f5.asInstanceOf[js.Any], f6.asInstanceOf[js.Any], f7.asInstanceOf[js.Any])).asInstanceOf[Pipeline[ValueType, ReturnType]]
  inline def apply[ValueType, ResultValue1, ResultValue2, ResultValue3, ResultValue4, ResultValue5, ResultValue6, ResultValue7, ReturnType](
    f1: UnaryFunction[ValueType, ResultValue1],
    f2: UnaryFunction[ResultValue1, ResultValue2],
    f3: UnaryFunction[ResultValue2, ResultValue3],
    f4: UnaryFunction[ResultValue3, ResultValue4],
    f5: UnaryFunction[ResultValue4, ResultValue5],
    f6: UnaryFunction[ResultValue5, ResultValue6],
    f7: UnaryFunction[ResultValue6, ResultValue7],
    f8: UnaryFunction[ResultValue7, ReturnType]
  ): Pipeline[ValueType, ReturnType] = (^.asInstanceOf[js.Dynamic].apply(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], f3.asInstanceOf[js.Any], f4.asInstanceOf[js.Any], f5.asInstanceOf[js.Any], f6.asInstanceOf[js.Any], f7.asInstanceOf[js.Any], f8.asInstanceOf[js.Any])).asInstanceOf[Pipeline[ValueType, ReturnType]]
  inline def apply[ValueType, ResultValue1, ResultValue2, ResultValue3, ResultValue4, ResultValue5, ResultValue6, ResultValue7, ResultValue8, ReturnType](
    f1: UnaryFunction[ValueType, ResultValue1],
    f2: UnaryFunction[ResultValue1, ResultValue2],
    f3: UnaryFunction[ResultValue2, ResultValue3],
    f4: UnaryFunction[ResultValue3, ResultValue4],
    f5: UnaryFunction[ResultValue4, ResultValue5],
    f6: UnaryFunction[ResultValue5, ResultValue6],
    f7: UnaryFunction[ResultValue6, ResultValue7],
    f8: UnaryFunction[ResultValue7, ResultValue8],
    f9: UnaryFunction[ResultValue8, ReturnType]
  ): Pipeline[ValueType, ReturnType] = (^.asInstanceOf[js.Dynamic].apply(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], f3.asInstanceOf[js.Any], f4.asInstanceOf[js.Any], f5.asInstanceOf[js.Any], f6.asInstanceOf[js.Any], f7.asInstanceOf[js.Any], f8.asInstanceOf[js.Any], f9.asInstanceOf[js.Any])).asInstanceOf[Pipeline[ValueType, ReturnType]]
  
  @JSImport("p-pipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Pipeline[ValueType, ReturnType] = js.Function1[/* value */ js.UndefOr[ValueType], js.Promise[ReturnType]]
  
  type UnaryFunction[ValueType, ReturnType] = js.Function1[/* value */ ValueType, ReturnType | js.Thenable[ReturnType]]
}
