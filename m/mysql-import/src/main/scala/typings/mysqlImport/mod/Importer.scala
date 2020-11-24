package typings.mysqlImport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Importer extends js.Object {
  
  /**
    * Import an .sql file to the database.
    */
  def `import`(filename: String): js.Promise[Unit] = js.native
}
object Importer {
  
  @scala.inline
  def apply(`import`: String => js.Promise[Unit]): Importer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[Importer]
  }
  
  @scala.inline
  implicit class ImporterOps[Self <: Importer] (val x: Self) extends AnyVal {
    
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
    def setImport(value: String => js.Promise[Unit]): Self = this.set("import", js.Any.fromFunction1(value))
  }
}
