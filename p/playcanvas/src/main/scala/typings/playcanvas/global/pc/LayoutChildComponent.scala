package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new LayoutChildComponent.
  * @property minWidth - The minimum width the element should be rendered at.
  * @property minHeight - The minimum height the element should be rendered at.
  * @property maxWidth - The maximum width the element should be rendered at.
  * @property maxHeight - The maximum height the element should be rendered at.
  * @property fitWidthProportion - The amount of additional horizontal space that the element should take up, if necessary to satisfy a Stretch/Shrink fitting calculation. This is specified as a proportion, taking into account the proportion values of other siblings.
  * @property fitHeightProportion - The amount of additional vertical space that the element should take up, if necessary to satisfy a Stretch/Shrink fitting calculation. This is specified as a proportion, taking into account the proportion values of other siblings.
  * @property excludeFromLayout - If set to true, the child will be excluded from all layout calculations.
  * @param system - The ComponentSystem that created this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@JSGlobal("pc.LayoutChildComponent")
@js.native
class LayoutChildComponent protected ()
  extends typings.playcanvas.pc.LayoutChildComponent {
  def this(system: typings.playcanvas.pc.LayoutChildComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}
