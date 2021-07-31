package typings.mz.anon

import typings.mz.mzStrings.buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var encoding: buffer
}
object `0` {
  
  @scala.inline
  def apply(): `0` = {
    val __obj = js.Dynamic.literal(encoding = "buffer")
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
