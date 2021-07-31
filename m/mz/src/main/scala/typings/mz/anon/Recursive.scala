package typings.mz.anon

import typings.mz.mzStrings.buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recursive extends StObject {
  
  var encoding: buffer
  
  var persistent: js.UndefOr[Boolean] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object Recursive {
  
  @scala.inline
  def apply(): Recursive = {
    val __obj = js.Dynamic.literal(encoding = "buffer")
    __obj.asInstanceOf[Recursive]
  }
  
  @scala.inline
  implicit class RecursiveMutableBuilder[Self <: Recursive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
