package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.Content
import typings.orbitUiReactComponents.anon.IsLoading
import typings.orbitUiReactComponents.anon.Style
import typings.orbitUiReactComponents.anon.StyleHeight
import typings.orbitUiReactComponents.distCollectionSrcItemMod.InnerItemProps
import typings.orbitUiReactComponents.distCollectionSrcSectionMod.InnerSectionProps
import typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.CollectionItem
import typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.CollectionNode
import typings.orbitUiReactComponents.distCollectionSrcUseCollectionSearchMod.UseCollectionSearchOptions
import typings.orbitUiReactComponents.distCollectionSrcUseScrollableCollectionMod.UseScrollableCollectionOptions
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.AbortSignal
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCollectionSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/collection/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/collection/src", "CollectionBuilder")
  @js.native
  open class CollectionBuilder ()
    extends typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.CollectionBuilder
  
  inline def InnerItem(props: InnerItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerItem")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerSection(props: InnerSectionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerSection")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/collection/src", "Item")
  @js.native
  val Item: OrbitComponent[HTMLElement, InnerItemProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/collection/src", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType & String
      ] = js.native
    
    /* "divider" */ val divider: typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType.divider & String = js.native
    
    /* "item" */ val item: typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType.item & String = js.native
    
    /* "section" */ val section: typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType.section & String = js.native
  }
  
  @JSImport("@orbit-ui/react-components/dist/collection/src", "Section")
  @js.native
  val Section: OrbitComponent[HTMLElement, InnerSectionProps] = js.native
  
  inline def createCollectionItem(param0: CollectionItem): Content = ^.asInstanceOf[js.Dynamic].applyDynamic("createCollectionItem")(param0.asInstanceOf[js.Any]).asInstanceOf[Content]
  
  inline def getItemText(item: CollectionNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemText")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isDivider(node: CollectionNode): /* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionDivider */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDivider")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionDivider */ Boolean]
  
  inline def isItem(node: CollectionNode): /* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isItem")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionItem */ Boolean]
  
  inline def isSection(node: CollectionNode): /* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionSection */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSection")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @orbit-ui/react-components.@orbit-ui/react-components/dist/collection/src/useCollection.CollectionSection */ Boolean]
  
  inline def reduceCollection(nodes: js.Array[CollectionNode], acceptItem: js.Function1[/* item */ CollectionItem, Boolean]): js.Array[CollectionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceCollection")(nodes.asInstanceOf[js.Any], acceptItem.asInstanceOf[js.Any])).asInstanceOf[js.Array[CollectionItem]]
  
  inline def useAsyncSearch[T](load: js.Function2[/* query */ String, /* signal */ AbortSignal, js.Promise[js.Array[T]]]): IsLoading[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncSearch")(load.asInstanceOf[js.Any]).asInstanceOf[IsLoading[T]]
  
  inline def useCollection(children: ReactNode): js.Array[CollectionNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCollection")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[CollectionNode]]
  
  inline def useCollectionSearch(children: ReactNode, param1: UseCollectionSearchOptions): js.Tuple2[
    js.Array[CollectionNode], 
    js.Function2[/* event */ SyntheticEvent[typings.std.Element, Event], /* query */ String, Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCollectionSearch")(children.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.Array[CollectionNode], 
    js.Function2[/* event */ SyntheticEvent[typings.std.Element, Event], /* query */ String, Unit]
  ]]
  
  inline def useOnlyCollectionItems(nodes: js.Array[CollectionNode]): js.Array[CollectionItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnlyCollectionItems")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[CollectionItem]]
  
  inline def useScrollableCollection(containerRef: RefObject[typings.std.Element]): Style | StyleHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollableCollection")(containerRef.asInstanceOf[js.Any]).asInstanceOf[Style | StyleHeight]
  inline def useScrollableCollection(containerRef: RefObject[typings.std.Element], param1: UseScrollableCollectionOptions): Style | StyleHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("useScrollableCollection")(containerRef.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Style | StyleHeight]
}
