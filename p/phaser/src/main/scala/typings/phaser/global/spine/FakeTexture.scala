package typings.phaser.global.spine

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.FakeTexture")
@js.native
open class FakeTexture ()
  extends StObject
     with typings.phaser.spine.FakeTexture {
  
  /* protected */ /* CompleteClass */
  var _image: HTMLImageElement = js.native
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  override def getImage(): HTMLImageElement = js.native
  
  /* CompleteClass */
  override def setFilters(minFilter: typings.phaser.spine.TextureFilter, magFilter: typings.phaser.spine.TextureFilter): Unit = js.native
  
  /* CompleteClass */
  override def setWraps(uWrap: typings.phaser.spine.TextureWrap, vWrap: typings.phaser.spine.TextureWrap): Unit = js.native
}
