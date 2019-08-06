package typings

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object numeral {
  type NumeralJSLocales = StringDictionary[NumeralJSLocale]
  type RoundingFunction = js.Function1[/* value */ Double, Double]
}
