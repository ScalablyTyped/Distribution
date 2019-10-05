package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.CancellationToken
import typings.monacoDashEditor.monacoDashEditorMod.IDisposable
import typings.monacoDashEditor.monacoDashEditorMod.IEvent
import typings.monacoDashEditor.monacoDashEditorMod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeLensProvider extends js.Object {
  var onDidChange: js.UndefOr[IEvent[this.type]] = js.undefined
  var resolveCodeLens: js.UndefOr[
    js.Function3[
      /* model */ ITextModel, 
      /* codeLens */ CodeLens, 
      /* token */ CancellationToken, 
      ProviderResult[CodeLens]
    ]
  ] = js.undefined
  def provideCodeLenses(model: ITextModel, token: CancellationToken): ProviderResult[CodeLensList]
}

object CodeLensProvider {
  @scala.inline
  def apply(
    provideCodeLenses: (ITextModel, CancellationToken) => ProviderResult[CodeLensList],
    onDidChange: (/* listener */ js.Function1[CodeLensProvider, js.Any], /* thisArg */ js.UndefOr[js.Any]) => IDisposable = null,
    resolveCodeLens: (/* model */ ITextModel, /* codeLens */ CodeLens, /* token */ CancellationToken) => ProviderResult[CodeLens] = null
  ): CodeLensProvider = {
    val __obj = js.Dynamic.literal(provideCodeLenses = js.Any.fromFunction2(provideCodeLenses))
    if (onDidChange != null) __obj.updateDynamic("onDidChange")(js.Any.fromFunction2(onDidChange))
    if (resolveCodeLens != null) __obj.updateDynamic("resolveCodeLens")(js.Any.fromFunction3(resolveCodeLens))
    __obj.asInstanceOf[CodeLensProvider]
  }
}

