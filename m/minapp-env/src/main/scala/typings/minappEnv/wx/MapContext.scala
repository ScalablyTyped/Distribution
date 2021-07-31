package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapContext extends StObject {
  
  /** [MapContext.getCenterLocation(Object object)](MapContext.getCenterLocation.md)
    *
    * 获取当前地图中心的经纬度。返回的是 gcj02 坐标系，可以用于 [wx.openLocation()](https://developers.weixin.qq.com/miniprogram/dev/api/location/wx.openLocation.html) */
  def getCenterLocation(): Unit = js.native
  def getCenterLocation(option: GetCenterLocationOption): Unit = js.native
  
  /** [MapContext.getRegion(Object object)](MapContext.getRegion.md)
    *
    * 获取当前地图的视野范围
    *
    * 最低基础库： `1.4.0` */
  def getRegion(): Unit = js.native
  def getRegion(option: GetRegionOption): Unit = js.native
  
  /** [MapContext.getScale(Object object)](MapContext.getScale.md)
    *
    * 获取当前地图的缩放级别
    *
    * 最低基础库： `1.4.0` */
  def getScale(): Unit = js.native
  def getScale(option: GetScaleOption): Unit = js.native
  
  /** [MapContext.includePoints(Object object)](MapContext.includePoints.md)
    *
    * 缩放视野展示所有经纬度
    *
    * 最低基础库： `1.2.0` */
  def includePoints(option: IncludePointsOption): Unit = js.native
  
  /** [MapContext.moveToLocation()](MapContext.moveToLocation.md)
    *
    * 将地图中心移动到当前定位点。需要配合map组件的show-location使用 */
  def moveToLocation(): Unit = js.native
  
  /** [MapContext.translateMarker(Object object)](MapContext.translateMarker.md)
    *
    * 平移marker，带动画
    *
    * 最低基础库： `1.2.0` */
  def translateMarker(option: TranslateMarkerOption): Unit = js.native
}
