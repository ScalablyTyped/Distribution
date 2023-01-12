package typings.mp4frag

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mp4frag", JSImport.Namespace)
  @js.native
  /**
    * Construct a new Mp4Frag object.
    *
    * @throws If options.hlsPlaylistBase contains characters other than letters(a-zA-Z) and underscores(_).
    */
  open class ^ () extends Mp4Frag {
    def this(options: Mp4FragOptions) = this()
  }
  
  @js.native
  trait Mp4Frag extends Transform {
    
    /**
      * Returns a boolean indicating if all segments contain a keyframe.
      * Returns <b>false</b> if any segments do not contain a keyframe.
      */
    def allKeyframes: Boolean = js.native
    
    /**
      * Returns the audio codec information as a <b>string</b>.
      * Returns <b>null</b> if requested before [initialized event]{@link Mp4Frag#event:initialized}.
      */
    def audioCodec: String | Null = js.native
    
    /**
      * Returns the duration of latest [SegmentObject]{@link SegmentObject} as a <b>Float</b>(<i>seconds</i>).
      * Returns <b>-1</b> if requested before first [segment event]{@link Mp4Frag#event:segment}.
      */
    def duration: Double = js.native
    
    def getSegmentObject(sequence: String): SegmentObject | Null = js.native
    /**
      * - Returns the [SegmentObject]{@link SegmentObject} that corresponds to the sequence number.
      * - Returns <b>null</b> if there is no segment that corresponds to sequence number.
      */
    def getSegmentObject(sequence: Double): SegmentObject | Null = js.native
    
    /**
      * Returns the Mp4 initialization fragment as a <b>Buffer</b>.
      * Returns <b>null</b> if requested before [initialized event]{@link Mp4Frag#event:initialized}.
      */
    def initialization: Buffer | Null = js.native
    
    /**
      * Returns a boolean indicating if the current segment contains a keyframe.
      * Returns <b>false</b> if the current segment does not contain a keyframe.
      * Returns <b>true</b> if segment only contains audio.
      */
    def keyframe: Boolean = js.native
    
    /**
      * Returns the fmp4 HLS m3u8 playlist as a <b>string</b>.
      * Returns <b>null</b> if requested before [initialized event]{@link Mp4Frag#event:initialized}.
      */
    def m3u8: String | Null = js.native
    
    /**
      * Returns the mime type information as a <b>string</b>.
      * Returns <b>null</b> if requested before [initialized event]{@link Mp4Frag#event:initialized}.
      */
    def mime: String | Null = js.native
    
    /**
      * Clear cached values
      */
    def resetCache(): Unit = js.native
    
    /**
      * Returns the latest [SegmentObject]{@link SegmentObject} as a <b>Buffer</b>.
      * Returns <b>null</b> if requested before first [segment event]{@link Mp4Frag#event:segment}.
      */
    def segment: Buffer | Null = js.native
    
    /**
      * Returns the latest [SegmentObject]{@link SegmentObject}.
      * Returns <b>{segment: null, sequence: -1, duration: -1; timestamp: -1, keyframe: true}</b> if requested before
      * first [segment event]{@link Mp4Frag#event:segment}.
      */
    def segmentObject: SegmentObject = js.native
    
    /**
      * Returns an array of [SegmentObject]{@link SegmentObject}
      * Returns <b>null</b> if requested before first [segment event]{@link Mp4Frag#event:segment}.
      */
    def segmentObjects: js.Array[SegmentObject] | Null = js.native
    
    /**
      * Returns the sequence of the latest [SegmentObject]{@link SegmentObject} as an <b>Integer</b>.
      * Returns <b>-1</b> if requested before first [segment event]{@link Mp4Frag#event:segment}.
      */
    def sequence: Double = js.native
    
    /**
      * Returns the timestamp of the latest [SegmentObject]{@link SegmentObject} as an <b>Integer</b>(<i>milliseconds</i>).
      * Returns <b>-1</b> if requested before first [segment event]{@link Mp4Frag#event:segment}.
      */
    def timestamp: Double = js.native
    
    /**
      * Returns the total byte length of the Mp4 initialization and all [SegmentObjects]{@link SegmentObject} as an <b>Integer</b>(<i>bytes</i>).
      * Returns <b>-1</b> if requested before [initialized event]{@link Mp4Frag#event:initialized}.
      */
    def totalByteLength: Double | Null = js.native
    
    /**
      * Returns the total duration of all [SegmentObjects]{@link SegmentObject} as a <b>Float</b>(<i>seconds</i>).
      * Returns <b>-1</b> if requested before first [segment event]{@link Mp4Frag#event:segment}.
      */
    def totalDuration: Double = js.native
    
    /**
      * Returns the video codec information as a <b>string</b>.
      * Returns <b>null</b> if requested before [initialized event]{@link Mp4Frag#event:initialized}.
      */
    def videoCodec: String | Null = js.native
  }
  
  trait Mp4FragOptions extends StObject {
    
    /**
      * Base name of files in m3u8 playlist. Affects the generated m3u8 playlist by naming file fragments.
      *
      * Must be set to generate m3u8 playlist. e.g. 'front_door'
      */
    var hlsPlaylistBase: js.UndefOr[String] = js.undefined
    
    /**
      * Number of extra segments to keep in memory. Must be an integer ranging from 0 to 10.
      *
      * Defaults to 0.
      */
    var hlsPlaylistExtra: js.UndefOr[Double] = js.undefined
    
    /**
      * Indicates that m3u8 playlist should be generated after [initialization]{@link Mp4Frag#initialization}
      * is created and before media segments are created.
      *
      * Defaults to true.
      */
    var hlsPlaylistInit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Number of segments to use in m3u8 playlist. Must be an integer ranging from 2 to 20.
      *
      * Defaults to 4.
      */
    var hlsPlaylistSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of segments to keep in memory. Has no effect if using options.hlsPlaylistBase.
      * Must be an integer ranging from 2 to 30.
      *
      * Defaults to 2.
      */
    var segmentCount: js.UndefOr[Double] = js.undefined
  }
  object Mp4FragOptions {
    
    inline def apply(): Mp4FragOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mp4FragOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mp4FragOptions] (val x: Self) extends AnyVal {
      
      inline def setHlsPlaylistBase(value: String): Self = StObject.set(x, "hlsPlaylistBase", value.asInstanceOf[js.Any])
      
      inline def setHlsPlaylistBaseUndefined: Self = StObject.set(x, "hlsPlaylistBase", js.undefined)
      
      inline def setHlsPlaylistExtra(value: Double): Self = StObject.set(x, "hlsPlaylistExtra", value.asInstanceOf[js.Any])
      
      inline def setHlsPlaylistExtraUndefined: Self = StObject.set(x, "hlsPlaylistExtra", js.undefined)
      
      inline def setHlsPlaylistInit(value: Boolean): Self = StObject.set(x, "hlsPlaylistInit", value.asInstanceOf[js.Any])
      
      inline def setHlsPlaylistInitUndefined: Self = StObject.set(x, "hlsPlaylistInit", js.undefined)
      
      inline def setHlsPlaylistSize(value: Double): Self = StObject.set(x, "hlsPlaylistSize", value.asInstanceOf[js.Any])
      
      inline def setHlsPlaylistSizeUndefined: Self = StObject.set(x, "hlsPlaylistSize", js.undefined)
      
      inline def setSegmentCount(value: Double): Self = StObject.set(x, "segmentCount", value.asInstanceOf[js.Any])
      
      inline def setSegmentCountUndefined: Self = StObject.set(x, "segmentCount", js.undefined)
    }
  }
  
  /**
    * A SegmentObject.
    *
    * An object with values
    * <code>
    * {
    *     segment: null,
    *     sequence: -1,
    *     duration: -1;
    *     timestamp: -1,
    *     keyframe: true
    * }
    * </code
    * is returned in erroneous conditions (before a segment has been generated, etc. Refer to individual function docs.
    */
  trait SegmentObject extends StObject {
    
    var duration: Double
    
    var keyframe: Boolean
    
    var segment: js.UndefOr[Buffer] = js.undefined
    
    var sequence: Double
    
    var timestamp: Double
  }
  object SegmentObject {
    
    inline def apply(duration: Double, keyframe: Boolean, sequence: Double, timestamp: Double): SegmentObject = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], keyframe = keyframe.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegmentObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SegmentObject] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setKeyframe(value: Boolean): Self = StObject.set(x, "keyframe", value.asInstanceOf[js.Any])
      
      inline def setSegment(value: Buffer): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
      
      inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
