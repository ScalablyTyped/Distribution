package typings.nodeIsbn.anon

import typings.nodeIsbn.nodeIsbnStrings.google
import typings.nodeIsbn.nodeIsbnStrings.isbndb
import typings.nodeIsbn.nodeIsbnStrings.openlibrary
import typings.nodeIsbn.nodeIsbnStrings.worldcat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GOOGLE extends js.Object {
  
  var GOOGLE: google = js.native
  
  var ISBNDB: isbndb = js.native
  
  var OPENLIBRARY: openlibrary = js.native
  
  var WORLDCAT: worldcat = js.native
}
object GOOGLE {
  
  @scala.inline
  def apply(GOOGLE: google, ISBNDB: isbndb, OPENLIBRARY: openlibrary, WORLDCAT: worldcat): GOOGLE = {
    val __obj = js.Dynamic.literal(GOOGLE = GOOGLE.asInstanceOf[js.Any], ISBNDB = ISBNDB.asInstanceOf[js.Any], OPENLIBRARY = OPENLIBRARY.asInstanceOf[js.Any], WORLDCAT = WORLDCAT.asInstanceOf[js.Any])
    __obj.asInstanceOf[GOOGLE]
  }
  
  @scala.inline
  implicit class GOOGLEOps[Self <: GOOGLE] (val x: Self) extends AnyVal {
    
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
    def setGOOGLE(value: google): Self = this.set("GOOGLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setISBNDB(value: isbndb): Self = this.set("ISBNDB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOPENLIBRARY(value: openlibrary): Self = this.set("OPENLIBRARY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWORLDCAT(value: worldcat): Self = this.set("WORLDCAT", value.asInstanceOf[js.Any])
  }
}
