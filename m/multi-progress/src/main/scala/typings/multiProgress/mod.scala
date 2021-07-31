package typings.multiProgress

import typings.node.streamMod.Stream
import typings.progress.mod.ProgressBarOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multi-progress", JSImport.Namespace)
  @js.native
  /**
    * Create a new @see MultiProgress with the given stream, or stderr by default
    * @param stream A stream to write the progress bars to
    */
  class ^ ()
    extends StObject
       with MultiProgress {
    def this(stream: Stream) = this()
  }
  
  @js.native
  trait MultiProgress extends StObject {
    
    /**
      * Render the given progress bar
      */
    def move(index: Double): Unit = js.native
    
    /**
      * Add a new bar
      */
    def newBar(format: String, options: ProgressBarOptions): typings.progress.mod.^ = js.native
    
    /**
      * Close all bars
      */
    def terminate(): Unit = js.native
    
    /**
      * Move the bar indicated by index forward the number of steps indicated by value
      */
    def tick(index: Double, value: Double): Unit = js.native
    def tick(index: Double, value: Double, options: js.Any): Unit = js.native
    
    /**
      * Update the bar indicated by index to the value given
      */
    def update(index: Double, value: Double): Unit = js.native
    def update(index: Double, value: Double, options: js.Any): Unit = js.native
  }
}
