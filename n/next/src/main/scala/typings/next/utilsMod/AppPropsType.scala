package typings.next.utilsMod

import typings.next.routerMod.NextRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next.next/dist/next-server/lib/utils.AppInitialProps & {  Component  :next.next/dist/next-server/lib/utils.NextComponentType<next.next/dist/next-server/lib/utils.NextPageContext, any, P>,   router  :R,   __N_SSG ? :boolean,   __N_SSP ? :boolean} */
trait AppPropsType[R /* <: NextRouter */, P] extends js.Object {
  var Component: NextComponentType[NextPageContext, _, P]
  var __N_SSG: js.UndefOr[Boolean] = js.undefined
  var __N_SSP: js.UndefOr[Boolean] = js.undefined
  var pageProps: js.Any
  var router: R
}

object AppPropsType {
  @scala.inline
  def apply[/* <: typings.next.routerMod.NextRouter */ R, P](
    Component: NextComponentType[NextPageContext, _, P],
    pageProps: js.Any,
    router: R,
    __N_SSG: js.UndefOr[Boolean] = js.undefined,
    __N_SSP: js.UndefOr[Boolean] = js.undefined
  ): AppPropsType[R, P] = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], pageProps = pageProps.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
    if (!js.isUndefined(__N_SSG)) __obj.updateDynamic("__N_SSG")(__N_SSG.get.asInstanceOf[js.Any])
    if (!js.isUndefined(__N_SSP)) __obj.updateDynamic("__N_SSP")(__N_SSP.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppPropsType[R, P]]
  }
}

