package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobConfig extends js.Object {
  
  /** List of ad breaks. Specifies where to insert ad break tags in the output manifests. */
  var adBreaks: js.UndefOr[js.Array[AdBreak]] = js.native
  
  /** List of `Edit atom`s. Defines the ultimate timeline of the resulting file or manifest. */
  var editList: js.UndefOr[js.Array[EditAtom]] = js.native
  
  /** List of elementary streams. */
  var elementaryStreams: js.UndefOr[js.Array[ElementaryStream]] = js.native
  
  /** List of input assets stored in Cloud Storage. */
  var inputs: js.UndefOr[js.Array[Input]] = js.native
  
  /** List of output manifests. */
  var manifests: js.UndefOr[js.Array[Manifest]] = js.native
  
  /** List of multiplexing settings for output streams. */
  var muxStreams: js.UndefOr[js.Array[MuxStream]] = js.native
  
  /** Output configuration. */
  var output: js.UndefOr[Output] = js.native
  
  /** List of overlays on the output video, in descending Z-order. */
  var overlays: js.UndefOr[js.Array[Overlay]] = js.native
  
  /** Destination on Pub/Sub. */
  var pubsubDestination: js.UndefOr[PubsubDestination] = js.native
  
  /** List of output sprite sheets. */
  var spriteSheets: js.UndefOr[js.Array[SpriteSheet]] = js.native
}
object JobConfig {
  
  @scala.inline
  def apply(): JobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfig]
  }
  
  @scala.inline
  implicit class JobConfigOps[Self <: JobConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdBreaksVarargs(value: AdBreak*): Self = this.set("adBreaks", js.Array(value :_*))
    
    @scala.inline
    def setAdBreaks(value: js.Array[AdBreak]): Self = this.set("adBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdBreaks: Self = this.set("adBreaks", js.undefined)
    
    @scala.inline
    def setEditListVarargs(value: EditAtom*): Self = this.set("editList", js.Array(value :_*))
    
    @scala.inline
    def setEditList(value: js.Array[EditAtom]): Self = this.set("editList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditList: Self = this.set("editList", js.undefined)
    
    @scala.inline
    def setElementaryStreamsVarargs(value: ElementaryStream*): Self = this.set("elementaryStreams", js.Array(value :_*))
    
    @scala.inline
    def setElementaryStreams(value: js.Array[ElementaryStream]): Self = this.set("elementaryStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementaryStreams: Self = this.set("elementaryStreams", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: Input*): Self = this.set("inputs", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: js.Array[Input]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    
    @scala.inline
    def setManifestsVarargs(value: Manifest*): Self = this.set("manifests", js.Array(value :_*))
    
    @scala.inline
    def setManifests(value: js.Array[Manifest]): Self = this.set("manifests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifests: Self = this.set("manifests", js.undefined)
    
    @scala.inline
    def setMuxStreamsVarargs(value: MuxStream*): Self = this.set("muxStreams", js.Array(value :_*))
    
    @scala.inline
    def setMuxStreams(value: js.Array[MuxStream]): Self = this.set("muxStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuxStreams: Self = this.set("muxStreams", js.undefined)
    
    @scala.inline
    def setOutput(value: Output): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setOverlaysVarargs(value: Overlay*): Self = this.set("overlays", js.Array(value :_*))
    
    @scala.inline
    def setOverlays(value: js.Array[Overlay]): Self = this.set("overlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlays: Self = this.set("overlays", js.undefined)
    
    @scala.inline
    def setPubsubDestination(value: PubsubDestination): Self = this.set("pubsubDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubsubDestination: Self = this.set("pubsubDestination", js.undefined)
    
    @scala.inline
    def setSpriteSheetsVarargs(value: SpriteSheet*): Self = this.set("spriteSheets", js.Array(value :_*))
    
    @scala.inline
    def setSpriteSheets(value: js.Array[SpriteSheet]): Self = this.set("spriteSheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpriteSheets: Self = this.set("spriteSheets", js.undefined)
  }
}
