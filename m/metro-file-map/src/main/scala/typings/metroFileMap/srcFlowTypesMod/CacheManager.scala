package typings.metroFileMap.srcFlowTypesMod

import typings.metroFileMap.anon.ReadonlychangedFileDatare
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheManager extends StObject {
  
  def read(): js.Promise[CacheData | Null]
  
  def write(dataSnapshot: CacheData, delta: ReadonlychangedFileDatare): js.Promise[Unit]
}
object CacheManager {
  
  inline def apply(
    read: () => js.Promise[CacheData | Null],
    write: (CacheData, ReadonlychangedFileDatare) => js.Promise[Unit]
  ): CacheManager = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read), write = js.Any.fromFunction2(write))
    __obj.asInstanceOf[CacheManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheManager] (val x: Self) extends AnyVal {
    
    inline def setRead(value: () => js.Promise[CacheData | Null]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    
    inline def setWrite(value: (CacheData, ReadonlychangedFileDatare) => js.Promise[Unit]): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
  }
}
