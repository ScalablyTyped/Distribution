package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Restorable extends StObject {
  
  def restore(): Unit
}
object Restorable {
  
  inline def apply(restore: () => Unit): Restorable = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction0(restore))
    __obj.asInstanceOf[Restorable]
  }
  
  extension [Self <: Restorable](x: Self) {
    
    inline def setRestore(value: () => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction0(value))
  }
}
