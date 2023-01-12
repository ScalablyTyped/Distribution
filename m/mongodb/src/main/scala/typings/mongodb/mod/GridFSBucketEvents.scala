package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFSBucketEvents extends StObject {
  
  def index(): Unit
}
object GridFSBucketEvents {
  
  inline def apply(index: () => Unit): GridFSBucketEvents = {
    val __obj = js.Dynamic.literal(index = js.Any.fromFunction0(index))
    __obj.asInstanceOf[GridFSBucketEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridFSBucketEvents] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: () => Unit): Self = StObject.set(x, "index", js.Any.fromFunction0(value))
  }
}
