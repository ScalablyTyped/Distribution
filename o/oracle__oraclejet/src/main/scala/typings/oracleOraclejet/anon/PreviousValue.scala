package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.external
import typings.oracleOraclejet.oracleOraclejetStrings.internal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviousValue[V]
  extends /* key */ StringDictionary[js.Any] {
  
  var previousValue: V = js.native
  
  var subproperty: Dictkey = js.native
  
  var updatedFrom: external | internal = js.native
  
  var value: V = js.native
}
object PreviousValue {
  
  @scala.inline
  def apply[V](previousValue: V, subproperty: Dictkey, updatedFrom: external | internal, value: V): PreviousValue[V] = {
    val __obj = js.Dynamic.literal(previousValue = previousValue.asInstanceOf[js.Any], subproperty = subproperty.asInstanceOf[js.Any], updatedFrom = updatedFrom.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousValue[V]]
  }
  
  @scala.inline
  implicit class PreviousValueMutableBuilder[Self <: PreviousValue[_], V] (val x: Self with PreviousValue[V]) extends AnyVal {
    
    @scala.inline
    def setPreviousValue(value: V): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubproperty(value: Dictkey): Self = StObject.set(x, "subproperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedFrom(value: external | internal): Self = StObject.set(x, "updatedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
