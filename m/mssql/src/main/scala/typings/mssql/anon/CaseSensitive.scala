package typings.mssql.anon

import typings.mssql.mod.ISqlType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaseSensitive extends js.Object {
  
  var caseSensitive: Boolean = js.native
  
  var identity: Boolean = js.native
  
  var index: Double = js.native
  
  var length: Double = js.native
  
  var name: String = js.native
  
  var nullable: Boolean = js.native
  
  var precision: js.UndefOr[Double] = js.native
  
  var readOnly: Boolean = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var `type`: js.Function0[ISqlType] | ISqlType = js.native
  
  var udt: js.UndefOr[js.Any] = js.native
}
object CaseSensitive {
  
  @scala.inline
  def apply(
    caseSensitive: Boolean,
    identity: Boolean,
    index: Double,
    length: Double,
    name: String,
    nullable: Boolean,
    readOnly: Boolean,
    `type`: js.Function0[ISqlType] | ISqlType
  ): CaseSensitive = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseSensitive]
  }
  
  @scala.inline
  implicit class CaseSensitiveOps[Self <: CaseSensitive] (val x: Self) extends AnyVal {
    
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: Boolean): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullable(value: Boolean): Self = this.set("nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeFunction0(value: () => ISqlType): Self = this.set("type", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: js.Function0[ISqlType] | ISqlType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setUdt(value: js.Any): Self = this.set("udt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUdt: Self = this.set("udt", js.undefined)
  }
}
