package typings.officeUiFabricReact.useKeytipDataMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeytipData extends js.Object {
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  var executeElementAttributes: StringDictionary[js.UndefOr[String]]
  var targetElementAttributes: StringDictionary[js.UndefOr[String]]
}

object IKeytipData {
  @scala.inline
  def apply(
    executeElementAttributes: StringDictionary[js.UndefOr[String]],
    targetElementAttributes: StringDictionary[js.UndefOr[String]],
    ariaDescribedBy: String = null
  ): IKeytipData = {
    val __obj = js.Dynamic.literal(executeElementAttributes = executeElementAttributes.asInstanceOf[js.Any], targetElementAttributes = targetElementAttributes.asInstanceOf[js.Any])
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipData]
  }
}

