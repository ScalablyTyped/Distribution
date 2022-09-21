package typings.musickitJs.MusicKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An array of media items to be played.
  */
trait Queue extends StObject {
  
  /**
    * Add an event listener for a MusicKit queue by name.
    *
    * @param name The name of the event.
    * @param callback The callback function to remove.
    */
  def addEventListener(name: String, callback: js.Function0[Any]): Unit
  
  /**
    * Inserts the media items defined by the queue descriptor after the last
    * media item in the current queue.
    */
  def append(descriptor: Descriptor): Unit
  
  /**
    * Returns the index in the playback queue for a media item descriptor.
    *
    * @param descriptor A descriptor can be an instance of the MusicKit.MediaItem
    * class, or a string identifier.
    */
  def indexForItem(descriptor: Descriptor): Double
  
  /**
    * A Boolean value indicating whether the queue has no items.
    */
  val isEmpty: Boolean
  
  /**
    * Returns the media item located in the indicated array index.
    */
  def item(index: Double): js.UndefOr[MediaItem | Null]
  
  /**
    * An array of all the media items in the queue.
    */
  val items: js.Array[MediaItem]
  
  /**
    * The number of items in the queue.
    */
  val length: Double
  
  /**
    * The next playable media item in the queue.
    */
  val nextPlayableItem: js.UndefOr[MediaItem] = js.undefined
  
  /**
    * The current queue position.
    */
  val position: Double
  
  /**
    * Inserts the media items defined by the queue descriptor into the current
    * queue immediately after the currently playing media item.
    */
  def prepend(descriptor: Any): Unit
  
  /**
    * The previous playable media item in the queue.
    */
  val previousPlayableItem: js.UndefOr[MediaItem] = js.undefined
  
  /**
    * Removes an event listener for a MusicKit queue by name.
    *
    * @param name The name of the event.
    * @param callback The callback function to remove.
    */
  def removeEventListener(name: String, callback: js.Function0[Any]): Unit
}
object Queue {
  
  inline def apply(
    addEventListener: (String, js.Function0[Any]) => Unit,
    append: Descriptor => Unit,
    indexForItem: Descriptor => Double,
    isEmpty: Boolean,
    item: Double => js.UndefOr[MediaItem | Null],
    items: js.Array[MediaItem],
    length: Double,
    position: Double,
    prepend: Any => Unit,
    removeEventListener: (String, js.Function0[Any]) => Unit
  ): Queue = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), append = js.Any.fromFunction1(append), indexForItem = js.Any.fromFunction1(indexForItem), isEmpty = isEmpty.asInstanceOf[js.Any], item = js.Any.fromFunction1(item), items = items.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], prepend = js.Any.fromFunction1(prepend), removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[Queue]
  }
  
  extension [Self <: Queue](x: Self) {
    
    inline def setAddEventListener(value: (String, js.Function0[Any]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setAppend(value: Descriptor => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    inline def setIndexForItem(value: Descriptor => Double): Self = StObject.set(x, "indexForItem", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => js.UndefOr[MediaItem | Null]): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    inline def setItems(value: js.Array[MediaItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: MediaItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setNextPlayableItem(value: MediaItem): Self = StObject.set(x, "nextPlayableItem", value.asInstanceOf[js.Any])
    
    inline def setNextPlayableItemUndefined: Self = StObject.set(x, "nextPlayableItem", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPrepend(value: Any => Unit): Self = StObject.set(x, "prepend", js.Any.fromFunction1(value))
    
    inline def setPreviousPlayableItem(value: MediaItem): Self = StObject.set(x, "previousPlayableItem", value.asInstanceOf[js.Any])
    
    inline def setPreviousPlayableItemUndefined: Self = StObject.set(x, "previousPlayableItem", js.undefined)
    
    inline def setRemoveEventListener(value: (String, js.Function0[Any]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
  }
}
