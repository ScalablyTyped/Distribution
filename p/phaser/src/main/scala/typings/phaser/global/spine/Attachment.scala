package typings.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.Attachment")
@js.native
abstract class Attachment protected ()
  extends StObject
     with typings.phaser.spine.Attachment {
  def this(name: String) = this()
  
  /* CompleteClass */
  override def copy(): typings.phaser.spine.Attachment = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
