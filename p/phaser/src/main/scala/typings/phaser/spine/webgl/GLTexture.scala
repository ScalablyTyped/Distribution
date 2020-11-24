package typings.phaser.spine.webgl

import typings.phaser.spine.Disposable
import typings.phaser.spine.Restorable
import typings.phaser.spine.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GLTexture
  extends Texture
     with Disposable
     with Restorable {
  
  def bind(): Unit = js.native
  def bind(unit: Double): Unit = js.native
  
  var boundUnit: js.Any = js.native
  
  var context: js.Any = js.native
  
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  
  var texture: js.Any = js.native
  
  def unbind(): Unit = js.native
  
  def update(useMipMaps: Boolean): Unit = js.native
  
  var useMipMaps: js.Any = js.native
}
