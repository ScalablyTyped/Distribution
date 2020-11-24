package typings.playable.withHlsMod

import typings.playable.mediaStreamMod.MediaStreamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/with-hls", "MEDIA_STREAM_TYPES")
@js.native
object MEDIA_STREAM_TYPES extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MediaStreamType with String] = js.native
  
  /* "DASH" */ val DASH: typings.playable.mediaStreamMod.MediaStreamType.DASH with String = js.native
  
  /* "HLS" */ val HLS: typings.playable.mediaStreamMod.MediaStreamType.HLS with String = js.native
  
  /* "MKV" */ val MKV: typings.playable.mediaStreamMod.MediaStreamType.MKV with String = js.native
  
  /* "MOV" */ val MOV: typings.playable.mediaStreamMod.MediaStreamType.MOV with String = js.native
  
  /* "MP4" */ val MP4: typings.playable.mediaStreamMod.MediaStreamType.MP4 with String = js.native
  
  /* "OGG" */ val OGG: typings.playable.mediaStreamMod.MediaStreamType.OGG with String = js.native
  
  /* "WEBM" */ val WEBM: typings.playable.mediaStreamMod.MediaStreamType.WEBM with String = js.native
}
