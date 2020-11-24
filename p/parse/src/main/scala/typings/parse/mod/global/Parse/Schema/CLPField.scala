package typings.parse.mod.global.Parse.Schema

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The id of a `_User` object or a role name prefixed by `'role:'`.
  * @example
  *  '*': false, // public
  *  requiresAuthentication: false,
  * 'role:Admin': true,
  *  'idOfASpecificUser': true
  */
@js.native
trait CLPField
  extends /** `role:Admin` */
/* userIdOrRoleName */ StringDictionary[js.UndefOr[Boolean]] {
  
  @JSName("*")
  var Asterisk: js.UndefOr[Boolean] = js.native
  
  var requiresAuthentication: js.UndefOr[Boolean] = js.native
}
object CLPField {
  
  @scala.inline
  def apply(): CLPField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CLPField]
  }
  
  @scala.inline
  implicit class CLPFieldOps[Self <: CLPField] (val x: Self) extends AnyVal {
    
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
    def setAsterisk(value: Boolean): Self = this.set("*", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsterisk: Self = this.set("*", js.undefined)
    
    @scala.inline
    def setRequiresAuthentication(value: Boolean): Self = this.set("requiresAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiresAuthentication: Self = this.set("requiresAuthentication", js.undefined)
  }
}
