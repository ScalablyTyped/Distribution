package typings.oracleOraclejet.ojcompositeMod

import typings.oracleOraclejet.anon.Path
import typings.oracleOraclejet.oracleOraclejetStrings.external
import typings.oracleOraclejet.oracleOraclejetStrings.internal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyChangedContext extends js.Object {
  
  var previousValue: js.Any = js.native
  
  var property: String = js.native
  
  var subproperty: js.UndefOr[Path] = js.native
  
  var updatedFrom: external | internal = js.native
  
  var value: js.Any = js.native
}
object PropertyChangedContext {
  
  @scala.inline
  def apply(previousValue: js.Any, property: String, updatedFrom: external | internal, value: js.Any): PropertyChangedContext = {
    val __obj = js.Dynamic.literal(previousValue = previousValue.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], updatedFrom = updatedFrom.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyChangedContext]
  }
  
  @scala.inline
  implicit class PropertyChangedContextOps[Self <: PropertyChangedContext] (val x: Self) extends AnyVal {
    
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
    def setPreviousValue(value: js.Any): Self = this.set("previousValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedFrom(value: external | internal): Self = this.set("updatedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubproperty(value: Path): Self = this.set("subproperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubproperty: Self = this.set("subproperty", js.undefined)
  }
}
