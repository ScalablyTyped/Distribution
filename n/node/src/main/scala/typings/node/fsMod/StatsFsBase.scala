package typings.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatsFsBase[T] extends StObject {
  
  /** Available blocks for unprivileged users */
  var bavail: T
  
  /** Free blocks in file system. */
  var bfree: T
  
  /**  Total data blocks in file system. */
  var blocks: T
  
  /**  Optimal transfer block size. */
  var bsize: T
  
  /** Free file nodes in file system. */
  var ffree: T
  
  /** Total file nodes in file system. */
  var files: T
  
  /** Type of file system. */
  var `type`: T
}
object StatsFsBase {
  
  inline def apply[T](bavail: T, bfree: T, blocks: T, bsize: T, ffree: T, files: T, `type`: T): StatsFsBase[T] = {
    val __obj = js.Dynamic.literal(bavail = bavail.asInstanceOf[js.Any], bfree = bfree.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], bsize = bsize.asInstanceOf[js.Any], ffree = ffree.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsFsBase[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatsFsBase[?], T] (val x: Self & StatsFsBase[T]) extends AnyVal {
    
    inline def setBavail(value: T): Self = StObject.set(x, "bavail", value.asInstanceOf[js.Any])
    
    inline def setBfree(value: T): Self = StObject.set(x, "bfree", value.asInstanceOf[js.Any])
    
    inline def setBlocks(value: T): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBsize(value: T): Self = StObject.set(x, "bsize", value.asInstanceOf[js.Any])
    
    inline def setFfree(value: T): Self = StObject.set(x, "ffree", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: T): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
