package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResult extends StObject {
  
  /**
    * A callback URL that can be used to record telemetry information. The application should issue a GET on this URL if the
    * user interacts with this item to improve the quality of results.
    */
  var onClickTelemetryUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object SearchResult {
  
  @scala.inline
  def apply(): SearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResult]
  }
  
  @scala.inline
  implicit class SearchResultMutableBuilder[Self <: SearchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnClickTelemetryUrl(value: NullableOption[String]): Self = StObject.set(x, "onClickTelemetryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickTelemetryUrlNull: Self = StObject.set(x, "onClickTelemetryUrl", null)
    
    @scala.inline
    def setOnClickTelemetryUrlUndefined: Self = StObject.set(x, "onClickTelemetryUrl", js.undefined)
  }
}
