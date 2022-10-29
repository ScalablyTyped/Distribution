package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "BufferSystem")
@js.native
open class BufferSystem protected ()
  extends typings.pixiCore.mod.BufferSystem {
  /**
    * @param {PIXI.Renderer} renderer - The renderer this System works for.
    */
  def this(renderer: typings.pixiCore.libRendererMod.Renderer) = this()
}
/* static members */
object BufferSystem {
  
  /** @ignore */
  @JSImport("pixi.js", "BufferSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
