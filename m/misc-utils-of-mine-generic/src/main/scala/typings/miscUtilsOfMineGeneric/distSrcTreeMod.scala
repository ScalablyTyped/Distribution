package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTreeMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterAncestors[T /* <: Node */](n: T, p: NodeSimplePredicate[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterAncestors")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def filterAncestors[T /* <: Node */](n: T, p: NodeSimplePredicate[T], o: VisitorOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterAncestors")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def filterChildren[T /* <: Node */](n: Node, p: NodePredicate[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterChildren")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def filterDescendants[T /* <: Node */](n: T, p: NodePredicate[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterDescendants")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def filterDescendants[T /* <: Node */](n: T, p: NodePredicate[T], o: VisitorOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterDescendants")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def findAncestor[T /* <: Node */](n: T, p: NodePredicate[T]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAncestor")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def findAncestor[T /* <: Node */](n: T, p: NodePredicate[T], o: js.Object): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAncestor")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def findChildren[T /* <: Node */](n: T, p: NodePredicate[T]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findChildren")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def findDescendant[T /* <: Node */](n: T, p: NodePredicate[T]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findDescendant")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def findDescendant[T /* <: Node */](n: T, p: NodePredicate[T], o: VisitorOptions): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findDescendant")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def findRootElement[T /* <: Node */](n: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("findRootElement")(n.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def getAncestors[T /* <: Node */](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAncestors")().asInstanceOf[js.Array[T]]
  inline def getAncestors[T /* <: Node */](node: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAncestors")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def getChildIndex(node: Node): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildIndex")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getChildIndex(node: Node, children: js.Array[Node]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildIndex")(node.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDistanceToAncestor[T /* <: Node */](): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceToAncestor")().asInstanceOf[Double]
  inline def getDistanceToAncestor[T /* <: Node */](node: T): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceToAncestor")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getDistanceToAncestor[T /* <: Node */](node: T, ancestor: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceToAncestor")(node.asInstanceOf[js.Any], ancestor.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getDistanceToAncestor[T /* <: Node */](node: Unit, ancestor: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceToAncestor")(node.asInstanceOf[js.Any], ancestor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getNextSibling(node: Node): js.UndefOr[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextSibling")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Node]]
  
  inline def getPreviousSibling(node: Node): js.UndefOr[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousSibling")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Node]]
  
  inline def getSiblings(node: Node): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSiblings")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
  inline def getSiblings(node: Node, getChildrenMode: Boolean): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSiblings")(node.asInstanceOf[js.Any], getChildrenMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  
  inline def mapChildren[N /* <: Node */, T](n: N, v: js.Function1[/* c */ N, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapChildren")(n.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def mapDescendants[T /* <: Node */, V](n: T, p: js.Function1[/* p */ T, V]): js.Array[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapDescendants")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Array[V]]
  inline def mapDescendants[T /* <: Node */, V](n: T, p: js.Function1[/* p */ T, V], o: VisitorOptions): js.Array[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapDescendants")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Array[V]]
  
  inline def visitAncestors[T /* <: Node */](n: T, v: Visitor[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("visitAncestors")(n.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def visitAncestors[T /* <: Node */](n: T, v: Visitor[T], o: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("visitAncestors")(n.asInstanceOf[js.Any], v.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def visitChildren[T /* <: Node */](n: T, v: js.Function1[/* c */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitChildren")(n.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def visitDescendants[T /* <: Node */](n: T, v: Visitor[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("visitDescendants")(n.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def visitDescendants[T /* <: Node */](n: T, v: Visitor[T], o: Unit, inRecursion: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("visitDescendants")(n.asInstanceOf[js.Any], v.asInstanceOf[js.Any], o.asInstanceOf[js.Any], inRecursion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def visitDescendants[T /* <: Node */](n: T, v: Visitor[T], o: VisitorOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("visitDescendants")(n.asInstanceOf[js.Any], v.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def visitDescendants[T /* <: Node */](n: T, v: Visitor[T], o: VisitorOptions, inRecursion: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("visitDescendants")(n.asInstanceOf[js.Any], v.asInstanceOf[js.Any], o.asInstanceOf[js.Any], inRecursion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Node extends StObject {
    
    var childNodes: js.UndefOr[js.Array[Node]] = js.undefined
    
    var parentNode: js.UndefOr[Node] = js.undefined
  }
  object Node {
    
    inline def apply(): Node = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      inline def setChildNodes(value: js.Array[Node]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      inline def setChildNodesUndefined: Self = StObject.set(x, "childNodes", js.undefined)
      
      inline def setChildNodesVarargs(value: Node*): Self = StObject.set(x, "childNodes", js.Array(value*))
      
      inline def setParentNode(value: Node): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      inline def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
    }
  }
  
  type NodeKindPredicate[T /* <: Node */] = js.Function3[
    /* n */ T, 
    /* i */ js.UndefOr[Double], 
    /* a */ js.UndefOr[js.Array[T]], 
    /* is T */ Boolean
  ]
  
  type NodePredicate[T /* <: Node */] = NodeSimplePredicate[T] | NodeKindPredicate[T]
  
  type NodeSimplePredicate[T /* <: Node */] = js.Function3[/* n */ T, /* i */ js.UndefOr[Double], /* a */ js.UndefOr[js.Array[T]], Boolean]
  
  type Visitor[T /* <: Node */] = js.Function1[/* n */ T, Boolean]
  
  trait VisitorOptions extends StObject {
    
    var andSelf: js.UndefOr[Boolean] = js.undefined
    
    /**
      * if a descendant visitor returned true, we stop visiting and signal up
      */
    var breakOnDescendantSignal: js.UndefOr[Boolean] = js.undefined
    
    var childrenFirst: js.UndefOr[Boolean] = js.undefined
    
    /**
      * no matter if visitor returns true for a node, it will still visit its descendants and then break the chain
      */
    var visitDescendantsOnSelfSignalAnyway: js.UndefOr[Boolean] = js.undefined
  }
  object VisitorOptions {
    
    inline def apply(): VisitorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisitorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VisitorOptions] (val x: Self) extends AnyVal {
      
      inline def setAndSelf(value: Boolean): Self = StObject.set(x, "andSelf", value.asInstanceOf[js.Any])
      
      inline def setAndSelfUndefined: Self = StObject.set(x, "andSelf", js.undefined)
      
      inline def setBreakOnDescendantSignal(value: Boolean): Self = StObject.set(x, "breakOnDescendantSignal", value.asInstanceOf[js.Any])
      
      inline def setBreakOnDescendantSignalUndefined: Self = StObject.set(x, "breakOnDescendantSignal", js.undefined)
      
      inline def setChildrenFirst(value: Boolean): Self = StObject.set(x, "childrenFirst", value.asInstanceOf[js.Any])
      
      inline def setChildrenFirstUndefined: Self = StObject.set(x, "childrenFirst", js.undefined)
      
      inline def setVisitDescendantsOnSelfSignalAnyway(value: Boolean): Self = StObject.set(x, "visitDescendantsOnSelfSignalAnyway", value.asInstanceOf[js.Any])
      
      inline def setVisitDescendantsOnSelfSignalAnywayUndefined: Self = StObject.set(x, "visitDescendantsOnSelfSignalAnyway", js.undefined)
    }
  }
}
