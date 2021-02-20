package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentVariable extends StObject {
  
  /** Key for the environment variable. */
  var key: js.UndefOr[String] = js.native
  
  /** Value for the environment variable. */
  var value: js.UndefOr[String] = js.native
}
object EnvironmentVariable {
  
  @scala.inline
  def apply(): EnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentVariable]
  }
  
  @scala.inline
  implicit class EnvironmentVariableMutableBuilder[Self <: EnvironmentVariable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
