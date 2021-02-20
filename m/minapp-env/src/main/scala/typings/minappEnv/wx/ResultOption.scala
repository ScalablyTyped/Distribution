package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultOption extends StObject {
  
  /** 小程序切前台的路径 */
  var path: String = js.native
  
  /** 小程序切前台的 query 参数 */
  var query: js.Object = js.native
  
  /** 来源信息。从另一个小程序、公众号或 App 进入小程序时返回。否则返回 `{}`。(参见后文注意) */
  var referrerInfo: ReferrerInfoOption = js.native
  
  /** 小程序切前台的[场景值]((scene)) */
  var scene: Double = js.native
  
  /** shareTicket，详见[获取更多转发信息]((转发#获取更多转发信息)) */
  var shareTicket: String = js.native
}
object ResultOption {
  
  @scala.inline
  def apply(
    path: String,
    query: js.Object,
    referrerInfo: ReferrerInfoOption,
    scene: Double,
    shareTicket: String
  ): ResultOption = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], referrerInfo = referrerInfo.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultOption]
  }
  
  @scala.inline
  implicit class ResultOptionMutableBuilder[Self <: ResultOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerInfo(value: ReferrerInfoOption): Self = StObject.set(x, "referrerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene(value: Double): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
  }
}
