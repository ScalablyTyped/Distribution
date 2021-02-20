package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Restorable extends StObject {
  
  def restore(): Unit = js.native
}
object Restorable {
  
  @scala.inline
  def apply(restore: () => Unit): Restorable = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction0(restore))
    __obj.asInstanceOf[Restorable]
  }
  
  @scala.inline
  implicit class RestorableMutableBuilder[Self <: Restorable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestore(value: () => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction0(value))
  }
}
