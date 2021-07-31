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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamicMod {
  
  @JSImport("next-server/dist/lib/dynamic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[P](dynamicOptions: DynamicOptions[P]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(dynamicOptions.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
  @scala.inline
  def default[P](dynamicOptions: DynamicOptions[P], options: DynamicOptions[P]): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dynamicOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
  @scala.inline
  def default[P](dynamicOptions: Loader[P]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(dynamicOptions.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
  @scala.inline
  def default[P](dynamicOptions: Loader[P], options: DynamicOptions[P]): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dynamicOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
  
  @scala.inline
  def noSSR[P](LoadableInitializer: LoadableFn[P], loadableOptions: LoadableOptions[P]): (ComponentClass[P, js.Any]) | FunctionComponent[P] | js.Function0[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("noSSR")(LoadableInitializer.asInstanceOf[js.Any], loadableOptions.asInstanceOf[js.Any])).asInstanceOf[(ComponentClass[P, js.Any]) | FunctionComponent[P] | js.Function0[Element]]
  
  trait DynamicOptions[P]
    extends StObject
       with LoadableBaseOptions[P] {
    
    /**
      * @deprecated the modules option has been planned for removal
      */
    var render: js.UndefOr[js.Function2[/* props */ P, /* loaded */ js.Any, Element]] = js.undefined
  }
  object DynamicOptions {
    
    @scala.inline
    def apply[P](): DynamicOptions[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicOptions[P]]
    }
    
    @scala.inline
    implicit class DynamicOptionsMutableBuilder[Self <: DynamicOptions[?], P] (val x: Self & DynamicOptions[P]) extends AnyVal {
      
      @scala.inline
      def setRender(value: (/* props */ P, /* loaded */ js.Any) => Element): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  trait LoadableBaseOptions[P]
    extends StObject
       with LoadableGeneratedOptions {
    
    var loadableGenerated: js.UndefOr[LoadableGeneratedOptions] = js.undefined
    
    var loader: js.UndefOr[Loader[P] | LoaderMap] = js.undefined
    
    var loading: js.UndefOr[js.Function1[/* hasErrorIsLoadingPastDelay */ Error, Element | Null]] = js.undefined
    
    var ssr: js.UndefOr[Boolean] = js.undefined
  }
  object LoadableBaseOptions {
    
    @scala.inline
    def apply[P](): LoadableBaseOptions[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadableBaseOptions[P]]
    }
    
    @scala.inline
    implicit class LoadableBaseOptionsMutableBuilder[Self <: LoadableBaseOptions[?], P] (val x: Self & LoadableBaseOptions[P]) extends AnyVal {
      
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
      def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
    }
  }
  
  type LoadableComponent[P] = ComponentType[P]
  
  type LoadableFn[P] = js.Function1[/* opts */ LoadableOptions[P], ComponentType[P]]
  
  trait LoadableGeneratedOptions extends StObject {
    
    var modules: js.UndefOr[js.Function0[LoaderMap]] = js.undefined
    
    var webpack: js.UndefOr[js.Function0[js.Any]] = js.undefined
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
      def setWebpack(value: () => js.Any): Self = StObject.set(x, "webpack", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWebpackUndefined: Self = StObject.set(x, "webpack", js.undefined)
    }
  }
  
  trait LoadableOptions[P]
    extends StObject
       with LoadableBaseOptions[P] {
    
    var render: js.UndefOr[js.Function2[/* loader */ js.Any, /* props */ js.Any, Element]] = js.undefined
  }
  object LoadableOptions {
    
    @scala.inline
    def apply[P](): LoadableOptions[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadableOptions[P]]
    }
    
    @scala.inline
    implicit class LoadableOptionsMutableBuilder[Self <: LoadableOptions[?], P] (val x: Self & LoadableOptions[P]) extends AnyVal {
      
      @scala.inline
      def setRender(value: (/* loader */ js.Any, /* props */ js.Any) => Element): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  type Loader[P] = js.Function0[LoaderComponent[P]] | LoaderComponent[P]
  
  type LoaderComponent[P] = js.Promise[ComponentType[P] | Default[P]]
  
  type LoaderMap = StringDictionary[js.Function0[Loader[js.Any]]]
}
