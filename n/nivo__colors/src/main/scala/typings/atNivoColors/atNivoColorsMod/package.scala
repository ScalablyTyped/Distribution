package typings.atNivoColors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoColorsMod {
  type ColorIdentityFunction[D] = js.Function1[/* datum */ D, String | Double]
  type ColorModifier = js.Tuple2[ColorModifierType, Double]
  type CustomColorFunction[D] = js.Function1[/* datum */ D, String]
  type DatumIdentity[D] = String | DatumIdentityFunction[D]
  type DatumIdentityFunction[D] = js.Function1[/* datum */ D, String | Double]
  type InheritedColorFunction[D] = js.Function1[/* datum */ D, String]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.atNivoColors.Anon_Theme
    - typings.atNivoColors.Anon_From
    - typings.atNivoColors.atNivoColorsMod.InheritedColorFunction[D]
  */
  type InheritedColorProp[D] = _InheritedColorProp[D] | String | InheritedColorFunction[D]
  type OrdinalColorScale[D] = js.Function1[/* datum */ D, String]
  /* Rewritten from type alias, can be one of: 
    - typings.atNivoColors.atNivoColorsMod.DatumColorInstruction
    - typings.atNivoColors.atNivoColorsMod.SchemeColorInstruction
    - typings.atNivoColors.atNivoColorsMod.CustomColorFunction[D]
    - js.Array[java.lang.String]
    - java.lang.String
  */
  type OrdinalColorsInstruction[D] = _OrdinalColorsInstruction[D] | js.Array[String] | CustomColorFunction[D] | String
}
