package typings.mobxReact

import typings.mobx.distApiAnnotationMod.AnnotationsMap
import typings.mobxReact.distDisposeOnUnmountMod.Disposer
import typings.mobxReact.distProviderMod.ProviderProps
import typings.mobxReact.distTypesIreactcomponentMod.IReactComponent
import typings.mobxReact.distTypesIstorestopropsMod.IStoresToProps
import typings.mobxReact.distTypesIvaluemapMod.IValueMap
import typings.mobxReact.distTypesIwrappedcomponentMod.IWrappedComponent
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.Requireable
import typings.react.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mobx-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx-react", "MobXProviderContext")
  @js.native
  val MobXProviderContext: Context[IValueMap] = js.native
  
  object PropTypes {
    
    @JSImport("mobx-react", "PropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx-react", "PropTypes.arrayOrObservableArray")
    @js.native
    def arrayOrObservableArray: Requireable[Any] = js.native
    
    inline def arrayOrObservableArrayOf(typeChecker: Validator[Any]): Requireable[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayOrObservableArrayOf")(typeChecker.asInstanceOf[js.Any]).asInstanceOf[Requireable[Any]]
    
    inline def arrayOrObservableArray_=(x: Requireable[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayOrObservableArray")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-react", "PropTypes.objectOrObservableObject")
    @js.native
    def objectOrObservableObject: Requireable[Any] = js.native
    inline def objectOrObservableObject_=(x: Requireable[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("objectOrObservableObject")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-react", "PropTypes.observableArray")
    @js.native
    def observableArray: Requireable[Any] = js.native
    
    inline def observableArrayOf(typeChecker: Validator[Any]): Requireable[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("observableArrayOf")(typeChecker.asInstanceOf[js.Any]).asInstanceOf[Requireable[Any]]
    
    inline def observableArray_=(x: Requireable[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observableArray")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-react", "PropTypes.observableMap")
    @js.native
    def observableMap: Requireable[Any] = js.native
    inline def observableMap_=(x: Requireable[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observableMap")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-react", "PropTypes.observableObject")
    @js.native
    def observableObject: Requireable[Any] = js.native
    inline def observableObject_=(x: Requireable[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observableObject")(x.asInstanceOf[js.Any])
  }
  
  object Provider {
    
    inline def apply(props: ProviderProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("mobx-react", "Provider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx-react", "Provider.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  inline def disposeOnUnmount(target: Component[Any, Any, Any], propertyKey: PropertyKey): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disposeOnUnmount")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def disposeOnUnmount_TF_TF[TF /* <: Disposer | js.Array[Disposer] */](target: Component[Any, Any, Any], fn: TF): TF = (^.asInstanceOf[js.Dynamic].applyDynamic("disposeOnUnmount")(target.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[TF]
  
  inline def enableStaticRendering(enable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableStaticRendering")(enable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def inject(stores: String*): js.Function1[
    /* target */ IReactComponent[Any], 
    IReactComponent[Any] & (/* import warning: importer.ImportType#apply Failed type conversion: mobx-react.mobx-react/dist/types/IReactComponent.IReactComponent<any> extends mobx-react.mobx-react/dist/types/IReactComponent.IReactComponent<infer P> ? mobx-react.mobx-react/dist/types/IWrappedComponent.IWrappedComponent<P> : never */ js.Any)
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(stores.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[
    /* target */ IReactComponent[Any], 
    IReactComponent[Any] & (/* import warning: importer.ImportType#apply Failed type conversion: mobx-react.mobx-react/dist/types/IReactComponent.IReactComponent<any> extends mobx-react.mobx-react/dist/types/IReactComponent.IReactComponent<infer P> ? mobx-react.mobx-react/dist/types/IWrappedComponent.IWrappedComponent<P> : never */ js.Any)
  ]]
  inline def inject[S, P, I, C](fn: IStoresToProps[S, P, I, C]): js.Function1[/* target */ IReactComponent[Any], IReactComponent[Any] & IWrappedComponent[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ IReactComponent[Any], IReactComponent[Any] & IWrappedComponent[P]]]
  
  inline def isUsingStaticRendering(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUsingStaticRendering")().asInstanceOf[Boolean]
  
  inline def observer[T /* <: IReactComponent[Any] */](component: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(component.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def observerBatching(reactionScheduler: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("observerBatching")(reactionScheduler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useAsObservableSource[TSource /* <: js.Object */](current: TSource): TSource = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsObservableSource")(current.asInstanceOf[js.Any]).asInstanceOf[TSource]
  
  inline def useLocalObservable[TStore /* <: Record[String, Any] */](initializer: js.Function0[TStore]): TStore = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalObservable")(initializer.asInstanceOf[js.Any]).asInstanceOf[TStore]
  inline def useLocalObservable[TStore /* <: Record[String, Any] */](initializer: js.Function0[TStore], annotations: AnnotationsMap[TStore, scala.Nothing]): TStore = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalObservable")(initializer.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any])).asInstanceOf[TStore]
  
  inline def useLocalStore[TStore /* <: Record[String, Any] */](initializer: js.Function0[TStore]): TStore = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalStore")(initializer.asInstanceOf[js.Any]).asInstanceOf[TStore]
  inline def useLocalStore[TStore /* <: Record[String, Any] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore], current: TSource): TStore = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalStore")(initializer.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[TStore]
  
  inline def useObserver[T](fn: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useObserver")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useObserver[T](fn: js.Function0[T], baseComponentName: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useObserver")(fn.asInstanceOf[js.Any], baseComponentName.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useStaticRendering(enable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useStaticRendering")(enable.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
