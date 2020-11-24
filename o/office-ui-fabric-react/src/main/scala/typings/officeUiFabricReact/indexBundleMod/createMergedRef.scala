package typings.officeUiFabricReact.indexBundleMod

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "createMergedRef")
@js.native
object createMergedRef extends js.Object {
  
  def apply[TType, TValue](): js.Function1[
    /* repeated */ js.UndefOr[
      (js.Function1[/* instance */ TType | TValue | Null, Unit]) | (RefObject[TType | TValue | Null]) | Null
    ], 
    js.Function1[/* newValue */ TType | TValue | Null, Unit]
  ] = js.native
  def apply[TType, TValue](value: TValue): js.Function1[
    /* repeated */ js.UndefOr[
      (js.Function1[/* instance */ TType | TValue | Null, Unit]) | (RefObject[TType | TValue | Null]) | Null
    ], 
    js.Function1[/* newValue */ TType | TValue | Null, Unit]
  ] = js.native
}
