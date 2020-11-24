package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectId extends js.Object {
  
  /** Required. The parts of an OID path. The most significant parts of the path come first. */
  var objectIdPath: js.UndefOr[js.Array[Double]] = js.native
}
object ObjectId {
  
  @scala.inline
  def apply(): ObjectId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectId]
  }
  
  @scala.inline
  implicit class ObjectIdOps[Self <: ObjectId] (val x: Self) extends AnyVal {
    
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
    def setObjectIdPathVarargs(value: Double*): Self = this.set("objectIdPath", js.Array(value :_*))
    
    @scala.inline
    def setObjectIdPath(value: js.Array[Double]): Self = this.set("objectIdPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectIdPath: Self = this.set("objectIdPath", js.undefined)
  }
}
