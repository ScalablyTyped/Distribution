package typings.mz.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodingFlag extends StObject {
  
  var encoding: String
  
  var flag: js.UndefOr[String] = js.undefined
}
object EncodingFlag {
  
  @scala.inline
  def apply(encoding: String): EncodingFlag = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingFlag]
  }
  
  @scala.inline
  implicit class EncodingFlagMutableBuilder[Self <: EncodingFlag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
  }
}
