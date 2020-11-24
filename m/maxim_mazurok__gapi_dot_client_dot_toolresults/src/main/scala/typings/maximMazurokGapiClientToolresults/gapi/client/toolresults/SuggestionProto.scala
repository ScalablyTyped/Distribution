package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestionProto extends js.Object {
  
  /** Reference to a help center article concerning this type of suggestion. Always set. */
  var helpUrl: js.UndefOr[String] = js.native
  
  /** Message, in the user's language, explaining the suggestion, which may contain markup. Always set. */
  var longMessage: js.UndefOr[SafeHtmlProto] = js.native
  
  /** Relative importance of a suggestion. Always set. */
  var priority: js.UndefOr[String] = js.native
  
  /**
    * A somewhat human readable identifier of the source view, if it does not have a resource_name. This is a path within the accessibility hierarchy, an element with resource name;
    * similar to an XPath.
    */
  var pseudoResourceId: js.UndefOr[String] = js.native
  
  /** Region within the screenshot that is relevant to this suggestion. Optional. */
  var region: js.UndefOr[RegionProto] = js.native
  
  /** Reference to a view element, identified by its resource name, if it has one. */
  var resourceName: js.UndefOr[String] = js.native
  
  /** ID of the screen for the suggestion. It is used for getting the corresponding screenshot path. For example, screen_id "1" corresponds to "1.png" file in GCS. Always set. */
  var screenId: js.UndefOr[String] = js.native
  
  /**
    * Relative importance of a suggestion as compared with other suggestions that have the same priority and category. This is a meaningless value that can be used to order suggestions
    * that are in the same category and have the same priority. The larger values have higher priority (i.e., are more important). Optional.
    */
  var secondaryPriority: js.UndefOr[Double] = js.native
  
  /** Concise message, in the user's language, representing the suggestion, which may contain markup. Always set. */
  var shortMessage: js.UndefOr[SafeHtmlProto] = js.native
  
  /** General title for the suggestion, in the user's language, without markup. Always set. */
  var title: js.UndefOr[String] = js.native
}
object SuggestionProto {
  
  @scala.inline
  def apply(): SuggestionProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestionProto]
  }
  
  @scala.inline
  implicit class SuggestionProtoOps[Self <: SuggestionProto] (val x: Self) extends AnyVal {
    
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
    def setHelpUrl(value: String): Self = this.set("helpUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpUrl: Self = this.set("helpUrl", js.undefined)
    
    @scala.inline
    def setLongMessage(value: SafeHtmlProto): Self = this.set("longMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongMessage: Self = this.set("longMessage", js.undefined)
    
    @scala.inline
    def setPriority(value: String): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setPseudoResourceId(value: String): Self = this.set("pseudoResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePseudoResourceId: Self = this.set("pseudoResourceId", js.undefined)
    
    @scala.inline
    def setRegion(value: RegionProto): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    
    @scala.inline
    def setScreenId(value: String): Self = this.set("screenId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenId: Self = this.set("screenId", js.undefined)
    
    @scala.inline
    def setSecondaryPriority(value: Double): Self = this.set("secondaryPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryPriority: Self = this.set("secondaryPriority", js.undefined)
    
    @scala.inline
    def setShortMessage(value: SafeHtmlProto): Self = this.set("shortMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortMessage: Self = this.set("shortMessage", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
