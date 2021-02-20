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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mstOperationsMod {
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "addDisposer")
  @js.native
  def addDisposer(target: IAnyStateTreeNode, disposer: IDisposer): IDisposer = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "applyPatch")
  @js.native
  def applyPatch(target: IAnyStateTreeNode, patch: js.Array[IJsonPatch]): Unit = js.native
  @JSImport("mobx-state-tree/dist/core/mst-operations", "applyPatch")
  @js.native
  def applyPatch(target: IAnyStateTreeNode, patch: IJsonPatch): Unit = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "applySnapshot")
  @js.native
  def applySnapshot[C](target: IStateTreeNode[IType[C, _, _]], snapshot: C): Unit = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "cast")
  @js.native
  def cast(snapshotOrInstance: js.UndefOr[scala.Nothing]): js.UndefOr[scala.Nothing] = js.native
  @JSImport("mobx-state-tree/dist/core/mst-operations", "cast")
  @js.native
  def cast(snapshotOrInstance: String): String = js.native
  @JSImport("mobx-state-tree/dist/core/mst-operations", "cast")
  @js.native
  def cast(snapshotOrInstance: Boolean): Boolean = js.native
  @JSImport("mobx-state-tree/dist/core/mst-operations", "cast")
  @js.native
  def cast(snapshotOrInstance: Double): Double = js.native
  @JSImport("mobx-state-tree/dist/core/mst-operations", "cast")
  @js.native
  def cast(snapshotOrInstance: Null): Null = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "castToReferenceSnapshot")
  @js.native
  def castToReferenceSnapshot[I](instance: I): ReferenceIdentifier | I = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "castToSnapshot")
  @js.native
  def castToSnapshot[I](snapshotOrInstance: I): (/* import warning: importer.ImportType#apply Failed type conversion: mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.TypeOfValue<I>['CreationType'] */ js.Any) | I = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "cast")
  @js.native
  def cast_CreationType[O](
    snapshotOrInstance: /* import warning: importer.ImportType#apply Failed type conversion: mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.TypeOfValue<O>['CreationType'] */ js.Any
  ): O = js.native
  @JSImport("mobx-state-tree/dist/core/mst-operations", "cast")
  @js.native
  def cast_SnapshotType[O](
    snapshotOrInstance: /* import warning: importer.ImportType#apply Failed type conversion: mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.TypeOfValue<O>['SnapshotType'] */ js.Any
  ): O = js.native
  @JSImport("mobx-state-tree/dist/core/mst-operations", "cast")
  @js.native
  def cast_Type[O](
    snapshotOrInstance: /* import warning: importer.ImportType#apply Failed type conversion: mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.TypeOfValue<O>['Type'] */ js.Any
  ): O = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "clone")
  @js.native
  def clone_[T /* <: IAnyStateTreeNode */](source: T): T = js.native
  @JSImport("mobx-state-tree/dist/core/mst-operations", "clone")
  @js.native
  def clone_[T /* <: IAnyStateTreeNode */](source: T, keepEnvironment: js.Any): T = js.native
  @JSImport("mobx-state-tree/dist/core/mst-operations", "clone")
  @js.native
  def clone_[T /* <: IAnyStateTreeNode */](source: T, keepEnvironment: Boolean): T = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "destroy")
  @js.native
  def destroy(target: IAnyStateTreeNode): Unit = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "detach")
  @js.native
  def detach[T /* <: IAnyStateTreeNode */](target: T): T = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "getChildType")
  @js.native
  def getChildType(`object`: IAnyStateTreeNode): IAnyType = js.native
  @JSImport("mobx-state-tree/dist/core/mst-operations", "getChildType")
  @js.native
  def getChildType(`object`: IAnyStateTreeNode, propertyName: String): IAnyType = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "getEnv")
  @js.native
  def getEnv[T](target: IAnyStateTreeNode): T = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "getIdentifier")
  @js.native
  def getIdentifier(target: IAnyStateTreeNode): String | Null = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "getMembers")
  @js.native
  def getMembers(target: IAnyStateTreeNode): IModelReflectionData = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "getNodeId")
  @js.native
  def getNodeId(target: IAnyStateTreeNode): Double = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "getParent")
  @js.native
  def getParent[IT /* <: IAnyStateTreeNode | IAnyComplexType */](target: IAnyStateTreeNode): TypeOrStateTreeNodeToStateTreeNode[IT] = js.native
  @JSImport("mobx-state-tree/dist/core/mst-operations", "getParent")
  @js.native
  def getParent[IT /* <: IAnyStateTreeNode | IAnyComplexType */](target: IAnyStateTreeNode, depth: Double): TypeOrStateTreeNodeToStateTreeNode[IT] = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "getParentOfType")
  @js.native
  def getParentOfType[IT /* <: IAnyComplexType */](target: IAnyStateTreeNode, `type`: IT): /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "getPath")
  @js.native
  def getPath(target: IAnyStateTreeNode): String = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "getPathParts")
  @js.native
  def getPathParts(target: IAnyStateTreeNode): js.Array[String] = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "getPropertyMembers")
  @js.native
  def getPropertyMembers(typeOrNode: IAnyModelType): IModelReflectionPropertiesData = js.native
  @JSImport("mobx-state-tree/dist/core/mst-operations", "getPropertyMembers")
  @js.native
  def getPropertyMembers(typeOrNode: IAnyStateTreeNode): IModelReflectionPropertiesData = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "getRelativePath")
  @js.native
  def getRelativePath(base: IAnyStateTreeNode, target: IAnyStateTreeNode): String = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "getRoot")
  @js.native
  def getRoot[IT /* <: IAnyComplexType | IAnyStateTreeNode */](target: IAnyStateTreeNode): TypeOrStateTreeNodeToStateTreeNode[IT] = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "getSnapshot")
  @js.native
  def getSnapshot[S](target: IStateTreeNode[IType[_, S, _]]): S = js.native
  @JSImport("mobx-state-tree/dist/core/mst-operations", "getSnapshot")
  @js.native
  def getSnapshot[S](target: IStateTreeNode[IType[_, S, _]], applyPostProcess: Boolean): S = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "getType")
  @js.native
  def getType(`object`: IAnyStateTreeNode): IAnyComplexType = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "hasParent")
  @js.native
  def hasParent(target: IAnyStateTreeNode): Boolean = js.native
  @JSImport("mobx-state-tree/dist/core/mst-operations", "hasParent")
  @js.native
  def hasParent(target: IAnyStateTreeNode, depth: Double): Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "hasParentOfType")
  @js.native
  def hasParentOfType(target: IAnyStateTreeNode, `type`: IAnyComplexType): Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "isAlive")
  @js.native
  def isAlive(target: IAnyStateTreeNode): Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "isProtected")
  @js.native
  def isProtected(target: IAnyStateTreeNode): Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "isRoot")
  @js.native
  def isRoot(target: IAnyStateTreeNode): Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "isValidReference")
  @js.native
  def isValidReference[N /* <: IAnyStateTreeNode */](getter: js.Function0[js.UndefOr[N | Null]]): Boolean = js.native
  @JSImport("mobx-state-tree/dist/core/mst-operations", "isValidReference")
  @js.native
  def isValidReference[N /* <: IAnyStateTreeNode */](getter: js.Function0[js.UndefOr[N | Null]], checkIfAlive: Boolean): Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "onPatch")
  @js.native
  def onPatch(
    target: IAnyStateTreeNode,
    callback: js.Function2[/* patch */ IJsonPatch, /* reversePatch */ IJsonPatch, Unit]
  ): IDisposer = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "onSnapshot")
  @js.native
  def onSnapshot[S](target: IStateTreeNode[IType[_, S, _]], callback: js.Function1[/* snapshot */ S, Unit]): IDisposer = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "protect")
  @js.native
  def protect(target: IAnyStateTreeNode): Unit = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "recordPatches")
  @js.native
  def recordPatches(subject: IAnyStateTreeNode): IPatchRecorder = js.native
  @JSImport("mobx-state-tree/dist/core/mst-operations", "recordPatches")
  @js.native
  def recordPatches(
    subject: IAnyStateTreeNode,
    filter: js.Function3[
      /* patch */ IJsonPatch, 
      /* inversePatch */ IJsonPatch, 
      /* actionContext */ js.UndefOr[IActionContext], 
      Boolean
    ]
  ): IPatchRecorder = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "resolveIdentifier")
  @js.native
  def resolveIdentifier[IT /* <: IAnyModelType */](`type`: IT, target: IAnyStateTreeNode, identifier: ReferenceIdentifier): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any
  ] = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "resolvePath")
  @js.native
  def resolvePath(target: IAnyStateTreeNode, path: String): js.Any = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "tryReference")
  @js.native
  def tryReference[N /* <: IAnyStateTreeNode */](getter: js.Function0[js.UndefOr[N | Null]]): js.UndefOr[N] = js.native
  @JSImport("mobx-state-tree/dist/core/mst-operations", "tryReference")
  @js.native
  def tryReference[N /* <: IAnyStateTreeNode */](getter: js.Function0[js.UndefOr[N | Null]], checkIfAlive: Boolean): js.UndefOr[N] = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "tryResolve")
  @js.native
  def tryResolve(target: IAnyStateTreeNode, path: String): js.Any = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "unprotect")
  @js.native
  def unprotect(target: IAnyStateTreeNode): Unit = js.native
  
  @JSImport("mobx-state-tree/dist/core/mst-operations", "walk")
  @js.native
  def walk(target: IAnyStateTreeNode, processor: js.Function1[/* item */ IAnyStateTreeNode, Unit]): Unit = js.native
  
  @js.native
  trait IModelReflectionData extends IModelReflectionPropertiesData {
    
    var actions: js.Array[String] = js.native
    
    var views: js.Array[String] = js.native
    
    var volatile: js.Array[String] = js.native
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
  
  @js.native
  trait IModelReflectionPropertiesData extends StObject {
    
    var name: String = js.native
    
    var properties: StringDictionary[IAnyType] = js.native
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
  
  type TypeOrStateTreeNodeToStateTreeNode[T /* <: IAnyType | IAnyStateTreeNode */] = T | (js.Any with IStateTreeNode[T])
}
