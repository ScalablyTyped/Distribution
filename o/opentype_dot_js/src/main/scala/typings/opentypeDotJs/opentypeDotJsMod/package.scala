package typings.opentypeDotJs

import org.scalablytyped.runtime.StringDictionary
import typings.opentypeDotJs.Anon_Glyphs
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object opentypeDotJsMod {
  type Contour = js.Array[Point]
  type FontConstructorOptions = FontConstructorOptionsBase with Partial[FontOptions] with Anon_Glyphs
  type KerningPairs = StringDictionary[Double]
  type LocalizedName = StringDictionary[String]
  type Substitution = js.Function1[/* font */ Font, js.Any]
}
