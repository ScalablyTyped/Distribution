package typings.plottable

import typings.plottable.interfacesMod.AttributeToProjector
import typings.plottable.interfacesMod.Projector
import typings.plottable.memThunkMod.Thunk
import typings.plottable.memoizeMemoizeMod.MemoizedFunction
import typings.plottable.signatureMod.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoizeMod {
  
  @JSImport("plottable/build/src/memoize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def memThunk[I1, O](arg1: Thunk[I1], compute: js.ThisFunction1[/* this */ Unit, /* arg1 */ I1, O]): MemoizedFunction[Thunk[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("memThunk")(arg1.asInstanceOf[js.Any], compute.asInstanceOf[js.Any])).asInstanceOf[MemoizedFunction[Thunk[O]]]
  @scala.inline
  def memThunk[I1, I2, O](
    arg1: Thunk[I1],
    arg2: Thunk[I2],
    compute: js.ThisFunction2[/* this */ Unit, /* arg1 */ I1, /* arg2 */ I2, O]
  ): MemoizedFunction[Thunk[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("memThunk")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], compute.asInstanceOf[js.Any])).asInstanceOf[MemoizedFunction[Thunk[O]]]
  @scala.inline
  def memThunk[I1, I2, I3, O](
    arg1: Thunk[I1],
    arg2: Thunk[I2],
    arg3: Thunk[I3],
    compute: js.ThisFunction3[/* this */ Unit, /* arg1 */ I1, /* arg2 */ I2, /* arg3 */ I3, O]
  ): MemoizedFunction[Thunk[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("memThunk")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], compute.asInstanceOf[js.Any])).asInstanceOf[MemoizedFunction[Thunk[O]]]
  @scala.inline
  def memThunk[I1, I2, I3, I4, O](
    arg1: Thunk[I1],
    arg2: Thunk[I2],
    arg3: Thunk[I3],
    arg4: Thunk[I4],
    compute: js.ThisFunction4[/* this */ Unit, /* arg1 */ I1, /* arg2 */ I2, /* arg3 */ I3, /* arg4 */ I4, O]
  ): MemoizedFunction[Thunk[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("memThunk")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], compute.asInstanceOf[js.Any])).asInstanceOf[MemoizedFunction[Thunk[O]]]
  
  @scala.inline
  def memoize[F /* <: js.Function */](compute: F): MemoizedFunction[F] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(compute.asInstanceOf[js.Any]).asInstanceOf[MemoizedFunction[F]]
  
  @scala.inline
  def memoizeProjector(projector: Projector): Projector = ^.asInstanceOf[js.Dynamic].applyDynamic("memoizeProjector")(projector.asInstanceOf[js.Any]).asInstanceOf[Projector]
  
  @scala.inline
  def memoizeProjectors(attrToProjector: AttributeToProjector): AttributeToProjector = ^.asInstanceOf[js.Dynamic].applyDynamic("memoizeProjectors")(attrToProjector.asInstanceOf[js.Any]).asInstanceOf[AttributeToProjector]
  
  @scala.inline
  def sign(a: js.Any): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(a.asInstanceOf[js.Any]).asInstanceOf[Signature]
}
