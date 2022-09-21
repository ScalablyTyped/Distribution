package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeViewMod {
  
  inline def apply(field: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(field.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/TreeView", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with TreeView {
    def this(field: Any) = this()
    
    /* CompleteClass */
    var field: Any = js.native
    
    /* CompleteClass */
    var nodes: typings.nginstackEngine.stringListMod.^ = js.native
    
    /* CompleteClass */
    var readOnly: Boolean = js.native
  }
  @JSImport("@nginstack/web-framework/lib/grid/TreeView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/grid/TreeView", "AbstractTree_")
  @js.native
  /* private */ open class AbstractTree_ ()
    extends StObject
       with AbstractTree {
    
    /* CompleteClass */
    override def addChild(text: Any, value: Any, index: Any, css: Any): Any = js.native
    
    /* CompleteClass */
    var autoExpand: Boolean = js.native
    
    /* CompleteClass */
    var children: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def collapse(): Unit = js.native
    
    /* CompleteClass */
    var css: Any = js.native
    
    /* CompleteClass */
    override def expand(): Unit = js.native
    
    /* CompleteClass */
    var expanded: Boolean = js.native
    
    /* CompleteClass */
    override def getHasChildren(): Boolean = js.native
    
    /* CompleteClass */
    var index: Double = js.native
    
    /* CompleteClass */
    var level: Double = js.native
    
    /* CompleteClass */
    var nId: Double = js.native
    
    /* CompleteClass */
    var onAddition: typings.nginstackEngine.legacyEventMod.^ = js.native
    
    /* CompleteClass */
    var onCollapse: typings.nginstackEngine.legacyEventMod.^ = js.native
    
    /* CompleteClass */
    var onDeletion: typings.nginstackEngine.legacyEventMod.^ = js.native
    
    /* CompleteClass */
    var onExpand: typings.nginstackEngine.legacyEventMod.^ = js.native
    
    /* CompleteClass */
    var onGetTreeIcon: typings.nginstackEngine.legacyEventMod.^ = js.native
    
    /* CompleteClass */
    var parent: Any = js.native
    
    /* CompleteClass */
    var text: Any = js.native
    
    /* CompleteClass */
    var treeView: Any = js.native
    
    /* CompleteClass */
    var value: Any = js.native
  }
  object AbstractTree_ {
    
    @JSImport("@nginstack/web-framework/lib/grid/TreeView", "AbstractTree_")
    @js.native
    def apply(treeView: Any, parent: Any): Unit = js.native
  }
  
  @JSImport("@nginstack/web-framework/lib/grid/TreeView", "TreeChild_")
  @js.native
  open class TreeChild_ protected ()
    extends StObject
       with TreeChild {
    def this(treeView: Any, parent: Any, css: Any) = this()
    
    /* CompleteClass */
    var css: Any = js.native
    
    /* CompleteClass */
    var fHtml: String = js.native
    
    /* CompleteClass */
    override def getHtml(): String = js.native
    
    /* CompleteClass */
    override def getIsFirst(): Boolean = js.native
    
    /* CompleteClass */
    override def getIsLast(): Boolean = js.native
    
    /* CompleteClass */
    var nId: Any = js.native
  }
  object TreeChild_ {
    
    @JSImport("@nginstack/web-framework/lib/grid/TreeView", "TreeChild_")
    @js.native
    def apply(treeView: Any, parent: Any, css: Any): Unit = js.native
  }
  
  trait AbstractTree extends StObject {
    
    def addChild(text: Any, value: Any, index: Any, css: Any): Any
    
    var autoExpand: Boolean
    
    var children: js.Array[Any]
    
    def collapse(): Unit
    
    var css: Any
    
    def expand(): Unit
    
    var expanded: Boolean
    
    def getHasChildren(): Boolean
    
    var index: Double
    
    var level: Double
    
    var nId: Double
    
    var onAddition: typings.nginstackEngine.legacyEventMod.^
    
    var onCollapse: typings.nginstackEngine.legacyEventMod.^
    
    var onDeletion: typings.nginstackEngine.legacyEventMod.^
    
    var onExpand: typings.nginstackEngine.legacyEventMod.^
    
    var onGetTreeIcon: typings.nginstackEngine.legacyEventMod.^
    
    var parent: Any
    
    var text: Any
    
    var treeView: Any
    
    var value: Any
  }
  object AbstractTree {
    
    inline def apply(
      addChild: (Any, Any, Any, Any) => Any,
      autoExpand: Boolean,
      children: js.Array[Any],
      collapse: () => Unit,
      css: Any,
      expand: () => Unit,
      expanded: Boolean,
      getHasChildren: () => Boolean,
      index: Double,
      level: Double,
      nId: Double,
      onAddition: typings.nginstackEngine.legacyEventMod.^,
      onCollapse: typings.nginstackEngine.legacyEventMod.^,
      onDeletion: typings.nginstackEngine.legacyEventMod.^,
      onExpand: typings.nginstackEngine.legacyEventMod.^,
      onGetTreeIcon: typings.nginstackEngine.legacyEventMod.^,
      parent: Any,
      text: Any,
      treeView: Any,
      value: Any
    ): AbstractTree = {
      val __obj = js.Dynamic.literal(addChild = js.Any.fromFunction4(addChild), autoExpand = autoExpand.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], collapse = js.Any.fromFunction0(collapse), css = css.asInstanceOf[js.Any], expand = js.Any.fromFunction0(expand), expanded = expanded.asInstanceOf[js.Any], getHasChildren = js.Any.fromFunction0(getHasChildren), index = index.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], nId = nId.asInstanceOf[js.Any], onAddition = onAddition.asInstanceOf[js.Any], onCollapse = onCollapse.asInstanceOf[js.Any], onDeletion = onDeletion.asInstanceOf[js.Any], onExpand = onExpand.asInstanceOf[js.Any], onGetTreeIcon = onGetTreeIcon.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], treeView = treeView.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbstractTree]
    }
    
    extension [Self <: AbstractTree](x: Self) {
      
      inline def setAddChild(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "addChild", js.Any.fromFunction4(value))
      
      inline def setAutoExpand(value: Boolean): Self = StObject.set(x, "autoExpand", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Any*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setCollapse(value: () => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction0(value))
      
      inline def setCss(value: Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setExpand(value: () => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction0(value))
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setGetHasChildren(value: () => Boolean): Self = StObject.set(x, "getHasChildren", js.Any.fromFunction0(value))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setNId(value: Double): Self = StObject.set(x, "nId", value.asInstanceOf[js.Any])
      
      inline def setOnAddition(value: typings.nginstackEngine.legacyEventMod.^): Self = StObject.set(x, "onAddition", value.asInstanceOf[js.Any])
      
      inline def setOnCollapse(value: typings.nginstackEngine.legacyEventMod.^): Self = StObject.set(x, "onCollapse", value.asInstanceOf[js.Any])
      
      inline def setOnDeletion(value: typings.nginstackEngine.legacyEventMod.^): Self = StObject.set(x, "onDeletion", value.asInstanceOf[js.Any])
      
      inline def setOnExpand(value: typings.nginstackEngine.legacyEventMod.^): Self = StObject.set(x, "onExpand", value.asInstanceOf[js.Any])
      
      inline def setOnGetTreeIcon(value: typings.nginstackEngine.legacyEventMod.^): Self = StObject.set(x, "onGetTreeIcon", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTreeView(value: Any): Self = StObject.set(x, "treeView", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TreeChild extends StObject {
    
    var css: Any
    
    var fHtml: String
    
    def getHtml(): String
    
    def getIsFirst(): Boolean
    
    def getIsLast(): Boolean
    
    var nId: Any
  }
  object TreeChild {
    
    inline def apply(
      css: Any,
      fHtml: String,
      getHtml: () => String,
      getIsFirst: () => Boolean,
      getIsLast: () => Boolean,
      nId: Any
    ): TreeChild = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], fHtml = fHtml.asInstanceOf[js.Any], getHtml = js.Any.fromFunction0(getHtml), getIsFirst = js.Any.fromFunction0(getIsFirst), getIsLast = js.Any.fromFunction0(getIsLast), nId = nId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeChild]
    }
    
    extension [Self <: TreeChild](x: Self) {
      
      inline def setCss(value: Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setFHtml(value: String): Self = StObject.set(x, "fHtml", value.asInstanceOf[js.Any])
      
      inline def setGetHtml(value: () => String): Self = StObject.set(x, "getHtml", js.Any.fromFunction0(value))
      
      inline def setGetIsFirst(value: () => Boolean): Self = StObject.set(x, "getIsFirst", js.Any.fromFunction0(value))
      
      inline def setGetIsLast(value: () => Boolean): Self = StObject.set(x, "getIsLast", js.Any.fromFunction0(value))
      
      inline def setNId(value: Any): Self = StObject.set(x, "nId", value.asInstanceOf[js.Any])
    }
  }
  
  trait TreeView extends StObject {
    
    var field: Any
    
    var nodes: typings.nginstackEngine.stringListMod.^
    
    var readOnly: Boolean
  }
  object TreeView {
    
    inline def apply(field: Any, nodes: typings.nginstackEngine.stringListMod.^, readOnly: Boolean): TreeView = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeView]
    }
    
    extension [Self <: TreeView](x: Self) {
      
      inline def setField(value: Any): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: typings.nginstackEngine.stringListMod.^): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    }
  }
}
