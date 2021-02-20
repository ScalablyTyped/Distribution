package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attached extends StObject {
  
  def attached(param0: js.Object): Unit = js.native
}
object Attached {
  
  @scala.inline
  def apply(attached: js.Object => Unit): Attached = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction1(attached))
    __obj.asInstanceOf[Attached]
  }
  
  @scala.inline
  implicit class AttachedMutableBuilder[Self <: Attached] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttached(value: js.Object => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction1(value))
  }
}
