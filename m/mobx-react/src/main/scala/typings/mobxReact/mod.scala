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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
    
    @JSImport("mobx-react", "PropTypes.arrayOrObservableArrayOf")
    @js.native
    def arrayOrObservableArrayOf(typeChecker: Validator[_]): Requireable[_] = js.native
    
    @scala.inline
    def arrayOrObservableArray_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayOrObservableArray")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-react", "PropTypes.objectOrObservableObject")
    @js.native
    def objectOrObservableObject: Requireable[js.Any] = js.native
    @scala.inline
    def objectOrObservableObject_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("objectOrObservableObject")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-react", "PropTypes.observableArray")
    @js.native
    def observableArray: Requireable[js.Any] = js.native
    
    @JSImport("mobx-react", "PropTypes.observableArrayOf")
    @js.native
    def observableArrayOf(typeChecker: Validator[_]): Requireable[_] = js.native
    
    @scala.inline
    def observableArray_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observableArray")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-react", "PropTypes.observableMap")
    @js.native
    def observableMap: Requireable[js.Any] = js.native
    @scala.inline
    def observableMap_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observableMap")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-react", "PropTypes.observableObject")
    @js.native
    def observableObject: Requireable[js.Any] = js.native
    @scala.inline
    def observableObject_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observableObject")(x.asInstanceOf[js.Any])
  }
  
  object Provider {
    
    @JSImport("mobx-react", "Provider")
    @js.native
    def apply(props: ProviderProps): Element = js.native
    @JSImport("mobx-react", "Provider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx-react", "Provider.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mobx-react", "disposeOnUnmount")
  @js.native
  def disposeOnUnmount(target: Component[_, _, _], propertyKey: PropertyKey): Unit = js.native
  @JSImport("mobx-react", "disposeOnUnmount")
  @js.native
  def disposeOnUnmount[TF /* <: Disposer | js.Array[Disposer] */](target: Component[_, _, _], fn: TF): TF = js.native
  
  @JSImport("mobx-react", "enableStaticRendering")
  @js.native
  def enableStaticRendering(enable: Boolean): Unit = js.native
  
  @JSImport("mobx-react", "inject")
  @js.native
  def inject(stores: String*): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[_]] = js.native
  @JSImport("mobx-react", "inject")
  @js.native
  def inject[S, P, I, C](fn: IStoresToProps[S, P, I, C]): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[P]] = js.native
  
  @JSImport("mobx-react", "isUsingStaticRendering")
  @js.native
  def isUsingStaticRendering(): Boolean = js.native
  
  @JSImport("mobx-react", "observer")
  @js.native
  def observer[T /* <: IReactComponent[_] */](component: T): T = js.native
  
  @JSImport("mobx-react", "observerBatching")
  @js.native
  def observerBatching(reactionScheduler: js.Any): Unit = js.native
  
  @JSImport("mobx-react", "useAsObservableSource")
  @js.native
  def useAsObservableSource[TSource](current: TSource): TSource = js.native
  
  @JSImport("mobx-react", "useLocalObservable")
  @js.native
  def useLocalObservable[TStore /* <: Record[String, _] */](initializer: js.Function0[TStore]): TStore = js.native
  @JSImport("mobx-react", "useLocalObservable")
  @js.native
  def useLocalObservable[TStore /* <: Record[String, _] */](
    initializer: js.Function0[TStore],
    annotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotationsMap<TStore, never> */ js.Any
  ): TStore = js.native
  
  @JSImport("mobx-react", "useLocalStore")
  @js.native
  def useLocalStore[TStore /* <: Record[String, _] */](initializer: js.Function0[TStore]): TStore = js.native
  @JSImport("mobx-react", "useLocalStore")
  @js.native
  def useLocalStore[TStore /* <: Record[String, _] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore], current: TSource): TStore = js.native
  
  @JSImport("mobx-react", "useObserver")
  @js.native
  def useObserver[T](fn: js.Function0[T]): T = js.native
  @JSImport("mobx-react", "useObserver")
  @js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: String): T = js.native
  
  @JSImport("mobx-react", "useStaticRendering")
  @js.native
  def useStaticRendering(enable: Boolean): Unit = js.native
}
