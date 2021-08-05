package typings.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.TextureAtlas")
@js.native
class TextureAtlas protected ()
  extends StObject
     with typings.phaser.spine.TextureAtlas {
  def this(atlasText: String, textureLoader: js.Function1[/* path */ String, js.Any]) = this()
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  override def findRegion(name: String): typings.phaser.spine.TextureAtlasRegion = js.native
  
  /* private */ /* CompleteClass */
  var load: js.Any = js.native
  
  /* CompleteClass */
  var pages: js.Array[typings.phaser.spine.TextureAtlasPage] = js.native
  
  /* CompleteClass */
  var regions: js.Array[typings.phaser.spine.TextureAtlasRegion] = js.native
}
