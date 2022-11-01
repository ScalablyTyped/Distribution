package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LayerRegistry
  */
@js.native
trait LayerRegistry
  extends StObject
     with KVO {
  
  def getLayerNames(): js.Array[String] = js.native
  
  def set(key: String, value: Layer): Unit = js.native
}
