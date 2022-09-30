package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "Prepare")
@js.native
open class Prepare protected ()
  extends typings.pixiPrepare.mod.Prepare {
  /**
    * @param {PIXI.Renderer} renderer - A reference to the current renderer
    */
  def this(renderer: typings.pixiCore.mod.Renderer) = this()
}
/* static members */
object Prepare {
  
  /** @ignore */
  @JSImport("pixi.js", "Prepare.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
