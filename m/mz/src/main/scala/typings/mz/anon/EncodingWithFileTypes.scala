package typings.mz.anon

import typings.mz.mzBooleans.`false`
import typings.mz.mzStrings.buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodingWithFileTypes extends StObject {
  
  var encoding: buffer
  
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}
object EncodingWithFileTypes {
  
  @scala.inline
  def apply(): EncodingWithFileTypes = {
    val __obj = js.Dynamic.literal(encoding = "buffer")
    __obj.asInstanceOf[EncodingWithFileTypes]
  }
  
  @scala.inline
  implicit class EncodingWithFileTypesMutableBuilder[Self <: EncodingWithFileTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
  }
}
