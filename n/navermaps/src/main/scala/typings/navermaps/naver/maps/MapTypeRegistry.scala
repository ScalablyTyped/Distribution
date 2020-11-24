package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapTypeRegistry extends KVO {
  
  def getPreviousTypeId(): String = js.native
  
  def getSelectedType(): MapType = js.native
  
  def getSelectedTypeId(): String = js.native
  
  def getTypeIds(): js.Array[String] = js.native
  
  def set(mapTypeId: String, mapType: MapType): Unit = js.native
  
  def setSelectedTypeId(mapTypeId: String): Unit = js.native
}
