package typings.nivoColors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ColorIdentityFunction[D] = js.Function1[/* datum */ D, java.lang.String | scala.Double]
  type ColorModifier = js.Tuple2[typings.nivoColors.mod.ColorModifierType, scala.Double]
  type CustomColorFunction[D] = js.Function1[/* datum */ D, java.lang.String]
  type DatumIdentity[D] = java.lang.String | typings.nivoColors.mod.DatumIdentityFunction[D]
  type DatumIdentityFunction[D] = js.Function1[/* datum */ D, java.lang.String | scala.Double]
  type InheritedColorFunction[D] = js.Function1[/* datum */ D, java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.nivoColors.anon.Theme
    - typings.nivoColors.anon.From
    - typings.nivoColors.mod.InheritedColorFunction[D]
  */
  type InheritedColorProp[D] = typings.nivoColors.mod._InheritedColorProp[D] | java.lang.String | typings.nivoColors.mod.InheritedColorFunction[D]
  type OrdinalColorScale[D] = js.Function1[/* datum */ D, java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - typings.nivoColors.mod.DatumColorInstruction
    - typings.nivoColors.mod.SchemeColorInstruction
    - typings.nivoColors.mod.CustomColorFunction[D]
    - js.Array[java.lang.String]
    - java.lang.String
  */
  type OrdinalColorsInstruction[D] = typings.nivoColors.mod._OrdinalColorsInstruction[D] | js.Array[java.lang.String] | typings.nivoColors.mod.CustomColorFunction[D] | java.lang.String
}
