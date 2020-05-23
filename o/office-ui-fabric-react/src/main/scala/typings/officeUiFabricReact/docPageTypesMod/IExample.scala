package typings.officeUiFabricReact.docPageTypesMod

import typings.officeUiFabricReact.anon.Root
import typings.officeUiFabricReact.anon.Theme
import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExample extends js.Object {
  /** Raw source code of the example */
  var code: String
  /** JS String for codepen of the example */
  var codepenJS: js.UndefOr[String] = js.undefined
  var isScrollable: js.UndefOr[Boolean] = js.undefined
  /** Custom styles. Partial version of `IExampleCardProps['styles']`. */
  var styles: js.UndefOr[IStyleFunctionOrObject[Theme, Root]] = js.undefined
  /** Title of the example */
  var title: String
  /** Working example of the example */
  var view: Element
}

object IExample {
  @scala.inline
  def apply(
    code: String,
    title: String,
    view: Element,
    codepenJS: String = null,
    isScrollable: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[Theme, Root] = null
  ): IExample = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    if (codepenJS != null) __obj.updateDynamic("codepenJS")(codepenJS.asInstanceOf[js.Any])
    if (!js.isUndefined(isScrollable)) __obj.updateDynamic("isScrollable")(isScrollable.get.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExample]
  }
}

