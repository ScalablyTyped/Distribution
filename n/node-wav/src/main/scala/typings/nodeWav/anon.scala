package typings.nodeWav

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BitDepth extends StObject {
    
    /**
      * The bit depth of the WAVE file to encode.
      * This is ignored in floating point mode; floating point WAVE files are always 32-bit.
      * Otherwise defaults to 16.
      */
    val bitDepth: js.UndefOr[Double] = js.undefined
    
    /**
      * When true, the WAVE file is encoded in floating point.
      * It is otherwise encoded in fixed point.
      * An alias of {@link floatingPoint}.
      */
    val float: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, the WAVE file is encoded in floating point.
      * It is otherwise encoded in fixed point.
      * An alias of {@link float}.
      */
    val floatingPoint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The sample rate of the given {@link channelData}.
      * Defaults to 16000 when not given.
      */
    val sampleRate: js.UndefOr[Double] = js.undefined
  }
  object BitDepth {
    
    inline def apply(): BitDepth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BitDepth]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BitDepth] (val x: Self) extends AnyVal {
      
      inline def setBitDepth(value: Double): Self = StObject.set(x, "bitDepth", value.asInstanceOf[js.Any])
      
      inline def setBitDepthUndefined: Self = StObject.set(x, "bitDepth", js.undefined)
      
      inline def setFloat(value: Boolean): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      inline def setFloatingPoint(value: Boolean): Self = StObject.set(x, "floatingPoint", value.asInstanceOf[js.Any])
      
      inline def setFloatingPointUndefined: Self = StObject.set(x, "floatingPoint", js.undefined)
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    }
  }
  
  trait ChannelData extends StObject {
    
    /**
      * The raw sample data.
      * When mono, this will be a single {@link Float32Array}.
      * When stereo, this will be two {@link Float32Array}s of equal length.
      */
    val channelData: js.Array[js.typedarray.Float32Array]
    
    /**
      * The sample rate of the decoded WAVE file, in Hertz.
      */
    val sampleRate: Double
  }
  object ChannelData {
    
    inline def apply(channelData: js.Array[js.typedarray.Float32Array], sampleRate: Double): ChannelData = {
      val __obj = js.Dynamic.literal(channelData = channelData.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChannelData] (val x: Self) extends AnyVal {
      
      inline def setChannelData(value: js.Array[js.typedarray.Float32Array]): Self = StObject.set(x, "channelData", value.asInstanceOf[js.Any])
      
      inline def setChannelDataVarargs(value: js.typedarray.Float32Array*): Self = StObject.set(x, "channelData", js.Array(value*))
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    }
  }
}
