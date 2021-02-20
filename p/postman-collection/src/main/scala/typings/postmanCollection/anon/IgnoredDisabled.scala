package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnoredDisabled extends StObject {
  
  var encode: js.UndefOr[Boolean] = js.native
  
  var ignoredDisabled: js.UndefOr[Boolean] = js.native
}
object IgnoredDisabled {
  
  @scala.inline
  def apply(): IgnoredDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoredDisabled]
  }
  
  @scala.inline
  implicit class IgnoredDisabledMutableBuilder[Self <: IgnoredDisabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    @scala.inline
    def setIgnoredDisabled(value: Boolean): Self = StObject.set(x, "ignoredDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoredDisabledUndefined: Self = StObject.set(x, "ignoredDisabled", js.undefined)
  }
}
