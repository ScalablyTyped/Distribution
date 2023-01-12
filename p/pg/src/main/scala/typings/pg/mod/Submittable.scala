package typings.pg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Submittable extends StObject {
  
  def submit(connection: Connection): Unit
}
object Submittable {
  
  inline def apply(submit: Connection => Unit): Submittable = {
    val __obj = js.Dynamic.literal(submit = js.Any.fromFunction1(submit))
    __obj.asInstanceOf[Submittable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Submittable] (val x: Self) extends AnyVal {
    
    inline def setSubmit(value: Connection => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction1(value))
  }
}
