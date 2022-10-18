package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.Content
import typings.orbitUiReactComponents.anon.Props
import typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType.divider
import typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType.item
import typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType.section
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCollectionSrcUseCollectionMod {
  
  @JSImport("@orbit-ui/react-components/dist/collection/src/useCollection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/collection/src/useCollection", "CollectionBuilder")
  @js.native
  open class CollectionBuilder () extends StObject {
    
    def build(children: ReactNode): js.Array[CollectionNode] = js.native
    
    /* private */ var parseDivider: Any = js.native
    
    /* private */ var parseItem: Any = js.native
    
    /* private */ var parseSection: Any = js.native
    
    /* private */ var parseTooltip: Any = js.native
  }
  
  @js.native
  sealed trait NodeType extends StObject
  @JSImport("@orbit-ui/react-components/dist/collection/src/useCollection", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NodeType & String] = js.native
    
    @js.native
    sealed trait divider
      extends StObject
         with NodeType
    /* "divider" */ val divider: typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType.divider & String = js.native
    
    @js.native
    sealed trait item
      extends StObject
         with NodeType
    /* "item" */ val item: typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType.item & String = js.native
    
    @js.native
    sealed trait section
      extends StObject
         with NodeType
    /* "section" */ val section: typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType.section & String = js.native
  }
  
  inline def createCollectionItem(hasKeyIndexElementTypeRefContentProps: CollectionItem): Content = ^.asInstanceOf[js.Dynamic].applyDynamic("createCollectionItem")(hasKeyIndexElementTypeRefContentProps.asInstanceOf[js.Any]).asInstanceOf[Content]
  
  inline def isDivider(node: CollectionNode): /* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionDivider */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDivider")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionDivider */ Boolean]
  
  inline def isItem(node: CollectionNode): /* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isItem")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionItem */ Boolean]
  
  inline def isSection(node: CollectionNode): /* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionSection */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSection")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionSection */ Boolean]
  
  inline def useCollection(children: ReactNode): js.Array[CollectionNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCollection")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[CollectionNode]]
  
  trait CollectionDivider
    extends StObject
       with CollectionNode {
    
    var content: ElementType[Any] | js.Array[ReactElement]
    
    @JSName("type")
    var type_CollectionDivider: divider
  }
  object CollectionDivider {
    
    inline def apply(
      content: ElementType[Any] | js.Array[ReactElement],
      index: Double,
      key: String,
      props: Record[String, Any],
      `type`: divider
    ): CollectionDivider = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], ref = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionDivider]
    }
    
    extension [Self <: CollectionDivider](x: Self) {
      
      inline def setContent(value: ElementType[Any] | js.Array[ReactElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVarargs(value: ReactElement*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setType(value: divider): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CollectionItem
    extends StObject
       with CollectionNode {
    
    var content: ElementType[Any] | js.Array[ReactElement]
    
    var tooltip: js.UndefOr[Props] = js.undefined
    
    @JSName("type")
    var type_CollectionItem: item
  }
  object CollectionItem {
    
    inline def apply(
      content: ElementType[Any] | js.Array[ReactElement],
      index: Double,
      key: String,
      props: Record[String, Any],
      `type`: item
    ): CollectionItem = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], ref = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionItem]
    }
    
    extension [Self <: CollectionItem](x: Self) {
      
      inline def setContent(value: ElementType[Any] | js.Array[ReactElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVarargs(value: ReactElement*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setTooltip(value: Props): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setType(value: item): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CollectionNode extends StObject {
    
    var elementType: js.UndefOr[ElementType[Any] | String] = js.undefined
    
    var index: Double
    
    var key: String
    
    var props: Record[String, Any]
    
    var ref: Ref[Any]
    
    var `type`: NodeType
  }
  object CollectionNode {
    
    inline def apply(index: Double, key: String, props: Record[String, Any], `type`: NodeType): CollectionNode = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], ref = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionNode]
    }
    
    extension [Self <: CollectionNode](x: Self) {
      
      inline def setElementType(value: ElementType[Any] | String): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      inline def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Record[String, Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CollectionSection
    extends StObject
       with CollectionNode {
    
    var items: js.UndefOr[js.Array[CollectionItem]] = js.undefined
    
    @JSName("type")
    var type_CollectionSection: section
  }
  object CollectionSection {
    
    inline def apply(index: Double, key: String, props: Record[String, Any], `type`: section): CollectionSection = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], ref = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionSection]
    }
    
    extension [Self <: CollectionSection](x: Self) {
      
      inline def setItems(value: js.Array[CollectionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: CollectionItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setType(value: section): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
