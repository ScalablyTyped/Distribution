package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Field extends js.Object {
  
  /** The field cardinality. */
  var cardinality: js.UndefOr[String] = js.native
  
  /** The string value of the default value of this field. Proto2 syntax only. */
  var defaultValue: js.UndefOr[String] = js.native
  
  /** The field JSON name. */
  var jsonName: js.UndefOr[String] = js.native
  
  /** The field type. */
  var kind: js.UndefOr[String] = js.native
  
  /** The field name. */
  var name: js.UndefOr[String] = js.native
  
  /** The field number. */
  var number: js.UndefOr[Double] = js.native
  
  /** The index of the field type in `Type.oneofs`, for message or enumeration types. The first type has index 1; zero means the type is not in the list. */
  var oneofIndex: js.UndefOr[Double] = js.native
  
  /** The protocol buffer options. */
  var options: js.UndefOr[js.Array[Option]] = js.native
  
  /** Whether to use alternative packed wire representation. */
  var packed: js.UndefOr[Boolean] = js.native
  
  /** The field type URL, without the scheme, for message or enumeration types. Example: `"type.googleapis.com/google.protobuf.Timestamp"`. */
  var typeUrl: js.UndefOr[String] = js.native
}
object Field {
  
  @scala.inline
  def apply(): Field = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
    
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
    def setCardinality(value: String): Self = this.set("cardinality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardinality: Self = this.set("cardinality", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setJsonName(value: String): Self = this.set("jsonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonName: Self = this.set("jsonName", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setOneofIndex(value: Double): Self = this.set("oneofIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneofIndex: Self = this.set("oneofIndex", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: Option*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[Option]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPacked(value: Boolean): Self = this.set("packed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePacked: Self = this.set("packed", js.undefined)
    
    @scala.inline
    def setTypeUrl(value: String): Self = this.set("typeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeUrl: Self = this.set("typeUrl", js.undefined)
  }
}
