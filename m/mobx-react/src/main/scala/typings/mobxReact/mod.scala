package typings.mobxReact

import typings.mobxReact.disposeOnUnmountMod.Disposer
import typings.mobxReact.ireactcomponentMod.IReactComponent
import typings.mobxReact.istorestopropsMod.IStoresToProps
import typings.mobxReact.iwrappedcomponentMod.IWrappedComponent
import typings.mobxReact.providerMod.ProviderProps
import typings.mobxReactLite.observerBatchingMod.IBatchedUpdates
import typings.mobxReactLite.useObserverMod.IUseObserverOptions
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.Requireable
import typings.react.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.std.PropertyKey
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-react", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val MobXProviderContext: Context[Record[String, js.Any]] = js.native
  def disposeOnUnmount(target: Component[_, _, _], propertyKey: PropertyKey): Unit = js.native
  def disposeOnUnmount[TF /* <: Disposer | js.Array[Disposer] */](target: Component[_, _, _], fn: TF): TF = js.native
  def inject(stores: String*): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[_]] = js.native
  def inject[S, P, I, C](fn: IStoresToProps[S, P, I, C]): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[P]] = js.native
  def isObserverBatched(): js.Any = js.native
  def isUsingStaticRendering(): Boolean = js.native
  def observer[T /* <: IReactComponent[_] */](component: T): T = js.native
  def observerBatching(): Unit = js.native
  def observerBatching(reactionScheduler: IBatchedUpdates): Unit = js.native
  def observerBatchingOptOut(): Unit = js.native
  def useAsObservableSource[TSource](current: TSource): TSource = js.native
  def useLocalStore[TStore /* <: Record[String, _] */](initializer: js.Function0[TStore]): TStore = js.native
  def useLocalStore[TStore /* <: Record[String, _] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore], current: TSource): TStore = js.native
  def useObserver[T](fn: js.Function0[T]): T = js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: js.UndefOr[scala.Nothing], options: IUseObserverOptions): T = js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: String): T = js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: String, options: IUseObserverOptions): T = js.native
  def useStaticRendering(enable: Boolean): Unit = js.native
  @js.native
  object PropTypes extends js.Object {
    var arrayOrObservableArray: Requireable[_] = js.native
    var objectOrObservableObject: Requireable[_] = js.native
    var observableArray: Requireable[_] = js.native
    var observableMap: Requireable[_] = js.native
    var observableObject: Requireable[_] = js.native
    def arrayOrObservableArrayOf(typeChecker: Validator[_]): Requireable[_] = js.native
    def observableArrayOf(typeChecker: Validator[_]): Requireable[_] = js.native
  }
  
  @js.native
  object Provider extends js.Object {
    var displayName: String = js.native
    def apply(props: ProviderProps): Element = js.native
  }
  
}

