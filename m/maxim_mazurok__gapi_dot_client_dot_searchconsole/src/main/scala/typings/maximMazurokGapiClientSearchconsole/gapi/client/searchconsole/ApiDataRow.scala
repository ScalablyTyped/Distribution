package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiDataRow extends StObject {
  
  var clicks: js.UndefOr[Double] = js.undefined
  
  var ctr: js.UndefOr[Double] = js.undefined
  
  var impressions: js.UndefOr[Double] = js.undefined
  
  var keys: js.UndefOr[js.Array[String]] = js.undefined
  
  var position: js.UndefOr[Double] = js.undefined
}
object ApiDataRow {
  
  @scala.inline
  def apply(): ApiDataRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiDataRow]
  }
  
  @scala.inline
  implicit class ApiDataRowMutableBuilder[Self <: ApiDataRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClicks(value: Double): Self = StObject.set(x, "clicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClicksUndefined: Self = StObject.set(x, "clicks", js.undefined)
    
    @scala.inline
    def setCtr(value: Double): Self = StObject.set(x, "ctr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrUndefined: Self = StObject.set(x, "ctr", js.undefined)
    
    @scala.inline
    def setImpressions(value: Double): Self = StObject.set(x, "impressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionsUndefined: Self = StObject.set(x, "impressions", js.undefined)
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
