package typings.photoshop

import typings.photoshop.anon.Get
import typings.photoshop.domPathPointMod.PathPoint
import typings.photoshop.domSubPathItemMod.SubPathItem
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domCollectionsPathPointsMod {
  
  @JSImport("photoshop/dom/collections/PathPoints", "PathPoints")
  @js.native
  open class PathPoints protected ()
    extends StObject
       with Array[PathPoint] {
    /**
      * @ignore
      */
    def this(index: Double, pathId: Double, docId: Double) = this()
    
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
    val _subPathIndex: Double = js.native
    
    /**
      * @ignore
      */
    def handler(): Get = js.native
    
    /**
      * Number of elements in this collection.
      * @minVersion 23.3
      */
    @JSName("length")
    def length_MPathPoints: Double = js.native
    
    /**
      * The SubPathItem that contains this PathPoints collection.
      * @minVersion 23.3
      */
    def parent: SubPathItem = js.native
    
    /**
      * @ignore
      */
    /* private */ var proxy: Any = js.native
  }
}
