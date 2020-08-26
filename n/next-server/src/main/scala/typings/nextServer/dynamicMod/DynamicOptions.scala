package typings.nextServer.dynamicMod

import typings.nextServer.anon.Error
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next-server.next-server/dist/lib/dynamic.LoadableBaseOptions<P> & {  render :(props : P, loaded : any): react.react.<global>.JSX.Element | undefined} */
@js.native
trait DynamicOptions[P] extends js.Object {
  var loadableGenerated: js.UndefOr[LoadableGeneratedOptions] = js.native
  var loader: js.UndefOr[Loader[P] | LoaderMap] = js.native
  var loading: js.UndefOr[js.Function1[/* hasErrorIsLoadingPastDelay */ Error, Element | Null]] = js.native
  var modules: js.UndefOr[js.Function0[LoaderMap]] = js.native
  /**
    * @deprecated the modules option has been planned for removal
    */
  var render: js.UndefOr[js.Function2[/* props */ P, /* loaded */ js.Any, Element]] = js.native
  var ssr: js.UndefOr[Boolean] = js.native
  var webpack: js.UndefOr[js.Function0[_]] = js.native
}

object DynamicOptions {
  @scala.inline
  def apply[P](): DynamicOptions[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicOptions[P]]
  }
  @scala.inline
  implicit class DynamicOptionsOps[Self <: DynamicOptions[_], P] (val x: Self with DynamicOptions[P]) extends AnyVal {
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
    def setLoadableGenerated(value: LoadableGeneratedOptions): Self = this.set("loadableGenerated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadableGenerated: Self = this.set("loadableGenerated", js.undefined)
    @scala.inline
    def setLoaderFunction0(value: () => LoaderComponent[P]): Self = this.set("loader", js.Any.fromFunction0(value))
    @scala.inline
    def setLoader(value: Loader[P] | LoaderMap): Self = this.set("loader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    @scala.inline
    def setLoading(value: /* hasErrorIsLoadingPastDelay */ Error => Element | Null): Self = this.set("loading", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setModules(value: () => LoaderMap): Self = this.set("modules", js.Any.fromFunction0(value))
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    @scala.inline
    def setRender(value: (/* props */ P, /* loaded */ js.Any) => Element): Self = this.set("render", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setSsr(value: Boolean): Self = this.set("ssr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsr: Self = this.set("ssr", js.undefined)
    @scala.inline
    def setWebpack(value: () => _): Self = this.set("webpack", js.Any.fromFunction0(value))
    @scala.inline
    def deleteWebpack: Self = this.set("webpack", js.undefined)
  }
  
}

