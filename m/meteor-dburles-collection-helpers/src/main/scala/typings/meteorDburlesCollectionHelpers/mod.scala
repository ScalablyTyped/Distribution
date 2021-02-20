package typings.meteorDburlesCollectionHelpers

import org.scalablytyped.runtime.TopLevel
import typings.meteorDburlesCollectionHelpers.meteorDburlesCollectionHelpersStrings._meteor_dburles_collection_helpers_allowPartial
import typings.meteorDburlesCollectionHelpers.meteorDburlesCollectionHelpersStrings._meteor_dburles_collection_helpers_brand
import typings.meteorDburlesCollectionHelpers.meteorDburlesCollectionHelpersStrings._meteor_dburles_collection_helpers_flavor
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import typings.std.Required
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type AllowPartial = _meteor_dburles_collection_helpers_allowPartial
  
  type Brand = _meteor_dburles_collection_helpers_brand
  
  type Data[T] = DataFlavor[T] with NonHelpersOf[T] with Partial[HelpersOf[T]]
  
  @js.native
  trait DataFlavor[T] extends StObject {
    
    var _meteor_dburles_collection_helpers_isData: js.UndefOr[js.Tuple2[Flavor, T]] = js.native
  }
  object DataFlavor {
    
    @scala.inline
    def apply[T](): DataFlavor[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataFlavor[T]]
    }
    
    @scala.inline
    implicit class DataFlavorMutableBuilder[Self <: DataFlavor[_], T] (val x: Self with DataFlavor[T]) extends AnyVal {
      
      @scala.inline
      def set_meteor_dburles_collection_helpers_isData(value: js.Tuple2[Flavor, T]): Self = StObject.set(x, "_meteor_dburles_collection_helpers_isData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_meteor_dburles_collection_helpers_isDataUndefined: Self = StObject.set(x, "_meteor_dburles_collection_helpers_isData", js.undefined)
    }
  }
  
  type Flavor = _meteor_dburles_collection_helpers_flavor
  
  // apply HelpersFlavor, but only if the resulting type wouldn't be never or weak
  type FlavorAsHelpers[TOriginal, TToFlavor] = TToFlavor | (TToFlavor with HelpersFlavor[TOriginal])
  
  // types where HelperBrand will be used instead of HelperFlavor
  type FlavorUnsupportedTypes = js.UndefOr[Null]
  
  type Full[T] = NonData[NonHelpers[T]] with HelpersOf[NonData[NonHelpers[T]]]
  
  type Func = js.Function1[/* repeated */ js.Any, js.Any]
  
  type Helper[T] = (T with HelperFlavor) | T | HelperBrand
  
  // for types where (T & HelperFlavor) === never, (T | HelperBrand) is used instead,
  // and the HelperBrand is stripped off in HelpersOf
  // this is less preferable, because it means:
  // - on a value of the original interface type TInterface, Helper<null> and Helper<T | null> properties will
  //   not be assignable to null or to (T | null) respectively
  // - Helpers<Helpers<T>> !== Helpers<T> when T has Helper<null> or Helper<T | null> properties
  // however, this appears to be a limitation of Typescript (with strict null checks on, null and undefined
  // simply *can't* extend anything besides themselves (and void in undefined's case), so there's no way to
  // flavor them)
  @js.native
  trait HelperBrand
    extends _OptionalHelper[js.Any] {
    
    var _meteor_dburles_collection_helpers_isBrandUnsupportedHelper: Brand = js.native
  }
  object HelperBrand {
    
    @scala.inline
    def apply(_meteor_dburles_collection_helpers_isBrandUnsupportedHelper: Brand): HelperBrand = {
      val __obj = js.Dynamic.literal(_meteor_dburles_collection_helpers_isBrandUnsupportedHelper = _meteor_dburles_collection_helpers_isBrandUnsupportedHelper.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelperBrand]
    }
    
    @scala.inline
    implicit class HelperBrandMutableBuilder[Self <: HelperBrand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_meteor_dburles_collection_helpers_isBrandUnsupportedHelper(value: Brand): Self = StObject.set(x, "_meteor_dburles_collection_helpers_isBrandUnsupportedHelper", value.asInstanceOf[js.Any])
    }
  }
  
  // where possible, helpers are tagged as (T & HelperFlavor)
  // this is a technique called "flavoring" - (T & HelperFlavor) is assignable both to and from T for most T,
  // but the presence of the flavor can be checked since (T & HelperFlavor) is also assignable to HelperFlavor
  // (note that HelperFlavor is a "weak type" - since all its properties are optional, you might think anything
  // would be assignable to it, but Typescript prohibits assigning any type that doesn't share at least one
  // property with it)
  // weirdly, ({} & HelperFlavor) still accepts {}!
  @js.native
  trait HelperFlavor extends StObject {
    
    var _meteor_dburles_collection_helpers_isHelper: js.UndefOr[Flavor] = js.native
  }
  object HelperFlavor {
    
    @scala.inline
    def apply(): HelperFlavor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelperFlavor]
    }
    
    @scala.inline
    implicit class HelperFlavorMutableBuilder[Self <: HelperFlavor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_meteor_dburles_collection_helpers_isHelper(value: Flavor): Self = StObject.set(x, "_meteor_dburles_collection_helpers_isHelper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_meteor_dburles_collection_helpers_isHelperUndefined: Self = StObject.set(x, "_meteor_dburles_collection_helpers_isHelper", js.undefined)
    }
  }
  
  // The names of all properties of T with either a HelperBrand or a HelperFlavor (whether required or optional)
  type HelperNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: std.Exclude<T[K], undefined> extends infer NoUndefined? [meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperBrand] extends [any]? K : [meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperBrand | meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperBrand] extends [any]? K : [std.Required<any>] extends [/ * Inlined std.Required<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperFlavor> * /
  {  _meteor_dburles_collection_helpers_isHelper :meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.Flavor}]? K : [std.Required<any>] extends [/ * Inlined std.Required<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperFlavor & meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperFlavor> * /
  {  _meteor_dburles_collection_helpers_isHelper :meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.Flavor,   _meteor_dburles_collection_helpers_isOptionalHelper :meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.Flavor}]? K : never : never}[keyof T] */ js.Any
  
  type Helpers[T] = FlavorAsHelpers[
    T, 
    (// methods will only ever get called on a Full<T> (unless you directly declare a Helpers<T>, but *why*)
  ThisType[Full[T]]) with HelpersOf[NonHelpers[NonData[T]]]
  ]
  
  // used to flavor Helpers<T> so we can get back to the original T if needed
  // not to be confused with HelperFlavor
  @js.native
  trait HelpersFlavor[T] extends StObject {
    
    var _meteor_dburles_collection_helpers_isHelpersOf: js.UndefOr[js.Tuple2[Flavor, T]] = js.native
  }
  object HelpersFlavor {
    
    @scala.inline
    def apply[T](): HelpersFlavor[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelpersFlavor[T]]
    }
    
    @scala.inline
    implicit class HelpersFlavorMutableBuilder[Self <: HelpersFlavor[_], T] (val x: Self with HelpersFlavor[T]) extends AnyVal {
      
      @scala.inline
      def set_meteor_dburles_collection_helpers_isHelpersOf(value: js.Tuple2[Flavor, T]): Self = StObject.set(x, "_meteor_dburles_collection_helpers_isHelpersOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_meteor_dburles_collection_helpers_isHelpersOfUndefined: Self = StObject.set(x, "_meteor_dburles_collection_helpers_isHelpersOf", js.undefined)
    }
  }
  
  // To get all the helper properties, we union the list of function properties and the list of Helper<T> properties.
  // Make anything not marked optional required, and anything marked optional optional.
  type HelpersOf[T] = RemoveHelperBrands[
    (Required[
      Pick[
        T, 
        Exclude[
          (PropertyNamesMatching[Required[T], Func]) | HelperNames[Required[T]], 
          OptionalHelperNames[Required[T]]
        ]
      ]
    ]) with (Partial[Pick[T, OptionalHelperNames[Required[T]]]])
  ]
  
  type NonData[T] = T
  
  type NonHelpers[T] = T
  
  // All the members of T that aren't helpers
  type NonHelpersOf[T] = Pick[
    T, 
    Exclude[
      PropertyNamesNotMatching[Required[T], Func], 
      HelperNames[Required[T]] | OptionalHelperNames[Required[T]]
    ]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - T with typings.meteorDburlesCollectionHelpers.mod.HelperFlavor with typings.meteorDburlesCollectionHelpers.mod.OptionalHelperFlavor
    - js.UndefOr[scala.Nothing]
    - T
    - typings.meteorDburlesCollectionHelpers.mod.HelperBrand
    - typings.meteorDburlesCollectionHelpers.mod.OptionalHelperBrand
  */
  type OptionalHelper[T] = js.UndefOr[_OptionalHelper[T] | (T with HelperFlavor with OptionalHelperFlavor) | T]
  
  @js.native
  trait OptionalHelperBrand
    extends _OptionalHelper[js.Any] {
    
    var _meteor_dburles_collection_helpers_isBrandUnsupportedOptionalHelper: js.UndefOr[Brand] = js.native
  }
  object OptionalHelperBrand {
    
    @scala.inline
    def apply(): OptionalHelperBrand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalHelperBrand]
    }
    
    @scala.inline
    implicit class OptionalHelperBrandMutableBuilder[Self <: OptionalHelperBrand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_meteor_dburles_collection_helpers_isBrandUnsupportedOptionalHelper(value: Brand): Self = StObject.set(x, "_meteor_dburles_collection_helpers_isBrandUnsupportedOptionalHelper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_meteor_dburles_collection_helpers_isBrandUnsupportedOptionalHelperUndefined: Self = StObject.set(x, "_meteor_dburles_collection_helpers_isBrandUnsupportedOptionalHelper", js.undefined)
    }
  }
  
  @js.native
  trait OptionalHelperFlavor extends StObject {
    
    var _meteor_dburles_collection_helpers_isOptionalHelper: js.UndefOr[Flavor] = js.native
  }
  object OptionalHelperFlavor {
    
    @scala.inline
    def apply(): OptionalHelperFlavor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalHelperFlavor]
    }
    
    @scala.inline
    implicit class OptionalHelperFlavorMutableBuilder[Self <: OptionalHelperFlavor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_meteor_dburles_collection_helpers_isOptionalHelper(value: Flavor): Self = StObject.set(x, "_meteor_dburles_collection_helpers_isOptionalHelper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_meteor_dburles_collection_helpers_isOptionalHelperUndefined: Self = StObject.set(x, "_meteor_dburles_collection_helpers_isOptionalHelper", js.undefined)
    }
  }
  
  type OptionalHelperNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: std.Exclude<T[K], undefined> extends infer NoUndefined? [meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperBrand | meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperBrand] extends [any]? K : [std.Required<any>] extends [/ * Inlined std.Required<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperFlavor & meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperFlavor> * /
  {  _meteor_dburles_collection_helpers_isHelper :meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.Flavor,   _meteor_dburles_collection_helpers_isOptionalHelper :meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.Flavor}]? K : never : never}[keyof T] */ js.Any
  
  type PartialHelpers[T] = ThisType[NonData[NonHelpers[T]]] with Partial[Helpers[T]]
  
  type PropertyNamesMatching[T, TPred] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends TPred? K : never}[keyof T] */ js.Any
  
  type PropertyNamesNotMatching[T, TPred] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends TPred? never : K}[keyof T] */ js.Any
  
  // We also want to strip brands from the flavor-unsupported types - since the brands are no longer needed to
  // tell us which types are helpers, *
  type RemoveHelperBrands[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: std.Exclude<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.RemoveHelperFlavorForVoid<T[K]>, meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperBrand | meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperBrand>}
    */ typings.meteorDburlesCollectionHelpers.meteorDburlesCollectionHelpersStrings.RemoveHelperBrands with TopLevel[T]
  
  // void is a bit of a weird case; unlike the others, it doesn't explicitly become never when flavored,
  // and (void & HelperFlavor) *is* assignable to void, but only other expressions of type (void & HelperFlavor)
  // are assignable to it
  // however, this is just enough to let us support it with a bit of special-casing - convert it back to normal
  // void when stripping helper brands, and Helpers<TInterface>.helperVoidProperty can be assigned undefined!
  // This is one way to make a helper with an optional value that can be read off a raw TInterface (although
  // Helper<T | false> would work almost as well).
  // tslint:disable-next-line void-return
  type RemoveHelperFlavorForVoid[T] = T | Unit
  
  trait _OptionalHelper[T] extends StObject
  object _OptionalHelper {
    
    @scala.inline
    def HelperBrand(_meteor_dburles_collection_helpers_isBrandUnsupportedHelper: Brand): typings.meteorDburlesCollectionHelpers.mod.HelperBrand = {
      val __obj = js.Dynamic.literal(_meteor_dburles_collection_helpers_isBrandUnsupportedHelper = _meteor_dburles_collection_helpers_isBrandUnsupportedHelper.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.meteorDburlesCollectionHelpers.mod.HelperBrand]
    }
    
    @scala.inline
    def OptionalHelperBrand(): typings.meteorDburlesCollectionHelpers.mod.OptionalHelperBrand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.meteorDburlesCollectionHelpers.mod.OptionalHelperBrand]
    }
  }
}
