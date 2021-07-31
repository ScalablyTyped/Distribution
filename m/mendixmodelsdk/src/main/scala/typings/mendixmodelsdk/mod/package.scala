package typings.mendixmodelsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def MAX_METAMODEL_VERSION: java.lang.String = typings.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MAX_METAMODEL_VERSION").asInstanceOf[java.lang.String]

@scala.inline
def SDK_VERSION: java.lang.String = typings.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SDK_VERSION").asInstanceOf[java.lang.String]

@scala.inline
def beginTransaction(model: typings.mendixmodelsdk.abstractModelMod.IAbstractModel): typings.mendixmodelsdk.transactionManagerMod.Transaction = typings.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("beginTransaction")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.transactionManagerMod.Transaction]
@scala.inline
def beginTransaction(
  model: typings.mendixmodelsdk.abstractModelMod.IAbstractModel,
  options: typings.mendixmodelsdk.transactionManagerMod.ITransactionOptions
): typings.mendixmodelsdk.transactionManagerMod.Transaction = (typings.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("beginTransaction")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.mendixmodelsdk.transactionManagerMod.Transaction]

@scala.inline
def createElementFromJSON(
  model: typings.mendixmodelsdk.abstractModelMod.IAbstractModel,
  json: typings.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
): typings.mendixmodelsdk.elementsMod.Element[typings.mendixmodelsdk.abstractModelMod.IAbstractModel] = (typings.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElementFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.mendixmodelsdk.elementsMod.Element[typings.mendixmodelsdk.abstractModelMod.IAbstractModel]]
@scala.inline
def createElementFromJSON(
  model: typings.mendixmodelsdk.abstractModelMod.IAbstractModel,
  json: typings.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson,
  idToStructureMap: typings.mendixmodelsdk.utilsMod.utils.IMap[
  typings.mendixmodelsdk.structuresMod.Structure[
    typings.mendixmodelsdk.abstractModelMod.IAbstractModel, 
    typings.mendixmodelsdk.structuresMod.aliases.IContainer | scala.Null
  ]
]
): typings.mendixmodelsdk.elementsMod.Element[typings.mendixmodelsdk.abstractModelMod.IAbstractModel] = (typings.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElementFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any], idToStructureMap.asInstanceOf[js.Any])).asInstanceOf[typings.mendixmodelsdk.elementsMod.Element[typings.mendixmodelsdk.abstractModelMod.IAbstractModel]]

@scala.inline
def createModelUnitFromJSON(
  containerUnit: typings.mendixmodelsdk.unitsMod.IStructuralUnit,
  containmentName: java.lang.String,
  contents: typings.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
): typings.mendixmodelsdk.unitsMod.ModelUnit[typings.mendixmodelsdk.abstractModelMod.IAbstractModel] = (typings.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createModelUnitFromJSON")(containerUnit.asInstanceOf[js.Any], containmentName.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[typings.mendixmodelsdk.unitsMod.ModelUnit[typings.mendixmodelsdk.abstractModelMod.IAbstractModel]]

@scala.inline
def instantiateChildElement(
  parent: typings.mendixmodelsdk.elementsMod.AbstractElement[
  typings.mendixmodelsdk.abstractModelMod.IAbstractModel, 
  typings.mendixmodelsdk.structuresMod.aliases.Container
]
): typings.mendixmodelsdk.elementsMod.Element[typings.mendixmodelsdk.abstractModelMod.IAbstractModel] | scala.Null = typings.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.elementsMod.Element[typings.mendixmodelsdk.abstractModelMod.IAbstractModel] | scala.Null]
@scala.inline
def instantiateChildElement(
  parent: typings.mendixmodelsdk.elementsMod.AbstractElement[
  typings.mendixmodelsdk.abstractModelMod.IAbstractModel, 
  typings.mendixmodelsdk.structuresMod.aliases.Container
],
  value: typings.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
): typings.mendixmodelsdk.elementsMod.Element[typings.mendixmodelsdk.abstractModelMod.IAbstractModel] | scala.Null = (typings.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.mendixmodelsdk.elementsMod.Element[typings.mendixmodelsdk.abstractModelMod.IAbstractModel] | scala.Null]

@scala.inline
def isNamedElement(element: typings.mendixmodelsdk.structuresMod.IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ scala.Boolean = typings.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNamedElement")(element.asInstanceOf[js.Any]).asInstanceOf[/* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ scala.Boolean]

@scala.inline
def runInTransaction[T](model: typings.mendixmodelsdk.abstractModelMod.IAbstractModel, action: js.Function0[js.Promise[T]]): js.Promise[T] = (typings.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
@scala.inline
def runInTransaction[T](
  model: typings.mendixmodelsdk.abstractModelMod.IAbstractModel,
  options: typings.mendixmodelsdk.transactionManagerMod.ITransactionOptions,
  action: js.Function0[js.Promise[T]]
): js.Promise[T] = (typings.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]

@scala.inline
def runInTransaction_T_T[T](model: typings.mendixmodelsdk.abstractModelMod.IAbstractModel, action: js.Function0[T]): T = (typings.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[T]
@scala.inline
def runInTransaction_T_T[T](
  model: typings.mendixmodelsdk.abstractModelMod.IAbstractModel,
  options: typings.mendixmodelsdk.transactionManagerMod.ITransactionOptions,
  action: js.Function0[T]
): T = (typings.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[T]

@scala.inline
def sendListChangeDeltas[T, P](
  property: (typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], typings.mendixmodelsdk.instancesMod.IList[P]]) & typings.mendixmodelsdk.anon.ToRawChangeValue[P],
  change: typings.mobx.observablearrayMod.IArrayWillChange[P]
): scala.Unit = (typings.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def sendListChangeDeltas[T, P](
  property: (typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], typings.mendixmodelsdk.instancesMod.IList[P]]) & typings.mendixmodelsdk.anon.ToRawChangeValue[P],
  change: typings.mobx.observablearrayMod.IArrayWillSplice[P]
): scala.Unit = (typings.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
