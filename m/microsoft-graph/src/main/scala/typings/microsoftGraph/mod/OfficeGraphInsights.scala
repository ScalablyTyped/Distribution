package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfficeGraphInsights extends Entity {
  /**
    * Calculated relationship identifying documents shared with or by the user. This includes URLs, file attachments, and
    * reference attachments to OneDrive for Business and SharePoint files found in Outlook messages and meetings. This also
    * includes URLs and reference attachments to Teams conversations. Ordered by recency of share.
    */
  var shared: js.UndefOr[js.Array[SharedInsight]] = js.native
  /**
    * Calculated relationship identifying documents trending around a user. Trending documents are calculated based on
    * activity of the user's closest network of people and include files stored in OneDrive for Business and SharePoint.
    * Trending insights help the user to discover potentially useful content that the user has access to, but has never
    * viewed before.
    */
  var trending: js.UndefOr[js.Array[Trending]] = js.native
  /**
    * Calculated relationship identifying the latest documents viewed or modified by a user, including OneDrive for Business
    * and SharePoint documents, ranked by recency of use.
    */
  var used: js.UndefOr[js.Array[UsedInsight]] = js.native
}

object OfficeGraphInsights {
  @scala.inline
  def apply(): OfficeGraphInsights = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfficeGraphInsights]
  }
  @scala.inline
  implicit class OfficeGraphInsightsOps[Self <: OfficeGraphInsights] (val x: Self) extends AnyVal {
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
    def setSharedVarargs(value: SharedInsight*): Self = this.set("shared", js.Array(value :_*))
    @scala.inline
    def setShared(value: js.Array[SharedInsight]): Self = this.set("shared", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    @scala.inline
    def setTrendingVarargs(value: Trending*): Self = this.set("trending", js.Array(value :_*))
    @scala.inline
    def setTrending(value: js.Array[Trending]): Self = this.set("trending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrending: Self = this.set("trending", js.undefined)
    @scala.inline
    def setUsedVarargs(value: UsedInsight*): Self = this.set("used", js.Array(value :_*))
    @scala.inline
    def setUsed(value: js.Array[UsedInsight]): Self = this.set("used", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsed: Self = this.set("used", js.undefined)
  }
  
}

