package typings.officeDashUiDashFabricDashReact.libCommonDocPageDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITableJson extends js.Object {
  var deprecated: js.UndefOr[Boolean] = js.undefined
  var deprecatedMessage: js.UndefOr[String] = js.undefined
  var description: String
  /**
    * Any types the item extends, translated to an array of text elements and links to other types.
    * For classes and interfaces only.
    */
  var extendsTokens: js.Array[ILinkToken]
  var kind: ApiKind
  var members: js.Array[IEnumTableRowJson | ITableRowJson]
  var name: String
}

object ITableJson {
  @scala.inline
  def apply(
    description: String,
    extendsTokens: js.Array[ILinkToken],
    kind: ApiKind,
    members: js.Array[IEnumTableRowJson | ITableRowJson],
    name: String,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    deprecatedMessage: String = null
  ): ITableJson = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], extendsTokens = extendsTokens.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (deprecatedMessage != null) __obj.updateDynamic("deprecatedMessage")(deprecatedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableJson]
  }
}

