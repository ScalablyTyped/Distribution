package typings
package objectDashMapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("object-map", JSImport.Namespace)
@js.native
object objectDashMapMod extends js.Object {
  def apply[TInput, TOutput, TThis](
    target: ScalablyTyped.runtime.StringDictionary[TInput],
    callback: js.ThisFunction3[
      /* this */ TThis, 
      /* currentValue */ TInput, 
      /* key */ java.lang.String, 
      /* object */ ScalablyTyped.runtime.StringDictionary[TInput], 
      TOutput
    ]
  ): ScalablyTyped.runtime.StringDictionary[TOutput] = js.native
  def apply[TInput, TOutput, TThis](
    target: ScalablyTyped.runtime.StringDictionary[TInput],
    callback: js.ThisFunction3[
      /* this */ TThis, 
      /* currentValue */ TInput, 
      /* key */ java.lang.String, 
      /* object */ ScalablyTyped.runtime.StringDictionary[TInput], 
      TOutput
    ],
    thisArg: TThis
  ): ScalablyTyped.runtime.StringDictionary[TOutput] = js.native
}

