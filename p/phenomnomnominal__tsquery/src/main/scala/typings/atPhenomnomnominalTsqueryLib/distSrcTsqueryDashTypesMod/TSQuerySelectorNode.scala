package typings
package atPhenomnomnominalTsqueryLib.distSrcTsqueryDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSQuerySelectorNode
  extends /* key */ org.scalablytyped.runtime.StringDictionary[
      TSQuerySelectorNode | js.Array[TSQuerySelectorNode] | stdLib.RegExp | scala.Boolean | scala.Double | java.lang.String
    ] {
  var index: TSQuerySelectorNode
  var left: TSQuerySelectorNode
  var name: java.lang.String
  var operator: atPhenomnomnominalTsqueryLib.atPhenomnomnominalTsqueryLibStrings.`=` | atPhenomnomnominalTsqueryLib.atPhenomnomnominalTsqueryLibStrings.`!=` | atPhenomnomnominalTsqueryLib.atPhenomnomnominalTsqueryLibStrings.`<=` | atPhenomnomnominalTsqueryLib.atPhenomnomnominalTsqueryLibStrings.`<` | atPhenomnomnominalTsqueryLib.atPhenomnomnominalTsqueryLibStrings.`>=` | atPhenomnomnominalTsqueryLib.atPhenomnomnominalTsqueryLibStrings.`>`
  var right: TSQuerySelectorNode
  var selectors: js.Array[TSQuerySelectorNode]
  var subject: scala.Boolean
  var `type`: TSQueryAttributeOperatorType
  var value: TSQuerySelectorNode | stdLib.RegExp | scala.Double | java.lang.String
}

object TSQuerySelectorNode {
  @scala.inline
  def apply(
    index: TSQuerySelectorNode,
    left: TSQuerySelectorNode,
    name: java.lang.String,
    operator: atPhenomnomnominalTsqueryLib.atPhenomnomnominalTsqueryLibStrings.`=` | atPhenomnomnominalTsqueryLib.atPhenomnomnominalTsqueryLibStrings.`!=` | atPhenomnomnominalTsqueryLib.atPhenomnomnominalTsqueryLibStrings.`<=` | atPhenomnomnominalTsqueryLib.atPhenomnomnominalTsqueryLibStrings.`<` | atPhenomnomnominalTsqueryLib.atPhenomnomnominalTsqueryLibStrings.`>=` | atPhenomnomnominalTsqueryLib.atPhenomnomnominalTsqueryLibStrings.`>`,
    right: TSQuerySelectorNode,
    selectors: js.Array[TSQuerySelectorNode],
    subject: scala.Boolean,
    `type`: TSQueryAttributeOperatorType,
    value: TSQuerySelectorNode | stdLib.RegExp | scala.Double | java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[
      TSQuerySelectorNode | js.Array[TSQuerySelectorNode] | stdLib.RegExp | scala.Boolean | scala.Double | java.lang.String
    ] = null
  ): TSQuerySelectorNode = {
    val __obj = js.Dynamic.literal(index = index, left = left, name = name, operator = operator.asInstanceOf[js.Any], right = right, selectors = selectors, subject = subject, value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TSQuerySelectorNode]
  }
}

