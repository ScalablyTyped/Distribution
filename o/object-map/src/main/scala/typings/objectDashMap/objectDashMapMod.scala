package typings.objectDashMap

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("object-map", JSImport.Namespace)
@js.native
object objectDashMapMod extends js.Object {
  def apply[TInput, TOutput, TThis](
    target: StringDictionary[TInput],
    callback: js.ThisFunction3[
      /* this */ TThis, 
      /* currentValue */ TInput, 
      /* key */ String, 
      /* object */ StringDictionary[TInput], 
      TOutput
    ]
  ): StringDictionary[TOutput] = js.native
  def apply[TInput, TOutput, TThis](
    target: StringDictionary[TInput],
    callback: js.ThisFunction3[
      /* this */ TThis, 
      /* currentValue */ TInput, 
      /* key */ String, 
      /* object */ StringDictionary[TInput], 
      TOutput
    ],
    thisArg: TThis
  ): StringDictionary[TOutput] = js.native
}

