package typings.nodeBrowserHistory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-browser-history", "getAllHistory")
  @js.native
  def getAllHistory(): js.Promise[js.Array[BrowserHistory]] = js.native
  @JSImport("node-browser-history", "getAllHistory")
  @js.native
  def getAllHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = js.native
  
  @JSImport("node-browser-history", "getChromeHistory")
  @js.native
  def getChromeHistory(): js.Promise[js.Array[BrowserHistory]] = js.native
  @JSImport("node-browser-history", "getChromeHistory")
  @js.native
  def getChromeHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = js.native
  
  @JSImport("node-browser-history", "getFirefoxHistory")
  @js.native
  def getFirefoxHistory(): js.Promise[js.Array[BrowserHistory]] = js.native
  @JSImport("node-browser-history", "getFirefoxHistory")
  @js.native
  def getFirefoxHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = js.native
  
  @JSImport("node-browser-history", "getIEHistory")
  @js.native
  def getIEHistory(): js.Promise[js.Array[BrowserHistory]] = js.native
  @JSImport("node-browser-history", "getIEHistory")
  @js.native
  def getIEHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = js.native
  
  @JSImport("node-browser-history", "getMaxthonHistory")
  @js.native
  def getMaxthonHistory(): js.Promise[js.Array[BrowserHistory]] = js.native
  @JSImport("node-browser-history", "getMaxthonHistory")
  @js.native
  def getMaxthonHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = js.native
  
  @JSImport("node-browser-history", "getOperaHistory")
  @js.native
  def getOperaHistory(): js.Promise[js.Array[BrowserHistory]] = js.native
  @JSImport("node-browser-history", "getOperaHistory")
  @js.native
  def getOperaHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = js.native
  
  @JSImport("node-browser-history", "getSafariHistory")
  @js.native
  def getSafariHistory(): js.Promise[js.Array[BrowserHistory]] = js.native
  @JSImport("node-browser-history", "getSafariHistory")
  @js.native
  def getSafariHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = js.native
  
  @JSImport("node-browser-history", "getSeaMonkeyHistory")
  @js.native
  def getSeaMonkeyHistory(): js.Promise[js.Array[BrowserHistory]] = js.native
  @JSImport("node-browser-history", "getSeaMonkeyHistory")
  @js.native
  def getSeaMonkeyHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = js.native
  
  @JSImport("node-browser-history", "getTorchHistory")
  @js.native
  def getTorchHistory(): js.Promise[js.Array[BrowserHistory]] = js.native
  @JSImport("node-browser-history", "getTorchHistory")
  @js.native
  def getTorchHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = js.native
  
  @JSImport("node-browser-history", "getVivaldiHistory")
  @js.native
  def getVivaldiHistory(): js.Promise[js.Array[BrowserHistory]] = js.native
  @JSImport("node-browser-history", "getVivaldiHistory")
  @js.native
  def getVivaldiHistory(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = js.native
  
  @js.native
  trait BrowserHistory extends StObject {
    
    var browser: String = js.native
    
    var title: String = js.native
    
    var url: String = js.native
    
    var utc_time: Double = js.native
  }
  object BrowserHistory {
    
    @scala.inline
    def apply(browser: String, title: String, url: String, utc_time: Double): BrowserHistory = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], utc_time = utc_time.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserHistory]
    }
    
    @scala.inline
    implicit class BrowserHistoryMutableBuilder[Self <: BrowserHistory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtc_time(value: Double): Self = StObject.set(x, "utc_time", value.asInstanceOf[js.Any])
    }
  }
}
