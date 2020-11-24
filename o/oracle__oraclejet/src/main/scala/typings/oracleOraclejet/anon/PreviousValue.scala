package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.external
import typings.oracleOraclejet.oracleOraclejetStrings.internal
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
  implicit class PreviousValueOps[Self <: PreviousValue[_], V] (val x: Self with PreviousValue[V]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPreviousValue(value: V): Self = this.set("previousValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubproperty(value: Dictkey): Self = this.set("subproperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedFrom(value: external | internal): Self = this.set("updatedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: V): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
