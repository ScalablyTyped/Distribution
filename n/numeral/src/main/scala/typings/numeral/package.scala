package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object numeral {
  import org.scalablytyped.runtime.StringDictionary

  type NumeralJSLocales = StringDictionary[NumeralJSLocale]
  type RoundingFunction = js.Function1[/* value */ Double, Double]
}
