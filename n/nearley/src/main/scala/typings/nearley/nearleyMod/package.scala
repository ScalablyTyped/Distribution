package typings.nearley

import org.scalablytyped.runtime.StringDictionary
import typings.nearley.Anon_Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nearleyMod {
  type LexerState = StringDictionary[js.Any]
  type Postprocessor = js.Function3[/* data */ js.Array[js.Any], /* reference */ Double, /* wantedBy */ js.Object, Unit]
  type Token = String | Anon_Value
}
