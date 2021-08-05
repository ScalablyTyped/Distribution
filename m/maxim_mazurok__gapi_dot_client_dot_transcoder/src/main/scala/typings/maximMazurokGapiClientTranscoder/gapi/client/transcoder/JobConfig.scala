package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobConfig extends StObject {
  
  /** List of ad breaks. Specifies where to insert ad break tags in the output manifests. */
  var adBreaks: js.UndefOr[js.Array[AdBreak]] = js.undefined
  
  /** List of `Edit atom`s. Defines the ultimate timeline of the resulting file or manifest. */
  var editList: js.UndefOr[js.Array[EditAtom]] = js.undefined
  
  /** List of elementary streams. */
  var elementaryStreams: js.UndefOr[js.Array[ElementaryStream]] = js.undefined
  
  /** List of input assets stored in Cloud Storage. */
  var inputs: js.UndefOr[js.Array[Input]] = js.undefined
  
  /** List of output manifests. */
  var manifests: js.UndefOr[js.Array[Manifest]] = js.undefined
  
  /** List of multiplexing settings for output streams. */
  var muxStreams: js.UndefOr[js.Array[MuxStream]] = js.undefined
  
  /** Output configuration. */
  var output: js.UndefOr[Output] = js.undefined
  
  /** List of overlays on the output video, in descending Z-order. */
  var overlays: js.UndefOr[js.Array[Overlay]] = js.undefined
  
  /** Destination on Pub/Sub. */
  var pubsubDestination: js.UndefOr[PubsubDestination] = js.undefined
  
  /** List of output sprite sheets. */
  var spriteSheets: js.UndefOr[js.Array[SpriteSheet]] = js.undefined
}
object JobConfig {
  
  inline def apply(): JobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfig]
  }
  
  extension [Self <: JobConfig](x: Self) {
    
    inline def setAdBreaks(value: js.Array[AdBreak]): Self = StObject.set(x, "adBreaks", value.asInstanceOf[js.Any])
    
    inline def setAdBreaksUndefined: Self = StObject.set(x, "adBreaks", js.undefined)
    
    inline def setAdBreaksVarargs(value: AdBreak*): Self = StObject.set(x, "adBreaks", js.Array(value :_*))
    
    inline def setEditList(value: js.Array[EditAtom]): Self = StObject.set(x, "editList", value.asInstanceOf[js.Any])
    
    inline def setEditListUndefined: Self = StObject.set(x, "editList", js.undefined)
    
    inline def setEditListVarargs(value: EditAtom*): Self = StObject.set(x, "editList", js.Array(value :_*))
    
    inline def setElementaryStreams(value: js.Array[ElementaryStream]): Self = StObject.set(x, "elementaryStreams", value.asInstanceOf[js.Any])
    
    inline def setElementaryStreamsUndefined: Self = StObject.set(x, "elementaryStreams", js.undefined)
    
    inline def setElementaryStreamsVarargs(value: ElementaryStream*): Self = StObject.set(x, "elementaryStreams", js.Array(value :_*))
    
    inline def setInputs(value: js.Array[Input]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: Input*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    inline def setManifests(value: js.Array[Manifest]): Self = StObject.set(x, "manifests", value.asInstanceOf[js.Any])
    
    inline def setManifestsUndefined: Self = StObject.set(x, "manifests", js.undefined)
    
    inline def setManifestsVarargs(value: Manifest*): Self = StObject.set(x, "manifests", js.Array(value :_*))
    
    inline def setMuxStreams(value: js.Array[MuxStream]): Self = StObject.set(x, "muxStreams", value.asInstanceOf[js.Any])
    
    inline def setMuxStreamsUndefined: Self = StObject.set(x, "muxStreams", js.undefined)
    
    inline def setMuxStreamsVarargs(value: MuxStream*): Self = StObject.set(x, "muxStreams", js.Array(value :_*))
    
    inline def setOutput(value: Output): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setOverlays(value: js.Array[Overlay]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
    
    inline def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
    
    inline def setOverlaysVarargs(value: Overlay*): Self = StObject.set(x, "overlays", js.Array(value :_*))
    
    inline def setPubsubDestination(value: PubsubDestination): Self = StObject.set(x, "pubsubDestination", value.asInstanceOf[js.Any])
    
    inline def setPubsubDestinationUndefined: Self = StObject.set(x, "pubsubDestination", js.undefined)
    
    inline def setSpriteSheets(value: js.Array[SpriteSheet]): Self = StObject.set(x, "spriteSheets", value.asInstanceOf[js.Any])
    
    inline def setSpriteSheetsUndefined: Self = StObject.set(x, "spriteSheets", js.undefined)
    
    inline def setSpriteSheetsVarargs(value: SpriteSheet*): Self = StObject.set(x, "spriteSheets", js.Array(value :_*))
  }
}
