package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.anon.ToRawChangeValue
import typings.mendixmodelsdk.mod.^
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalDeltasTransactionManagerMod.ITransactionOptions
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.IAbstractElementJson
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit
import typings.mendixmodelsdk.srcSdkUtilsMod.utils.IMap
import typings.mobx.distTypesObservablearrayMod.IArrayWillChange
import typings.mobx.distTypesObservablearrayMod.IArrayWillSplice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def MAX_METAMODEL_VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("MAX_METAMODEL_VERSION").asInstanceOf[String]

inline def SDK_VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SDK_VERSION").asInstanceOf[String]

inline def beginTransaction(model: IAbstractModel): typings.mendixmodelsdk.srcSdkInternalDeltasTransactionManagerMod.Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("beginTransaction")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcSdkInternalDeltasTransactionManagerMod.Transaction]
inline def beginTransaction(model: IAbstractModel, options: ITransactionOptions): typings.mendixmodelsdk.srcSdkInternalDeltasTransactionManagerMod.Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("beginTransaction")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mendixmodelsdk.srcSdkInternalDeltasTransactionManagerMod.Transaction]

inline def createElementFromJSON(model: IAbstractModel, json: IAbstractElementJson): typings.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel]]
inline def createElementFromJSON(
  model: IAbstractModel,
  json: IAbstractElementJson,
  idToStructureMap: IMap[
  typings.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[IAbstractModel, IContainer | Null]
]
): typings.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any], idToStructureMap.asInstanceOf[js.Any])).asInstanceOf[typings.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel]]

inline def createModelUnitFromJSON(containerUnit: IStructuralUnit, containmentName: String, contents: IAbstractElementJson): typings.mendixmodelsdk.srcSdkInternalUnitsMod.ModelUnit[IAbstractModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("createModelUnitFromJSON")(containerUnit.asInstanceOf[js.Any], containmentName.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[typings.mendixmodelsdk.srcSdkInternalUnitsMod.ModelUnit[IAbstractModel]]

inline def instantiateChildElement(
  parent: typings.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container]
): typings.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] | Null]
inline def instantiateChildElement(
  parent: typings.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container],
  value: IAbstractElementJson
): typings.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.mendixmodelsdk.srcSdkInternalElementsMod.Element[IAbstractModel] | Null]

inline def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/src/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedElement")(element.asInstanceOf[js.Any]).asInstanceOf[/* is mendixmodelsdk.mendixmodelsdk/src/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean]

inline def runInTransaction[T](model: IAbstractModel, action: js.Function0[js.Promise[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
inline def runInTransaction[T](model: IAbstractModel, options: ITransactionOptions, action: js.Function0[js.Promise[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]

inline def runInTransaction_T_T[T](model: IAbstractModel, action: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[T]
inline def runInTransaction_T_T[T](model: IAbstractModel, options: ITransactionOptions, action: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[T]

inline def sendListChangeDeltas[T, P](
  property: (typings.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) & ToRawChangeValue[P],
  change: IArrayWillChange[P]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def sendListChangeDeltas[T, P](
  property: (typings.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) & ToRawChangeValue[P],
  change: IArrayWillSplice[P]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[Unit]
