package typings.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libReactionsValueMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.popmotion.Anon_InitialSubscription
  import typings.popmotion.libObserverTypesMod.ObserverProps

  type Value = Double | String | ValueMap | ValueList
  type ValueList = js.Array[Double | String]
  type ValueMap = StringDictionary[Double | String]
  type ValueProps = ObserverProps with Anon_InitialSubscription
}
