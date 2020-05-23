package typings.nextServer.anon

import typings.nextServer.libUtilsMod.AppType
import typings.nextServer.libUtilsMod.Enhancer
import typings.nextServer.libUtilsMod.NextComponentType
import typings.nextServer.libUtilsMod.NextPageContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnhanceApp extends js.Object {
  var enhanceApp: js.UndefOr[Enhancer[AppType]] = js.undefined
  var enhanceComponent: js.UndefOr[Enhancer[NextComponentType[NextPageContext, js.Object, js.Object]]] = js.undefined
}

object EnhanceApp {
  @scala.inline
  def apply(
    enhanceApp: AppType => AppType = null,
    enhanceComponent: NextComponentType[NextPageContext, js.Object, js.Object] => NextComponentType[NextPageContext, js.Object, js.Object] = null
  ): EnhanceApp = {
    val __obj = js.Dynamic.literal()
    if (enhanceApp != null) __obj.updateDynamic("enhanceApp")(js.Any.fromFunction1(enhanceApp))
    if (enhanceComponent != null) __obj.updateDynamic("enhanceComponent")(js.Any.fromFunction1(enhanceComponent))
    __obj.asInstanceOf[EnhanceApp]
  }
}

