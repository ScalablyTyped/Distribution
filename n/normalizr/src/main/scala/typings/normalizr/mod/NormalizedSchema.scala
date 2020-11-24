package typings.normalizr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizedSchema[E, R] extends js.Object {
  
  var entities: E = js.native
  
  var result: R = js.native
}
object NormalizedSchema {
  
  @scala.inline
  def apply[E, R](entities: E, result: R): NormalizedSchema[E, R] = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedSchema[E, R]]
  }
  
  @scala.inline
  implicit class NormalizedSchemaOps[Self <: NormalizedSchema[_, _], E, R] (val x: Self with (NormalizedSchema[E, R])) extends AnyVal {
    
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
    def setEntities(value: E): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: R): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
