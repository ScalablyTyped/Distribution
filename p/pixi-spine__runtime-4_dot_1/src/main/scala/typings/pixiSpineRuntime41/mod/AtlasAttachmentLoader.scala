package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.TextureAtlas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "AtlasAttachmentLoader")
@js.native
open class AtlasAttachmentLoader protected ()
  extends StObject
     with AttachmentLoader {
  def this(atlas: TextureAtlas) = this()
  
  var atlas: TextureAtlas = js.native
  
  def loadSequence(name: String, basePath: String, sequence: Sequence): Unit = js.native
}
