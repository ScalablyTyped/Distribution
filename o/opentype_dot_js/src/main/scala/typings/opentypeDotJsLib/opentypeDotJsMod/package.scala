package typings
package opentypeDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object opentypeDotJsMod {
  type Contour = js.Array[Point]
  type FontConstructorOptions = FontConstructorOptionsBase with stdLib.Partial[FontOptions] with opentypeDotJsLib.Anon_Glyphs
  type KerningPairs = org.scalablytyped.runtime.StringDictionary[scala.Double]
  type LocalizedName = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Substitution = js.Function1[/* font */ Font, js.Any]
}
