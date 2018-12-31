package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemGroupDefinition extends PropertyDefinition {
  var auth: js.UndefOr[RequestAuthDefinition] = js.undefined
  var event: js.UndefOr[js.Array[EventDefinition]] = js.undefined
  var item: js.UndefOr[js.Array[ItemDefinition | ItemGroupDefinition]] = js.undefined
}

