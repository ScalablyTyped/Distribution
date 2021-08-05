package typings.nodelibFsWalk

import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Entry = typings.nodelibFsScandir.typesMod.Entry
  
  type Errno = ErrnoException
  
  trait QueueItem extends StObject {
    
    var base: js.UndefOr[String] = js.undefined
    
    var directory: String
  }
  object QueueItem {
    
    inline def apply(directory: String): QueueItem = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueItem]
    }
    
    extension [Self <: QueueItem](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    }
  }
}
