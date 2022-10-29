package typings.pixiCore.libSystemsMod

import typings.pixiCore.libRendererMod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core/lib/systems", "GeometrySystem")
@js.native
open class GeometrySystem protected ()
  extends typings.pixiCore.libGeometryGeometrySystemMod.GeometrySystem {
  /** @param renderer - The renderer this System works for. */
  def this(renderer: Renderer) = this()
}
/* static members */
object GeometrySystem {
  
  /** @ignore */
  @JSImport("@pixi/core/lib/systems", "GeometrySystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
