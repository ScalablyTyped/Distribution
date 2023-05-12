package typings.oojsUi.OO.ui.mixin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojs.OO.EmitterListEventMap
import typings.oojs.OO.EventEmitter
import typings.oojsUi.OO.ui.Element
import typings.oojsUi.OO.ui.mixin.GroupElement.Props
import typings.oojsUi.OO.ui.mixin.GroupElement.Prototype
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Any OOUI widget that contains other widgets (such as {@link OO.ui.ButtonWidget buttons} or
  * {@link OO.ui.OptionWidget options}) mixes in GroupElement. Adding, removing, and clearing
  * items from the group is done through the interface the class provides.
  * For more information, please see the
  * [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Elements/Groups).
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.mixin.GroupElement
  */
@js.native
trait GroupElement
  extends StObject
     with Props
     with Prototype
object GroupElement {
  
  trait ConfigOptions extends StObject {
    
    /**
      * The container element created by the class. If this configuration is omitted, the group
      * element will use a generated `<div>`.
      */
    @JSName("$group")
    var $group: js.UndefOr[JQuery[HTMLElement]] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$group(value: JQuery[HTMLElement]): Self = StObject.set(x, "$group", value.asInstanceOf[js.Any])
      
      inline def set$groupUndefined: Self = StObject.set(x, "$group", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[GroupElement]
       with Instantiable1[/* config */ ConfigOptions, GroupElement]
  
  trait EventMap
    extends StObject
       with EmitterListEventMap {
    
    var change: js.Array[/* items */ js.Array[Element]]
  }
  object EventMap {
    
    inline def apply(
      add: js.Tuple2[/* item */ EventEmitter, /* index */ Double],
      change: js.Array[/* items */ js.Array[Element]],
      clear: js.Array[Any],
      move: js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double],
      remove: js.Tuple2[/* item */ EventEmitter, /* index */ Double]
    ): EventMap = {
      val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setChange(value: js.Array[/* items */ js.Array[Element]]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setChangeVarargs(value: (/* items */ js.Array[Element])*): Self = StObject.set(x, "change", js.Array(value*))
    }
  }
  
  trait Props extends StObject {
    
    @JSName("$group")
    var $group: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply($group: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($group = $group.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$group(value: JQuery[HTMLElement]): Self = StObject.set(x, "$group", value.asInstanceOf[js.Any])
    }
  }
  
  // HACK: Omit props to address LSP violation issue
  /* Inlined parent std.Omit<oojs.OO.EmitterList, 'addItems' | 'removeItems' | 'clearItems'> */
  @js.native
  trait Prototype extends StObject {
    
    /**
      * Add items to the group.
      *
      * Items will be added to the end of the group array unless the optional `index` parameter
      * specifies a different insertion point. Adding an existing item will move it to the
      * end of the array or the point specified by the `index`.
      *
      * @param items Elements to add to the group
      * @param index Index of the insertion point
      * @return The element, for chaining
      */
    def addItems(items: js.Array[Element]): this.type = js.native
    def addItems(items: js.Array[Element], index: Double): this.type = js.native
    
    def aggregate(events: Record[String, String | Null]): Unit = js.native
    @JSName("aggregate")
    var aggregate_Original: js.Function1[/* events */ Record[String, String | Null], Unit] = js.native
    
    /**
      * Clear all items from the group.
      *
      * Cleared items are detached from the DOM, not removed, so that they may be reused.
      * To remove only a subset of items from a group, use the {@link removeItems} method.
      *
      * @return The element, for chaining
      */
    def clearItems(): this.type = js.native
    
    /**
      * Find an item by its data.
      *
      * Only the first item with matching data will be returned. To return all matching items,
      * use the {@link findItemsFromData} method.
      *
      * @param data Item data to search for
      * @return Item with equivalent data, `null` if none exists
      */
    def findItemFromData(data: Any): Element | Null = js.native
    
    /**
      * Find items by their data.
      *
      * All items with matching data will be returned. To return only the first match, use the
      * {@link findItemFromData} method instead.
      *
      * @param data Item data to search for
      * @return  Items with equivalent data
      */
    def findItemsFromData(data: Any): js.Array[Element] = js.native
    
    def getItemCount(): Double = js.native
    @JSName("getItemCount")
    var getItemCount_Original: js.Function0[Double] = js.native
    
    def getItemIndex(item: EventEmitter): Double = js.native
    @JSName("getItemIndex")
    var getItemIndex_Original: js.Function1[/* item */ EventEmitter, Double] = js.native
    
    def getItems(): js.Array[EventEmitter] = js.native
    @JSName("getItems")
    var getItems_Original: js.Function0[js.Array[EventEmitter]] = js.native
    
    def isEmpty(): Boolean = js.native
    @JSName("isEmpty")
    var isEmpty_Original: js.Function0[Boolean] = js.native
    
    /**
      * Remove the specified items from a group.
      *
      * Removed items are detached (not removed) from the DOM so that they may be reused.
      * To remove all items from a group, you may wish to use the {@link clearItems} method
      * instead.
      *
      * @param items An array of items to remove
      * @return  The element, for chaining
      */
    def removeItems(items: js.Array[Element]): this.type = js.native
    
    /**
      * Set the group element.
      *
      * If an element is already set, items will be moved to the new element.
      *
      * @param $group Element to use as group
      */
    def setGroupElement($group: JQuery[HTMLElement]): Unit = js.native
  }
}
