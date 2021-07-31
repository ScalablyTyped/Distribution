package typings.nodeTimecodes

import typings.nodeTimecodes.anon.Framerate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-timecodes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("node-timecodes", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-timecodes", "default.constants")
    @js.native
    def constants: Framerate = js.native
    @scala.inline
    def constants_=(x: Framerate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("constants")(x.asInstanceOf[js.Any])
    
    @JSImport("node-timecodes", "default.fromSeconds")
    @js.native
    def fromSeconds: js.Function2[/* seconds */ Double, /* option */ js.UndefOr[TimecodeOptions], String] = js.native
    @scala.inline
    def fromSeconds(seconds: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeconds")(seconds.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def fromSeconds(seconds: Double, option: TimecodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSeconds")(seconds.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def fromSeconds_=(x: js.Function2[/* seconds */ Double, /* option */ js.UndefOr[TimecodeOptions], String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromSeconds")(x.asInstanceOf[js.Any])
    
    @JSImport("node-timecodes", "default.toSeconds")
    @js.native
    def toSeconds: js.Function2[/* timecode */ String, /* frameRate */ js.UndefOr[Double], Double] = js.native
    @scala.inline
    def toSeconds(timecode: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toSeconds")(timecode.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def toSeconds(timecode: String, frameRate: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toSeconds")(timecode.asInstanceOf[js.Any], frameRate.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def toSeconds_=(x: js.Function2[/* timecode */ String, /* frameRate */ js.UndefOr[Double], Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toSeconds")(x.asInstanceOf[js.Any])
  }
  
  object constants {
    
    @JSImport("node-timecodes", "constants")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-timecodes", "constants.framerate")
    @js.native
    def framerate: Double = js.native
    @scala.inline
    def framerate_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("framerate")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def fromSeconds(seconds: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeconds")(seconds.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def fromSeconds(seconds: Double, option: TimecodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSeconds")(seconds.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def toSeconds(timecode: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toSeconds")(timecode.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def toSeconds(timecode: String, frameRate: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toSeconds")(timecode.asInstanceOf[js.Any], frameRate.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait TimecodeOptions extends StObject {
    
    var frameRate: js.UndefOr[Double] = js.undefined
    
    var ms: js.UndefOr[Boolean] = js.undefined
  }
  object TimecodeOptions {
    
    @scala.inline
    def apply(): TimecodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimecodeOptions]
    }
    
    @scala.inline
    implicit class TimecodeOptionsMutableBuilder[Self <: TimecodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
      
      @scala.inline
      def setMs(value: Boolean): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
    }
  }
}
