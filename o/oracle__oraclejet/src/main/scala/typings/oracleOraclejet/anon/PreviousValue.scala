package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.external
import typings.oracleOraclejet.oracleOraclejetStrings.internal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviousValue[V]
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var previousValue: V
  
  var subproperty: Dictkey
  
  var updatedFrom: external | internal
  
  var value: V
}
object PreviousValue {
  
  inline def apply[V](previousValue: V, subproperty: Dictkey, updatedFrom: external | internal, value: V): PreviousValue[V] = {
    val __obj = js.Dynamic.literal(previousValue = previousValue.asInstanceOf[js.Any], subproperty = subproperty.asInstanceOf[js.Any], updatedFrom = updatedFrom.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousValue[V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreviousValue[?], V] (val x: Self & PreviousValue[V]) extends AnyVal {
    
    inline def setPreviousValue(value: V): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    inline def setSubproperty(value: Dictkey): Self = StObject.set(x, "subproperty", value.asInstanceOf[js.Any])
    
    inline def setUpdatedFrom(value: external | internal): Self = StObject.set(x, "updatedFrom", value.asInstanceOf[js.Any])
    
    inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
