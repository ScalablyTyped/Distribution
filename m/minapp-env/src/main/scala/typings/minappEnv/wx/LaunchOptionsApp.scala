package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 启动参数 */
trait LaunchOptionsApp extends StObject {
  
  /** 启动小程序的路径 */
  var path: String
  
  /** 启动小程序的 query 参数 */
  var query: js.Object
  
  /** 来源信息。从另一个小程序、公众号或 App 进入小程序时返回。否则返回 `{}`。(参见后文注意) */
  var referrerInfo: ReferrerInfo
  
  /** 启动小程序的[场景值]((scene)) */
  var scene: Double
  
  /** shareTicket，详见[获取更多转发信息]((转发#获取更多转发信息)) */
  var shareTicket: String
}
object LaunchOptionsApp {
  
  inline def apply(path: String, query: js.Object, referrerInfo: ReferrerInfo, scene: Double, shareTicket: String): LaunchOptionsApp = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], referrerInfo = referrerInfo.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchOptionsApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchOptionsApp] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReferrerInfo(value: ReferrerInfo): Self = StObject.set(x, "referrerInfo", value.asInstanceOf[js.Any])
    
    inline def setScene(value: Double): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
  }
}
