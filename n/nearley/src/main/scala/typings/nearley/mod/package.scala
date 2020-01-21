package typings.nearley

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LexerState = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Postprocessor = js.Function3[
    /* data */ js.Array[js.Any], 
    /* reference */ js.UndefOr[scala.Double], 
    /* wantedBy */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type Token = java.lang.String | typings.nearley.AnonValue
}
