package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinitionSource extends js.Object {
  
  var definition: js.UndefOr[String | Null] = js.native
  
  var source: js.UndefOr[String | Null] = js.native
}
object DefinitionSource {
  
  @scala.inline
  def apply(): DefinitionSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinitionSource]
  }
  
  @scala.inline
  implicit class DefinitionSourceOps[Self <: DefinitionSource] (val x: Self) extends AnyVal {
    
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
    def setDefinition(value: String): Self = this.set("definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    
    @scala.inline
    def setDefinitionNull: Self = this.set("definition", null)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
  }
}
