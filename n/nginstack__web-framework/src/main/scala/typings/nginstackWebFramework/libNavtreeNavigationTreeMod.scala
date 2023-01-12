package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNavtreeNavigationTreeMod {
  
  inline def apply(rootClassKey: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(rootClassKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/navtree/NavigationTree", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with NavigationTree {
    def this(rootClassKey: Any) = this()
    
    /* CompleteClass */
    var accessibleChildren: Any = js.native
    
    /* CompleteClass */
    var alwaysVisibleClasses: js.Array[Double] = js.native
    
    /* private */ /* CompleteClass */
    var classDefManager_ : Any = js.native
    
    /* CompleteClass */
    override def classHasChildren(classKey: Any): Boolean = js.native
    
    /* CompleteClass */
    var classe: typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* CompleteClass */
    override def collectImmediateLevelNavigatableChildren(collection: Any, classDef: Any, parentNodeId: Any): Any = js.native
    
    /* CompleteClass */
    override def collectProcessesAndLayouts(collection: Any, classDef: Any, parentNodeId: Any): Any = js.native
    
    /* CompleteClass */
    var collection: typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* CompleteClass */
    override def fillCollection(collection: Any, classDef: Any, parentNodeId: Any, mimeType: Any, levelOrder: Any, nodeKind: Any): Unit = js.native
    
    /* CompleteClass */
    override def getChildren(nodeId: Any): Any = js.native
    
    /* CompleteClass */
    override def getChildrenVersion(classDef: Any): Any = js.native
    
    /* CompleteClass */
    override def getNodeVersion(classDef: Any): Any = js.native
    
    /* CompleteClass */
    override def getSubClassesVersion(classKey: Any): Double = js.native
    
    /* CompleteClass */
    override def getVfsVersionByMimeType(classKey: Any, mimeTypes: Any): Double = js.native
    
    /* CompleteClass */
    override def initialize(): Unit = js.native
    
    /* CompleteClass */
    var ipermission: typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* CompleteClass */
    var ivfs: typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* CompleteClass */
    override def nodeExists(id: String): Boolean = js.native
    
    /* CompleteClass */
    var reset: Any = js.native
    
    /* CompleteClass */
    var rootClassKey: Any = js.native
    
    /* CompleteClass */
    var visibilityMode: VisibilityModes = js.native
  }
  @JSImport("@nginstack/web-framework/lib/navtree/NavigationTree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object CLASS_NODE {
    
    @JSImport("@nginstack/web-framework/lib/navtree/NavigationTree", "CLASS_NODE.subType")
    @js.native
    val subType: Any = js.native
    
    @JSImport("@nginstack/web-framework/lib/navtree/NavigationTree", "CLASS_NODE.type")
    @js.native
    val `type`: Double = js.native
  }
  
  object DATASOURCE_NODE {
    
    @JSImport("@nginstack/web-framework/lib/navtree/NavigationTree", "DATASOURCE_NODE.subType_4")
    @js.native
    val subType4: Double = js.native
    
    @JSImport("@nginstack/web-framework/lib/navtree/NavigationTree", "DATASOURCE_NODE.type_4")
    @js.native
    val type4: Double = js.native
  }
  
  object ERROR_NODE {
    
    @JSImport("@nginstack/web-framework/lib/navtree/NavigationTree", "ERROR_NODE.subType_5")
    @js.native
    val subType5: Any = js.native
    
    @JSImport("@nginstack/web-framework/lib/navtree/NavigationTree", "ERROR_NODE.type_5")
    @js.native
    val type5: Double = js.native
  }
  
  object LAYOUT_NODE {
    
    @JSImport("@nginstack/web-framework/lib/navtree/NavigationTree", "LAYOUT_NODE.subType_2")
    @js.native
    val subType2: Double = js.native
    
    @JSImport("@nginstack/web-framework/lib/navtree/NavigationTree", "LAYOUT_NODE.type_2")
    @js.native
    val type2: Double = js.native
  }
  
  object LINK_NODE {
    
    @JSImport("@nginstack/web-framework/lib/navtree/NavigationTree", "LINK_NODE.subType_3")
    @js.native
    val subType3: Double = js.native
    
    @JSImport("@nginstack/web-framework/lib/navtree/NavigationTree", "LINK_NODE.type_3")
    @js.native
    val type3: Double = js.native
  }
  
  object PROCESS_NODE {
    
    @JSImport("@nginstack/web-framework/lib/navtree/NavigationTree", "PROCESS_NODE.subType_1")
    @js.native
    val subType1: Double = js.native
    
    @JSImport("@nginstack/web-framework/lib/navtree/NavigationTree", "PROCESS_NODE.type_1")
    @js.native
    val type1: Double = js.native
  }
  
  object VisibilityModes {
    
    @JSImport("@nginstack/web-framework/lib/navtree/NavigationTree", "VisibilityModes.ANYTHING_IN_PERMITTED_MODULES")
    @js.native
    val ANYTHING_IN_PERMITTED_MODULES: Double = js.native
    
    @JSImport("@nginstack/web-framework/lib/navtree/NavigationTree", "VisibilityModes.EVERYTHING")
    @js.native
    val EVERYTHING: Double = js.native
    
    @JSImport("@nginstack/web-framework/lib/navtree/NavigationTree", "VisibilityModes.ONLY_THOSE_PERMITTED")
    @js.native
    val ONLY_THOSE_PERMITTED: Double = js.native
  }
  type VisibilityModes = Double
  
  inline def createEmptyNavigationTreeCollection(): typings.nginstackEngine.libDatasetDataSetMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyNavigationTreeCollection")().asInstanceOf[typings.nginstackEngine.libDatasetDataSetMod.^]
  
  inline def obtainVisibilityMode(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("obtainVisibilityMode")().asInstanceOf[Double]
  
  trait NavigationTree extends StObject {
    
    var accessibleChildren: Any
    
    var alwaysVisibleClasses: js.Array[Double]
    
    /* private */ var classDefManager_ : Any
    
    def classHasChildren(classKey: Any): Boolean
    
    var classe: typings.nginstackEngine.libDatasetDataSetMod.^
    
    def collectImmediateLevelNavigatableChildren(collection: Any, classDef: Any, parentNodeId: Any): Any
    
    def collectProcessesAndLayouts(collection: Any, classDef: Any, parentNodeId: Any): Any
    
    var collection: typings.nginstackEngine.libDatasetDataSetMod.^
    
    def fillCollection(collection: Any, classDef: Any, parentNodeId: Any, mimeType: Any, levelOrder: Any, nodeKind: Any): Unit
    
    def getChildren(nodeId: Any): Any
    
    def getChildrenVersion(classDef: Any): Any
    
    def getNodeVersion(classDef: Any): Any
    
    def getSubClassesVersion(classKey: Any): Double
    
    def getVfsVersionByMimeType(classKey: Any, mimeTypes: Any): Double
    
    def initialize(): Unit
    
    var ipermission: typings.nginstackEngine.libDatasetDataSetMod.^
    
    var ivfs: typings.nginstackEngine.libDatasetDataSetMod.^
    
    /* private */ var logger_ : Any
    
    def nodeExists(id: String): Boolean
    
    var reset: Any
    
    var rootClassKey: Any
    
    var visibilityMode: VisibilityModes
  }
  object NavigationTree {
    
    inline def apply(
      accessibleChildren: Any,
      alwaysVisibleClasses: js.Array[Double],
      classDefManager_ : Any,
      classHasChildren: Any => Boolean,
      classe: typings.nginstackEngine.libDatasetDataSetMod.^,
      collectImmediateLevelNavigatableChildren: (Any, Any, Any) => Any,
      collectProcessesAndLayouts: (Any, Any, Any) => Any,
      collection: typings.nginstackEngine.libDatasetDataSetMod.^,
      fillCollection: (Any, Any, Any, Any, Any, Any) => Unit,
      getChildren: Any => Any,
      getChildrenVersion: Any => Any,
      getNodeVersion: Any => Any,
      getSubClassesVersion: Any => Double,
      getVfsVersionByMimeType: (Any, Any) => Double,
      initialize: () => Unit,
      ipermission: typings.nginstackEngine.libDatasetDataSetMod.^,
      ivfs: typings.nginstackEngine.libDatasetDataSetMod.^,
      logger_ : Any,
      nodeExists: String => Boolean,
      reset: Any,
      rootClassKey: Any,
      visibilityMode: VisibilityModes
    ): NavigationTree = {
      val __obj = js.Dynamic.literal(accessibleChildren = accessibleChildren.asInstanceOf[js.Any], alwaysVisibleClasses = alwaysVisibleClasses.asInstanceOf[js.Any], classDefManager_ = classDefManager_.asInstanceOf[js.Any], classHasChildren = js.Any.fromFunction1(classHasChildren), classe = classe.asInstanceOf[js.Any], collectImmediateLevelNavigatableChildren = js.Any.fromFunction3(collectImmediateLevelNavigatableChildren), collectProcessesAndLayouts = js.Any.fromFunction3(collectProcessesAndLayouts), collection = collection.asInstanceOf[js.Any], fillCollection = js.Any.fromFunction6(fillCollection), getChildren = js.Any.fromFunction1(getChildren), getChildrenVersion = js.Any.fromFunction1(getChildrenVersion), getNodeVersion = js.Any.fromFunction1(getNodeVersion), getSubClassesVersion = js.Any.fromFunction1(getSubClassesVersion), getVfsVersionByMimeType = js.Any.fromFunction2(getVfsVersionByMimeType), initialize = js.Any.fromFunction0(initialize), ipermission = ipermission.asInstanceOf[js.Any], ivfs = ivfs.asInstanceOf[js.Any], logger_ = logger_.asInstanceOf[js.Any], nodeExists = js.Any.fromFunction1(nodeExists), reset = reset.asInstanceOf[js.Any], rootClassKey = rootClassKey.asInstanceOf[js.Any], visibilityMode = visibilityMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationTree]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationTree] (val x: Self) extends AnyVal {
      
      inline def setAccessibleChildren(value: Any): Self = StObject.set(x, "accessibleChildren", value.asInstanceOf[js.Any])
      
      inline def setAlwaysVisibleClasses(value: js.Array[Double]): Self = StObject.set(x, "alwaysVisibleClasses", value.asInstanceOf[js.Any])
      
      inline def setAlwaysVisibleClassesVarargs(value: Double*): Self = StObject.set(x, "alwaysVisibleClasses", js.Array(value*))
      
      inline def setClassDefManager_(value: Any): Self = StObject.set(x, "classDefManager_", value.asInstanceOf[js.Any])
      
      inline def setClassHasChildren(value: Any => Boolean): Self = StObject.set(x, "classHasChildren", js.Any.fromFunction1(value))
      
      inline def setClasse(value: typings.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "classe", value.asInstanceOf[js.Any])
      
      inline def setCollectImmediateLevelNavigatableChildren(value: (Any, Any, Any) => Any): Self = StObject.set(x, "collectImmediateLevelNavigatableChildren", js.Any.fromFunction3(value))
      
      inline def setCollectProcessesAndLayouts(value: (Any, Any, Any) => Any): Self = StObject.set(x, "collectProcessesAndLayouts", js.Any.fromFunction3(value))
      
      inline def setCollection(value: typings.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setFillCollection(value: (Any, Any, Any, Any, Any, Any) => Unit): Self = StObject.set(x, "fillCollection", js.Any.fromFunction6(value))
      
      inline def setGetChildren(value: Any => Any): Self = StObject.set(x, "getChildren", js.Any.fromFunction1(value))
      
      inline def setGetChildrenVersion(value: Any => Any): Self = StObject.set(x, "getChildrenVersion", js.Any.fromFunction1(value))
      
      inline def setGetNodeVersion(value: Any => Any): Self = StObject.set(x, "getNodeVersion", js.Any.fromFunction1(value))
      
      inline def setGetSubClassesVersion(value: Any => Double): Self = StObject.set(x, "getSubClassesVersion", js.Any.fromFunction1(value))
      
      inline def setGetVfsVersionByMimeType(value: (Any, Any) => Double): Self = StObject.set(x, "getVfsVersionByMimeType", js.Any.fromFunction2(value))
      
      inline def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
      
      inline def setIpermission(value: typings.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "ipermission", value.asInstanceOf[js.Any])
      
      inline def setIvfs(value: typings.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "ivfs", value.asInstanceOf[js.Any])
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setNodeExists(value: String => Boolean): Self = StObject.set(x, "nodeExists", js.Any.fromFunction1(value))
      
      inline def setReset(value: Any): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setRootClassKey(value: Any): Self = StObject.set(x, "rootClassKey", value.asInstanceOf[js.Any])
      
      inline def setVisibilityMode(value: VisibilityModes): Self = StObject.set(x, "visibilityMode", value.asInstanceOf[js.Any])
    }
  }
}
