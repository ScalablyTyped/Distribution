package typings.mobxReact

import typings.mobxReact.disposeOnUnmountMod.Disposer
import typings.mobxReact.ireactcomponentMod.IReactComponent
import typings.mobxReact.istorestopropsMod.IStoresToProps
import typings.mobxReact.iwrappedcomponentMod.IWrappedComponent
import typings.mobxReact.providerMod.ProviderProps
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
  val MobXProviderContext: Context[Record[String, js.Any]] = js.native
  
  object PropTypes {
    
    @JSImport("mobx-react", "PropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx-react", "PropTypes.arrayOrObservableArray")
    @js.native
    def arrayOrObservableArray: Requireable[js.Any] = js.native
    
    inline def arrayOrObservableArrayOf(typeChecker: Validator[js.Any]): Requireable[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayOrObservableArrayOf")(typeChecker.asInstanceOf[js.Any]).asInstanceOf[Requireable[js.Any]]
    
    inline def arrayOrObservableArray_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayOrObservableArray")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-react", "PropTypes.objectOrObservableObject")
    @js.native
    def objectOrObservableObject: Requireable[js.Any] = js.native
    inline def objectOrObservableObject_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("objectOrObservableObject")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-react", "PropTypes.observableArray")
    @js.native
    def observableArray: Requireable[js.Any] = js.native
    
    inline def observableArrayOf(typeChecker: Validator[js.Any]): Requireable[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("observableArrayOf")(typeChecker.asInstanceOf[js.Any]).asInstanceOf[Requireable[js.Any]]
    
    inline def observableArray_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observableArray")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-react", "PropTypes.observableMap")
    @js.native
    def observableMap: Requireable[js.Any] = js.native
    inline def observableMap_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observableMap")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-react", "PropTypes.observableObject")
    @js.native
    def observableObject: Requireable[js.Any] = js.native
    inline def observableObject_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observableObject")(x.asInstanceOf[js.Any])
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
  
  inline def disposeOnUnmount(target: Component[js.Any, js.Any, js.Any], propertyKey: PropertyKey): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disposeOnUnmount")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def disposeOnUnmount_TF_UnionDisposerArrayDisposer_TF[TF /* <: Disposer | js.Array[Disposer] */](target: Component[js.Any, js.Any, js.Any], fn: TF): TF = (^.asInstanceOf[js.Dynamic].applyDynamic("disposeOnUnmount")(target.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[TF]
  
  inline def enableStaticRendering(enable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableStaticRendering")(enable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def inject(stores: String*): js.Function1[
    /* target */ IReactComponent[js.Any], 
    IReactComponent[js.Any] & IWrappedComponent[js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(stores.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* target */ IReactComponent[js.Any], 
    IReactComponent[js.Any] & IWrappedComponent[js.Any]
  ]]
  inline def inject[S, P, I, C](fn: IStoresToProps[S, P, I, C]): js.Function1[
    /* target */ IReactComponent[js.Any], 
    IReactComponent[js.Any] & IWrappedComponent[P]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* target */ IReactComponent[js.Any], 
    IReactComponent[js.Any] & IWrappedComponent[P]
  ]]
  
  inline def isUsingStaticRendering(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUsingStaticRendering")().asInstanceOf[Boolean]
  
  inline def observer[T /* <: IReactComponent[js.Any] */](component: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(component.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def observerBatching(reactionScheduler: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("observerBatching")(reactionScheduler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useAsObservableSource[TSource](current: TSource): TSource = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsObservableSource")(current.asInstanceOf[js.Any]).asInstanceOf[TSource]
  
  inline def useLocalObservable[TStore /* <: Record[String, js.Any] */](initializer: js.Function0[TStore]): TStore = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalObservable")(initializer.asInstanceOf[js.Any]).asInstanceOf[TStore]
  inline def useLocalObservable[TStore /* <: Record[String, js.Any] */](
    initializer: js.Function0[TStore],
    annotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotationsMap<TStore, never> */ js.Any
  ): TStore = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalObservable")(initializer.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any])).asInstanceOf[TStore]
  
  inline def useLocalStore[TStore /* <: Record[String, js.Any] */](initializer: js.Function0[TStore]): TStore = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalStore")(initializer.asInstanceOf[js.Any]).asInstanceOf[TStore]
  inline def useLocalStore[TStore /* <: Record[String, js.Any] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore], current: TSource): TStore = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalStore")(initializer.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[TStore]
  
  inline def useObserver[T](fn: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useObserver")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useObserver[T](fn: js.Function0[T], baseComponentName: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useObserver")(fn.asInstanceOf[js.Any], baseComponentName.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useStaticRendering(enable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useStaticRendering")(enable.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
