package typings.mobxStateTree

import typings.mobxStateTree.anon.AcceptsUndefined
import typings.mobxStateTree.anon.Fn0
import typings.mobxStateTree.anon.Fn1
import typings.mobxStateTree.anon.Fn2
import typings.mobxStateTree.anon.FnCall
import typings.mobxStateTree.anon.FnCallDefaultValue
import typings.mobxStateTree.anon.FnCallNameABCDEFGHI
import typings.mobxStateTree.anon.FnCallNameProperties
import typings.mobxStateTree.anon.FnCallNameType
import typings.mobxStateTree.anon.FnCallNameTypePredicateMessage
import typings.mobxStateTree.anon.FnCallOptions
import typings.mobxStateTree.anon.FnCallOptionsABCDEFGHI
import typings.mobxStateTree.anon.FnCallSubTypeOptions
import typings.mobxStateTree.anon.FnCallSubtype
import typings.mobxStateTree.anon.FnCallType
import typings.mobxStateTree.anon.FnCallTypeDefaultValueOrFunctionOptionalValues
import typings.mobxStateTree.anon.FnCallTypeProcessorsName
import typings.mobxStateTree.anon.FnCallValue
import typings.mobxStateTree.anon.OnInvalidated
import typings.mobxStateTree.distCoreTypeTypeMod.IAnyComplexType
import typings.mobxStateTree.distCoreTypeTypeMod.IAnyType
import typings.mobxStateTree.distCoreTypeTypeMod.ISimpleType
import typings.mobxStateTree.distCoreTypeTypeMod.IType
import typings.mobxStateTree.distTypesComplexTypesArrayMod.IArrayType
import typings.mobxStateTree.distTypesComplexTypesMapMod.IMapType
import typings.mobxStateTree.distTypesComplexTypesModelMod.CustomJoin
import typings.mobxStateTree.distTypesComplexTypesModelMod.IModelType
import typings.mobxStateTree.distTypesComplexTypesModelMod.ModelCreationType2
import typings.mobxStateTree.distTypesComplexTypesModelMod.ModelInstanceType
import typings.mobxStateTree.distTypesComplexTypesModelMod.ModelProperties
import typings.mobxStateTree.distTypesComplexTypesModelMod.ModelPropertiesDeclaration
import typings.mobxStateTree.distTypesComplexTypesModelMod.ModelPropertiesDeclarationToProperties
import typings.mobxStateTree.distTypesComplexTypesModelMod.ModelSnapshotType2
import typings.mobxStateTree.distTypesUtilityTypesCustomMod.CustomTypeOptions
import typings.mobxStateTree.distTypesUtilityTypesEnumerationMod.UnionStringArray
import typings.mobxStateTree.distTypesUtilityTypesMaybeMod.IMaybe
import typings.mobxStateTree.distTypesUtilityTypesMaybeMod.IMaybeNull
import typings.mobxStateTree.distTypesUtilityTypesOptionalMod.IOptionalIType
import typings.mobxStateTree.distTypesUtilityTypesOptionalMod.OptionalDefaultValueOrFunction
import typings.mobxStateTree.distTypesUtilityTypesOptionalMod.ValidOptionalValues
import typings.mobxStateTree.distTypesUtilityTypesReferenceMod.IReferenceType
import typings.mobxStateTree.distTypesUtilityTypesReferenceMod.ReferenceOptions
import typings.mobxStateTree.distTypesUtilityTypesReferenceMod.ReferenceOptionsGetSet
import typings.mobxStateTree.distTypesUtilityTypesSnapshotProcessorMod.ISnapshotProcessor
import typings.mobxStateTree.distTypesUtilityTypesSnapshotProcessorMod.ISnapshotProcessors
import typings.mobxStateTree.distTypesUtilityTypesSnapshotProcessorMod.NotCustomized
import typings.mobxStateTree.distTypesUtilityTypesUnionMod.ITypeUnion
import typings.mobxStateTree.distTypesUtilityTypesUnionMod.UnionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  object types {
    
    @JSImport("mobx-state-tree/dist/types", "types")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx-state-tree/dist/types", "types.Date")
    @js.native
    def Date: IType[Double | js.Date, Double, js.Date] = js.native
    inline def Date_=(x: IType[Double | js.Date, Double, js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Date")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.array")
    @js.native
    def array: Fn2 = js.native
    inline def array[IT /* <: IAnyType */](subtype: IT): IArrayType[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(subtype.asInstanceOf[js.Any]).asInstanceOf[IArrayType[IT]]
    inline def array_=(x: Fn2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("array")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.boolean")
    @js.native
    def boolean: ISimpleType[Boolean] = js.native
    inline def boolean_=(x: ISimpleType[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boolean")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.compose")
    @js.native
    def compose: FnCallNameABCDEFGHI = js.native
    inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): IModelType[PA & PB, OA & OB, CustomJoin[FCA, FCB], CustomJoin[FSA, FSB]] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any])).asInstanceOf[IModelType[PA & PB, OA & OB, CustomJoin[FCA, FCB], CustomJoin[FSA, FSB]]]
    inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](name: String, A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): IModelType[PA & PB, OA & OB, CustomJoin[FCA, FCB], CustomJoin[FSA, FSB]] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(name.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any])).asInstanceOf[IModelType[PA & PB, OA & OB, CustomJoin[FCA, FCB], CustomJoin[FSA, FSB]]]
    inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB], C: IModelType[PC, OC, FCC, FSC]): IModelType[
        PA & PB & PC, 
        OA & OB & OC, 
        CustomJoin[FCA, CustomJoin[FCB, FCC]], 
        CustomJoin[FSA, CustomJoin[FSB, FSC]]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[IModelType[
        PA & PB & PC, 
        OA & OB & OC, 
        CustomJoin[FCA, CustomJoin[FCB, FCC]], 
        CustomJoin[FSA, CustomJoin[FSB, FSC]]
      ]]
    inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](
      name: String,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC]
    ): IModelType[
        PA & PB & PC, 
        OA & OB & OC, 
        CustomJoin[FCA, CustomJoin[FCB, FCC]], 
        CustomJoin[FSA, CustomJoin[FSB, FSC]]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(name.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[IModelType[
        PA & PB & PC, 
        OA & OB & OC, 
        CustomJoin[FCA, CustomJoin[FCB, FCC]], 
        CustomJoin[FSA, CustomJoin[FSB, FSC]]
      ]]
    inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD]
    ): IModelType[
        PA & PB & PC & PD, 
        OA & OB & OC & OD, 
        CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, FCD]]], 
        CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, FSD]]]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any])).asInstanceOf[IModelType[
        PA & PB & PC & PD, 
        OA & OB & OC & OD, 
        CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, FCD]]], 
        CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, FSD]]]
      ]]
    inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
      name: String,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD]
    ): IModelType[
        PA & PB & PC & PD, 
        OA & OB & OC & OD, 
        CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, FCD]]], 
        CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, FSD]]]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(name.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any])).asInstanceOf[IModelType[
        PA & PB & PC & PD, 
        OA & OB & OC & OD, 
        CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, FCD]]], 
        CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, FSD]]]
      ]]
    inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE]
    ): IModelType[
        PA & PB & PC & PD & PE, 
        OA & OB & OC & OD & OE, 
        CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, FCE]]]], 
        CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, FSE]]]]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any])).asInstanceOf[IModelType[
        PA & PB & PC & PD & PE, 
        OA & OB & OC & OD & OE, 
        CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, FCE]]]], 
        CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, FSE]]]]
      ]]
    inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
      name: String,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE]
    ): IModelType[
        PA & PB & PC & PD & PE, 
        OA & OB & OC & OD & OE, 
        CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, FCE]]]], 
        CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, FSE]]]]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(name.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any])).asInstanceOf[IModelType[
        PA & PB & PC & PD & PE, 
        OA & OB & OC & OD & OE, 
        CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, FCE]]]], 
        CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, FSE]]]]
      ]]
    inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF]
    ): IModelType[
        PA & PB & PC & PD & PE & PF, 
        OA & OB & OC & OD & OE & OF, 
        CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, FCF]]]]], 
        CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, FSF]]]]]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[IModelType[
        PA & PB & PC & PD & PE & PF, 
        OA & OB & OC & OD & OE & OF, 
        CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, FCF]]]]], 
        CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, FSF]]]]]
      ]]
    inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
      name: String,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF]
    ): IModelType[
        PA & PB & PC & PD & PE & PF, 
        OA & OB & OC & OD & OE & OF, 
        CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, FCF]]]]], 
        CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, FSF]]]]]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(name.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[IModelType[
        PA & PB & PC & PD & PE & PF, 
        OA & OB & OC & OD & OE & OF, 
        CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, FCF]]]]], 
        CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, FSF]]]]]
      ]]
    inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG]
    ): IModelType[
        PA & PB & PC & PD & PE & PF & PG, 
        OA & OB & OC & OD & OE & OF & OG, 
        CustomJoin[
          FCA, 
          CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, FCG]]]]]
        ], 
        CustomJoin[
          FSA, 
          CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, FSG]]]]]
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[IModelType[
        PA & PB & PC & PD & PE & PF & PG, 
        OA & OB & OC & OD & OE & OF & OG, 
        CustomJoin[
          FCA, 
          CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, FCG]]]]]
        ], 
        CustomJoin[
          FSA, 
          CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, FSG]]]]]
        ]
      ]]
    inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
      name: String,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG]
    ): IModelType[
        PA & PB & PC & PD & PE & PF & PG, 
        OA & OB & OC & OD & OE & OF & OG, 
        CustomJoin[
          FCA, 
          CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, FCG]]]]]
        ], 
        CustomJoin[
          FSA, 
          CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, FSG]]]]]
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(name.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[IModelType[
        PA & PB & PC & PD & PE & PF & PG, 
        OA & OB & OC & OD & OE & OF & OG, 
        CustomJoin[
          FCA, 
          CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, FCG]]]]]
        ], 
        CustomJoin[
          FSA, 
          CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, FSG]]]]]
        ]
      ]]
    inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG],
      H: IModelType[PH, OH, FCH, FSH]
    ): IModelType[
        PA & PB & PC & PD & PE & PF & PG & PH, 
        OA & OB & OC & OD & OE & OF & OG & OH, 
        CustomJoin[
          FCA, 
          CustomJoin[
            FCB, 
            CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, FCH]]]]]
          ]
        ], 
        CustomJoin[
          FSA, 
          CustomJoin[
            FSB, 
            CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, FSH]]]]]
          ]
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any])).asInstanceOf[IModelType[
        PA & PB & PC & PD & PE & PF & PG & PH, 
        OA & OB & OC & OD & OE & OF & OG & OH, 
        CustomJoin[
          FCA, 
          CustomJoin[
            FCB, 
            CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, FCH]]]]]
          ]
        ], 
        CustomJoin[
          FSA, 
          CustomJoin[
            FSB, 
            CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, FSH]]]]]
          ]
        ]
      ]]
    inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
      name: String,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG],
      H: IModelType[PH, OH, FCH, FSH]
    ): IModelType[
        PA & PB & PC & PD & PE & PF & PG & PH, 
        OA & OB & OC & OD & OE & OF & OG & OH, 
        CustomJoin[
          FCA, 
          CustomJoin[
            FCB, 
            CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, FCH]]]]]
          ]
        ], 
        CustomJoin[
          FSA, 
          CustomJoin[
            FSB, 
            CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, FSH]]]]]
          ]
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(name.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any])).asInstanceOf[IModelType[
        PA & PB & PC & PD & PE & PF & PG & PH, 
        OA & OB & OC & OD & OE & OF & OG & OH, 
        CustomJoin[
          FCA, 
          CustomJoin[
            FCB, 
            CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, FCH]]]]]
          ]
        ], 
        CustomJoin[
          FSA, 
          CustomJoin[
            FSB, 
            CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, FSH]]]]]
          ]
        ]
      ]]
    inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG],
      H: IModelType[PH, OH, FCH, FSH],
      I: IModelType[PI, OI, FCI, FSI]
    ): IModelType[
        PA & PB & PC & PD & PE & PF & PG & PH & PI, 
        OA & OB & OC & OD & OE & OF & OG & OH & OI, 
        CustomJoin[
          FCA, 
          CustomJoin[
            FCB, 
            CustomJoin[
              FCC, 
              CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, CustomJoin[FCH, FCI]]]]]
            ]
          ]
        ], 
        CustomJoin[
          FSA, 
          CustomJoin[
            FSB, 
            CustomJoin[
              FSC, 
              CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, CustomJoin[FSH, FSI]]]]]
            ]
          ]
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any], I.asInstanceOf[js.Any])).asInstanceOf[IModelType[
        PA & PB & PC & PD & PE & PF & PG & PH & PI, 
        OA & OB & OC & OD & OE & OF & OG & OH & OI, 
        CustomJoin[
          FCA, 
          CustomJoin[
            FCB, 
            CustomJoin[
              FCC, 
              CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, CustomJoin[FCH, FCI]]]]]
            ]
          ]
        ], 
        CustomJoin[
          FSA, 
          CustomJoin[
            FSB, 
            CustomJoin[
              FSC, 
              CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, CustomJoin[FSH, FSI]]]]]
            ]
          ]
        ]
      ]]
    inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
      name: String,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG],
      H: IModelType[PH, OH, FCH, FSH],
      I: IModelType[PI, OI, FCI, FSI]
    ): IModelType[
        PA & PB & PC & PD & PE & PF & PG & PH & PI, 
        OA & OB & OC & OD & OE & OF & OG & OH & OI, 
        CustomJoin[
          FCA, 
          CustomJoin[
            FCB, 
            CustomJoin[
              FCC, 
              CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, CustomJoin[FCH, FCI]]]]]
            ]
          ]
        ], 
        CustomJoin[
          FSA, 
          CustomJoin[
            FSB, 
            CustomJoin[
              FSC, 
              CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, CustomJoin[FSH, FSI]]]]]
            ]
          ]
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(name.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any], I.asInstanceOf[js.Any])).asInstanceOf[IModelType[
        PA & PB & PC & PD & PE & PF & PG & PH & PI, 
        OA & OB & OC & OD & OE & OF & OG & OH & OI, 
        CustomJoin[
          FCA, 
          CustomJoin[
            FCB, 
            CustomJoin[
              FCC, 
              CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, CustomJoin[FCH, FCI]]]]]
            ]
          ]
        ], 
        CustomJoin[
          FSA, 
          CustomJoin[
            FSB, 
            CustomJoin[
              FSC, 
              CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, CustomJoin[FSH, FSI]]]]]
            ]
          ]
        ]
      ]]
    inline def compose_=(x: FnCallNameABCDEFGHI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compose")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.custom")
    @js.native
    def custom: FnCallOptions = js.native
    inline def custom[S, T](options: CustomTypeOptions[S, T]): IType[S | T, S, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("custom")(options.asInstanceOf[js.Any]).asInstanceOf[IType[S | T, S, T]]
    inline def custom_=(x: FnCallOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("custom")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.enumeration")
    @js.native
    def enumeration: FnCall = js.native
    inline def enumeration[T /* <: String */](name: String, options: js.Array[T]): ISimpleType[UnionStringArray[js.Array[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumeration")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ISimpleType[UnionStringArray[js.Array[T]]]]
    inline def enumeration[T /* <: String */](options: js.Array[T]): ISimpleType[UnionStringArray[js.Array[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumeration")(options.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[UnionStringArray[js.Array[T]]]]
    inline def enumeration_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enumeration")(x.asInstanceOf[js.Any])
    
    inline def frozen[T](): IType[T, T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("frozen")().asInstanceOf[IType[T, T, T]]
    inline def frozen[T](defaultValue: T): IType[js.UndefOr[T | Null], T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("frozen")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[IType[js.UndefOr[T | Null], T, T]]
    inline def frozen[C](subType: IType[C, Any, Any]): IType[C, C, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("frozen")(subType.asInstanceOf[js.Any]).asInstanceOf[IType[C, C, C]]
    @JSImport("mobx-state-tree/dist/types", "types.frozen")
    @js.native
    def frozen_Ftypes: FnCallDefaultValue = js.native
    
    inline def frozen_Ftypes_=(x: FnCallDefaultValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frozen")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.identifier")
    @js.native
    def identifier: ISimpleType[String] = js.native
    
    @JSImport("mobx-state-tree/dist/types", "types.identifierNumber")
    @js.native
    def identifierNumber: ISimpleType[Double] = js.native
    inline def identifierNumber_=(x: ISimpleType[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identifierNumber")(x.asInstanceOf[js.Any])
    
    inline def identifier_=(x: ISimpleType[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identifier")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.integer")
    @js.native
    def integer: ISimpleType[Double] = js.native
    inline def integer_=(x: ISimpleType[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("integer")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.late")
    @js.native
    def late: FnCallNameType = js.native
    inline def late[T /* <: IAnyType */](name: String, `type`: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("late")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def late[T /* <: IAnyType */](`type`: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("late")(`type`.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def late_=(x: FnCallNameType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("late")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.literal")
    @js.native
    def literal: FnCallValue = js.native
    inline def literal(value: String): ISimpleType[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[String]]
    inline def literal(value: js.Date): ISimpleType[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[js.Date]]
    inline def literal(value: Boolean): ISimpleType[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[Boolean]]
    inline def literal(value: Double): ISimpleType[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[Double]]
    inline def literal(value: Null): ISimpleType[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[Null]]
    inline def literal(value: Unit): ISimpleType[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[Unit]]
    inline def literal_=(x: FnCallValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("literal")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.map")
    @js.native
    def map: FnCallSubtype = js.native
    inline def map[IT /* <: IAnyType */](subtype: IT): IMapType[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(subtype.asInstanceOf[js.Any]).asInstanceOf[IMapType[IT]]
    inline def map_=(x: FnCallSubtype): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.maybe")
    @js.native
    def maybe: FnCallType = js.native
    inline def maybe[IT /* <: IAnyType */](`type`: IT): IMaybe[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("maybe")(`type`.asInstanceOf[js.Any]).asInstanceOf[IMaybe[IT]]
    
    @JSImport("mobx-state-tree/dist/types", "types.maybeNull")
    @js.native
    def maybeNull: Fn1 = js.native
    inline def maybeNull[IT /* <: IAnyType */](`type`: IT): IMaybeNull[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("maybeNull")(`type`.asInstanceOf[js.Any]).asInstanceOf[IMaybeNull[IT]]
    inline def maybeNull_=(x: Fn1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maybeNull")(x.asInstanceOf[js.Any])
    
    inline def maybe_=(x: FnCallType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maybe")(x.asInstanceOf[js.Any])
    
    inline def model[P /* <: ModelPropertiesDeclaration */](): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = ^.asInstanceOf[js.Dynamic].applyDynamic("model")().asInstanceOf[IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized]]
    inline def model[P /* <: ModelPropertiesDeclaration */](name: String): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = ^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any]).asInstanceOf[IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized]]
    inline def model[P /* <: ModelPropertiesDeclaration */](name: String, properties: P): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized]]
    inline def model[P /* <: ModelPropertiesDeclaration */](properties: P): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = ^.asInstanceOf[js.Dynamic].applyDynamic("model")(properties.asInstanceOf[js.Any]).asInstanceOf[IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized]]
    @JSImport("mobx-state-tree/dist/types", "types.model")
    @js.native
    def model_Ftypes: FnCallNameProperties = js.native
    
    inline def model_Ftypes_=(x: FnCallNameProperties): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("model")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.null")
    @js.native
    val `null`: ISimpleType[Null] = js.native
    
    @JSImport("mobx-state-tree/dist/types", "types.number")
    @js.native
    def number: ISimpleType[Double] = js.native
    inline def number_=(x: ISimpleType[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.optional")
    @js.native
    def optional: FnCallTypeDefaultValueOrFunctionOptionalValues = js.native
    inline def optional[IT /* <: IAnyType */](`type`: IT, defaultValueOrFunction: OptionalDefaultValueOrFunction[IT]): IOptionalIType[IT, js.Array[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("optional")(`type`.asInstanceOf[js.Any], defaultValueOrFunction.asInstanceOf[js.Any])).asInstanceOf[IOptionalIType[IT, js.Array[Unit]]]
    inline def optional[IT /* <: IAnyType */, OptionalVals /* <: ValidOptionalValues */](
      `type`: IT,
      defaultValueOrFunction: OptionalDefaultValueOrFunction[IT],
      optionalValues: OptionalVals
    ): IOptionalIType[IT, OptionalVals] = (^.asInstanceOf[js.Dynamic].applyDynamic("optional")(`type`.asInstanceOf[js.Any], defaultValueOrFunction.asInstanceOf[js.Any], optionalValues.asInstanceOf[js.Any])).asInstanceOf[IOptionalIType[IT, OptionalVals]]
    inline def optional_=(x: FnCallTypeDefaultValueOrFunctionOptionalValues): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optional")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.reference")
    @js.native
    def reference: FnCallSubTypeOptions = js.native
    inline def reference[IT /* <: IAnyComplexType */](subType: IT): IReferenceType[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("reference")(subType.asInstanceOf[js.Any]).asInstanceOf[IReferenceType[IT]]
    inline def reference[IT /* <: IAnyComplexType */](subType: IT, options: ReferenceOptions[IT]): IReferenceType[IT] = (^.asInstanceOf[js.Dynamic].applyDynamic("reference")(subType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IReferenceType[IT]]
    inline def reference_=(x: FnCallSubTypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reference")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.refinement")
    @js.native
    def refinement: FnCallNameTypePredicateMessage = js.native
    inline def refinement_=(x: FnCallNameTypePredicateMessage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refinement")(x.asInstanceOf[js.Any])
    
    inline def refinement_CreationType[IT /* <: IAnyType */](
      name: String,
      `type`: IT,
      predicate: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
          Boolean
        ]
    ): IT = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[IT]
    inline def refinement_CreationType[IT /* <: IAnyType */](
      name: String,
      `type`: IT,
      predicate: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
          Boolean
        ],
      message: String
    ): IT = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[IT]
    inline def refinement_CreationType[IT /* <: IAnyType */](
      name: String,
      `type`: IT,
      predicate: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
          Boolean
        ],
      message: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* v */ js.Any, 
          String
        ]
    ): IT = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[IT]
    inline def refinement_CreationType[IT /* <: IAnyType */](
      `type`: IT,
      predicate: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
          Boolean
        ]
    ): IT = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(`type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[IT]
    inline def refinement_CreationType[IT /* <: IAnyType */](
      `type`: IT,
      predicate: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
          Boolean
        ],
      message: String
    ): IT = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(`type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[IT]
    inline def refinement_CreationType[IT /* <: IAnyType */](
      `type`: IT,
      predicate: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
          Boolean
        ],
      message: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* v */ js.Any, 
          String
        ]
    ): IT = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(`type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[IT]
    
    @JSImport("mobx-state-tree/dist/types", "types.safeReference")
    @js.native
    def safeReference: Fn0 = js.native
    inline def safeReference[IT /* <: IAnyComplexType */](subType: IT): IMaybe[IReferenceType[IT]] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeReference")(subType.asInstanceOf[js.Any]).asInstanceOf[IMaybe[IReferenceType[IT]]]
    inline def safeReference[IT /* <: IAnyComplexType */](subType: IT, options: (ReferenceOptionsGetSet[IT] & OnInvalidated[IT]) | OnInvalidated[IT]): IReferenceType[IT] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeReference")(subType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IReferenceType[IT]]
    inline def safeReference[IT /* <: IAnyComplexType */](subType: IT, options: (ReferenceOptionsGetSet[IT] & AcceptsUndefined[IT]) | AcceptsUndefined[IT]): IMaybe[IReferenceType[IT]] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeReference")(subType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IMaybe[IReferenceType[IT]]]
    inline def safeReference_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("safeReference")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.snapshotProcessor")
    @js.native
    def snapshotProcessor: FnCallTypeProcessorsName = js.native
    inline def snapshotProcessor[IT /* <: IAnyType */, CustomC, CustomS](
      `type`: IT,
      processors: ISnapshotProcessors[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any, 
          CustomC, 
          /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any, 
          CustomS
        ]
    ): ISnapshotProcessor[IT, CustomC, CustomS] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotProcessor")(`type`.asInstanceOf[js.Any], processors.asInstanceOf[js.Any])).asInstanceOf[ISnapshotProcessor[IT, CustomC, CustomS]]
    inline def snapshotProcessor[IT /* <: IAnyType */, CustomC, CustomS](
      `type`: IT,
      processors: ISnapshotProcessors[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any, 
          CustomC, 
          /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any, 
          CustomS
        ],
      name: String
    ): ISnapshotProcessor[IT, CustomC, CustomS] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotProcessor")(`type`.asInstanceOf[js.Any], processors.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ISnapshotProcessor[IT, CustomC, CustomS]]
    inline def snapshotProcessor_=(x: FnCallTypeProcessorsName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("snapshotProcessor")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.string")
    @js.native
    def string: ISimpleType[String] = js.native
    inline def string_=(x: ISimpleType[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.undefined")
    @js.native
    def undefined: ISimpleType[Unit] = js.native
    inline def undefined_=(x: ISimpleType[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefined")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/types", "types.union")
    @js.native
    def union: FnCallOptionsABCDEFGHI = js.native
    inline def union(dispatchOrType: IAnyType, otherTypes: IAnyType*): IAnyType = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(scala.List(dispatchOrType.asInstanceOf[js.Any]).`++`(otherTypes.asInstanceOf[Seq[js.Any]])*).asInstanceOf[IAnyType]
    inline def union(dispatchOrType: UnionOptions, otherTypes: IAnyType*): IAnyType = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(scala.List(dispatchOrType.asInstanceOf[js.Any]).`++`(otherTypes.asInstanceOf[Seq[js.Any]])*).asInstanceOf[IAnyType]
    inline def union(types: IAnyType*): IAnyType = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(types.asInstanceOf[Seq[js.Any]]*).asInstanceOf[IAnyType]
    inline def union[CA, SA, TA, CB, SB, TB](A: IType[CA, SA, TA], B: IType[CB, SB, TB]): ITypeUnion[CA | CB, SA | SB, TA | TB] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[CA | CB, SA | SB, TA | TB]]
    inline def union[CA, SA, TA, CB, SB, TB](options: UnionOptions, A: IType[CA, SA, TA], B: IType[CB, SB, TB]): ITypeUnion[CA | CB, SA | SB, TA | TB] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[CA | CB, SA | SB, TA | TB]]
    inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): ITypeUnion[
        ModelCreationType2[PA | PB, FCA | FCB], 
        ModelSnapshotType2[PA | PB, FSA | FSB], 
        ModelInstanceType[PA | PB, OA | OB]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        ModelCreationType2[PA | PB, FCA | FCB], 
        ModelSnapshotType2[PA | PB, FSA | FSB], 
        ModelInstanceType[PA | PB, OA | OB]
      ]]
    inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](options: UnionOptions, A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): ITypeUnion[
        ModelCreationType2[PA | PB, FCA | FCB], 
        ModelSnapshotType2[PA | PB, FSA | FSB], 
        ModelInstanceType[PA | PB, OA | OB]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        ModelCreationType2[PA | PB, FCA | FCB], 
        ModelSnapshotType2[PA | PB, FSA | FSB], 
        ModelInstanceType[PA | PB, OA | OB]
      ]]
    inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC](A: IType[CA, SA, TA], B: IType[CB, SB, TB], C: IType[CC, SC, TC]): ITypeUnion[CA | CB | CC, SA | SB | SC, TA | TB | TC] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[CA | CB | CC, SA | SB | SC, TA | TB | TC]]
    inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC](options: UnionOptions, A: IType[CA, SA, TA], B: IType[CB, SB, TB], C: IType[CC, SC, TC]): ITypeUnion[CA | CB | CC, SA | SB | SC, TA | TB | TC] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[CA | CB | CC, SA | SB | SC, TA | TB | TC]]
    inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD](A: IType[CA, SA, TA], B: IType[CB, SB, TB], C: IType[CC, SC, TC], D: IType[CD, SD, TD]): ITypeUnion[CA | CB | CC | CD, SA | SB | SC | SD, TA | TB | TC | TD] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[CA | CB | CC | CD, SA | SB | SC | SD, TA | TB | TC | TD]]
    inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB], C: IModelType[PC, OC, FCC, FSC]): ITypeUnion[
        ModelCreationType2[PA | PB | PC, FCA | FCB | FCC], 
        ModelSnapshotType2[PA | PB | PC, FSA | FSB | FSC], 
        ModelInstanceType[PA | PB | PC, OA | OB | OC]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        ModelCreationType2[PA | PB | PC, FCA | FCB | FCC], 
        ModelSnapshotType2[PA | PB | PC, FSA | FSB | FSC], 
        ModelInstanceType[PA | PB | PC, OA | OB | OC]
      ]]
    inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD](
      options: UnionOptions,
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD]
    ): ITypeUnion[CA | CB | CC | CD, SA | SB | SC | SD, TA | TB | TC | TD] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[CA | CB | CC | CD, SA | SB | SC | SD, TA | TB | TC | TD]]
    inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](
      options: UnionOptions,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC, FCA | FCB | FCC], 
        ModelSnapshotType2[PA | PB | PC, FSA | FSB | FSC], 
        ModelInstanceType[PA | PB | PC, OA | OB | OC]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        ModelCreationType2[PA | PB | PC, FCA | FCB | FCC], 
        ModelSnapshotType2[PA | PB | PC, FSA | FSB | FSC], 
        ModelInstanceType[PA | PB | PC, OA | OB | OC]
      ]]
    inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE](
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE]
    ): ITypeUnion[CA | CB | CC | CD | CE, SA | SB | SC | SD | SE, TA | TB | TC | TD | TE] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[CA | CB | CC | CD | CE, SA | SB | SC | SD | SE, TA | TB | TC | TD | TE]]
    inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE](
      options: UnionOptions,
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE]
    ): ITypeUnion[CA | CB | CC | CD | CE, SA | SB | SC | SD | SE, TA | TB | TC | TD | TE] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[CA | CB | CC | CD | CE, SA | SB | SC | SD | SE, TA | TB | TC | TD | TE]]
    inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD, FCA | FCB | FCC | FCD], 
        ModelSnapshotType2[PA | PB | PC | PD, FSA | FSB | FSC | FSD], 
        ModelInstanceType[PA | PB | PC | PD, OA | OB | OC | OD]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD, FCA | FCB | FCC | FCD], 
        ModelSnapshotType2[PA | PB | PC | PD, FSA | FSB | FSC | FSD], 
        ModelInstanceType[PA | PB | PC | PD, OA | OB | OC | OD]
      ]]
    inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
      options: UnionOptions,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD, FCA | FCB | FCC | FCD], 
        ModelSnapshotType2[PA | PB | PC | PD, FSA | FSB | FSC | FSD], 
        ModelInstanceType[PA | PB | PC | PD, OA | OB | OC | OD]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD, FCA | FCB | FCC | FCD], 
        ModelSnapshotType2[PA | PB | PC | PD, FSA | FSB | FSC | FSD], 
        ModelInstanceType[PA | PB | PC | PD, OA | OB | OC | OD]
      ]]
    inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF](
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE],
      F: IType[CF, SF, TF]
    ): ITypeUnion[
        CA | CB | CC | CD | CE | CF, 
        SA | SB | SC | SD | SE | SF, 
        TA | TB | TC | TD | TE | TF
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        CA | CB | CC | CD | CE | CF, 
        SA | SB | SC | SD | SE | SF, 
        TA | TB | TC | TD | TE | TF
      ]]
    inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF](
      options: UnionOptions,
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE],
      F: IType[CF, SF, TF]
    ): ITypeUnion[
        CA | CB | CC | CD | CE | CF, 
        SA | SB | SC | SD | SE | SF, 
        TA | TB | TC | TD | TE | TF
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        CA | CB | CC | CD | CE | CF, 
        SA | SB | SC | SD | SE | SF, 
        TA | TB | TC | TD | TE | TF
      ]]
    inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD | PE, FCA | FCB | FCC | FCD | FCE], 
        ModelSnapshotType2[PA | PB | PC | PD | PE, FSA | FSB | FSC | FSD | FSE], 
        ModelInstanceType[PA | PB | PC | PD | PE, OA | OB | OC | OD | OE]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD | PE, FCA | FCB | FCC | FCD | FCE], 
        ModelSnapshotType2[PA | PB | PC | PD | PE, FSA | FSB | FSC | FSD | FSE], 
        ModelInstanceType[PA | PB | PC | PD | PE, OA | OB | OC | OD | OE]
      ]]
    inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
      options: UnionOptions,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD | PE, FCA | FCB | FCC | FCD | FCE], 
        ModelSnapshotType2[PA | PB | PC | PD | PE, FSA | FSB | FSC | FSD | FSE], 
        ModelInstanceType[PA | PB | PC | PD | PE, OA | OB | OC | OD | OE]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD | PE, FCA | FCB | FCC | FCD | FCE], 
        ModelSnapshotType2[PA | PB | PC | PD | PE, FSA | FSB | FSC | FSD | FSE], 
        ModelInstanceType[PA | PB | PC | PD | PE, OA | OB | OC | OD | OE]
      ]]
    inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG](
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE],
      F: IType[CF, SF, TF],
      G: IType[CG, SG, TG]
    ): ITypeUnion[
        CA | CB | CC | CD | CE | CF | CG, 
        SA | SB | SC | SD | SE | SF | SG, 
        TA | TB | TC | TD | TE | TF | TG
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        CA | CB | CC | CD | CE | CF | CG, 
        SA | SB | SC | SD | SE | SF | SG, 
        TA | TB | TC | TD | TE | TF | TG
      ]]
    inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG](
      options: UnionOptions,
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE],
      F: IType[CF, SF, TF],
      G: IType[CG, SG, TG]
    ): ITypeUnion[
        CA | CB | CC | CD | CE | CF | CG, 
        SA | SB | SC | SD | SE | SF | SG, 
        TA | TB | TC | TD | TE | TF | TG
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        CA | CB | CC | CD | CE | CF | CG, 
        SA | SB | SC | SD | SE | SF | SG, 
        TA | TB | TC | TD | TE | TF | TG
      ]]
    inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH](
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE],
      F: IType[CF, SF, TF],
      G: IType[CG, SG, TG],
      H: IType[CH, SH, TH]
    ): ITypeUnion[
        CA | CB | CC | CD | CE | CF | CG | CH, 
        SA | SB | SC | SD | SE | SF | SG | SH, 
        TA | TB | TC | TD | TE | TF | TG | TH
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        CA | CB | CC | CD | CE | CF | CG | CH, 
        SA | SB | SC | SD | SE | SF | SG | SH, 
        TA | TB | TC | TD | TE | TF | TG | TH
      ]]
    inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD | PE | PF, FCA | FCB | FCC | FCD | FCE | FCF], 
        ModelSnapshotType2[PA | PB | PC | PD | PE | PF, FSA | FSB | FSC | FSD | FSE | FSF], 
        ModelInstanceType[PA | PB | PC | PD | PE | PF, OA | OB | OC | OD | OE | OF]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD | PE | PF, FCA | FCB | FCC | FCD | FCE | FCF], 
        ModelSnapshotType2[PA | PB | PC | PD | PE | PF, FSA | FSB | FSC | FSD | FSE | FSF], 
        ModelInstanceType[PA | PB | PC | PD | PE | PF, OA | OB | OC | OD | OE | OF]
      ]]
    inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH](
      options: UnionOptions,
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE],
      F: IType[CF, SF, TF],
      G: IType[CG, SG, TG],
      H: IType[CH, SH, TH]
    ): ITypeUnion[
        CA | CB | CC | CD | CE | CF | CG | CH, 
        SA | SB | SC | SD | SE | SF | SG | SH, 
        TA | TB | TC | TD | TE | TF | TG | TH
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        CA | CB | CC | CD | CE | CF | CG | CH, 
        SA | SB | SC | SD | SE | SF | SG | SH, 
        TA | TB | TC | TD | TE | TF | TG | TH
      ]]
    inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
      options: UnionOptions,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD | PE | PF, FCA | FCB | FCC | FCD | FCE | FCF], 
        ModelSnapshotType2[PA | PB | PC | PD | PE | PF, FSA | FSB | FSC | FSD | FSE | FSF], 
        ModelInstanceType[PA | PB | PC | PD | PE | PF, OA | OB | OC | OD | OE | OF]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD | PE | PF, FCA | FCB | FCC | FCD | FCE | FCF], 
        ModelSnapshotType2[PA | PB | PC | PD | PE | PF, FSA | FSB | FSC | FSD | FSE | FSF], 
        ModelInstanceType[PA | PB | PC | PD | PE | PF, OA | OB | OC | OD | OE | OF]
      ]]
    inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH, CI, SI, TI](
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE],
      F: IType[CF, SF, TF],
      G: IType[CG, SG, TG],
      H: IType[CH, SH, TH],
      I: IType[CI, SI, TI]
    ): ITypeUnion[
        CA | CB | CC | CD | CE | CF | CG | CH | CI, 
        SA | SB | SC | SD | SE | SF | SG | SH | SI, 
        TA | TB | TC | TD | TE | TF | TG | TH | TI
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any], I.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        CA | CB | CC | CD | CE | CF | CG | CH | CI, 
        SA | SB | SC | SD | SE | SF | SG | SH | SI, 
        TA | TB | TC | TD | TE | TF | TG | TH | TI
      ]]
    inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH, CI, SI, TI](
      options: UnionOptions,
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE],
      F: IType[CF, SF, TF],
      G: IType[CG, SG, TG],
      H: IType[CH, SH, TH],
      I: IType[CI, SI, TI]
    ): ITypeUnion[
        CA | CB | CC | CD | CE | CF | CG | CH | CI, 
        SA | SB | SC | SD | SE | SF | SG | SH | SI, 
        TA | TB | TC | TD | TE | TF | TG | TH | TI
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any], I.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        CA | CB | CC | CD | CE | CF | CG | CH | CI, 
        SA | SB | SC | SD | SE | SF | SG | SH | SI, 
        TA | TB | TC | TD | TE | TF | TG | TH | TI
      ]]
    inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD | PE | PF | PG, FCA | FCB | FCC | FCD | FCE | FCF | FCG], 
        ModelSnapshotType2[PA | PB | PC | PD | PE | PF | PG, FSA | FSB | FSC | FSD | FSE | FSF | FSG], 
        ModelInstanceType[PA | PB | PC | PD | PE | PF | PG, OA | OB | OC | OD | OE | OF | OG]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD | PE | PF | PG, FCA | FCB | FCC | FCD | FCE | FCF | FCG], 
        ModelSnapshotType2[PA | PB | PC | PD | PE | PF | PG, FSA | FSB | FSC | FSD | FSE | FSF | FSG], 
        ModelInstanceType[PA | PB | PC | PD | PE | PF | PG, OA | OB | OC | OD | OE | OF | OG]
      ]]
    inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
      options: UnionOptions,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD | PE | PF | PG, FCA | FCB | FCC | FCD | FCE | FCF | FCG], 
        ModelSnapshotType2[PA | PB | PC | PD | PE | PF | PG, FSA | FSB | FSC | FSD | FSE | FSF | FSG], 
        ModelInstanceType[PA | PB | PC | PD | PE | PF | PG, OA | OB | OC | OD | OE | OF | OG]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD | PE | PF | PG, FCA | FCB | FCC | FCD | FCE | FCF | FCG], 
        ModelSnapshotType2[PA | PB | PC | PD | PE | PF | PG, FSA | FSB | FSC | FSD | FSE | FSF | FSG], 
        ModelInstanceType[PA | PB | PC | PD | PE | PF | PG, OA | OB | OC | OD | OE | OF | OG]
      ]]
    inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG],
      H: IModelType[PH, OH, FCH, FSH]
    ): ITypeUnion[
        ModelCreationType2[
          PA | PB | PC | PD | PE | PF | PG | PH, 
          FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH
        ], 
        ModelSnapshotType2[
          PA | PB | PC | PD | PE | PF | PG | PH, 
          FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH
        ], 
        ModelInstanceType[PA | PB | PC | PD | PE | PF | PG | PH, OA | OB | OC | OD | OE | OF | OG | OH]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        ModelCreationType2[
          PA | PB | PC | PD | PE | PF | PG | PH, 
          FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH
        ], 
        ModelSnapshotType2[
          PA | PB | PC | PD | PE | PF | PG | PH, 
          FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH
        ], 
        ModelInstanceType[PA | PB | PC | PD | PE | PF | PG | PH, OA | OB | OC | OD | OE | OF | OG | OH]
      ]]
    inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
      options: UnionOptions,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG],
      H: IModelType[PH, OH, FCH, FSH]
    ): ITypeUnion[
        ModelCreationType2[
          PA | PB | PC | PD | PE | PF | PG | PH, 
          FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH
        ], 
        ModelSnapshotType2[
          PA | PB | PC | PD | PE | PF | PG | PH, 
          FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH
        ], 
        ModelInstanceType[PA | PB | PC | PD | PE | PF | PG | PH, OA | OB | OC | OD | OE | OF | OG | OH]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        ModelCreationType2[
          PA | PB | PC | PD | PE | PF | PG | PH, 
          FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH
        ], 
        ModelSnapshotType2[
          PA | PB | PC | PD | PE | PF | PG | PH, 
          FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH
        ], 
        ModelInstanceType[PA | PB | PC | PD | PE | PF | PG | PH, OA | OB | OC | OD | OE | OF | OG | OH]
      ]]
    inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG],
      H: IModelType[PH, OH, FCH, FSH],
      I: IModelType[PI, OI, FCI, FSI]
    ): ITypeUnion[
        ModelCreationType2[
          PA | PB | PC | PD | PE | PF | PG | PH | PI, 
          FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH | FCI
        ], 
        ModelSnapshotType2[
          PA | PB | PC | PD | PE | PF | PG | PH | PI, 
          FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH | FSI
        ], 
        ModelInstanceType[
          PA | PB | PC | PD | PE | PF | PG | PH | PI, 
          OA | OB | OC | OD | OE | OF | OG | OH | OI
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any], I.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        ModelCreationType2[
          PA | PB | PC | PD | PE | PF | PG | PH | PI, 
          FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH | FCI
        ], 
        ModelSnapshotType2[
          PA | PB | PC | PD | PE | PF | PG | PH | PI, 
          FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH | FSI
        ], 
        ModelInstanceType[
          PA | PB | PC | PD | PE | PF | PG | PH | PI, 
          OA | OB | OC | OD | OE | OF | OG | OH | OI
        ]
      ]]
    inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
      options: UnionOptions,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG],
      H: IModelType[PH, OH, FCH, FSH],
      I: IModelType[PI, OI, FCI, FSI]
    ): ITypeUnion[
        ModelCreationType2[
          PA | PB | PC | PD | PE | PF | PG | PH | PI, 
          FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH | FCI
        ], 
        ModelSnapshotType2[
          PA | PB | PC | PD | PE | PF | PG | PH | PI, 
          FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH | FSI
        ], 
        ModelInstanceType[
          PA | PB | PC | PD | PE | PF | PG | PH | PI, 
          OA | OB | OC | OD | OE | OF | OG | OH | OI
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any], I.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
        ModelCreationType2[
          PA | PB | PC | PD | PE | PF | PG | PH | PI, 
          FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH | FCI
        ], 
        ModelSnapshotType2[
          PA | PB | PC | PD | PE | PF | PG | PH | PI, 
          FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH | FSI
        ], 
        ModelInstanceType[
          PA | PB | PC | PD | PE | PF | PG | PH | PI, 
          OA | OB | OC | OD | OE | OF | OG | OH | OI
        ]
      ]]
    inline def union_=(x: FnCallOptionsABCDEFGHI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("union")(x.asInstanceOf[js.Any])
  }
}
