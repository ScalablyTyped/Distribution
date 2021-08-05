package typings.objectMap

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[TInput, TOutput, TThis](
    target: StringDictionary[TInput],
    callback: js.ThisFunction3[
      /* this */ TThis, 
      /* currentValue */ TInput, 
      /* key */ String, 
      /* object */ StringDictionary[TInput], 
      TOutput
    ]
  ): StringDictionary[TOutput] = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[TOutput]]
  inline def apply[TInput, TOutput, TThis](
    target: StringDictionary[TInput],
    callback: js.ThisFunction3[
      /* this */ TThis, 
      /* currentValue */ TInput, 
      /* key */ String, 
      /* object */ StringDictionary[TInput], 
      TOutput
    ],
    thisArg: TThis
  ): StringDictionary[TOutput] = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[TOutput]]
  
  @JSImport("object-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
