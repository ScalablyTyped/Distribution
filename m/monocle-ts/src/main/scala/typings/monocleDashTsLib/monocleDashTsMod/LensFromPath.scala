package typings
package monocleDashTsLib.monocleDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LensFromPath[S] extends js.Object {
  def apply[K1 /* <: java.lang.String */](path: js.Array[K1]): Lens[S, /* import warning: ImportType.apply Failed type conversion: S[K1] */ js.Any] = js.native
  def apply[K1 /* <: java.lang.String */, K2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1] */ js.Any */](path: js.Tuple2[K1, K2]): Lens[S, /* import warning: ImportType.apply Failed type conversion: S[K1][K2] */ js.Any] = js.native
  def apply[K1 /* <: java.lang.String */, K2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1] */ js.Any */, K3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1][K2] */ js.Any */](path: js.Tuple3[K1, K2, K3]): Lens[
    S, 
    /* import warning: ImportType.apply Failed type conversion: S[K1][K2][K3] */ js.Any
  ] = js.native
  def apply[K1 /* <: java.lang.String */, K2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1] */ js.Any */, K3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1][K2] */ js.Any */, K4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1][K2][K3] */ js.Any */](path: js.Tuple4[K1, K2, K3, K4]): Lens[
    S, 
    /* import warning: ImportType.apply Failed type conversion: S[K1][K2][K3][K4] */ js.Any
  ] = js.native
  def apply[K1 /* <: java.lang.String */, K2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1] */ js.Any */, K3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1][K2] */ js.Any */, K4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1][K2][K3] */ js.Any */, K5 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1][K2][K3][K4] */ js.Any */](path: js.Tuple5[K1, K2, K3, K4, K5]): Lens[
    S, 
    /* import warning: ImportType.apply Failed type conversion: S[K1][K2][K3][K4][K5] */ js.Any
  ] = js.native
}

