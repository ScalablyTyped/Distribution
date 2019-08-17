package typings.oboe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oboeMod {
  import org.scalablytyped.runtime.StringDictionary

  type CallbackSignature = js.Function3[
    /* node */ js.Any, 
    /* pathOrHeaders */ js.Any, 
    /* ancestors */ js.Array[js.Object], 
    js.Any
  ]
  type PatternMap = StringDictionary[CallbackSignature]
}
