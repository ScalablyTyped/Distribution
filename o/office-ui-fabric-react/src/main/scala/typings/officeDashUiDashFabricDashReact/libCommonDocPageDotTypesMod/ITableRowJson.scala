package typings.officeDashUiDashFabricDashReact.libCommonDocPageDotTypesMod

import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.method
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITableRowJson extends js.Object {
  var defaultValue: js.UndefOr[String] = js.undefined
  var deprecated: Boolean
  var deprecatedMessage: js.UndefOr[String] = js.undefined
  var description: String
  var kind: js.UndefOr[method | property] = js.undefined
  var name: String
  var required: js.UndefOr[Boolean] = js.undefined
  /**
    * The row's type translated to an array of text elements and links to other types.
    * For example, `Readonly<IFoo>` would translate to:
    * `[{ text: 'Readonly<' }, { text: 'IFoo', hyperlinkedPage: '(page name)', pageKind: '(kind)' }, { text: '>' }]`
    */
  var typeTokens: js.Array[ILinkToken]
}

object ITableRowJson {
  @scala.inline
  def apply(
    deprecated: Boolean,
    description: String,
    name: String,
    typeTokens: js.Array[ILinkToken],
    defaultValue: String = null,
    deprecatedMessage: String = null,
    kind: method | property = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): ITableRowJson = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeTokens = typeTokens.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (deprecatedMessage != null) __obj.updateDynamic("deprecatedMessage")(deprecatedMessage.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableRowJson]
  }
}

