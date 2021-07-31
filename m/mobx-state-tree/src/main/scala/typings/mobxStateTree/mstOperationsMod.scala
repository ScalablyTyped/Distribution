package typings.mobxStateTree

import org.scalablytyped.runtime.StringDictionary
import typings.mobxStateTree.actionContextMod.IActionContext
import typings.mobxStateTree.identifierMod.ReferenceIdentifier
import typings.mobxStateTree.jsonPatchMod.IJsonPatch
import typings.mobxStateTree.modelMod.IAnyModelType
import typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import typings.mobxStateTree.nodeUtilsMod.IStateTreeNode
import typings.mobxStateTree.typeMod.IAnyComplexType
import typings.mobxStateTree.typeMod.IAnyType
import typings.mobxStateTree.typeMod.IType
import typings.mobxStateTree.utilsMod.IDisposer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mstOperationsMod {
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addDisposer(target: IAnyStateTreeNode, disposer: IDisposer): IDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("addDisposer")(target.asInstanceOf[js.Any], disposer.asInstanceOf[js.Any])).asInstanceOf[IDisposer]
  
  @scala.inline
  def applyPatch(target: IAnyStateTreeNode, patch: js.Array[IJsonPatch]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(target.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def applyPatch(target: IAnyStateTreeNode, patch: IJsonPatch): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(target.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def applySnapshot[C](target: IStateTreeNode[IType[C, js.Any, js.Any]], snapshot: C): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applySnapshot")(target.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def cast(snapshotOrInstance: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(snapshotOrInstance.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def cast(snapshotOrInstance: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(snapshotOrInstance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def cast(snapshotOrInstance: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(snapshotOrInstance.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def cast(snapshotOrInstance: Null): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(snapshotOrInstance.asInstanceOf[js.Any]).asInstanceOf[Null]
  @scala.inline
  def cast(snapshotOrInstance: Unit): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(snapshotOrInstance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def castToReferenceSnapshot[I](instance: I): ReferenceIdentifier | I = ^.asInstanceOf[js.Dynamic].applyDynamic("castToReferenceSnapshot")(instance.asInstanceOf[js.Any]).asInstanceOf[ReferenceIdentifier | I]
  
  @scala.inline
  def castToSnapshot[I](snapshotOrInstance: I): (/* import warning: importer.ImportType#apply Failed type conversion: mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.TypeOfValue<I>['CreationType'] */ js.Any) | I = ^.asInstanceOf[js.Dynamic].applyDynamic("castToSnapshot")(snapshotOrInstance.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.TypeOfValue<I>['CreationType'] */ js.Any) | I]
  
  @scala.inline
  def cast_CreationType[O](
    snapshotOrInstance: /* import warning: importer.ImportType#apply Failed type conversion: mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.TypeOfValue<O>['CreationType'] */ js.Any
  ): O = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(snapshotOrInstance.asInstanceOf[js.Any]).asInstanceOf[O]
  
  @scala.inline
  def cast_SnapshotType[O](
    snapshotOrInstance: /* import warning: importer.ImportType#apply Failed type conversion: mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.TypeOfValue<O>['SnapshotType'] */ js.Any
  ): O = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(snapshotOrInstance.asInstanceOf[js.Any]).asInstanceOf[O]
  
  @scala.inline
  def cast_Type[O](
    snapshotOrInstance: /* import warning: importer.ImportType#apply Failed type conversion: mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.TypeOfValue<O>['Type'] */ js.Any
  ): O = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(snapshotOrInstance.asInstanceOf[js.Any]).asInstanceOf[O]
  
  @scala.inline
  def clone_[T /* <: IAnyStateTreeNode */](source: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(source.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def clone_[T /* <: IAnyStateTreeNode */](source: T, keepEnvironment: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(source.asInstanceOf[js.Any], keepEnvironment.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def clone_[T /* <: IAnyStateTreeNode */](source: T, keepEnvironment: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(source.asInstanceOf[js.Any], keepEnvironment.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def destroy(target: IAnyStateTreeNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def detach[T /* <: IAnyStateTreeNode */](target: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("detach")(target.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def getChildType(`object`: IAnyStateTreeNode): IAnyType = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildType")(`object`.asInstanceOf[js.Any]).asInstanceOf[IAnyType]
  @scala.inline
  def getChildType(`object`: IAnyStateTreeNode, propertyName: String): IAnyType = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildType")(`object`.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[IAnyType]
  
  @scala.inline
  def getEnv[T](target: IAnyStateTreeNode): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnv")(target.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def getIdentifier(target: IAnyStateTreeNode): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getIdentifier")(target.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @scala.inline
  def getMembers(target: IAnyStateTreeNode): IModelReflectionData = ^.asInstanceOf[js.Dynamic].applyDynamic("getMembers")(target.asInstanceOf[js.Any]).asInstanceOf[IModelReflectionData]
  
  @scala.inline
  def getNodeId(target: IAnyStateTreeNode): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeId")(target.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getParent[IT /* <: IAnyStateTreeNode | IAnyComplexType */](target: IAnyStateTreeNode): TypeOrStateTreeNodeToStateTreeNode[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(target.asInstanceOf[js.Any]).asInstanceOf[TypeOrStateTreeNodeToStateTreeNode[IT]]
  @scala.inline
  def getParent[IT /* <: IAnyStateTreeNode | IAnyComplexType */](target: IAnyStateTreeNode, depth: Double): TypeOrStateTreeNodeToStateTreeNode[IT] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(target.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[TypeOrStateTreeNodeToStateTreeNode[IT]]
  
  @scala.inline
  def getParentOfType[IT /* <: IAnyComplexType */](target: IAnyStateTreeNode, `type`: IT): /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getParentOfType")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any]
  
  @scala.inline
  def getPath(target: IAnyStateTreeNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(target.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getPathParts(target: IAnyStateTreeNode): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathParts")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getPropertyMembers(typeOrNode: IAnyModelType): IModelReflectionPropertiesData = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyMembers")(typeOrNode.asInstanceOf[js.Any]).asInstanceOf[IModelReflectionPropertiesData]
  @scala.inline
  def getPropertyMembers(typeOrNode: IAnyStateTreeNode): IModelReflectionPropertiesData = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyMembers")(typeOrNode.asInstanceOf[js.Any]).asInstanceOf[IModelReflectionPropertiesData]
  
  @scala.inline
  def getRelativePath(base: IAnyStateTreeNode, target: IAnyStateTreeNode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePath")(base.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getRoot[IT /* <: IAnyComplexType | IAnyStateTreeNode */](target: IAnyStateTreeNode): TypeOrStateTreeNodeToStateTreeNode[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoot")(target.asInstanceOf[js.Any]).asInstanceOf[TypeOrStateTreeNodeToStateTreeNode[IT]]
  
  @scala.inline
  def getSnapshot[S](target: IStateTreeNode[IType[js.Any, S, js.Any]]): S = ^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshot")(target.asInstanceOf[js.Any]).asInstanceOf[S]
  @scala.inline
  def getSnapshot[S](target: IStateTreeNode[IType[js.Any, S, js.Any]], applyPostProcess: Boolean): S = (^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshot")(target.asInstanceOf[js.Any], applyPostProcess.asInstanceOf[js.Any])).asInstanceOf[S]
  
  @scala.inline
  def getType(`object`: IAnyStateTreeNode): IAnyComplexType = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(`object`.asInstanceOf[js.Any]).asInstanceOf[IAnyComplexType]
  
  @scala.inline
  def hasParent(target: IAnyStateTreeNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasParent")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def hasParent(target: IAnyStateTreeNode, depth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasParent")(target.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def hasParentOfType(target: IAnyStateTreeNode, `type`: IAnyComplexType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasParentOfType")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isAlive(target: IAnyStateTreeNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlive")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isProtected(target: IAnyStateTreeNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProtected")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isRoot(target: IAnyStateTreeNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRoot")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidReference[N /* <: IAnyStateTreeNode */](getter: js.Function0[js.UndefOr[N | Null]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidReference")(getter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isValidReference[N /* <: IAnyStateTreeNode */](getter: js.Function0[js.UndefOr[N | Null]], checkIfAlive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidReference")(getter.asInstanceOf[js.Any], checkIfAlive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def onPatch(
    target: IAnyStateTreeNode,
    callback: js.Function2[/* patch */ IJsonPatch, /* reversePatch */ IJsonPatch, Unit]
  ): IDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("onPatch")(target.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IDisposer]
  
  @scala.inline
  def onSnapshot[S](target: IStateTreeNode[IType[js.Any, S, js.Any]], callback: js.Function1[/* snapshot */ S, Unit]): IDisposer = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(target.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IDisposer]
  
  @scala.inline
  def protect(target: IAnyStateTreeNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("protect")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def recordPatches(subject: IAnyStateTreeNode): IPatchRecorder = ^.asInstanceOf[js.Dynamic].applyDynamic("recordPatches")(subject.asInstanceOf[js.Any]).asInstanceOf[IPatchRecorder]
  @scala.inline
  def recordPatches(
    subject: IAnyStateTreeNode,
    filter: js.Function3[
      /* patch */ IJsonPatch, 
      /* inversePatch */ IJsonPatch, 
      /* actionContext */ js.UndefOr[IActionContext], 
      Boolean
    ]
  ): IPatchRecorder = (^.asInstanceOf[js.Dynamic].applyDynamic("recordPatches")(subject.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[IPatchRecorder]
  
  @scala.inline
  def resolveIdentifier[IT /* <: IAnyModelType */](`type`: IT, target: IAnyStateTreeNode, identifier: ReferenceIdentifier): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveIdentifier")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any
  ]]
  
  @scala.inline
  def resolvePath(target: IAnyStateTreeNode, path: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def tryReference[N /* <: IAnyStateTreeNode */](getter: js.Function0[js.UndefOr[N | Null]]): js.UndefOr[N] = ^.asInstanceOf[js.Dynamic].applyDynamic("tryReference")(getter.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[N]]
  @scala.inline
  def tryReference[N /* <: IAnyStateTreeNode */](getter: js.Function0[js.UndefOr[N | Null]], checkIfAlive: Boolean): js.UndefOr[N] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryReference")(getter.asInstanceOf[js.Any], checkIfAlive.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[N]]
  
  @scala.inline
  def tryResolve(target: IAnyStateTreeNode, path: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("tryResolve")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def unprotect(target: IAnyStateTreeNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unprotect")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def walk(target: IAnyStateTreeNode, processor: js.Function1[/* item */ IAnyStateTreeNode, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(target.asInstanceOf[js.Any], processor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait IModelReflectionData
    extends StObject
       with IModelReflectionPropertiesData {
    
    var actions: js.Array[String]
    
    var views: js.Array[String]
    
    var volatile: js.Array[String]
  }
  object IModelReflectionData {
    
    @scala.inline
    def apply(
      actions: js.Array[String],
      name: String,
      properties: StringDictionary[IAnyType],
      views: js.Array[String],
      volatile: js.Array[String]
    ): IModelReflectionData = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any], volatile = volatile.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModelReflectionData]
    }
    
    @scala.inline
    implicit class IModelReflectionDataMutableBuilder[Self <: IModelReflectionData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setViews(value: js.Array[String]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewsVarargs(value: String*): Self = StObject.set(x, "views", js.Array(value :_*))
      
      @scala.inline
      def setVolatile(value: js.Array[String]): Self = StObject.set(x, "volatile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolatileVarargs(value: String*): Self = StObject.set(x, "volatile", js.Array(value :_*))
    }
  }
  
  trait IModelReflectionPropertiesData extends StObject {
    
    var name: String
    
    var properties: StringDictionary[IAnyType]
  }
  object IModelReflectionPropertiesData {
    
    @scala.inline
    def apply(name: String, properties: StringDictionary[IAnyType]): IModelReflectionPropertiesData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModelReflectionPropertiesData]
    }
    
    @scala.inline
    implicit class IModelReflectionPropertiesDataMutableBuilder[Self <: IModelReflectionPropertiesData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: StringDictionary[IAnyType]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPatchRecorder extends StObject {
    
    var inversePatches: js.Array[IJsonPatch] = js.native
    
    var patches: js.Array[IJsonPatch] = js.native
    
    val recording: Boolean = js.native
    
    def replay(): Unit = js.native
    def replay(target: IAnyStateTreeNode): Unit = js.native
    
    def resume(): Unit = js.native
    
    var reversedInversePatches: js.Array[IJsonPatch] = js.native
    
    def stop(): Unit = js.native
    
    def undo(): Unit = js.native
    def undo(target: IAnyStateTreeNode): Unit = js.native
  }
  
  type TypeOrStateTreeNodeToStateTreeNode[T /* <: IAnyType | IAnyStateTreeNode */] = T | (js.Any & IStateTreeNode[T])
}
