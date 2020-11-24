package typings.meteorDburlesCollectionHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AllowPartial = typings.meteorDburlesCollectionHelpers.meteorDburlesCollectionHelpersStrings._meteor_dburles_collection_helpers_allowPartial
  
  type Brand = typings.meteorDburlesCollectionHelpers.meteorDburlesCollectionHelpersStrings._meteor_dburles_collection_helpers_brand
  
  type Data[T] = typings.meteorDburlesCollectionHelpers.mod.DataFlavor[T] with typings.meteorDburlesCollectionHelpers.mod.NonHelpersOf[T] with typings.std.Partial[typings.meteorDburlesCollectionHelpers.mod.HelpersOf[T]]
  
  type Flavor = typings.meteorDburlesCollectionHelpers.meteorDburlesCollectionHelpersStrings._meteor_dburles_collection_helpers_flavor
  
  // apply HelpersFlavor, but only if the resulting type wouldn't be never or weak
  type FlavorAsHelpers[TOriginal, TToFlavor] = TToFlavor | (TToFlavor with typings.meteorDburlesCollectionHelpers.mod.HelpersFlavor[TOriginal])
  
  // types where HelperBrand will be used instead of HelperFlavor
  type FlavorUnsupportedTypes = js.UndefOr[scala.Null]
  
  type Full[T] = typings.meteorDburlesCollectionHelpers.mod.NonData[typings.meteorDburlesCollectionHelpers.mod.NonHelpers[T]] with (typings.meteorDburlesCollectionHelpers.mod.HelpersOf[
    typings.meteorDburlesCollectionHelpers.mod.NonData[typings.meteorDburlesCollectionHelpers.mod.NonHelpers[T]]
  ])
  
  type Func = js.Function1[/* repeated */ js.Any, js.Any]
  
  type Helper[T] = (T with typings.meteorDburlesCollectionHelpers.mod.HelperFlavor) | T | typings.meteorDburlesCollectionHelpers.mod.HelperBrand
  
  // The names of all properties of T with either a HelperBrand or a HelperFlavor (whether required or optional)
  type HelperNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: std.Exclude<T[K], undefined> extends infer NoUndefined? [meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperBrand] extends [any]? K : [meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperBrand | meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperBrand] extends [any]? K : [std.Required<any>] extends [/ * Inlined std.Required<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperFlavor> * /
  {  _meteor_dburles_collection_helpers_isHelper :meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.Flavor}]? K : [std.Required<any>] extends [/ * Inlined std.Required<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperFlavor & meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperFlavor> * /
  {  _meteor_dburles_collection_helpers_isHelper :meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.Flavor,   _meteor_dburles_collection_helpers_isOptionalHelper :meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.Flavor}]? K : never : never}[keyof T] */ js.Any
  
  type Helpers[T] = typings.meteorDburlesCollectionHelpers.mod.FlavorAsHelpers[
    T, 
    (// methods will only ever get called on a Full<T> (unless you directly declare a Helpers<T>, but *why*)
  typings.std.ThisType[typings.meteorDburlesCollectionHelpers.mod.Full[T]]) with (typings.meteorDburlesCollectionHelpers.mod.HelpersOf[
      typings.meteorDburlesCollectionHelpers.mod.NonHelpers[typings.meteorDburlesCollectionHelpers.mod.NonData[T]]
    ])
  ]
  
  // To get all the helper properties, we union the list of function properties and the list of Helper<T> properties.
  // Make anything not marked optional required, and anything marked optional optional.
  type HelpersOf[T] = typings.meteorDburlesCollectionHelpers.mod.RemoveHelperBrands[
    (typings.std.Required[
      typings.std.Pick[
        T, 
        typings.std.Exclude[
          (typings.meteorDburlesCollectionHelpers.mod.PropertyNamesMatching[typings.std.Required[T], typings.meteorDburlesCollectionHelpers.mod.Func]) | typings.meteorDburlesCollectionHelpers.mod.HelperNames[typings.std.Required[T]], 
          typings.meteorDburlesCollectionHelpers.mod.OptionalHelperNames[typings.std.Required[T]]
        ]
      ]
    ]) with (typings.std.Partial[
      typings.std.Pick[
        T, 
        typings.meteorDburlesCollectionHelpers.mod.OptionalHelperNames[typings.std.Required[T]]
      ]
    ])
  ]
  
  type NonData[T] = T
  
  type NonHelpers[T] = T
  
  // All the members of T that aren't helpers
  type NonHelpersOf[T] = typings.std.Pick[
    T, 
    typings.std.Exclude[
      typings.meteorDburlesCollectionHelpers.mod.PropertyNamesNotMatching[typings.std.Required[T], typings.meteorDburlesCollectionHelpers.mod.Func], 
      typings.meteorDburlesCollectionHelpers.mod.HelperNames[typings.std.Required[T]] | typings.meteorDburlesCollectionHelpers.mod.OptionalHelperNames[typings.std.Required[T]]
    ]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - T with typings.meteorDburlesCollectionHelpers.mod.HelperFlavor with typings.meteorDburlesCollectionHelpers.mod.OptionalHelperFlavor
    - js.UndefOr[scala.Nothing]
    - T
    - typings.meteorDburlesCollectionHelpers.mod.HelperBrand
    - typings.meteorDburlesCollectionHelpers.mod.OptionalHelperBrand
  */
  type OptionalHelper[T] = js.UndefOr[
    typings.meteorDburlesCollectionHelpers.mod._OptionalHelper[T] | (T with typings.meteorDburlesCollectionHelpers.mod.HelperFlavor with typings.meteorDburlesCollectionHelpers.mod.OptionalHelperFlavor) | T
  ]
  
  type OptionalHelperNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: std.Exclude<T[K], undefined> extends infer NoUndefined? [meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperBrand | meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperBrand] extends [any]? K : [std.Required<any>] extends [/ * Inlined std.Required<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperFlavor & meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperFlavor> * /
  {  _meteor_dburles_collection_helpers_isHelper :meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.Flavor,   _meteor_dburles_collection_helpers_isOptionalHelper :meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.Flavor}]? K : never : never}[keyof T] */ js.Any
  
  type PartialHelpers[T] = (typings.std.ThisType[
    typings.meteorDburlesCollectionHelpers.mod.NonData[typings.meteorDburlesCollectionHelpers.mod.NonHelpers[T]]
  ]) with typings.std.Partial[typings.meteorDburlesCollectionHelpers.mod.Helpers[T]]
  
  type PropertyNamesMatching[T, TPred] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends TPred? K : never}[keyof T] */ js.Any
  
  type PropertyNamesNotMatching[T, TPred] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends TPred? never : K}[keyof T] */ js.Any
  
  // We also want to strip brands from the flavor-unsupported types - since the brands are no longer needed to
  // tell us which types are helpers, *
  type RemoveHelperBrands[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: std.Exclude<meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.RemoveHelperFlavorForVoid<T[K]>, meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.HelperBrand | meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.OptionalHelperBrand>}
    */ typings.meteorDburlesCollectionHelpers.meteorDburlesCollectionHelpersStrings.RemoveHelperBrands with org.scalablytyped.runtime.TopLevel[T]
  
  // void is a bit of a weird case; unlike the others, it doesn't explicitly become never when flavored,
  // and (void & HelperFlavor) *is* assignable to void, but only other expressions of type (void & HelperFlavor)
  // are assignable to it
  // however, this is just enough to let us support it with a bit of special-casing - convert it back to normal
  // void when stripping helper brands, and Helpers<TInterface>.helperVoidProperty can be assigned undefined!
  // This is one way to make a helper with an optional value that can be read off a raw TInterface (although
  // Helper<T | false> would work almost as well).
  // tslint:disable-next-line void-return
  type RemoveHelperFlavorForVoid[T] = T | scala.Unit
}
