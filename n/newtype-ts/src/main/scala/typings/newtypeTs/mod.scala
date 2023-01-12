package typings.newtypeTs

import typings.fpTs.libEqMod.Eq
import typings.fpTs.libFieldMod.Field
import typings.fpTs.libFunctionMod.Predicate
import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libOrdMod.Ord_
import typings.fpTs.libRingMod.Ring
import typings.fpTs.libSemigroupMod.Semigroup
import typings.fpTs.libSemiringMod.Semiring
import typings.monocleTs.mod.Iso_
import typings.monocleTs.mod.Prism_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("newtype-ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEq_A[S /* <: Newtype[Any, Any] */](
    S: Eq[
      /* import warning: importer.ImportType#apply Failed type conversion: S['_A'] */ js.Any
    ]
  ): Eq[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(S.asInstanceOf[js.Any]).asInstanceOf[Eq[S]]
  
  inline def getField_A[S /* <: Newtype[Any, Any] */](
    F: Field[
      /* import warning: importer.ImportType#apply Failed type conversion: S['_A'] */ js.Any
    ]
  ): Field[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("getField")(F.asInstanceOf[js.Any]).asInstanceOf[Field[S]]
  
  inline def getMonoid_A[S /* <: Newtype[Any, Any] */](
    M: Monoid[
      /* import warning: importer.ImportType#apply Failed type conversion: S['_A'] */ js.Any
    ]
  ): Monoid[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[S]]
  
  inline def getOrd_A[S /* <: Newtype[Any, Any] */](
    O: Ord_[
      /* import warning: importer.ImportType#apply Failed type conversion: S['_A'] */ js.Any
    ]
  ): Ord_[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrd")(O.asInstanceOf[js.Any]).asInstanceOf[Ord_[S]]
  
  inline def getRing_A[S /* <: Newtype[Any, Any] */](
    R: Ring[
      /* import warning: importer.ImportType#apply Failed type conversion: S['_A'] */ js.Any
    ]
  ): Ring[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRing")(R.asInstanceOf[js.Any]).asInstanceOf[Ring[S]]
  
  inline def getSemigroup_A[S /* <: Newtype[Any, Any] */](
    S: Semigroup[
      /* import warning: importer.ImportType#apply Failed type conversion: S['_A'] */ js.Any
    ]
  ): Semigroup[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[S]]
  
  inline def getSemiring_A[S /* <: Newtype[Any, Any] */](
    S: Semiring[
      /* import warning: importer.ImportType#apply Failed type conversion: S['_A'] */ js.Any
    ]
  ): Semiring[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemiring")(S.asInstanceOf[js.Any]).asInstanceOf[Semiring[S]]
  
  inline def iso[S /* <: AnyNewtype */](): Iso_[S, CarrierOf[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("iso")().asInstanceOf[Iso_[S, CarrierOf[S]]]
  
  inline def prism[S /* <: AnyNewtype */](predicate: Predicate[CarrierOf[S]]): Prism_[CarrierOf[S], S] = ^.asInstanceOf[js.Dynamic].applyDynamic("prism")(predicate.asInstanceOf[js.Any]).asInstanceOf[Prism_[CarrierOf[S], S]]
  
  type AnyNewtype = Newtype[Any, Any]
  
  type CarrierOf[N /* <: AnyNewtype */] = /* import warning: importer.ImportType#apply Failed type conversion: N['_A'] */ js.Any
  
  type Concat[N1 /* <: Newtype[js.Object, Any] */, N2 /* <: Newtype[js.Object, CarrierOf[N1]] */] = Newtype[URIOf[N1] & URIOf[N2], CarrierOf[N1]]
  
  type Extends[N /* <: AnyNewtype */, Tags /* <: js.Object */] = Newtype[Tags & URIOf[N], CarrierOf[N]]
  
  trait Newtype[URI, A] extends StObject {
    
    val _A: A
    
    val _URI: URI
  }
  object Newtype {
    
    inline def apply[URI, A](_A: A, _URI: URI): Newtype[URI, A] = {
      val __obj = js.Dynamic.literal(_A = _A.asInstanceOf[js.Any], _URI = _URI.asInstanceOf[js.Any])
      __obj.asInstanceOf[Newtype[URI, A]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Newtype[?, ?], URI, A] (val x: Self & (Newtype[URI, A])) extends AnyVal {
      
      inline def set_A(value: A): Self = StObject.set(x, "_A", value.asInstanceOf[js.Any])
      
      inline def set_URI(value: URI): Self = StObject.set(x, "_URI", value.asInstanceOf[js.Any])
    }
  }
  
  type URIOf[N /* <: AnyNewtype */] = /* import warning: importer.ImportType#apply Failed type conversion: N['_URI'] */ js.Any
}
