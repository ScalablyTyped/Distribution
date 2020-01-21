package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProvider extends js.Object {
  var resolveLink: js.UndefOr[
    js.Function2[/* link */ ILink, /* token */ CancellationToken, ProviderResult[ILink]]
  ] = js.undefined
  def provideLinks(model: ITextModel, token: CancellationToken): ProviderResult[ILinksList]
}

object LinkProvider {
  @scala.inline
  def apply(
    provideLinks: (ITextModel, CancellationToken) => ProviderResult[ILinksList],
    resolveLink: (/* link */ ILink, /* token */ CancellationToken) => ProviderResult[ILink] = null
  ): LinkProvider = {
    val __obj = js.Dynamic.literal(provideLinks = js.Any.fromFunction2(provideLinks))
    if (resolveLink != null) __obj.updateDynamic("resolveLink")(js.Any.fromFunction2(resolveLink))
    __obj.asInstanceOf[LinkProvider]
  }
}

