package typings.novaEditorNode

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/file-stats/
@js.native
trait FileStats extends StObject {
  
  val atime: Date = js.native
  
  val birthtime: Date = js.native
  
  val ctime: Date = js.native
  
  def isDirectory(): Boolean = js.native
  
  def isFile(): Boolean = js.native
  
  def isSymbolicLink(): Boolean = js.native
  
  val mtime: Date = js.native
  
  val size: Double = js.native
}
object FileStats {
  
  @scala.inline
  def apply(
    atime: Date,
    birthtime: Date,
    ctime: Date,
    isDirectory: () => Boolean,
    isFile: () => Boolean,
    isSymbolicLink: () => Boolean,
    mtime: Date,
    size: Double
  ): FileStats = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStats]
  }
  
  @scala.inline
  implicit class FileStatsMutableBuilder[Self <: FileStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtime(value: Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthtime(value: Date): Self = StObject.set(x, "birthtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtime(value: Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSymbolicLink(value: () => Boolean): Self = StObject.set(x, "isSymbolicLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
