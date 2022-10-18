package typings.photoshop

import typings.photoshop.domConstantsMod.ChannelType
import typings.photoshop.domDocumentMod.Document
import typings.photoshop.domObjectsSolidColorMod.SolidColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domChannelMod {
  
  /* note: abstract class */ @JSImport("photoshop/dom/Channel", "Channel")
  @js.native
  open class Channel () extends StObject {
    
    /**
      * The color of the channel.
      */
    def color: SolidColor = js.native
    def color_=(color: SolidColor): Unit = js.native
    
    /**
      * Duplicates the channel to the parent document, or a target document
      * if specified.
      *
      * ```javascript
      * // duplicate the channel
      * await channel.duplicate()
      *
      * // duplicate to a different, compatible document
      * const newDoc = psApp.documents[1]
      * await channel.duplicate(newDoc)
      * ```
      * @param targetDocument if specified, duplicate to a different document target.
      *
      * @async
      */
    def duplicate(): js.Promise[Unit] = js.native
    def duplicate(targetDocument: Document): js.Promise[Unit] = js.native
    
    /**
      * A histogram containing the number of pixels at each color
      * intensity level for this channel. The array contains 256
      * members. The target channel must be visible.
      */
    def histogram: js.Array[Double] = js.native
    
    /**
      * The type or kind of the channel.
      */
    def kind: ChannelType = js.native
    def kind_=(kind: ChannelType): Unit = js.native
    
    /**
      * Merges a Spot Color channel into the component channels.
      */
    def merge(): js.Promise[Unit] = js.native
    
    /**
      * The color of the channel.
      */
    def name: String = js.native
    def name_=(name: String): Unit = js.native
    
    /**
      * The opacity or solidity of the channel.
      */
    def opacity: Double = js.native
    def opacity_=(opacity: Double): Unit = js.native
    
    /**
      * The containing document.
      */
    def parent: Document = js.native
    
    /**
      * Deletes the channel.
      */
    def remove(): js.Promise[Unit] = js.native
    
    /**
      * The visibility of the channel
      */
    def visible: Boolean = js.native
    def visible_=(visible: Boolean): Unit = js.native
  }
}
