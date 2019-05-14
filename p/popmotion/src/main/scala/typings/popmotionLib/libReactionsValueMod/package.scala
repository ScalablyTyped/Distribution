package typings
package popmotionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libReactionsValueMod {
  type Value = scala.Double | java.lang.String | ValueMap | ValueList
  type ValueList = js.Array[scala.Double | java.lang.String]
  type ValueMap = org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String]
  type ValueProps = popmotionLib.libObserverTypesMod.ObserverProps with popmotionLib.Anon_InitialSubscription
}
