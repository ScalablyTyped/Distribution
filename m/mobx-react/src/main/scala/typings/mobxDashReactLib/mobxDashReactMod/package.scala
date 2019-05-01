package typings
package mobxDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mobxDashReactMod {
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
  type IReactComponent[P] = reactLib.reactMod.StatelessComponent[P] | (reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState]) | reactLib.reactMod.ClassicComponentClass[P]
  type IStoresToProps[S /* <: IValueMap */, P /* <: IValueMap */, I /* <: IValueMap */, C /* <: IValueMap */] = js.Function3[/* stores */ S, /* nextProps */ P, /* context */ C, I]
  type IValueMap = org.scalablytyped.runtime.StringDictionary[js.Any]
}
