package typings.mongooseIdValidator.mod

import typings.mongoose.mod.Connection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MongooseIdValidatorOptions extends js.Object {
  
  /* Optional, applies to validation of arrays of ID references only. Set
    * to true if you sometimes have the same object ID reference
    * repeated in an array. If set, the validator will use the
    * total of unique ID references instead of total number of array
    * entries when checking the database.
    *
    * Defaults to false
    */
  var allowDuplicates: js.UndefOr[Boolean] = js.native
  
  /* Optional, mongoose connection object to use if you are
    * using multiple connections in your application.
    *
    * Defaults to built-in mongoose connection if not specified.
    */
  var connection: js.UndefOr[Connection_] = js.native
  
  /* Optional, custom validation message with {PATH} being replaced
    * with the relevant schema path that contains an invalid
    * document ID.
    */
  var message: js.UndefOr[String] = js.native
}
object MongooseIdValidatorOptions {
  
  @scala.inline
  def apply(): MongooseIdValidatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongooseIdValidatorOptions]
  }
  
  @scala.inline
  implicit class MongooseIdValidatorOptionsOps[Self <: MongooseIdValidatorOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowDuplicates(value: Boolean): Self = this.set("allowDuplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDuplicates: Self = this.set("allowDuplicates", js.undefined)
    
    @scala.inline
    def setConnection(value: Connection_): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
