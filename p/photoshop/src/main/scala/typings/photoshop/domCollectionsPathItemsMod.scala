package typings.photoshop

import typings.photoshop.anon.Get
import typings.photoshop.domObjectsSubPathInfoMod.SubPathInfo
import typings.photoshop.domPathItemMod.PathItem
import typings.std.Array
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domCollectionsPathItemsMod {
  
  @JSImport("photoshop/dom/collections/PathItems", "PathItems")
  @js.native
  open class PathItems protected ()
    extends StObject
       with Array[PathItem] {
    /**
      * @ignore
      */
    def this(docId: Double) = this()
    
    /**
      * @ignore
      */
    val _docId: Double = js.native
    
    /**
      * Creates a new path item object and adds it to this collection.
      *
      * A new [[SubPathItem]] object is created for each [[SubPathInfo]] object provided in `entirePath`,
      * and those [[SubPathItem]] objects are added to the [[PathItem.subPathItems]] collection of the returned
      * [[PathItem]].
      * @minVersion 23.3
      */
    def add(name: String, entirePath: js.Array[SubPathInfo]): PathItem = js.native
    
    /**
      * Retrieve the first PathItem matching the given name.
      * @param name Name to find
      * @minVersion 23.3
      */
    def getByName(name: String): PathItem = js.native
    
    /**
      * @ignore
      */
    def handler(): Get = js.native
    
    /**
      * Number of [[PathItem]] objects in this collection.
      * @minVersion 23.3
      */
    @JSName("length")
    def length_MPathItems: Double = js.native
    
    /**
      * The owner document of this PathItem collection.
      * @minVersion 23.3
      */
    def parent: Document = js.native
    
    /**
      * @ignore
      */
    /* private */ var proxy: Any = js.native
    
    /**
      * Removes all paths from this collection.
      * @minVersion 23.3
      */
    def removeAll(): Unit = js.native
  }
}
