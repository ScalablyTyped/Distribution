package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "Navigator")
@js.native
open class Navigator protected () extends Viewer {
  def this(options: Options) = this()
  
  def setFlip(state: Boolean): Unit = js.native
  
  def setHeight(width: String): Unit = js.native
  def setHeight(width: Double): Unit = js.native
  
  def setWidth(width: String): Unit = js.native
  def setWidth(width: Double): Unit = js.native
  
  def update(viewport: Viewport): Unit = js.native
  
  def updateSize(): Unit = js.native
}
