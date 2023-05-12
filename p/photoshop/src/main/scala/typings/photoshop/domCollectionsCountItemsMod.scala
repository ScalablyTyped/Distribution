package typings.photoshop

import typings.photoshop.anon.Get
import typings.photoshop.anon.X
import typings.photoshop.domCountItemMod.CountItem
import typings.photoshop.domDocumentMod.Document
import typings.photoshop.domObjectsSolidColorMod.SolidColor
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domCollectionsCountItemsMod {
  
  @JSImport("photoshop/dom/collections/CountItems", "CountItems")
  @js.native
  open class CountItems protected ()
    extends StObject
       with Array[CountItem] {
    /**
      * @ignore
      */
    def this(docId: Double) = this()
    
    /**
      * @ignore
      */
    /* private */ val _docId: Any = js.native
    
    /**
      * Activates a Count Item group by its index.
      * @param index: The index of the group to be activated.
      * @minVersion 24.1
      */
    def activateGroupByIndex(index: Double): Unit = js.native
    
    /**
      * Adds a new [[CountItem]] to the collection.
      *
      * ```javascript
      * app.activeDocument.countItems.add({x: 20, y: 20});
      * ```
      *
      * @param position: Object with x and y properties.
      * @param position.x: The x coordinate of the new CountItem in pixels.
      * @param position.y: The y coordinate of the new CountItem in pixels.
      * @minVersion 24.1
      */
    def add(position: X): CountItem = js.native
    
    /**
      * Creates a new Count Item group.
      * @param groupName: The name of the group to be created.
      * @minVersion 24.1
      */
    def createGroup(groupName: String): Unit = js.native
    
    /**
      * Retrieves all [[CountItem]] objects from this collection.
      *
      * ```javascript
      * app.activeDocument.countItems.getAll();
      * ```
      * @minVersion 24.1
      */
    def getAll(): js.Array[CountItem] = js.native
    
    /**
      * @ignore
      */
    def handler(): Get = js.native
    
    /**
      * Number of [[CountItem]] elements in this collection.
      * @minVersion 24.1
      */
    @JSName("length")
    def length_MCountItems: Double = js.native
    
    /**
      * The owner [[Document]] of this CountItems collection.
      * @minVersion 24.1
      */
    def parent: Document = js.native
    
    /**
      * @ignore
      */
    /* private */ var proxy: Any = js.native
    
    /**
      * Clears all [[CountItem]] objects from this collection.
      *
      * ```javascript
      * app.activeDocument.countItems.removeAllFromActiveGroup();
      * ```
      * @minVersion 24.1
      */
    def removeAllFromActiveGroup(): Unit = js.native
    
    /**
      * Removes a Count Item group by its index.
      * @param index: The index of the group to be removed.
      * @minVersion 24.1
      */
    def removeGroupByIndex(index: Double): Unit = js.native
    
    /**
      * Renames the currently active Count Item group.
      * @param groupName: The new name of the group.
      * @minVersion 24.1
      */
    def renameActiveGroup(groupName: String): Unit = js.native
    
    /**
      * Sets the Color of the Count Item marker and label.
      * @param color: The color as a [[SolidColor]] object.
      * @minVersion 24.1
      */
    def setActiveColor(color: SolidColor): Unit = js.native
    
    /**
      * Sets the Count Item label (the number) size.
      * @param size: The marker size @range 8..72 @default 8
      * @minVersion 24.1
      */
    def setActiveLabelSize(size: Double): Unit = js.native
    
    /**
      * Sets the Count Item marker (the dot) size.
      * @param size: The marker size @range 1..10 @default 2
      * @minVersion 24.1
      */
    def setActiveMarkerSize(size: Double): Unit = js.native
    
    /**
      * Toggles the visibility of the currently selected Count Item group.
      * @param isVisible: Whether the group should be visible or not.
      * @minVersion 24.1
      */
    def toggleActiveGroupVisibility(isVisible: Boolean): Unit = js.native
    
    /**
      * The CountItems collection's typename.
      * @minVersion 24.1
      */
    def typename: typings.photoshop.photoshopStrings.CountItems = js.native
  }
}
