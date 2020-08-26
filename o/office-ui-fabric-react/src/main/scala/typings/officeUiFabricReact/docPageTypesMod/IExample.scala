package typings.officeUiFabricReact.docPageTypesMod

import typings.officeUiFabricReact.anon.Root
import typings.officeUiFabricReact.anon.Theme
import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExample extends js.Object {
  /** Raw source code of the example */
  var code: String = js.native
  /** JS String for codepen of the example */
  var codepenJS: js.UndefOr[String] = js.native
  var isScrollable: js.UndefOr[Boolean] = js.native
  /** Custom styles. Partial version of `IExampleCardProps['styles']`. */
  var styles: js.UndefOr[IStyleFunctionOrObject[Theme, Root]] = js.native
  /** Title of the example */
  var title: String = js.native
  /** Working example of the example */
  var view: Element = js.native
}

object IExample {
  @scala.inline
  def apply(code: String, title: String, view: Element): IExample = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExample]
  }
  @scala.inline
  implicit class IExampleOps[Self <: IExample] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: Element): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodepenJS(value: String): Self = this.set("codepenJS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodepenJS: Self = this.set("codepenJS", js.undefined)
    @scala.inline
    def setIsScrollable(value: Boolean): Self = this.set("isScrollable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsScrollable: Self = this.set("isScrollable", js.undefined)
    @scala.inline
    def setStylesFunction1(value: Theme => DeepPartial[Root]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[Theme, Root]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

