package typings.orbitUiReactComponents

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAccordionItemsMod {
  
  @JSImport("@orbit-ui/react-components/dist/accordion/src/useAccordionItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/accordion/src/useAccordionItems", "AccordionBuilder")
  @js.native
  open class AccordionBuilder protected () extends StObject {
    def this(rootId: String) = this()
    
    def build(children: ReactNode): js.Array[AccordionBuilderItem] = js.native
    
    /* private */ var rootId: Any = js.native
  }
  
  inline def useAccordionItems(children: ReactNode, rootId: String): js.Array[AccordionBuilderItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAccordionItems")(children.asInstanceOf[js.Any], rootId.asInstanceOf[js.Any])).asInstanceOf[js.Array[AccordionBuilderItem]]
  
  trait AccordionBuilderHeader extends StObject {
    
    var elementType: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ReactElement['type'] */ js.Any
    
    var props: Record[String, Any]
    
    var ref: Ref[Any]
  }
  object AccordionBuilderHeader {
    
    inline def apply(
      elementType: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ReactElement['type'] */ js.Any,
      props: Record[String, Any]
    ): AccordionBuilderHeader = {
      val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], ref = null)
      __obj.asInstanceOf[AccordionBuilderHeader]
    }
    
    extension [Self <: AccordionBuilderHeader](x: Self) {
      
      inline def setElementType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ReactElement['type'] */ js.Any
      ): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Record[String, Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
  
  trait AccordionBuilderItem extends StObject {
    
    var header: AccordionBuilderHeader
    
    var id: String
    
    var index: Double
    
    var key: String
    
    var panel: AccordionBuilderPanel
  }
  object AccordionBuilderItem {
    
    inline def apply(
      header: AccordionBuilderHeader,
      id: String,
      index: Double,
      key: String,
      panel: AccordionBuilderPanel
    ): AccordionBuilderItem = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionBuilderItem]
    }
    
    extension [Self <: AccordionBuilderItem](x: Self) {
      
      inline def setHeader(value: AccordionBuilderHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPanel(value: AccordionBuilderPanel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    }
  }
  
  trait AccordionBuilderPanel extends StObject {
    
    var elementType: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ReactElement['type'] */ js.Any
    
    var props: Record[String, Any]
    
    var ref: Ref[Any]
  }
  object AccordionBuilderPanel {
    
    inline def apply(
      elementType: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ReactElement['type'] */ js.Any,
      props: Record[String, Any]
    ): AccordionBuilderPanel = {
      val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], ref = null)
      __obj.asInstanceOf[AccordionBuilderPanel]
    }
    
    extension [Self <: AccordionBuilderPanel](x: Self) {
      
      inline def setElementType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ReactElement['type'] */ js.Any
      ): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Record[String, Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
}
