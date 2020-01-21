package typings.officeUiFabricReact.contextualMenuCheckmarksExampleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuMultiselectExampleState extends js.Object {
  var selection: js.UndefOr[StringDictionary[Boolean]] = js.undefined
}

object IContextualMenuMultiselectExampleState {
  @scala.inline
  def apply(selection: StringDictionary[Boolean] = null): IContextualMenuMultiselectExampleState = {
    val __obj = js.Dynamic.literal()
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuMultiselectExampleState]
  }
}

