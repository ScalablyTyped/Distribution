package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TrafficLayer
  */
@js.native
trait TrafficLayer
  extends StObject
     with Layer {
  
  def endAutoRefresh(): Unit = js.native
  
  def getRTSVersion(): Double = js.native
  
  def refreshRTSVersion(): Unit = js.native
  
  def startAutoRefresh(): Unit = js.native
}
