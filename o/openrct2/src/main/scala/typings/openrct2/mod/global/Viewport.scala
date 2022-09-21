package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Viewport extends StObject {
  
  var bottom: Double = js.native
  
  def getCentrePosition(): CoordsXY = js.native
  
  var left: Double = js.native
  
  def moveTo(position: CoordsXY): Unit = js.native
  def moveTo(position: CoordsXYZ): Unit = js.native
  
  var right: Double = js.native
  
  var rotation: Double = js.native
  
  def scrollTo(position: CoordsXY): Unit = js.native
  def scrollTo(position: CoordsXYZ): Unit = js.native
  
  var top: Double = js.native
  
  var visibilityFlags: Double = js.native
  
  var zoom: Double = js.native
}
