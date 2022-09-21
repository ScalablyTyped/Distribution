package typings.pixiCore.mod

import typings.pixiMath.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRenderableContainer
  extends StObject
     with IRenderableObject {
  
  /** Get Local bounds for container */
  def getLocalBounds(): Rectangle = js.native
  def getLocalBounds(rect: Unit, skipChildrenUpdate: Boolean): Rectangle = js.native
  def getLocalBounds(rect: Rectangle): Rectangle = js.native
  def getLocalBounds(rect: Rectangle, skipChildrenUpdate: Boolean): Rectangle = js.native
}
