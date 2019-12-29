package typings.nearley

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nearleyMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.nearley.Anon_Value

  type LexerState = StringDictionary[js.Any]
  type Postprocessor = js.Function3[
    /* data */ js.Array[js.Any], 
    /* reference */ js.UndefOr[Double], 
    /* wantedBy */ js.UndefOr[js.Object], 
    Unit
  ]
  type Token = String | Anon_Value
}
