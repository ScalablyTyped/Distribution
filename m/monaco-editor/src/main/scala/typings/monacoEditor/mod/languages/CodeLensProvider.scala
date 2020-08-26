package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.IDisposable
import typings.monacoEditor.mod.IEvent
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeLensProvider extends js.Object {
  var onDidChange: js.UndefOr[IEvent[this.type]] = js.native
  var resolveCodeLens: js.UndefOr[
    js.Function3[
      /* model */ ITextModel, 
      /* codeLens */ CodeLens, 
      /* token */ CancellationToken, 
      ProviderResult[CodeLens]
    ]
  ] = js.native
  def provideCodeLenses(model: ITextModel, token: CancellationToken): ProviderResult[CodeLensList] = js.native
}

object CodeLensProvider {
  @scala.inline
  def apply(provideCodeLenses: (ITextModel, CancellationToken) => ProviderResult[CodeLensList]): CodeLensProvider = {
    val __obj = js.Dynamic.literal(provideCodeLenses = js.Any.fromFunction2(provideCodeLenses))
    __obj.asInstanceOf[CodeLensProvider]
  }
  @scala.inline
  implicit class CodeLensProviderOps[Self <: CodeLensProvider] (val x: Self) extends AnyVal {
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
    def setProvideCodeLenses(value: (ITextModel, CancellationToken) => ProviderResult[CodeLensList]): Self = this.set("provideCodeLenses", js.Any.fromFunction2(value))
    @scala.inline
    def setOnDidChange(
      value: (/* listener */ js.Function1[CodeLensProvider, js.Any], /* thisArg */ js.UndefOr[js.Any]) => IDisposable
    ): Self = this.set("onDidChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDidChange: Self = this.set("onDidChange", js.undefined)
    @scala.inline
    def setResolveCodeLens(
      value: (/* model */ ITextModel, /* codeLens */ CodeLens, /* token */ CancellationToken) => ProviderResult[CodeLens]
    ): Self = this.set("resolveCodeLens", js.Any.fromFunction3(value))
    @scala.inline
    def deleteResolveCodeLens: Self = this.set("resolveCodeLens", js.undefined)
  }
  
}

