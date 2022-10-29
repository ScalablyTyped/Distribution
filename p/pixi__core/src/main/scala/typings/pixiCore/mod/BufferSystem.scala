package typings.pixiCore.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "BufferSystem")
@js.native
open class BufferSystem protected ()
  extends typings.pixiCore.libGeometryBufferSystemMod.BufferSystem {
  /**
    * @param {PIXI.Renderer} renderer - The renderer this System works for.
    */
  def this(renderer: typings.pixiCore.libRendererMod.Renderer) = this()
}
/* static members */
object BufferSystem {
  
  /** @ignore */
  @JSImport("@pixi/core", "BufferSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
