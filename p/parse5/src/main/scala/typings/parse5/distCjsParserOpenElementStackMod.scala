package typings.parse5

import typings.parse5.distCjsCommonHtmlMod.TAG_ID
import typings.parse5.distCjsTreeAdaptersInterfaceMod.TreeAdapter
import typings.parse5.distCjsTreeAdaptersInterfaceMod.TreeAdapterTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsParserOpenElementStackMod {
  
  @JSImport("parse5/dist/cjs/parser/open-element-stack", "OpenElementStack")
  @js.native
  open class OpenElementStack[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */] protected () extends StObject {
    def this(
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      treeAdapter: TreeAdapter[T],
      handler: StackHandler[T]
    ) = this()
    
    /* private */ var _indexOf: Any = js.native
    
    /* private */ var _indexOfTagNames: Any = js.native
    
    /* private */ var _isInTemplate: Any = js.native
    
    /* private */ var _updateCurrentElement: Any = js.native
    
    /* private */ var clearBackTo: Any = js.native
    
    def clearBackToTableBodyContext(): Unit = js.native
    
    def clearBackToTableContext(): Unit = js.native
    
    def clearBackToTableRowContext(): Unit = js.native
    
    @JSName("contains")
    def contains_element(
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ): Boolean = js.native
    
    var current: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any = js.native
    
    var currentTagId: TAG_ID = js.native
    
    def currentTmplContentOrNode: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any = js.native
    
    def generateImpliedEndTags(): Unit = js.native
    
    def generateImpliedEndTagsThoroughly(): Unit = js.native
    
    def generateImpliedEndTagsWithExclusion(exclusionId: TAG_ID): Unit = js.native
    
    @JSName("getCommonAncestor")
    def getCommonAncestor_element(
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ): (/* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any) | Null = js.native
    
    /* private */ var handler: Any = js.native
    
    def hasInButtonScope(tagName: TAG_ID): Boolean = js.native
    
    def hasInListItemScope(tagName: TAG_ID): Boolean = js.native
    
    def hasInScope(tagName: TAG_ID): Boolean = js.native
    
    def hasInSelectScope(tagName: TAG_ID): Boolean = js.native
    
    def hasInTableScope(tagName: TAG_ID): Boolean = js.native
    
    def hasNumberedHeaderInScope(): Boolean = js.native
    
    def hasTableBodyContextInTableScope(): Boolean = js.native
    
    @JSName("insertAfter")
    def insertAfter_element(
      referenceElement: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      newElement: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      newElementID: TAG_ID
    ): Unit = js.native
    
    def isRootHtmlElementCurrent(): Boolean = js.native
    
    var items: js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any
      ] = js.native
    
    def pop(): Unit = js.native
    
    def popAllUpToHtmlElement(): Unit = js.native
    
    @JSName("popUntilElementPopped")
    def popUntilElementPopped_element(
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ): Unit = js.native
    
    def popUntilNumberedHeaderPopped(): Unit = js.native
    
    /* private */ var popUntilPopped: Any = js.native
    
    def popUntilTableCellPopped(): Unit = js.native
    
    def popUntilTagNamePopped(tagName: TAG_ID): Unit = js.native
    
    @JSName("push")
    def push_element(
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      tagID: TAG_ID
    ): Unit = js.native
    
    @JSName("remove")
    def remove_element(
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ): Unit = js.native
    
    @JSName("replace")
    def replace_element(
      oldElement: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      newElement: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ): Unit = js.native
    
    def shortenToLength(idx: Double): Unit = js.native
    
    var stackTop: Double = js.native
    
    var tagIDs: js.Array[TAG_ID] = js.native
    
    var tmplCount: Double = js.native
    
    /* private */ var treeAdapter: Any = js.native
    
    def tryPeekProperlyNestedBodyElement(): (/* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any) | Null = js.native
  }
  
  trait StackHandler[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */] extends StObject {
    
    @JSName("onItemPop")
    def onItemPop_parentNode(
      node: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any,
      isTop: Boolean
    ): Unit
    
    @JSName("onItemPush")
    def onItemPush_parentNode(
      node: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any,
      tid: Double,
      isTop: Boolean
    ): Unit
  }
  object StackHandler {
    
    inline def apply[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
      onItemPop: (/* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any, Boolean) => Unit,
      onItemPush: (/* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any, Double, Boolean) => Unit
    ): StackHandler[T] = {
      val __obj = js.Dynamic.literal(onItemPop = js.Any.fromFunction2(onItemPop), onItemPush = js.Any.fromFunction3(onItemPush))
      __obj.asInstanceOf[StackHandler[T]]
    }
    
    extension [Self <: StackHandler[?], T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](x: Self & StackHandler[T]) {
      
      inline def setOnItemPop(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any, Boolean) => Unit
      ): Self = StObject.set(x, "onItemPop", js.Any.fromFunction2(value))
      
      inline def setOnItemPush(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any, Double, Boolean) => Unit
      ): Self = StObject.set(x, "onItemPush", js.Any.fromFunction3(value))
    }
  }
}
