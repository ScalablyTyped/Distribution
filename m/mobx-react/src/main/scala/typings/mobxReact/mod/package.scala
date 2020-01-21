package typings.mobxReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // Ideal implementation:
  // export function inject
  // (
  // fn: IStoresToProps
  // ):
  // <P>(target: IReactComponent<P>) => IReactComponent<Partial<P>> & IWrappedComponent<IReactComponent<Partial<P>>>
  //
  // Or even better: (but that would require type inference to work other way around)
  // export function inject<P, I>
  // (
  // fn: IStoresToProps<any, P, I>
  // ):
  // <T extends IReactComponent<P & S>(target: T) => IReactComponent<P> & IWrappedComponent<T>
  /**
    * disposeOnUnmount
    */
  type Disposer = js.Function0[scala.Unit]
  type IReactComponent[P] = typings.react.mod.StatelessComponent[P] | (typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState]) | typings.react.mod.ClassicComponentClass[P]
  type IStoresToProps[S /* <: typings.mobxReact.mod.IValueMap */, P /* <: typings.mobxReact.mod.IValueMap */, I /* <: typings.mobxReact.mod.IValueMap */, C /* <: typings.mobxReact.mod.IValueMap */] = js.Function3[/* stores */ S, /* nextProps */ P, /* context */ C, I]
  type IValueMap = org.scalablytyped.runtime.StringDictionary[js.Any]
}
