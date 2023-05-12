package typings.photoshop

import typings.photoshop.anon.Get
import typings.photoshop.domPathItemMod.PathItem
import typings.photoshop.domSubPathItemMod.SubPathItem
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domCollectionsSubPathItemsMod {
  
  @JSImport("photoshop/dom/collections/SubPathItems", "SubPathItems")
  @js.native
  open class SubPathItems protected ()
    extends StObject
       with Array[SubPathItem] {
    /**
      * @ignore
      */
    def this(pathId: Double, docId: Double) = this()
    
    /**
      * @ignore
      */
    val _docId: Double = js.native
    
    /**
      * @ignore
      */
    val _pathId: Double = js.native
    
    /**
      * @ignore
      */
    def handler(): Get = js.native
    
    /**
      * Number of elements in this collection.
      * @minVersion 23.3
      */
    @JSName("length")
    def length_MSubPathItems: Double = js.native
    
    /**
      * The PathItem that contains this SubPathItem.
      * @minVersion 23.3
      */
    def parent: PathItem = js.native
    
    /**
      * @ignore
      */
    /* private */ var proxy: Any = js.native
  }
}
