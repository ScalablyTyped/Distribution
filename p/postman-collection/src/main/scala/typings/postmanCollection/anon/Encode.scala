package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encode extends StObject {
  
  var encode: js.UndefOr[Boolean] = js.undefined
  
  var ignoreDisabled: js.UndefOr[Boolean] = js.undefined
}
object Encode {
  
  @scala.inline
  def apply(): Encode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encode]
  }
  
  @scala.inline
  implicit class EncodeMutableBuilder[Self <: Encode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    @scala.inline
    def setIgnoreDisabled(value: Boolean): Self = StObject.set(x, "ignoreDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreDisabledUndefined: Self = StObject.set(x, "ignoreDisabled", js.undefined)
  }
}
