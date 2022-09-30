package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "ParticleRenderer")
@js.native
open class ParticleRenderer protected ()
  extends typings.pixiParticleContainer.mod.ParticleRenderer {
  /**
    * @param renderer - The renderer this sprite batch works for.
    */
  def this(renderer: typings.pixiCore.mod.Renderer) = this()
}
/* static members */
object ParticleRenderer {
  
  /** @ignore */
  @JSImport("pixi.js", "ParticleRenderer.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
