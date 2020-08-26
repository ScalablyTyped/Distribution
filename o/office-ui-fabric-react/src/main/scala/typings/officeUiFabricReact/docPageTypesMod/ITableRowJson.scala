package typings.officeUiFabricReact.docPageTypesMod

import typings.officeUiFabricReact.officeUiFabricReactStrings.method
import typings.officeUiFabricReact.officeUiFabricReactStrings.property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITableRowJson extends js.Object {
  var defaultValue: js.UndefOr[String] = js.native
  var deprecated: Boolean = js.native
  var deprecatedMessage: js.UndefOr[String] = js.native
  var description: String = js.native
  var kind: js.UndefOr[method | property] = js.native
  var name: String = js.native
  var required: js.UndefOr[Boolean] = js.native
  /**
    * The row's type translated to an array of text elements and links to other types.
    * For example, `Readonly<IFoo>` would translate to:
    * `[{ text: 'Readonly<' }, { text: 'IFoo', hyperlinkedPage: '(page name)', pageKind: '(kind)' }, { text: '>' }]`
    */
  var typeTokens: js.Array[ILinkToken] = js.native
}

object ITableRowJson {
  @scala.inline
  def apply(deprecated: Boolean, description: String, name: String, typeTokens: js.Array[ILinkToken]): ITableRowJson = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeTokens = typeTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableRowJson]
  }
  @scala.inline
  implicit class ITableRowJsonOps[Self <: ITableRowJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeprecated(value: Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeTokensVarargs(value: ILinkToken*): Self = this.set("typeTokens", js.Array(value :_*))
    @scala.inline
    def setTypeTokens(value: js.Array[ILinkToken]): Self = this.set("typeTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDeprecatedMessage(value: String): Self = this.set("deprecatedMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecatedMessage: Self = this.set("deprecatedMessage", js.undefined)
    @scala.inline
    def setKind(value: method | property): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
  
}

