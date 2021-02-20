package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfficeGraphInsights extends Entity {
  
  /**
    * Calculated relationship identifying documents shared with or by the user. This includes URLs, file attachments, and
    * reference attachments to OneDrive for Business and SharePoint files found in Outlook messages and meetings. This also
    * includes URLs and reference attachments to Teams conversations. Ordered by recency of share.
    */
  var shared: js.UndefOr[NullableOption[js.Array[SharedInsight]]] = js.native
  
  /**
    * Calculated relationship identifying documents trending around a user. Trending documents are calculated based on
    * activity of the user's closest network of people and include files stored in OneDrive for Business and SharePoint.
    * Trending insights help the user to discover potentially useful content that the user has access to, but has never
    * viewed before.
    */
  var trending: js.UndefOr[NullableOption[js.Array[Trending]]] = js.native
  
  /**
    * Calculated relationship identifying the latest documents viewed or modified by a user, including OneDrive for Business
    * and SharePoint documents, ranked by recency of use.
    */
  var used: js.UndefOr[NullableOption[js.Array[UsedInsight]]] = js.native
}
object OfficeGraphInsights {
  
  @scala.inline
  def apply(): OfficeGraphInsights = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfficeGraphInsights]
  }
  
  @scala.inline
  implicit class OfficeGraphInsightsMutableBuilder[Self <: OfficeGraphInsights] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShared(value: NullableOption[js.Array[SharedInsight]]): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedNull: Self = StObject.set(x, "shared", null)
    
    @scala.inline
    def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    @scala.inline
    def setSharedVarargs(value: SharedInsight*): Self = StObject.set(x, "shared", js.Array(value :_*))
    
    @scala.inline
    def setTrending(value: NullableOption[js.Array[Trending]]): Self = StObject.set(x, "trending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrendingNull: Self = StObject.set(x, "trending", null)
    
    @scala.inline
    def setTrendingUndefined: Self = StObject.set(x, "trending", js.undefined)
    
    @scala.inline
    def setTrendingVarargs(value: Trending*): Self = StObject.set(x, "trending", js.Array(value :_*))
    
    @scala.inline
    def setUsed(value: NullableOption[js.Array[UsedInsight]]): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedNull: Self = StObject.set(x, "used", null)
    
    @scala.inline
    def setUsedUndefined: Self = StObject.set(x, "used", js.undefined)
    
    @scala.inline
    def setUsedVarargs(value: UsedInsight*): Self = StObject.set(x, "used", js.Array(value :_*))
  }
}
