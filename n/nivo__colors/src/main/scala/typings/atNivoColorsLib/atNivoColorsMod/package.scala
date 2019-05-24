package typings
package atNivoColorsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoColorsMod {
  type ColorIdentityFunction[D] = js.Function1[/* datum */ D, java.lang.String | scala.Double]
  type ColorModifier = js.Tuple2[ColorModifierType, scala.Double]
  type CustomColorFunction[D] = js.Function1[/* datum */ D, java.lang.String]
  type DatumIdentity[D] = java.lang.String | DatumIdentityFunction[D]
  type DatumIdentityFunction[D] = js.Function1[/* datum */ D, java.lang.String | scala.Double]
  type InheritedColorFunction[D] = js.Function1[/* datum */ D, java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - atNivoColorsLib.Anon_Theme
    - atNivoColorsLib.Anon_From
    - InheritedColorFunction[D]
  */
  type InheritedColorProp[D] = _InheritedColorProp[D] | java.lang.String | InheritedColorFunction[D]
  type OrdinalColorScale[D] = js.Function1[/* datum */ D, java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - DatumColorInstruction
    - SchemeColorInstruction
    - CustomColorFunction[D]
    - js.Array[java.lang.String]
    - java.lang.String
  */
  type OrdinalColorsInstruction[D] = _OrdinalColorsInstruction[D] | js.Array[java.lang.String] | CustomColorFunction[D] | java.lang.String
}
