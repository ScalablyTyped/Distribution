package typings.photoshop

import typings.photoshop.anon.Get
import typings.photoshop.domChannelMod.Channel
import typings.std.Array
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domCollectionsChannelsMod {
  
  @JSImport("photoshop/dom/collections/Channels", "Channels")
  @js.native
  open class Channels protected ()
    extends StObject
       with Array[Channel] {
    /** @ignore */
    def this(docId: Double) = this()
    
    /** @ignore */
    val _docId: Double = js.native
    
    /**
      * Create a new alpha channel in this document.
      * @minVersion 23.0
      */
    def add(): Channel = js.native
    
    /**
      * Find the first channel with the matching name.
      * @minVersion 23.0
      */
    def getByName(name: String): Channel = js.native
    
    /** @ignore */
    def handler(): Get = js.native
    
    /**
      * Number of Channel elements in this collection.
      * @minVersion 23.0
      */
    @JSName("length")
    def length_MChannels: Double = js.native
    
    /**
      * The owner document of this Channel collection.
      * @minVersion 23.0
      */
    def parent: Document = js.native
    
    /** @ignore */
    /* private */ var proxy: Any = js.native
    
    /**
      * Remove all Alpha channels in the parent document.
      * @minVersion 23.0
      */
    def removeAll(): Unit = js.native
    
    /**
      * The name for this object collection: Channels.
      * @minVersion 23.0
      */
    def typename: typings.photoshop.photoshopStrings.Channels = js.native
  }
}
