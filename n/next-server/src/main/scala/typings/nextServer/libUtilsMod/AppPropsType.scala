package typings.nextServer.libUtilsMod

import typings.nextServer.routerMod.NextRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next-server.next-server/dist/lib/utils.AppInitialProps & {  Component :next-server.next-server/dist/lib/utils.NextComponentType<next-server.next-server/dist/lib/utils.NextPageContext, any, P>,   router :R} */
@js.native
trait AppPropsType[R /* <: NextRouter */, P] extends js.Object {
  var Component: NextComponentType[NextPageContext, _, P] = js.native
  var pageProps: js.Any = js.native
  var router: R = js.native
}

object AppPropsType {
  @scala.inline
  def apply[/* <: typings.nextServer.routerMod.NextRouter */ R, P](Component: NextComponentType[NextPageContext, _, P], pageProps: js.Any, router: R): AppPropsType[R, P] = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], pageProps = pageProps.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppPropsType[R, P]]
  }
  @scala.inline
  implicit class AppPropsTypeOps[Self <: AppPropsType[_, _], /* <: typings.nextServer.routerMod.NextRouter */ R, P] (val x: Self with (AppPropsType[R, P])) extends AnyVal {
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
    def setComponent(value: NextComponentType[NextPageContext, _, P]): Self = this.set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageProps(value: js.Any): Self = this.set("pageProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouter(value: R): Self = this.set("router", value.asInstanceOf[js.Any])
  }
  
}

