package typings.nodelibFsWalk

import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outTypesMod {
  
  type Entry = typings.nodelibFsScandir.outTypesMod.Entry
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueueItem] (val x: Self) extends AnyVal {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    }
  }
}
