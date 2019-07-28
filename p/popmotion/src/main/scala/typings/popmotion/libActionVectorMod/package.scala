package typings.popmotion

import org.scalablytyped.runtime.StringDictionary
import typings.popmotion.libActionMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libActionVectorMod {
  type ActionFactory = js.Function1[/* props */ Props, Action]
  type ActionMap = StringDictionary[Action]
  type Props = StringDictionary[js.Any]
  type TypeTest = js.Function1[/* v */ js.Any, Boolean]
  type TypeTestMap = StringDictionary[TypeTest]
  type VectorActionFactory = js.Function2[/* init */ ActionFactory, /* typeTests */ TypeTestMap, ActionFactory]
}
