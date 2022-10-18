package typings.next.anon

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MountedInstances extends StObject {
  
  var mountedInstances: Set[Any]
  
  def updateHead(head: js.Array[typings.react.mod.global.JSX.Element]): Unit
}
object MountedInstances {
  
  inline def apply(mountedInstances: Set[Any], updateHead: js.Array[typings.react.mod.global.JSX.Element] => Unit): MountedInstances = {
    val __obj = js.Dynamic.literal(mountedInstances = mountedInstances.asInstanceOf[js.Any], updateHead = js.Any.fromFunction1(updateHead))
    __obj.asInstanceOf[MountedInstances]
  }
  
  extension [Self <: MountedInstances](x: Self) {
    
    inline def setMountedInstances(value: Set[Any]): Self = StObject.set(x, "mountedInstances", value.asInstanceOf[js.Any])
    
    inline def setUpdateHead(value: js.Array[typings.react.mod.global.JSX.Element] => Unit): Self = StObject.set(x, "updateHead", js.Any.fromFunction1(value))
  }
}
