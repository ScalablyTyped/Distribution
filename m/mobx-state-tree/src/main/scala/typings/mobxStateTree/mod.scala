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
import typings.mobxStateTree.distCoreActionContextMod.IActionContext
import typings.mobxStateTree.distCoreActionMod.IMiddlewareEvent
import typings.mobxStateTree.distCoreActionMod.IMiddlewareHandler
import typings.mobxStateTree.distCoreFlowMod.FlowReturn
import typings.mobxStateTree.distCoreJsonPatchMod.IJsonPatch
import typings.mobxStateTree.distCoreMstOperationsMod.IModelReflectionData
import typings.mobxStateTree.distCoreMstOperationsMod.IModelReflectionPropertiesData
import typings.mobxStateTree.distCoreMstOperationsMod.IPatchRecorder
import typings.mobxStateTree.distCoreMstOperationsMod.TypeOrStateTreeNodeToStateTreeNode
import typings.mobxStateTree.distCoreNodeLivelinessCheckingMod.LivelinessMode
import typings.mobxStateTree.distCoreNodeNodeUtilsMod.IAnyStateTreeNode
import typings.mobxStateTree.distCoreNodeNodeUtilsMod.IStateTreeNode
import typings.mobxStateTree.distCoreTypeTypeMod.ExtractCSTWithSTN
import typings.mobxStateTree.distCoreTypeTypeMod.IAnyComplexType
import typings.mobxStateTree.distCoreTypeTypeMod.IAnyType
import typings.mobxStateTree.distCoreTypeTypeMod.ISimpleType
import typings.mobxStateTree.distCoreTypeTypeMod.IType
import typings.mobxStateTree.distMiddlewaresCreateActionTrackingMiddleware2Mod.IActionTrackingMiddleware2Hooks
import typings.mobxStateTree.distMiddlewaresCreateActionTrackingMiddlewareMod.IActionTrackingMiddlewareHooks
import typings.mobxStateTree.distMiddlewaresOnActionMod.IActionRecorder
import typings.mobxStateTree.distMiddlewaresOnActionMod.ISerializedActionCall
import typings.mobxStateTree.distTypesComplexTypesArrayMod.IArrayType
import typings.mobxStateTree.distTypesComplexTypesMapMod.IMapType
import typings.mobxStateTree.distTypesComplexTypesModelMod.CustomJoin
import typings.mobxStateTree.distTypesComplexTypesModelMod.IAnyModelType
import typings.mobxStateTree.distTypesComplexTypesModelMod.IModelType
import typings.mobxStateTree.distTypesComplexTypesModelMod.ModelCreationType2
import typings.mobxStateTree.distTypesComplexTypesModelMod.ModelInstanceType
import typings.mobxStateTree.distTypesComplexTypesModelMod.ModelProperties
import typings.mobxStateTree.distTypesComplexTypesModelMod.ModelPropertiesDeclaration
import typings.mobxStateTree.distTypesComplexTypesModelMod.ModelPropertiesDeclarationToProperties
import typings.mobxStateTree.distTypesComplexTypesModelMod.ModelSnapshotType2
import typings.mobxStateTree.distTypesUtilityTypesCustomMod.CustomTypeOptions
import typings.mobxStateTree.distTypesUtilityTypesEnumerationMod.UnionStringArray
import typings.mobxStateTree.distTypesUtilityTypesIdentifierMod.ReferenceIdentifier
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
import typings.mobxStateTree.distUtilsMod.IDisposer
import typings.std.Generator
import typings.std.IterableIterator
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mobx-state-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDisposer(target: IAnyStateTreeNode, disposer: IDisposer): IDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("addDisposer")(target.asInstanceOf[js.Any], disposer.asInstanceOf[js.Any])).asInstanceOf[IDisposer]
  
  inline def addMiddleware(target: IAnyStateTreeNode, handler: IMiddlewareHandler): IDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("addMiddleware")(target.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IDisposer]
  inline def addMiddleware(target: IAnyStateTreeNode, handler: IMiddlewareHandler, includeHooks: Boolean): IDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("addMiddleware")(target.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], includeHooks.asInstanceOf[js.Any])).asInstanceOf[IDisposer]
  
  inline def applyAction(target: IAnyStateTreeNode, actions: js.Array[ISerializedActionCall]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAction")(target.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyAction(target: IAnyStateTreeNode, actions: ISerializedActionCall): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAction")(target.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def applyPatch(target: IAnyStateTreeNode, patch: js.Array[IJsonPatch]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(target.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyPatch(target: IAnyStateTreeNode, patch: IJsonPatch): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(target.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def applySnapshot[C](target: IStateTreeNode[IType[C, Any, Any]], snapshot: C): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applySnapshot")(target.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cast(snapshotOrInstance: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(snapshotOrInstance.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cast(snapshotOrInstance: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(snapshotOrInstance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def cast(snapshotOrInstance: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(snapshotOrInstance.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def cast(snapshotOrInstance: Null): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(snapshotOrInstance.asInstanceOf[js.Any]).asInstanceOf[Null]
  inline def cast(snapshotOrInstance: Unit): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(snapshotOrInstance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def castFlowReturn[T](`val`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("castFlowReturn")(`val`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def castToReferenceSnapshot[I](instance: I): /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<I, mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.IAnyStateTreeNode> extends never ? I : mobx-state-tree.mobx-state-tree/dist/types/utility-types/identifier.ReferenceIdentifier */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("castToReferenceSnapshot")(instance.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: std.Extract<I, mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.IAnyStateTreeNode> extends never ? I : mobx-state-tree.mobx-state-tree/dist/types/utility-types/identifier.ReferenceIdentifier */ js.Any]
  
  inline def castToSnapshot[I](snapshotOrInstance: I): /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<I, mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.IAnyStateTreeNode> extends never ? I : mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.TypeOfValue<I>['CreationType'] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("castToSnapshot")(snapshotOrInstance.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: std.Extract<I, mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.IAnyStateTreeNode> extends never ? I : mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.TypeOfValue<I>['CreationType'] */ js.Any]
  
  inline def cast_CreationType[O](
    snapshotOrInstance: /* import warning: importer.ImportType#apply Failed type conversion: mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.TypeOfValue<O>['CreationType'] */ js.Any
  ): O = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(snapshotOrInstance.asInstanceOf[js.Any]).asInstanceOf[O]
  
  inline def cast_SnapshotType[O](
    snapshotOrInstance: /* import warning: importer.ImportType#apply Failed type conversion: mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.TypeOfValue<O>['SnapshotType'] */ js.Any
  ): O = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(snapshotOrInstance.asInstanceOf[js.Any]).asInstanceOf[O]
  
  inline def cast_Type[O](
    snapshotOrInstance: /* import warning: importer.ImportType#apply Failed type conversion: mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.TypeOfValue<O>['Type'] */ js.Any
  ): O = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(snapshotOrInstance.asInstanceOf[js.Any]).asInstanceOf[O]
  
  inline def clone_[T /* <: IAnyStateTreeNode */](source: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(source.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def clone_[T /* <: IAnyStateTreeNode */](source: T, keepEnvironment: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(source.asInstanceOf[js.Any], keepEnvironment.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def clone_[T /* <: IAnyStateTreeNode */](source: T, keepEnvironment: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(source.asInstanceOf[js.Any], keepEnvironment.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def createActionTrackingMiddleware[T](hooks: IActionTrackingMiddlewareHooks[T]): IMiddlewareHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("createActionTrackingMiddleware")(hooks.asInstanceOf[js.Any]).asInstanceOf[IMiddlewareHandler]
  
  inline def createActionTrackingMiddleware2[TEnv](middlewareHooks: IActionTrackingMiddleware2Hooks[TEnv]): IMiddlewareHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("createActionTrackingMiddleware2")(middlewareHooks.asInstanceOf[js.Any]).asInstanceOf[IMiddlewareHandler]
  
  inline def decorate[T /* <: js.Function */](handler: IMiddlewareHandler, fn: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(handler.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def decorate[T /* <: js.Function */](handler: IMiddlewareHandler, fn: T, includeHooks: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(handler.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], includeHooks.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def destroy(target: IAnyStateTreeNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def detach[T /* <: IAnyStateTreeNode */](target: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("detach")(target.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def escapeJsonPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeJsonPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def flow[R, Args /* <: js.Array[Any] */](generator: js.Function1[/* args */ Args, Generator[PromiseLike[Any], R, Any]]): js.Function1[/* args */ Args, js.Promise[FlowReturn[R]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flow")(generator.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, js.Promise[FlowReturn[R]]]]
  
  inline def getChildType(`object`: IAnyStateTreeNode): IAnyType = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildType")(`object`.asInstanceOf[js.Any]).asInstanceOf[IAnyType]
  inline def getChildType(`object`: IAnyStateTreeNode, propertyName: String): IAnyType = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildType")(`object`.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[IAnyType]
  
  inline def getEnv[T](target: IAnyStateTreeNode): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnv")(target.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def getIdentifier(target: IAnyStateTreeNode): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getIdentifier")(target.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getLivelinessChecking(): LivelinessMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getLivelinessChecking")().asInstanceOf[LivelinessMode]
  
  inline def getMembers(target: IAnyStateTreeNode): IModelReflectionData = ^.asInstanceOf[js.Dynamic].applyDynamic("getMembers")(target.asInstanceOf[js.Any]).asInstanceOf[IModelReflectionData]
  
  inline def getNodeId(target: IAnyStateTreeNode): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeId")(target.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getParent[IT /* <: IAnyStateTreeNode | IAnyComplexType */](target: IAnyStateTreeNode): TypeOrStateTreeNodeToStateTreeNode[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(target.asInstanceOf[js.Any]).asInstanceOf[TypeOrStateTreeNodeToStateTreeNode[IT]]
  inline def getParent[IT /* <: IAnyStateTreeNode | IAnyComplexType */](target: IAnyStateTreeNode, depth: Double): TypeOrStateTreeNodeToStateTreeNode[IT] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(target.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[TypeOrStateTreeNodeToStateTreeNode[IT]]
  
  inline def getParentOfType[IT /* <: IAnyComplexType */](target: IAnyStateTreeNode, `type`: IT): /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getParentOfType")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any]
  
  inline def getPath(target: IAnyStateTreeNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(target.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPathParts(target: IAnyStateTreeNode): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathParts")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getPropertyMembers(typeOrNode: IAnyStateTreeNode): IModelReflectionPropertiesData = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyMembers")(typeOrNode.asInstanceOf[js.Any]).asInstanceOf[IModelReflectionPropertiesData]
  inline def getPropertyMembers(typeOrNode: IAnyModelType): IModelReflectionPropertiesData = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyMembers")(typeOrNode.asInstanceOf[js.Any]).asInstanceOf[IModelReflectionPropertiesData]
  
  inline def getRelativePath(base: IAnyStateTreeNode, target: IAnyStateTreeNode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePath")(base.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getRoot[IT /* <: IAnyComplexType | IAnyStateTreeNode */](target: IAnyStateTreeNode): TypeOrStateTreeNodeToStateTreeNode[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoot")(target.asInstanceOf[js.Any]).asInstanceOf[TypeOrStateTreeNodeToStateTreeNode[IT]]
  
  inline def getRunningActionContext(): js.UndefOr[IActionContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRunningActionContext")().asInstanceOf[js.UndefOr[IActionContext]]
  
  inline def getSnapshot[S](target: IStateTreeNode[IType[Any, S, Any]]): S = ^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshot")(target.asInstanceOf[js.Any]).asInstanceOf[S]
  inline def getSnapshot[S](target: IStateTreeNode[IType[Any, S, Any]], applyPostProcess: Boolean): S = (^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshot")(target.asInstanceOf[js.Any], applyPostProcess.asInstanceOf[js.Any])).asInstanceOf[S]
  
  inline def getType(`object`: IAnyStateTreeNode): IAnyComplexType = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(`object`.asInstanceOf[js.Any]).asInstanceOf[IAnyComplexType]
  
  inline def hasParent(target: IAnyStateTreeNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasParent")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasParent(target: IAnyStateTreeNode, depth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasParent")(target.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasParentOfType(target: IAnyStateTreeNode, `type`: IAnyComplexType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasParentOfType")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isActionContextChildOf(actionContext: IActionContext, parent: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionContextChildOf")(actionContext.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isActionContextChildOf(actionContext: IActionContext, parent: IActionContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionContextChildOf")(actionContext.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isActionContextChildOf(actionContext: IActionContext, parent: IMiddlewareEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionContextChildOf")(actionContext.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isActionContextThisOrChildOf(actionContext: IActionContext, parentOrThis: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionContextThisOrChildOf")(actionContext.asInstanceOf[js.Any], parentOrThis.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isActionContextThisOrChildOf(actionContext: IActionContext, parentOrThis: IActionContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionContextThisOrChildOf")(actionContext.asInstanceOf[js.Any], parentOrThis.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isActionContextThisOrChildOf(actionContext: IActionContext, parentOrThis: IMiddlewareEvent): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isActionContextThisOrChildOf")(actionContext.asInstanceOf[js.Any], parentOrThis.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isAlive(target: IAnyStateTreeNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlive")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isArrayType[Items /* <: IAnyType */](`type`: IAnyType): /* is mobx-state-tree.mobx-state-tree/dist/types/complex-types/array.IArrayType<Items> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is mobx-state-tree.mobx-state-tree/dist/types/complex-types/array.IArrayType<Items> */ Boolean]
  
  inline def isFrozenType[IT /* <: IType[T | Any, T, T] */, T](`type`: IT): /* is IT */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFrozenType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is IT */ Boolean]
  
  inline def isIdentifierType(`type`: IType[Double | String, Double | String, Double | String]): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<string, string, string> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<string, string, string> */ Boolean]
  
  inline def isLateType[IT /* <: IAnyType */](`type`: IT): /* is IT */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLateType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is IT */ Boolean]
  
  inline def isLiteralType[IT /* <: ISimpleType[Any] */](`type`: IT): /* is IT */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is IT */ Boolean]
  
  inline def isMapType[Items /* <: IAnyType */](`type`: IAnyType): /* is mobx-state-tree.mobx-state-tree/dist/types/complex-types/map.IMapType<Items> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMapType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is mobx-state-tree.mobx-state-tree/dist/types/complex-types/map.IMapType<Items> */ Boolean]
  
  inline def isModelType[IT /* <: IAnyModelType */](`type`: IAnyType): /* is IT */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModelType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is IT */ Boolean]
  
  inline def isOptionalType[IT /* <: IAnyType */](`type`: IT): /* is IT */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is IT */ Boolean]
  
  inline def isPrimitiveType(
    `type`: IType[
      Boolean | js.Date | Double | String, 
      Boolean | Double | String, 
      Boolean | js.Date | Double | String
    ]
  ): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<string, string, string> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitiveType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<string, string, string> */ Boolean]
  
  inline def isProtected(target: IAnyStateTreeNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProtected")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isReferenceType[IT /* <: IReferenceType[Any] */](`type`: IT): /* is IT */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReferenceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is IT */ Boolean]
  
  inline def isRefinementType[IT /* <: IAnyType */](`type`: IT): /* is IT */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefinementType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is IT */ Boolean]
  
  inline def isRoot(target: IAnyStateTreeNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRoot")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isStateTreeNode[IT /* <: IAnyComplexType */](value: Any): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.STNValue<mobx-state-tree.mobx-state-tree/dist/core/type/type.Instance<IT>, IT> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStateTreeNode")(value.asInstanceOf[js.Any]).asInstanceOf[/* is mobx-state-tree.mobx-state-tree/dist/core/type/type.STNValue<mobx-state-tree.mobx-state-tree/dist/core/type/type.Instance<IT>, IT> */ Boolean]
  
  inline def isType(value: Any): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IAnyType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isType")(value.asInstanceOf[js.Any]).asInstanceOf[/* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IAnyType */ Boolean]
  
  inline def isUnionType[IT /* <: IAnyType */](`type`: IT): /* is IT */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnionType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is IT */ Boolean]
  
  inline def isValidReference[N /* <: IAnyStateTreeNode */](getter: js.Function0[js.UndefOr[N | Null]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidReference")(getter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidReference[N /* <: IAnyStateTreeNode */](getter: js.Function0[js.UndefOr[N | Null]], checkIfAlive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidReference")(getter.asInstanceOf[js.Any], checkIfAlive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def joinJsonPath(path: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("joinJsonPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def onAction(target: IAnyStateTreeNode, listener: js.Function1[/* call */ ISerializedActionCall, Unit]): IDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("onAction")(target.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[IDisposer]
  inline def onAction(
    target: IAnyStateTreeNode,
    listener: js.Function1[/* call */ ISerializedActionCall, Unit],
    attachAfter: Boolean
  ): IDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("onAction")(target.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], attachAfter.asInstanceOf[js.Any])).asInstanceOf[IDisposer]
  
  inline def onPatch(
    target: IAnyStateTreeNode,
    callback: js.Function2[/* patch */ IJsonPatch, /* reversePatch */ IJsonPatch, Unit]
  ): IDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("onPatch")(target.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IDisposer]
  
  inline def onSnapshot[S](target: IStateTreeNode[IType[Any, S, Any]], callback: js.Function1[/* snapshot */ S, Unit]): IDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(target.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IDisposer]
  
  inline def process[R](generator: js.Function0[IterableIterator[Any]]): js.Function0[js.Promise[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(generator.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[R]]]
  inline def process[A1](generator: js.Function1[/* a1 */ A1, IterableIterator[Any]]): js.Function1[/* a1 */ A1, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(generator.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a1 */ A1, js.Promise[Any]]]
  inline def process[A1, A2](generator: js.Function2[/* a1 */ A1, /* a2 */ A2, IterableIterator[Any]]): js.Function2[/* a1 */ A1, /* a2 */ A2, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(generator.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a1 */ A1, /* a2 */ A2, js.Promise[Any]]]
  inline def process[A1, A2, A3](generator: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, IterableIterator[Any]]): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(generator.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, js.Promise[Any]]]
  inline def process[A1, A2, A3, A4](generator: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, IterableIterator[Any]]): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(generator.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, js.Promise[Any]]]
  inline def process[A1, A2, A3, A4, A5](
    generator: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, IterableIterator[Any]]
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(generator.asInstanceOf[js.Any]).asInstanceOf[js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, js.Promise[Any]]]
  inline def process[A1, A2, A3, A4, A5, A6](
    generator: js.Function6[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      IterableIterator[Any]
    ]
  ): js.Function6[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    js.Promise[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(generator.asInstanceOf[js.Any]).asInstanceOf[js.Function6[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    js.Promise[Any]
  ]]
  inline def process[A1, A2, A3, A4, A5, A6, A7](
    generator: js.Function7[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      IterableIterator[Any]
    ]
  ): js.Function7[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    js.Promise[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(generator.asInstanceOf[js.Any]).asInstanceOf[js.Function7[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    js.Promise[Any]
  ]]
  inline def process[A1, A2, A3, A4, A5, A6, A7, A8](
    generator: js.Function8[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      /* a8 */ A8, 
      IterableIterator[Any]
    ]
  ): js.Function8[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    /* a8 */ A8, 
    js.Promise[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(generator.asInstanceOf[js.Any]).asInstanceOf[js.Function8[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    /* a8 */ A8, 
    js.Promise[Any]
  ]]
  
  inline def protect(target: IAnyStateTreeNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("protect")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def recordActions(subject: IAnyStateTreeNode): IActionRecorder = ^.asInstanceOf[js.Dynamic].applyDynamic("recordActions")(subject.asInstanceOf[js.Any]).asInstanceOf[IActionRecorder]
  inline def recordActions(
    subject: IAnyStateTreeNode,
    filter: js.Function2[
      /* action */ ISerializedActionCall, 
      /* actionContext */ js.UndefOr[IActionContext], 
      Boolean
    ]
  ): IActionRecorder = (^.asInstanceOf[js.Dynamic].applyDynamic("recordActions")(subject.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[IActionRecorder]
  
  inline def recordPatches(subject: IAnyStateTreeNode): IPatchRecorder = ^.asInstanceOf[js.Dynamic].applyDynamic("recordPatches")(subject.asInstanceOf[js.Any]).asInstanceOf[IPatchRecorder]
  inline def recordPatches(
    subject: IAnyStateTreeNode,
    filter: js.Function3[
      /* patch */ IJsonPatch, 
      /* inversePatch */ IJsonPatch, 
      /* actionContext */ js.UndefOr[IActionContext], 
      Boolean
    ]
  ): IPatchRecorder = (^.asInstanceOf[js.Dynamic].applyDynamic("recordPatches")(subject.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[IPatchRecorder]
  
  inline def resolveIdentifier[IT /* <: IAnyModelType */](`type`: IT, target: IAnyStateTreeNode, identifier: ReferenceIdentifier): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveIdentifier")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any
  ]]
  
  inline def resolvePath(target: IAnyStateTreeNode, path: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setLivelinessChecking(mode: LivelinessMode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLivelinessChecking")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLivelynessChecking(mode: LivelinessMode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLivelynessChecking")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def splitJsonPath(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitJsonPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def toGenerator[R](p: js.Promise[R]): Generator[js.Promise[R], R, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("toGenerator")(p.asInstanceOf[js.Any]).asInstanceOf[Generator[js.Promise[R], R, R]]
  
  inline def toGeneratorFunction[R, Args /* <: js.Array[Any] */](p: js.Function1[/* args */ Args, js.Promise[R]]): js.Function1[/* args */ Args, Generator[js.Promise[R], R, R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toGeneratorFunction")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, Generator[js.Promise[R], R, R]]]
  
  inline def tryReference[N /* <: IAnyStateTreeNode */](getter: js.Function0[js.UndefOr[N | Null]]): js.UndefOr[N] = ^.asInstanceOf[js.Dynamic].applyDynamic("tryReference")(getter.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[N]]
  inline def tryReference[N /* <: IAnyStateTreeNode */](getter: js.Function0[js.UndefOr[N | Null]], checkIfAlive: Boolean): js.UndefOr[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryReference")(getter.asInstanceOf[js.Any], checkIfAlive.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[N]]
  
  inline def tryResolve(target: IAnyStateTreeNode, path: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("tryResolve")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def typecheck[IT /* <: IAnyType */](`type`: IT, value: ExtractCSTWithSTN[IT]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typecheck")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object types {
    
    @JSImport("mobx-state-tree", "types")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx-state-tree", "types.Date")
    @js.native
    def Date: IType[Double | js.Date, Double, js.Date] = js.native
    inline def Date_=(x: IType[Double | js.Date, Double, js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Date")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree", "types.array")
    @js.native
    def array: Fn2 = js.native
    inline def array[IT /* <: IAnyType */](subtype: IT): IArrayType[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(subtype.asInstanceOf[js.Any]).asInstanceOf[IArrayType[IT]]
    inline def array_=(x: Fn2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("array")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree", "types.boolean")
    @js.native
    def boolean: ISimpleType[Boolean] = js.native
    inline def boolean_=(x: ISimpleType[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boolean")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree", "types.compose")
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
    
    @JSImport("mobx-state-tree", "types.custom")
    @js.native
    def custom: FnCallOptions = js.native
    inline def custom[S, T](options: CustomTypeOptions[S, T]): IType[S | T, S, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("custom")(options.asInstanceOf[js.Any]).asInstanceOf[IType[S | T, S, T]]
    inline def custom_=(x: FnCallOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("custom")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree", "types.enumeration")
    @js.native
    def enumeration: FnCall = js.native
    inline def enumeration[T /* <: String */](name: String, options: js.Array[T]): ISimpleType[UnionStringArray[js.Array[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumeration")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ISimpleType[UnionStringArray[js.Array[T]]]]
    inline def enumeration[T /* <: String */](options: js.Array[T]): ISimpleType[UnionStringArray[js.Array[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumeration")(options.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[UnionStringArray[js.Array[T]]]]
    inline def enumeration_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enumeration")(x.asInstanceOf[js.Any])
    
    inline def frozen[T](): IType[T, T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("frozen")().asInstanceOf[IType[T, T, T]]
    inline def frozen[T](defaultValue: T): IType[js.UndefOr[T | Null], T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("frozen")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[IType[js.UndefOr[T | Null], T, T]]
    inline def frozen[C](subType: IType[C, Any, Any]): IType[C, C, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("frozen")(subType.asInstanceOf[js.Any]).asInstanceOf[IType[C, C, C]]
    @JSImport("mobx-state-tree", "types.frozen")
    @js.native
    def frozen_Ftypes: FnCallDefaultValue = js.native
    
    inline def frozen_Ftypes_=(x: FnCallDefaultValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frozen")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree", "types.identifier")
    @js.native
    def identifier: ISimpleType[String] = js.native
    
    @JSImport("mobx-state-tree", "types.identifierNumber")
    @js.native
    def identifierNumber: ISimpleType[Double] = js.native
    inline def identifierNumber_=(x: ISimpleType[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identifierNumber")(x.asInstanceOf[js.Any])
    
    inline def identifier_=(x: ISimpleType[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identifier")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree", "types.integer")
    @js.native
    def integer: ISimpleType[Double] = js.native
    inline def integer_=(x: ISimpleType[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("integer")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree", "types.late")
    @js.native
    def late: FnCallNameType = js.native
    inline def late[T /* <: IAnyType */](name: String, `type`: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("late")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def late[T /* <: IAnyType */](`type`: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("late")(`type`.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def late_=(x: FnCallNameType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("late")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree", "types.literal")
    @js.native
    def literal: FnCallValue = js.native
    inline def literal(value: String): ISimpleType[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[String]]
    inline def literal(value: js.Date): ISimpleType[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[js.Date]]
    inline def literal(value: Boolean): ISimpleType[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[Boolean]]
    inline def literal(value: Double): ISimpleType[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[Double]]
    inline def literal(value: Null): ISimpleType[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[Null]]
    inline def literal(value: Unit): ISimpleType[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[Unit]]
    inline def literal_=(x: FnCallValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("literal")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree", "types.map")
    @js.native
    def map: FnCallSubtype = js.native
    inline def map[IT /* <: IAnyType */](subtype: IT): IMapType[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(subtype.asInstanceOf[js.Any]).asInstanceOf[IMapType[IT]]
    inline def map_=(x: FnCallSubtype): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree", "types.maybe")
    @js.native
    def maybe: FnCallType = js.native
    inline def maybe[IT /* <: IAnyType */](`type`: IT): IMaybe[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("maybe")(`type`.asInstanceOf[js.Any]).asInstanceOf[IMaybe[IT]]
    
    @JSImport("mobx-state-tree", "types.maybeNull")
    @js.native
    def maybeNull: Fn1 = js.native
    inline def maybeNull[IT /* <: IAnyType */](`type`: IT): IMaybeNull[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("maybeNull")(`type`.asInstanceOf[js.Any]).asInstanceOf[IMaybeNull[IT]]
    inline def maybeNull_=(x: Fn1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maybeNull")(x.asInstanceOf[js.Any])
    
    inline def maybe_=(x: FnCallType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maybe")(x.asInstanceOf[js.Any])
    
    inline def model[P /* <: ModelPropertiesDeclaration */](): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = ^.asInstanceOf[js.Dynamic].applyDynamic("model")().asInstanceOf[IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized]]
    inline def model[P /* <: ModelPropertiesDeclaration */](name: String): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = ^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any]).asInstanceOf[IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized]]
    inline def model[P /* <: ModelPropertiesDeclaration */](name: String, properties: P): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized]]
    inline def model[P /* <: ModelPropertiesDeclaration */](properties: P): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = ^.asInstanceOf[js.Dynamic].applyDynamic("model")(properties.asInstanceOf[js.Any]).asInstanceOf[IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized]]
    @JSImport("mobx-state-tree", "types.model")
    @js.native
    def model_Ftypes: FnCallNameProperties = js.native
    
    inline def model_Ftypes_=(x: FnCallNameProperties): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("model")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree", "types.null")
    @js.native
    val `null`: ISimpleType[Null] = js.native
    
    @JSImport("mobx-state-tree", "types.number")
    @js.native
    def number: ISimpleType[Double] = js.native
    inline def number_=(x: ISimpleType[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree", "types.optional")
    @js.native
    def optional: FnCallTypeDefaultValueOrFunctionOptionalValues = js.native
    inline def optional[IT /* <: IAnyType */](`type`: IT, defaultValueOrFunction: OptionalDefaultValueOrFunction[IT]): IOptionalIType[IT, js.Array[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("optional")(`type`.asInstanceOf[js.Any], defaultValueOrFunction.asInstanceOf[js.Any])).asInstanceOf[IOptionalIType[IT, js.Array[Unit]]]
    inline def optional[IT /* <: IAnyType */, OptionalVals /* <: ValidOptionalValues */](
      `type`: IT,
      defaultValueOrFunction: OptionalDefaultValueOrFunction[IT],
      optionalValues: OptionalVals
    ): IOptionalIType[IT, OptionalVals] = (^.asInstanceOf[js.Dynamic].applyDynamic("optional")(`type`.asInstanceOf[js.Any], defaultValueOrFunction.asInstanceOf[js.Any], optionalValues.asInstanceOf[js.Any])).asInstanceOf[IOptionalIType[IT, OptionalVals]]
    inline def optional_=(x: FnCallTypeDefaultValueOrFunctionOptionalValues): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optional")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree", "types.reference")
    @js.native
    def reference: FnCallSubTypeOptions = js.native
    inline def reference[IT /* <: IAnyComplexType */](subType: IT): IReferenceType[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("reference")(subType.asInstanceOf[js.Any]).asInstanceOf[IReferenceType[IT]]
    inline def reference[IT /* <: IAnyComplexType */](subType: IT, options: ReferenceOptions[IT]): IReferenceType[IT] = (^.asInstanceOf[js.Dynamic].applyDynamic("reference")(subType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IReferenceType[IT]]
    inline def reference_=(x: FnCallSubTypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reference")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree", "types.refinement")
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
    
    @JSImport("mobx-state-tree", "types.safeReference")
    @js.native
    def safeReference: Fn0 = js.native
    inline def safeReference[IT /* <: IAnyComplexType */](subType: IT): IMaybe[IReferenceType[IT]] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeReference")(subType.asInstanceOf[js.Any]).asInstanceOf[IMaybe[IReferenceType[IT]]]
    inline def safeReference[IT /* <: IAnyComplexType */](subType: IT, options: (ReferenceOptionsGetSet[IT] & OnInvalidated[IT]) | OnInvalidated[IT]): IReferenceType[IT] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeReference")(subType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IReferenceType[IT]]
    inline def safeReference[IT /* <: IAnyComplexType */](subType: IT, options: (ReferenceOptionsGetSet[IT] & AcceptsUndefined[IT]) | AcceptsUndefined[IT]): IMaybe[IReferenceType[IT]] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeReference")(subType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IMaybe[IReferenceType[IT]]]
    inline def safeReference_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("safeReference")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree", "types.snapshotProcessor")
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
    
    @JSImport("mobx-state-tree", "types.string")
    @js.native
    def string: ISimpleType[String] = js.native
    inline def string_=(x: ISimpleType[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree", "types.undefined")
    @js.native
    def undefined: ISimpleType[Unit] = js.native
    inline def undefined_=(x: ISimpleType[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefined")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree", "types.union")
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
  
  inline def unescapeJsonPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeJsonPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unprotect(target: IAnyStateTreeNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unprotect")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def walk(target: IAnyStateTreeNode, processor: js.Function1[/* item */ IAnyStateTreeNode, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(target.asInstanceOf[js.Any], processor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
