package typings.parquetjs.fieldInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldInterface extends js.Object {
  
  var compression: js.UndefOr[String] = js.native
  
  var dLevelMax: Double = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var fieldCount: js.UndefOr[Double] = js.native
  
  var fields: js.UndefOr[StringDictionary[FieldInterface]] = js.native
  
  var isNested: js.UndefOr[Boolean] = js.native
  
  var name: String = js.native
  
  var originalType: js.UndefOr[String | Null] = js.native
  
  var path: js.Array[String] = js.native
  
  var primitiveType: js.UndefOr[String | Null] = js.native
  
  var rLevelMax: Double = js.native
  
  var repetitionType: String = js.native
  
  var typeLength: js.UndefOr[Double | Null] = js.native
}
object FieldInterface {
  
  @scala.inline
  def apply(dLevelMax: Double, name: String, path: js.Array[String], rLevelMax: Double, repetitionType: String): FieldInterface = {
    val __obj = js.Dynamic.literal(dLevelMax = dLevelMax.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rLevelMax = rLevelMax.asInstanceOf[js.Any], repetitionType = repetitionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInterface]
  }
  
  @scala.inline
  implicit class FieldInterfaceOps[Self <: FieldInterface] (val x: Self) extends AnyVal {
    
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
    def setDLevelMax(value: Double): Self = this.set("dLevelMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRLevelMax(value: Double): Self = this.set("rLevelMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepetitionType(value: String): Self = this.set("repetitionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompression(value: String): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFieldCount(value: Double): Self = this.set("fieldCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldCount: Self = this.set("fieldCount", js.undefined)
    
    @scala.inline
    def setFields(value: StringDictionary[FieldInterface]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setIsNested(value: Boolean): Self = this.set("isNested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNested: Self = this.set("isNested", js.undefined)
    
    @scala.inline
    def setOriginalType(value: String): Self = this.set("originalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalType: Self = this.set("originalType", js.undefined)
    
    @scala.inline
    def setOriginalTypeNull: Self = this.set("originalType", null)
    
    @scala.inline
    def setPrimitiveType(value: String): Self = this.set("primitiveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimitiveType: Self = this.set("primitiveType", js.undefined)
    
    @scala.inline
    def setPrimitiveTypeNull: Self = this.set("primitiveType", null)
    
    @scala.inline
    def setTypeLength(value: Double): Self = this.set("typeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeLength: Self = this.set("typeLength", js.undefined)
    
    @scala.inline
    def setTypeLengthNull: Self = this.set("typeLength", null)
  }
}
