package typings.next

import typings.next.distNextDashServerLibUtilsMod.AppType
import typings.next.distNextDashServerLibUtilsMod.Enhancer
import typings.next.distNextDashServerLibUtilsMod.NextComponentType
import typings.next.distNextDashServerLibUtilsMod.NextPageContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnhanceApp extends js.Object {
  var enhanceApp: js.UndefOr[Enhancer[AppType]] = js.undefined
  var enhanceComponent: js.UndefOr[Enhancer[NextComponentType[NextPageContext, js.Object, js.Object]]] = js.undefined
}

object Anon_EnhanceApp {
  @scala.inline
  def apply(
    enhanceApp: AppType => AppType = null,
    enhanceComponent: NextComponentType[NextPageContext, js.Object, js.Object] => NextComponentType[NextPageContext, js.Object, js.Object] = null
  ): Anon_EnhanceApp = {
    val __obj = js.Dynamic.literal()
    if (enhanceApp != null) __obj.updateDynamic("enhanceApp")(js.Any.fromFunction1(enhanceApp))
    if (enhanceComponent != null) __obj.updateDynamic("enhanceComponent")(js.Any.fromFunction1(enhanceComponent))
    __obj.asInstanceOf[Anon_EnhanceApp]
  }
}

