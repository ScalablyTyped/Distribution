package typings.openfin.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BBG extends /* key */ StringDictionary[String] {
  
  var BBG: js.UndefOr[String] = js.native
  
  var CUSIP: js.UndefOr[String] = js.native
  
  var FIGI: js.UndefOr[String] = js.native
  
  var ISIN: js.UndefOr[String] = js.native
  
  var PERMID: js.UndefOr[String] = js.native
  
  var RIC: js.UndefOr[String] = js.native
  
  var SEDOL: js.UndefOr[String] = js.native
  
  var ticker: js.UndefOr[String] = js.native
}
object BBG {
  
  @scala.inline
  def apply(): BBG = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BBG]
  }
  
  @scala.inline
  implicit class BBGMutableBuilder[Self <: BBG] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBBG(value: String): Self = StObject.set(x, "BBG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBBGUndefined: Self = StObject.set(x, "BBG", js.undefined)
    
    @scala.inline
    def setCUSIP(value: String): Self = StObject.set(x, "CUSIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCUSIPUndefined: Self = StObject.set(x, "CUSIP", js.undefined)
    
    @scala.inline
    def setFIGI(value: String): Self = StObject.set(x, "FIGI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFIGIUndefined: Self = StObject.set(x, "FIGI", js.undefined)
    
    @scala.inline
    def setISIN(value: String): Self = StObject.set(x, "ISIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setISINUndefined: Self = StObject.set(x, "ISIN", js.undefined)
    
    @scala.inline
    def setPERMID(value: String): Self = StObject.set(x, "PERMID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPERMIDUndefined: Self = StObject.set(x, "PERMID", js.undefined)
    
    @scala.inline
    def setRIC(value: String): Self = StObject.set(x, "RIC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRICUndefined: Self = StObject.set(x, "RIC", js.undefined)
    
    @scala.inline
    def setSEDOL(value: String): Self = StObject.set(x, "SEDOL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSEDOLUndefined: Self = StObject.set(x, "SEDOL", js.undefined)
    
    @scala.inline
    def setTicker(value: String): Self = StObject.set(x, "ticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickerUndefined: Self = StObject.set(x, "ticker", js.undefined)
  }
}
