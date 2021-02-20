package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import typings.nextServer.anon.Default
import typings.nextServer.anon.Error
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamicMod {
  
  @JSImport("next-server/dist/lib/dynamic", JSImport.Default)
  @js.native
  def default[P](dynamicOptions: DynamicOptions[P]): ComponentType[P] = js.native
  @JSImport("next-server/dist/lib/dynamic", JSImport.Default)
  @js.native
  def default[P](dynamicOptions: DynamicOptions[P], options: DynamicOptions[P]): ComponentType[P] = js.native
  @JSImport("next-server/dist/lib/dynamic", JSImport.Default)
  @js.native
  def default[P](dynamicOptions: Loader[P]): ComponentType[P] = js.native
  @JSImport("next-server/dist/lib/dynamic", JSImport.Default)
  @js.native
  def default[P](dynamicOptions: Loader[P], options: DynamicOptions[P]): ComponentType[P] = js.native
  
  @JSImport("next-server/dist/lib/dynamic", "noSSR")
  @js.native
  def noSSR[P](LoadableInitializer: LoadableFn[P], loadableOptions: LoadableOptions[P]): (ComponentClass[P, _]) | FunctionComponent[P] | js.Function0[Element] = js.native
  
  /* Inlined next-server.next-server/dist/lib/dynamic.LoadableBaseOptions<P> & {  render :(props : P, loaded : any): react.react.<global>.JSX.Element | undefined} */
  @js.native
  trait DynamicOptions[P] extends StObject {
    
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
    implicit class DynamicOptionsMutableBuilder[Self <: DynamicOptions[_], P] (val x: Self with DynamicOptions[P]) extends AnyVal {
      
      @scala.inline
      def setLoadableGenerated(value: LoadableGeneratedOptions): Self = StObject.set(x, "loadableGenerated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadableGeneratedUndefined: Self = StObject.set(x, "loadableGenerated", js.undefined)
      
      @scala.inline
      def setLoader(value: Loader[P] | LoaderMap): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderFunction0(value: () => LoaderComponent[P]): Self = StObject.set(x, "loader", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      @scala.inline
      def setLoading(value: /* hasErrorIsLoadingPastDelay */ Error => Element | Null): Self = StObject.set(x, "loading", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setModules(value: () => LoaderMap): Self = StObject.set(x, "modules", js.Any.fromFunction0(value))
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setRender(value: (/* props */ P, /* loaded */ js.Any) => Element): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
      
      @scala.inline
      def setWebpack(value: () => _): Self = StObject.set(x, "webpack", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWebpackUndefined: Self = StObject.set(x, "webpack", js.undefined)
    }
  }
  
  /* Inlined next-server.next-server/dist/lib/dynamic.LoadableGeneratedOptions & {  loading :(hasErrorIsLoadingPastDelay : {  error :std.Error | null | undefined,   isLoading :boolean | undefined,   pastDelay :boolean | undefined,   timedOut :boolean | undefined}): react.react.<global>.JSX.Element | null | undefined,   loader :next-server.next-server/dist/lib/dynamic.Loader<P> | next-server.next-server/dist/lib/dynamic.LoaderMap | undefined,   loadableGenerated :next-server.next-server/dist/lib/dynamic.LoadableGeneratedOptions | undefined,   ssr :boolean | undefined} */
  @js.native
  trait LoadableBaseOptions[P] extends StObject {
    
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
    implicit class LoadableBaseOptionsMutableBuilder[Self <: LoadableBaseOptions[_], P] (val x: Self with LoadableBaseOptions[P]) extends AnyVal {
      
      @scala.inline
      def setLoadableGenerated(value: LoadableGeneratedOptions): Self = StObject.set(x, "loadableGenerated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadableGeneratedUndefined: Self = StObject.set(x, "loadableGenerated", js.undefined)
      
      @scala.inline
      def setLoader(value: Loader[P] | LoaderMap): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderFunction0(value: () => LoaderComponent[P]): Self = StObject.set(x, "loader", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      @scala.inline
      def setLoading(value: /* hasErrorIsLoadingPastDelay */ Error => Element | Null): Self = StObject.set(x, "loading", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setModules(value: () => LoaderMap): Self = StObject.set(x, "modules", js.Any.fromFunction0(value))
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
      
      @scala.inline
      def setWebpack(value: () => _): Self = StObject.set(x, "webpack", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWebpackUndefined: Self = StObject.set(x, "webpack", js.undefined)
    }
  }
  
  type LoadableComponent[P] = ComponentType[P]
  
  type LoadableFn[P] = js.Function1[/* opts */ LoadableOptions[P], ComponentType[P]]
  
  @js.native
  trait LoadableGeneratedOptions extends StObject {
    
    var modules: js.UndefOr[js.Function0[LoaderMap]] = js.native
    
    var webpack: js.UndefOr[js.Function0[_]] = js.native
  }
  object LoadableGeneratedOptions {
    
    @scala.inline
    def apply(): LoadableGeneratedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadableGeneratedOptions]
    }
    
    @scala.inline
    implicit class LoadableGeneratedOptionsMutableBuilder[Self <: LoadableGeneratedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModules(value: () => LoaderMap): Self = StObject.set(x, "modules", js.Any.fromFunction0(value))
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setWebpack(value: () => _): Self = StObject.set(x, "webpack", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWebpackUndefined: Self = StObject.set(x, "webpack", js.undefined)
    }
  }
  
  /* Inlined next-server.next-server/dist/lib/dynamic.LoadableBaseOptions<P> & {  render :(loader : any, props : any): react.react.<global>.JSX.Element | undefined} */
  @js.native
  trait LoadableOptions[P] extends StObject {
    
    var loadableGenerated: js.UndefOr[LoadableGeneratedOptions] = js.native
    
    var loader: js.UndefOr[Loader[P] | LoaderMap] = js.native
    
    var loading: js.UndefOr[js.Function1[/* hasErrorIsLoadingPastDelay */ Error, Element | Null]] = js.native
    
    var modules: js.UndefOr[js.Function0[LoaderMap]] = js.native
    
    var render: js.UndefOr[js.Function2[/* loader */ js.Any, /* props */ js.Any, Element]] = js.native
    
    var ssr: js.UndefOr[Boolean] = js.native
    
    var webpack: js.UndefOr[js.Function0[_]] = js.native
  }
  object LoadableOptions {
    
    @scala.inline
    def apply[P](): LoadableOptions[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadableOptions[P]]
    }
    
    @scala.inline
    implicit class LoadableOptionsMutableBuilder[Self <: LoadableOptions[_], P] (val x: Self with LoadableOptions[P]) extends AnyVal {
      
      @scala.inline
      def setLoadableGenerated(value: LoadableGeneratedOptions): Self = StObject.set(x, "loadableGenerated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadableGeneratedUndefined: Self = StObject.set(x, "loadableGenerated", js.undefined)
      
      @scala.inline
      def setLoader(value: Loader[P] | LoaderMap): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderFunction0(value: () => LoaderComponent[P]): Self = StObject.set(x, "loader", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      @scala.inline
      def setLoading(value: /* hasErrorIsLoadingPastDelay */ Error => Element | Null): Self = StObject.set(x, "loading", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setModules(value: () => LoaderMap): Self = StObject.set(x, "modules", js.Any.fromFunction0(value))
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setRender(value: (/* loader */ js.Any, /* props */ js.Any) => Element): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
      
      @scala.inline
      def setWebpack(value: () => _): Self = StObject.set(x, "webpack", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWebpackUndefined: Self = StObject.set(x, "webpack", js.undefined)
    }
  }
  
  type Loader[P] = js.Function0[LoaderComponent[P]] | LoaderComponent[P]
  
  type LoaderComponent[P] = js.Promise[ComponentType[P] | Default[P]]
  
  type LoaderMap = StringDictionary[js.Function0[Loader[js.Any]]]
}
