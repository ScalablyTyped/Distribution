package typings.orbitUiReactComponents

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTabsSrcUseTabsItemsMod {
  
  @JSImport("@orbit-ui/react-components/dist/tabs/src/useTabsItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tabs/src/useTabsItems", "TabsBuilder")
  @js.native
  open class TabsBuilder protected () extends StObject {
    def this(rootId: String) = this()
    
    def build(children: ReactNode): js.Tuple2[js.Array[TabType], js.Array[PanelType]] = js.native
    
    /* private */ var makeId: Any = js.native
    
    /* private */ var rootId: Any = js.native
  }
  
  inline def useTabsItems(children: ReactNode, rootId: String): js.Tuple2[js.Array[TabType], js.Array[PanelType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTabsItems")(children.asInstanceOf[js.Any], rootId.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[TabType], js.Array[PanelType]]]
  
  trait PanelType extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var elementType: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.ReactElement['type'] */ js.Any
      ] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var key: String
    
    var panelId: String
    
    var props: js.UndefOr[Record[String, Any]] = js.undefined
    
    var ref: js.UndefOr[Ref[Any]] = js.undefined
    
    var tabId: String
  }
  object PanelType {
    
    inline def apply(key: String, panelId: String, tabId: String): PanelType = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], panelId = panelId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanelType]
    }
    
    extension [Self <: PanelType](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setElementType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ReactElement['type'] */ js.Any
      ): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      inline def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPanelId(value: String): Self = StObject.set(x, "panelId", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Record[String, Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setTabId(value: String): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabType extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var elementType: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.ReactElement['type'] */ js.Any
      ] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var key: String
    
    var panelId: String
    
    var props: js.UndefOr[Record[String, Any]] = js.undefined
    
    var ref: js.UndefOr[Ref[Any]] = js.undefined
    
    var tabId: String
  }
  object TabType {
    
    inline def apply(key: String, panelId: String, tabId: String): TabType = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], panelId = panelId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabType]
    }
    
    extension [Self <: TabType](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setElementType(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ReactElement['type'] */ js.Any
      ): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      inline def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPanelId(value: String): Self = StObject.set(x, "panelId", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Record[String, Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setTabId(value: String): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
}
