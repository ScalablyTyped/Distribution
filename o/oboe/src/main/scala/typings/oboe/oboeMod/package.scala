package typings.oboe

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oboeMod {
  type CallbackSignature = js.Function3[
    /* node */ js.Any, 
    /* pathOrHeaders */ js.Any, 
    /* ancestors */ js.Array[js.Object], 
    js.Any
  ]
  type PatternMap = StringDictionary[CallbackSignature]
}
