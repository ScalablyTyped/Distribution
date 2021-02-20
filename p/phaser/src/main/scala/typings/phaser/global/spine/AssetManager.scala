package typings.phaser.global.spine

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.AssetManager")
@js.native
class AssetManager protected ()
  extends typings.phaser.spine.AssetManager {
  def this(textureLoader: js.Function1[/* image */ HTMLImageElement, _]) = this()
  def this(textureLoader: js.Function1[/* image */ HTMLImageElement, _], pathPrefix: String) = this()
}
object AssetManager {
  
  @JSGlobal("spine.AssetManager")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.AssetManager.downloadBinary")
  @js.native
  def downloadBinary: js.Any = js.native
  @scala.inline
  def downloadBinary_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("downloadBinary")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.AssetManager.downloadText")
  @js.native
  def downloadText: js.Any = js.native
  @scala.inline
  def downloadText_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("downloadText")(x.asInstanceOf[js.Any])
}
