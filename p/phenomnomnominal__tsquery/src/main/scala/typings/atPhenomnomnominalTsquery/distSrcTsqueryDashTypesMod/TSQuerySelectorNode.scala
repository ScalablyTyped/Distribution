package typings.atPhenomnomnominalTsquery.distSrcTsqueryDashTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPhenomnomnominalTsquery.atPhenomnomnominalTsqueryStrings.`!=`
import typings.atPhenomnomnominalTsquery.atPhenomnomnominalTsqueryStrings.`<=`
import typings.atPhenomnomnominalTsquery.atPhenomnomnominalTsqueryStrings.`<`
import typings.atPhenomnomnominalTsquery.atPhenomnomnominalTsqueryStrings.`=`
import typings.atPhenomnomnominalTsquery.atPhenomnomnominalTsqueryStrings.`>=`
import typings.atPhenomnomnominalTsquery.atPhenomnomnominalTsqueryStrings.`>`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSQuerySelectorNode
  extends /* key */ StringDictionary[
      TSQuerySelectorNode | js.Array[TSQuerySelectorNode] | RegExp | Boolean | Double | String
    ] {
  var index: TSQuerySelectorNode
  var left: TSQuerySelectorNode
  var name: String
  var operator: `=` | `!=` | `<=` | `<` | `>=` | `>`
  var right: TSQuerySelectorNode
  var selectors: js.Array[TSQuerySelectorNode]
  var subject: Boolean
  var `type`: TSQueryAttributeOperatorType
  var value: TSQuerySelectorNode | RegExp | Double | String
}

object TSQuerySelectorNode {
  @scala.inline
  def apply(
    index: TSQuerySelectorNode,
    left: TSQuerySelectorNode,
    name: String,
    operator: `=` | `!=` | `<=` | `<` | `>=` | `>`,
    right: TSQuerySelectorNode,
    selectors: js.Array[TSQuerySelectorNode],
    subject: Boolean,
    `type`: TSQueryAttributeOperatorType,
    value: TSQuerySelectorNode | RegExp | Double | String,
    StringDictionary: /* key */ StringDictionary[
      TSQuerySelectorNode | js.Array[TSQuerySelectorNode] | RegExp | Boolean | Double | String
    ] = null
  ): TSQuerySelectorNode = {
    val __obj = js.Dynamic.literal(index = index, left = left, name = name, operator = operator.asInstanceOf[js.Any], right = right, selectors = selectors, subject = subject, value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TSQuerySelectorNode]
  }
}

