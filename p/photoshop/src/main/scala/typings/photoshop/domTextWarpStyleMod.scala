package typings.photoshop

import typings.photoshop.domConstantsMod.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domTextWarpStyleMod {
  
  @JSImport("photoshop/dom/text/WarpStyle", "WarpStyle")
  @js.native
  open class WarpStyle () extends StObject {
    
    /**
      * The warp bend as a percentage.
      * @range -100..100
      * @minVersion 24.1
      */
    def bend: Double = js.native
    def bend_=(bend: Double): Unit = js.native
    
    /**
      * The warp direction
      * @default HORIZONTAL
      * @minVersion 24.1
      */
    def direction: Direction = js.native
    def direction_=(direction: Direction): Unit = js.native
    
    /**
      * The horizontal distortion of the warp as a percentage.
      * @range -100..100
      * @minVersion 24.1
      */
    def horizontalDistortion: Double = js.native
    def horizontalDistortion_=(horizontalDistortion: Double): Unit = js.native
    
    /**
      * Reset the WarpStyle to its default values.
      * @async
      * @minVersion 24.1
      */
    def reset(): js.Promise[Unit] = js.native
    
    /**
      * he style of warp to apply to the text.
      * @default NONE
      * @minVersion 24.1
      */
    def style: typings.photoshop.domConstantsMod.WarpStyle = js.native
    def style_=(style: typings.photoshop.domConstantsMod.WarpStyle): Unit = js.native
    
    /**
      * The vertical distortion of the warp as a percentage.
      * @range -100..100
      * @minVersion 24.1
      */
    def verticalDistortion: Double = js.native
    def verticalDistortion_=(verticalDistortion: Double): Unit = js.native
  }
}
