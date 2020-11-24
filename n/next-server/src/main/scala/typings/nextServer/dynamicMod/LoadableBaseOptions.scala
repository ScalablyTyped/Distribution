package typings.nextServer.dynamicMod

import typings.nextServer.anon.Error
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next-server.next-server/dist/lib/dynamic.LoadableGeneratedOptions & {  loading :(hasErrorIsLoadingPastDelay : {  error :std.Error | null | undefined,   isLoading :boolean | undefined,   pastDelay :boolean | undefined,   timedOut :boolean | undefined}): react.react.<global>.JSX.Element | null | undefined,   loader :next-server.next-server/dist/lib/dynamic.Loader<P> | next-server.next-server/dist/lib/dynamic.LoaderMap | undefined,   loadableGenerated :next-server.next-server/dist/lib/dynamic.LoadableGeneratedOptions | undefined,   ssr :boolean | undefined} */
@js.native
trait LoadableBaseOptions[P] extends js.Object {
  
  var loadableGenerated: js.UndefOr[LoadableGeneratedOptions] = js.native
  
  var loader: js.UndefOr[Loader[P] | LoaderMap] = js.native
  
  var loading: js.UndefOr[js.Function1[/* hasErrorIsLoadingPastDelay */ Error, Element | Null]] = js.native
  
  var modules: js.UndefOr[js.Function0[LoaderMap]] = js.native
  
  var ssr: js.UndefOr[Boolean] = js.native
  
  var webpack: js.UndefOr[js.Function0[_]] = js.native
}
object LoadableBaseOptions {
  
  @scala.inline
  def apply[P](): LoadableBaseOptions[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadableBaseOptions[P]]
  }
  
  @scala.inline
  implicit class LoadableBaseOptionsOps[Self <: LoadableBaseOptions[_], P] (val x: Self with LoadableBaseOptions[P]) extends AnyVal {
    
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
    def setSsr(value: Boolean): Self = this.set("ssr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsr: Self = this.set("ssr", js.undefined)
    
    @scala.inline
    def setWebpack(value: () => _): Self = this.set("webpack", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteWebpack: Self = this.set("webpack", js.undefined)
  }
}
