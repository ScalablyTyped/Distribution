package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arg extends StObject {
  
  /** Argument matches any value provided. */
  var anyValue: js.UndefOr[js.Any] = js.undefined
  
  /** Argument exactly matches value provided. */
  var exactValue: js.UndefOr[js.Any] = js.undefined
}
object Arg {
  
  @scala.inline
  def apply(): Arg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arg]
  }
  
  @scala.inline
  implicit class ArgMutableBuilder[Self <: Arg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnyValue(value: js.Any): Self = StObject.set(x, "anyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyValueUndefined: Self = StObject.set(x, "anyValue", js.undefined)
    
    @scala.inline
    def setExactValue(value: js.Any): Self = StObject.set(x, "exactValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactValueUndefined: Self = StObject.set(x, "exactValue", js.undefined)
  }
}
