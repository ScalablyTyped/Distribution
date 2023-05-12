package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryFilesize extends StObject {
  
  /**
    * Whether to use base 2, that means 1 Kibibyte = 1024 Byte, or base 10, that means 1 Kilobyte = 1000 Byte
    */
  var binaryFilesize: js.UndefOr[Boolean] = js.undefined
}
object BinaryFilesize {
  
  inline def apply(): BinaryFilesize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinaryFilesize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BinaryFilesize] (val x: Self) extends AnyVal {
    
    inline def setBinaryFilesize(value: Boolean): Self = StObject.set(x, "binaryFilesize", value.asInstanceOf[js.Any])
    
    inline def setBinaryFilesizeUndefined: Self = StObject.set(x, "binaryFilesize", js.undefined)
  }
}
