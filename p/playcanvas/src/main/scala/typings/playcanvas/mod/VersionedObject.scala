package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionedObject extends StObject {
  
  def increment(): Unit
  
  var version: Version_
}
object VersionedObject {
  
  inline def apply(increment: () => Unit, version: Version_): VersionedObject = {
    val __obj = js.Dynamic.literal(increment = js.Any.fromFunction0(increment), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionedObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VersionedObject] (val x: Self) extends AnyVal {
    
    inline def setIncrement(value: () => Unit): Self = StObject.set(x, "increment", js.Any.fromFunction0(value))
    
    inline def setVersion(value: Version_): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
