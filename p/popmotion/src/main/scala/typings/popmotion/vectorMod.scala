package typings.popmotion

import org.scalablytyped.runtime.StringDictionary
import typings.popmotion.actionMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/action/vector", JSImport.Namespace)
@js.native
object vectorMod extends js.Object {
  val default: VectorActionFactory = js.native
  type ActionFactory = js.Function1[/* props */ Props, Action]
  type ActionMap = StringDictionary[Action]
  type Props = StringDictionary[js.Any]
  type TypeTest = js.Function1[/* v */ js.Any, Boolean]
  type TypeTestMap = StringDictionary[TypeTest]
  type VectorActionFactory = js.Function2[/* init */ ActionFactory, /* typeTests */ TypeTestMap, ActionFactory]
}

