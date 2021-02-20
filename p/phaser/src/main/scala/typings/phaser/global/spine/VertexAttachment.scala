package typings.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.VertexAttachment")
@js.native
abstract class VertexAttachment protected ()
  extends typings.phaser.spine.VertexAttachment {
  def this(name: String) = this()
}
object VertexAttachment {
  
  @JSGlobal("spine.VertexAttachment")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.VertexAttachment.nextID")
  @js.native
  def nextID: js.Any = js.native
  @scala.inline
  def nextID_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextID")(x.asInstanceOf[js.Any])
}
