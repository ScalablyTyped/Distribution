package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.Default
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibDynamicMod {
  
  @JSImport("next/dist/shared/lib/dynamic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](dynamicOptions: DynamicOptions[P]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(dynamicOptions.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
  inline def default[P](dynamicOptions: DynamicOptions[P], options: DynamicOptions[P]): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dynamicOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
  inline def default[P](dynamicOptions: Loader[P]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(dynamicOptions.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
  inline def default[P](dynamicOptions: Loader[P], options: DynamicOptions[P]): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dynamicOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
  
  inline def noSSR[P](LoadableInitializer: LoadableFn[P], loadableOptions: DynamicOptions[P]): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("noSSR")(LoadableInitializer.asInstanceOf[js.Any], loadableOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
  
  trait DynamicOptions[P]
    extends StObject
       with LoadableGeneratedOptions {
    
    var loadableGenerated: js.UndefOr[LoadableGeneratedOptions] = js.undefined
    
    var loader: js.UndefOr[Loader[P] | LoaderMap] = js.undefined
    
    var loading: js.UndefOr[js.Function1[/* loadingProps */ DynamicOptionsLoadingProps, Element | Null]] = js.undefined
    
    var ssr: js.UndefOr[Boolean] = js.undefined
    
    var suspense: js.UndefOr[Boolean] = js.undefined
  }
  object DynamicOptions {
    
    inline def apply[P](): DynamicOptions[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicOptions[P]]
    }
    
    extension [Self <: DynamicOptions[?], P](x: Self & DynamicOptions[P]) {
      
      inline def setLoadableGenerated(value: LoadableGeneratedOptions): Self = StObject.set(x, "loadableGenerated", value.asInstanceOf[js.Any])
      
      inline def setLoadableGeneratedUndefined: Self = StObject.set(x, "loadableGenerated", js.undefined)
      
      inline def setLoader(value: Loader[P] | LoaderMap): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderFunction0(value: () => js.Promise[ComponentType[P] | Default[P]]): Self = StObject.set(x, "loader", js.Any.fromFunction0(value))
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setLoading(value: /* loadingProps */ DynamicOptionsLoadingProps => Element | Null): Self = StObject.set(x, "loading", js.Any.fromFunction1(value))
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
      
      inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
      
      inline def setSuspense(value: Boolean): Self = StObject.set(x, "suspense", value.asInstanceOf[js.Any])
      
      inline def setSuspenseUndefined: Self = StObject.set(x, "suspense", js.undefined)
    }
  }
  
  trait DynamicOptionsLoadingProps extends StObject {
    
    var error: js.UndefOr[js.Error | Null] = js.undefined
    
    var isLoading: js.UndefOr[Boolean] = js.undefined
    
    var pastDelay: js.UndefOr[Boolean] = js.undefined
    
    var retry: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var timedOut: js.UndefOr[Boolean] = js.undefined
  }
  object DynamicOptionsLoadingProps {
    
    inline def apply(): DynamicOptionsLoadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicOptionsLoadingProps]
    }
    
    extension [Self <: DynamicOptionsLoadingProps](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
      
      inline def setPastDelay(value: Boolean): Self = StObject.set(x, "pastDelay", value.asInstanceOf[js.Any])
      
      inline def setPastDelayUndefined: Self = StObject.set(x, "pastDelay", js.undefined)
      
      inline def setRetry(value: () => Unit): Self = StObject.set(x, "retry", js.Any.fromFunction0(value))
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setTimedOut(value: Boolean): Self = StObject.set(x, "timedOut", value.asInstanceOf[js.Any])
      
      inline def setTimedOutUndefined: Self = StObject.set(x, "timedOut", js.undefined)
    }
  }
  
  type LoadableComponent[P] = ComponentType[P]
  
  type LoadableFn[P] = js.Function1[/* opts */ LoadableOptions[P], ComponentType[P]]
  
  trait LoadableGeneratedOptions extends StObject {
    
    var modules: js.UndefOr[js.Function0[LoaderMap]] = js.undefined
    
    var webpack: js.UndefOr[js.Function0[Any]] = js.undefined
  }
  object LoadableGeneratedOptions {
    
    inline def apply(): LoadableGeneratedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadableGeneratedOptions]
    }
    
    extension [Self <: LoadableGeneratedOptions](x: Self) {
      
      inline def setModules(value: () => LoaderMap): Self = StObject.set(x, "modules", js.Any.fromFunction0(value))
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setWebpack(value: () => Any): Self = StObject.set(x, "webpack", js.Any.fromFunction0(value))
      
      inline def setWebpackUndefined: Self = StObject.set(x, "webpack", js.undefined)
    }
  }
  
  type LoadableOptions[P] = DynamicOptions[P]
  
  type Loader[P] = (js.Function0[js.Promise[ComponentType[P] | Default[P]]]) | (js.Promise[ComponentType[P] | Default[P]])
  
  type LoaderComponent[P] = js.Promise[ComponentType[P] | Default[P]]
  
  type LoaderMap = StringDictionary[js.Function0[Loader[Any]]]
}
