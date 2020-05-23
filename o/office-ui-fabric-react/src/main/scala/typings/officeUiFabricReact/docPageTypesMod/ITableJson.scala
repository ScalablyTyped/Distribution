package typings.officeUiFabricReact.docPageTypesMod

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
  var members: js.UndefOr[js.Array[IEnumTableRowJson | ITableRowJson]] = js.undefined
  var name: String
}

object ITableJson {
  @scala.inline
  def apply(
    description: String,
    extendsTokens: js.Array[ILinkToken],
    kind: ApiKind,
    name: String,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    deprecatedMessage: String = null,
    members: js.Array[IEnumTableRowJson | ITableRowJson] = null
  ): ITableJson = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], extendsTokens = extendsTokens.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.get.asInstanceOf[js.Any])
    if (deprecatedMessage != null) __obj.updateDynamic("deprecatedMessage")(deprecatedMessage.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableJson]
  }
}

