package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelSection extends StObject {
  
  /** The contentDetails object contains details about the channel section content, such as a list of playlists or channels featured in the section. */
  var contentDetails: js.UndefOr[ChannelSectionContentDetails] = js.undefined
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The ID that YouTube uses to uniquely identify the channel section. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#channelSection". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Localizations for different languages */
  var localizations: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.youtube.gapi.client.youtube.ChannelSectionLocalization}
    */ typings.maximMazurokGapiClientYoutube.maximMazurokGapiClientYoutubeStrings.ChannelSection & TopLevel[js.Any]
  ] = js.undefined
  
  /** The snippet object contains basic details about the channel section, such as its type, style and title. */
  var snippet: js.UndefOr[ChannelSectionSnippet] = js.undefined
  
  /** The targeting object contains basic targeting settings about the channel section. */
  var targeting: js.UndefOr[ChannelSectionTargeting] = js.undefined
}
object ChannelSection {
  
  @scala.inline
  def apply(): ChannelSection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSection]
  }
  
  @scala.inline
  implicit class ChannelSectionMutableBuilder[Self <: ChannelSection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentDetails(value: ChannelSectionContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocalizations(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.youtube.gapi.client.youtube.ChannelSectionLocalization}
      */ typings.maximMazurokGapiClientYoutube.maximMazurokGapiClientYoutubeStrings.ChannelSection & TopLevel[js.Any]
    ): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
    
    @scala.inline
    def setSnippet(value: ChannelSectionSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    @scala.inline
    def setTargeting(value: ChannelSectionTargeting): Self = StObject.set(x, "targeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingUndefined: Self = StObject.set(x, "targeting", js.undefined)
  }
}
