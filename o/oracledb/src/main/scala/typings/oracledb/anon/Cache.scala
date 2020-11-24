package typings.oracledb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cache extends js.Object {
  
  /**
    * SecureFiles LOB cache setting.
    *
    * @default true
    */
  var cache: js.UndefOr[Boolean] = js.native
  
  /**
    * SecureFiles LOB compression setting.
    *
    * @default NONE
    */
  var compress: js.UndefOr[String] = js.native
  
  /**
    * SecureFiles LOB encryption setting.
    *
    * Before you create a collection that uses SecureFiles LOB encryption you must set up an encryption wallet.
    *
    * @default NONE
    */
  var encrypt: js.UndefOr[String] = js.native
  
  /**
    * Maximum length of the content column in bytes. This component applies only to content of type VARCHAR2.
    *
    * @default 4000
    */
  var maxLength: js.UndefOr[Double] = js.native
  
  /**
    * Name of the column that stores the database content.
    *
    * @default JSON_DOCUMENT
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * SQL data type of the column that stores the document content.
    *
    * @default BLOB
    */
  var sqlType: js.UndefOr[String] = js.native
  
  /**
    * Syntax to which JavaScript Object Notation (JSON) content must conform—strict or lax.
    *
    * @default STANDARD
    */
  var validation: js.UndefOr[String] = js.native
}
object Cache {
  
  @scala.inline
  def apply(): Cache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cache]
  }
  
  @scala.inline
  implicit class CacheOps[Self <: Cache] (val x: Self) extends AnyVal {
    
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCompress(value: String): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    
    @scala.inline
    def setEncrypt(value: String): Self = this.set("encrypt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypt: Self = this.set("encrypt", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSqlType(value: String): Self = this.set("sqlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqlType: Self = this.set("sqlType", js.undefined)
    
    @scala.inline
    def setValidation(value: String): Self = this.set("validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidation: Self = this.set("validation", js.undefined)
  }
}
