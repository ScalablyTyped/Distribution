package typings.miniStore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ConnectedComponent[C /* <: typings.react.mod.ComponentType[_] */, T, P] = (typings.react.mod.NamedExoticComponent[
    typings.react.mod.global.JSX.LibraryManagedAttributes[
      C, 
      (typings.std.Omit[
        typings.miniStore.typesMod.GetProps[C], 
        /* keyof mini-store.mini-store/cjs/types.Shared<T, mini-store.mini-store/cjs/types.GetProps<C>> */ java.lang.String
      ]) with P
    ]
  ]) with (typings.hoistNonReactStatics.mod.NonReactStatics[C, js.Object]) with typings.miniStore.anon.WrappedComponent[C]
  type GetProps[C] = js.Any
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.miniStore.miniStoreStrings.Matching with org.scalablytyped.runtime.TopLevel[js.Any]
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typings.miniStore.miniStoreStrings.Shared with org.scalablytyped.runtime.TopLevel[js.Any]
}
