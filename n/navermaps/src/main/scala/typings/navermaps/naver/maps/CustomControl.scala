package typings.navermaps.naver.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Control
@js.native
trait CustomControl
  extends StObject
     with KVO {
  
  def getElement(): HTMLElement = js.native
  
  def getMap(): Map | Null = js.native
  
  def getOptions(): Any = js.native
  def getOptions(key: String): Any = js.native
  
  def html(): js.UndefOr[String] = js.native
  def html(html: String): js.UndefOr[String] = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  def setOptions(newOptions: ControlOptions): Unit = js.native
  
  def setPosition(position: Position): Unit = js.native
}
