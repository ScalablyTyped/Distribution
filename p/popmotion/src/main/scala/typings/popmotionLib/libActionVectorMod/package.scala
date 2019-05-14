package typings
package popmotionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libActionVectorMod {
  type ActionFactory = js.Function1[/* props */ Props, popmotionLib.libActionMod.Action]
  type ActionMap = org.scalablytyped.runtime.StringDictionary[popmotionLib.libActionMod.Action]
  type Props = org.scalablytyped.runtime.StringDictionary[js.Any]
  type TypeTest = js.Function1[/* v */ js.Any, scala.Boolean]
  type TypeTestMap = org.scalablytyped.runtime.StringDictionary[TypeTest]
  type VectorActionFactory = js.Function2[/* init */ ActionFactory, /* typeTests */ TypeTestMap, ActionFactory]
}
