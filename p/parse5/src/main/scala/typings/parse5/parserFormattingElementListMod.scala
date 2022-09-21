package typings.parse5

import typings.parse5.commonTokenMod.TagToken
import typings.parse5.parserFormattingElementListMod.EntryType.Element
import typings.parse5.parserFormattingElementListMod.EntryType.Marker
import typings.parse5.treeAdaptersInterfaceMod.TreeAdapter
import typings.parse5.treeAdaptersInterfaceMod.TreeAdapterTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserFormattingElementListMod {
  
  @js.native
  sealed trait EntryType extends StObject
  @JSImport("parse5/dist/parser/formatting-element-list", "EntryType")
  @js.native
  object EntryType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EntryType & Double] = js.native
    
    @js.native
    sealed trait Element
      extends StObject
         with EntryType
    /* 1 */ val Element: typings.parse5.parserFormattingElementListMod.EntryType.Element & Double = js.native
    
    @js.native
    sealed trait Marker
      extends StObject
         with EntryType
    /* 0 */ val Marker: typings.parse5.parserFormattingElementListMod.EntryType.Marker & Double = js.native
  }
  
  @JSImport("parse5/dist/parser/formatting-element-list", "FormattingElementList")
  @js.native
  open class FormattingElementList[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */] protected () extends StObject {
    def this(treeAdapter: TreeAdapter[T]) = this()
    
    /* private */ var _ensureNoahArkCondition: Any = js.native
    
    /* private */ var _getNoahArkConditionCandidates: Any = js.native
    
    var bookmark: Entry[T] | Null = js.native
    
    /**
      * Clears the list of formatting elements up to the last marker.
      *
      * @see https://html.spec.whatwg.org/multipage/parsing.html#clear-the-list-of-active-formatting-elements-up-to-the-last-marker
      */
    def clearToLastMarker(): Unit = js.native
    
    var entries: js.Array[Entry[T]] = js.native
    
    def getElementEntryInScopeWithTagName(tagName: String): ElementEntry[T] | Null = js.native
    
    @JSName("getElementEntry")
    def getElementEntry_element(
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ): js.UndefOr[ElementEntry[T]] = js.native
    
    @JSName("insertElementAfterBookmark")
    def insertElementAfterBookmark_element(
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      token: TagToken
    ): Unit = js.native
    
    def insertMarker(): Unit = js.native
    
    @JSName("pushElement")
    def pushElement_element(
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      token: TagToken
    ): Unit = js.native
    
    def removeEntry(entry: Entry[T]): Unit = js.native
    
    /* private */ var treeAdapter: Any = js.native
  }
  
  trait ElementEntry[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */]
    extends StObject
       with Entry[T] {
    
    var element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    
    var token: TagToken
    
    var `type`: Element
  }
  object ElementEntry {
    
    inline def apply[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      token: TagToken,
      `type`: Element
    ): ElementEntry[T] = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementEntry[T]]
    }
    
    extension [Self <: ElementEntry[?], T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](x: Self & ElementEntry[T]) {
      
      inline def setElement(value: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setToken(value: TagToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setType(value: Element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.parse5.parserFormattingElementListMod.MarkerEntry
    - typings.parse5.parserFormattingElementListMod.ElementEntry[T]
  */
  trait Entry[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */] extends StObject
  object Entry {
    
    inline def ElementEntry[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
      element: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      token: TagToken,
      `type`: Element
    ): typings.parse5.parserFormattingElementListMod.ElementEntry[T] = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.parse5.parserFormattingElementListMod.ElementEntry[T]]
    }
    
    inline def MarkerEntry(`type`: Marker): typings.parse5.parserFormattingElementListMod.MarkerEntry = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.parse5.parserFormattingElementListMod.MarkerEntry]
    }
  }
  
  trait MarkerEntry
    extends StObject
       with Entry[Any] {
    
    var `type`: Marker
  }
  object MarkerEntry {
    
    inline def apply(`type`: Marker): MarkerEntry = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerEntry]
    }
    
    extension [Self <: MarkerEntry](x: Self) {
      
      inline def setType(value: Marker): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
