package typings.meteorDburlesCollectionHelpers

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorDburlesColoncollectionHelpersMod {
  
  type AllowPartial = _meteor_dburles_collection_helpers_allowPartial
  
  type Brand = _meteor_dburles_collection_helpers_brand
  
  type Data[T] = DataFlavor[T] & NonHelpersOf[T] & (/* import warning: importer.ImportType#apply Failed type conversion: T extends T ? std.Partial<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelpersOf<T>> : never */ js.Any)
  
  trait DataFlavor[T] extends StObject {
    
    var _meteor_dburles_collection_helpers_isData: js.UndefOr[js.Tuple2[Flavor, T]] = js.undefined
  }
  object DataFlavor {
    
    inline def apply[T](): DataFlavor[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataFlavor[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataFlavor[?], T] (val x: Self & DataFlavor[T]) extends AnyVal {
      
      inline def set_meteor_dburles_collection_helpers_isData(value: js.Tuple2[Flavor, T]): Self = StObject.set(x, "_meteor_dburles_collection_helpers_isData", value.asInstanceOf[js.Any])
      
      inline def set_meteor_dburles_collection_helpers_isDataUndefined: Self = StObject.set(x, "_meteor_dburles_collection_helpers_isData", js.undefined)
    }
  }
  
  type Flavor = _meteor_dburles_collection_helpers_flavor
  
  // apply HelpersFlavor, but only if the resulting type wouldn't be never or weak
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [TToFlavor] extends [TToFlavor & meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelpersFlavor<TOriginal>] ? TToFlavor & meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelpersFlavor<TOriginal> : TToFlavor
    }}}
    */
  type FlavorAsHelpers[TOriginal, TToFlavor] = TToFlavor
  
  // types where HelperBrand will be used instead of HelperFlavor
  type FlavorUnsupportedTypes = js.UndefOr[Null]
  
  type Full[T] = NonData[NonHelpers[T]] & (/* import warning: importer.ImportType#apply Failed type conversion: T extends T ? meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelpersOf<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.NonData<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.NonHelpers<T>>> : never */ js.Any)
  
  @js.native
  trait Func extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends T ? T extends meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.FlavorUnsupportedTypes ? T | meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperBrand : T & meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperFlavor : never
    }}}
    */
  type Helper[T] = T | HelperBrand
  
  // for types where (T & HelperFlavor) === never, (T | HelperBrand) is used instead,
  // and the HelperBrand is stripped off in HelpersOf
  // this is less preferable, because it means:
  // - on a value of the original interface type TInterface, Helper<null> and Helper<T | null> properties will
  //   not be assignable to null or to (T | null) respectively
  // - Helpers<Helpers<T>> !== Helpers<T> when T has Helper<null> or Helper<T | null> properties
  // however, this appears to be a limitation of Typescript (with strict null checks on, null and undefined
  // simply *can't* extend anything besides themselves (and void in undefined's case), so there's no way to
  // flavor them)
  trait HelperBrand
    extends StObject
       with _OptionalHelper[Any] {
    
    var _meteor_dburles_collection_helpers_isBrandUnsupportedHelper: Brand
  }
  object HelperBrand {
    
    inline def apply(_meteor_dburles_collection_helpers_isBrandUnsupportedHelper: Brand): HelperBrand = {
      val __obj = js.Dynamic.literal(_meteor_dburles_collection_helpers_isBrandUnsupportedHelper = _meteor_dburles_collection_helpers_isBrandUnsupportedHelper.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelperBrand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelperBrand] (val x: Self) extends AnyVal {
      
      inline def set_meteor_dburles_collection_helpers_isBrandUnsupportedHelper(value: Brand): Self = StObject.set(x, "_meteor_dburles_collection_helpers_isBrandUnsupportedHelper", value.asInstanceOf[js.Any])
    }
  }
  
  // where possible, helpers are tagged as (T & HelperFlavor)
  // this is a technique called "flavoring" - (T & HelperFlavor) is assignable both to and from T for most T,
  // but the presence of the flavor can be checked since (T & HelperFlavor) is also assignable to HelperFlavor
  // (note that HelperFlavor is a "weak type" - since all its properties are optional, you might think anything
  // would be assignable to it, but Typescript prohibits assigning any type that doesn't share at least one
  // property with it)
  // weirdly, ({} & HelperFlavor) still accepts {}!
  trait HelperFlavor extends StObject {
    
    var _meteor_dburles_collection_helpers_isHelper: js.UndefOr[Flavor] = js.undefined
  }
  object HelperFlavor {
    
    inline def apply(): HelperFlavor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelperFlavor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelperFlavor] (val x: Self) extends AnyVal {
      
      inline def set_meteor_dburles_collection_helpers_isHelper(value: Flavor): Self = StObject.set(x, "_meteor_dburles_collection_helpers_isHelper", value.asInstanceOf[js.Any])
      
      inline def set_meteor_dburles_collection_helpers_isHelperUndefined: Self = StObject.set(x, "_meteor_dburles_collection_helpers_isHelper", js.undefined)
    }
  }
  
  // The names of all properties of T with either a HelperBrand or a HelperFlavor (whether required or optional)
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends T ? {[ K in keyof T ]: std.Exclude<T[K], undefined> extends infer NoUndefined? [meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperBrand] extends [NoUndefined]? K : [meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperBrand | meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperBrand] extends [NoUndefined]? K : [std.Required<NoUndefined>] extends [/ * Inlined std.Required<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperFlavor> * /
  {  _meteor_dburles_collection_helpers_isHelper :meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.Flavor}]? K : [std.Required<NoUndefined>] extends [/ * Inlined std.Required<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperFlavor & meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperFlavor> * /
  {  _meteor_dburles_collection_helpers_isHelper :meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.Flavor,   _meteor_dburles_collection_helpers_isOptionalHelper :meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.Flavor}]? K : never : never}[keyof T] : never
    }}}
    */
  @js.native
  trait HelperNames[T] extends StObject
  
  type Helpers[T] = FlavorAsHelpers[
    T, 
    (// methods will only ever get called on a Full<T> (unless you directly declare a Helpers<T>, but *why*)
  ThisType[Full[T]]) & (/* import warning: importer.ImportType#apply Failed type conversion: T extends T ? meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelpersOf<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.NonHelpers<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.NonData<T>>> : never */ js.Any)
  ]
  
  // used to flavor Helpers<T> so we can get back to the original T if needed
  // not to be confused with HelperFlavor
  trait HelpersFlavor[T] extends StObject {
    
    var _meteor_dburles_collection_helpers_isHelpersOf: js.UndefOr[js.Tuple2[Flavor, T]] = js.undefined
  }
  object HelpersFlavor {
    
    inline def apply[T](): HelpersFlavor[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelpersFlavor[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelpersFlavor[?], T] (val x: Self & HelpersFlavor[T]) extends AnyVal {
      
      inline def set_meteor_dburles_collection_helpers_isHelpersOf(value: js.Tuple2[Flavor, T]): Self = StObject.set(x, "_meteor_dburles_collection_helpers_isHelpersOf", value.asInstanceOf[js.Any])
      
      inline def set_meteor_dburles_collection_helpers_isHelpersOfUndefined: Self = StObject.set(x, "_meteor_dburles_collection_helpers_isHelpersOf", js.undefined)
    }
  }
  
  // To get all the helper properties, we union the list of function properties and the list of Helper<T> properties.
  // Make anything not marked optional required, and anything marked optional optional.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends T ? meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.RemoveHelperBrands<std.Required<std.Pick<T, std.Exclude<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.PropertyNamesMatching<std.Required<T>, meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.Func> | meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperNames<std.Required<T>>, meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperNames<std.Required<T>>>>> & std.Partial<std.Pick<T, meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperNames<std.Required<T>>>>> : never
    }}}
    */
  type HelpersOf[T] = RemoveHelperBrands[
    (Required[
      Pick[
        T, 
        Exclude[
          (PropertyNamesMatching[Required[T], Func]) | HelperNames[Required[T]], 
          OptionalHelperNames[Required[T]]
        ]
      ]
    ]) & (Partial[Pick[T, OptionalHelperNames[Required[T]]]])
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.DataFlavor<infer U> ? U : T
    }}}
    */
  type NonData[T] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelpersFlavor<infer U> ? U : T
    }}}
    */
  type NonHelpers[T] = T
  
  // All the members of T that aren't helpers
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends T ? std.Pick<T, std.Exclude<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.PropertyNamesNotMatching<std.Required<T>, meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.Func>, meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperNames<std.Required<T>> | meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperNames<std.Required<T>>>> : never
    }}}
    */
  type NonHelpersOf[T] = Pick[
    T, 
    Exclude[
      PropertyNamesNotMatching[Required[T], Func], 
      HelperNames[Required[T]] | OptionalHelperNames[Required[T]]
    ]
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends T ? T extends meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.FlavorUnsupportedTypes ? T | meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperBrand | meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperBrand | undefined : T & meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperFlavor & meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperFlavor | undefined : never
    }}}
    */
  /* Rewritten from type alias, can be one of: 
    - T
    - typings.meteorDburlesCollectionHelpers.meteorDburlesColoncollectionHelpersMod.HelperBrand
    - typings.meteorDburlesCollectionHelpers.meteorDburlesColoncollectionHelpersMod.OptionalHelperBrand
    - scala.Unit
  */
  type OptionalHelper[T] = js.UndefOr[_OptionalHelper[T] | T]
  
  trait OptionalHelperBrand
    extends StObject
       with _OptionalHelper[Any] {
    
    var _meteor_dburles_collection_helpers_isBrandUnsupportedOptionalHelper: js.UndefOr[Brand] = js.undefined
  }
  object OptionalHelperBrand {
    
    inline def apply(): OptionalHelperBrand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalHelperBrand]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionalHelperBrand] (val x: Self) extends AnyVal {
      
      inline def set_meteor_dburles_collection_helpers_isBrandUnsupportedOptionalHelper(value: Brand): Self = StObject.set(x, "_meteor_dburles_collection_helpers_isBrandUnsupportedOptionalHelper", value.asInstanceOf[js.Any])
      
      inline def set_meteor_dburles_collection_helpers_isBrandUnsupportedOptionalHelperUndefined: Self = StObject.set(x, "_meteor_dburles_collection_helpers_isBrandUnsupportedOptionalHelper", js.undefined)
    }
  }
  
  trait OptionalHelperFlavor extends StObject {
    
    var _meteor_dburles_collection_helpers_isOptionalHelper: js.UndefOr[Flavor] = js.undefined
  }
  object OptionalHelperFlavor {
    
    inline def apply(): OptionalHelperFlavor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalHelperFlavor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionalHelperFlavor] (val x: Self) extends AnyVal {
      
      inline def set_meteor_dburles_collection_helpers_isOptionalHelper(value: Flavor): Self = StObject.set(x, "_meteor_dburles_collection_helpers_isOptionalHelper", value.asInstanceOf[js.Any])
      
      inline def set_meteor_dburles_collection_helpers_isOptionalHelperUndefined: Self = StObject.set(x, "_meteor_dburles_collection_helpers_isOptionalHelper", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends T ? {[ K in keyof T ]: std.Exclude<T[K], undefined> extends infer NoUndefined? [meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperBrand | meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperBrand] extends [NoUndefined]? K : [std.Required<NoUndefined>] extends [/ * Inlined std.Required<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperFlavor & meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperFlavor> * /
  {  _meteor_dburles_collection_helpers_isHelper :meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.Flavor,   _meteor_dburles_collection_helpers_isOptionalHelper :meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.Flavor}]? K : never : never}[keyof T] : never
    }}}
    */
  @js.native
  trait OptionalHelperNames[T] extends StObject
  
  type PartialHelpers[T] = ThisType[NonData[NonHelpers[T]]] & Partial[Helpers[T]]
  
  type PropertyNamesMatching[T, TPred] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends TPred? K : never}[keyof T] */ js.Any
  
  type PropertyNamesNotMatching[T, TPred] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends TPred? never : K}[keyof T] */ js.Any
  
  // We also want to strip brands from the flavor-unsupported types - since the brands are no longer needed to
  // tell us which types are helpers, *
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: std.Exclude<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.RemoveHelperFlavorForVoid<T[K]>, meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperBrand | meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperBrand>}
    }}}
    */
  @js.native
  trait RemoveHelperBrands[T] extends StObject
  
  // void is a bit of a weird case; unlike the others, it doesn't explicitly become never when flavored,
  // and (void & HelperFlavor) *is* assignable to void, but only other expressions of type (void & HelperFlavor)
  // are assignable to it
  // however, this is just enough to let us support it with a bit of special-casing - convert it back to normal
  // void when stripping helper brands, and Helpers<TInterface>.helperVoidProperty can be assigned undefined!
  // This is one way to make a helper with an optional value that can be read off a raw TInterface (although
  // Helper<T | false> would work almost as well).
  // tslint:disable-next-line void-return
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends void & meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperFlavor ? void : T
    }}}
    */
  type RemoveHelperFlavorForVoid[T] = T
  
  trait _OptionalHelper[T] extends StObject
  object _OptionalHelper {
    
    inline def HelperBrand(_meteor_dburles_collection_helpers_isBrandUnsupportedHelper: Brand): typings.meteorDburlesCollectionHelpers.meteorDburlesColoncollectionHelpersMod.HelperBrand = {
      val __obj = js.Dynamic.literal(_meteor_dburles_collection_helpers_isBrandUnsupportedHelper = _meteor_dburles_collection_helpers_isBrandUnsupportedHelper.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.meteorDburlesCollectionHelpers.meteorDburlesColoncollectionHelpersMod.HelperBrand]
    }
    
    inline def OptionalHelperBrand(): typings.meteorDburlesCollectionHelpers.meteorDburlesColoncollectionHelpersMod.OptionalHelperBrand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.meteorDburlesCollectionHelpers.meteorDburlesColoncollectionHelpersMod.OptionalHelperBrand]
    }
  }
}
