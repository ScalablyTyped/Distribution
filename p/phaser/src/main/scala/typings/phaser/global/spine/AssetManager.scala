package typings.phaser.global.spine

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.AssetManager")
@js.native
open class AssetManager protected ()
  extends StObject
     with typings.phaser.spine.AssetManager {
  def this(textureLoader: js.Function1[/* image */ HTMLImageElement, Any]) = this()
  def this(textureLoader: js.Function1[/* image */ HTMLImageElement, Any], pathPrefix: String) = this()
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
object AssetManager {
  
  @JSGlobal("spine.AssetManager")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.AssetManager.downloadBinary")
  @js.native
  def downloadBinary: Any = js.native
  inline def downloadBinary_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("downloadBinary")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.AssetManager.downloadText")
  @js.native
  def downloadText: Any = js.native
  inline def downloadText_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("downloadText")(x.asInstanceOf[js.Any])
}
