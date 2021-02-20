package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FSyncOptions extends CommonOptions {
  
  var fsync: js.UndefOr[Boolean] = js.native
}
object FSyncOptions {
  
  @scala.inline
  def apply(): FSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FSyncOptions]
  }
  
  @scala.inline
  implicit class FSyncOptionsMutableBuilder[Self <: FSyncOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFsync(value: Boolean): Self = StObject.set(x, "fsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsyncUndefined: Self = StObject.set(x, "fsync", js.undefined)
  }
}
