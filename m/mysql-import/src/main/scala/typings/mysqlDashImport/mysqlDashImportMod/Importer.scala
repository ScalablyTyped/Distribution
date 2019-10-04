package typings.mysqlDashImport.mysqlDashImportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Importer extends js.Object {
  /**
    * Import an .sql file to the database.
    */
  def `import`(filename: String): js.Promise[Unit]
}

object Importer {
  @scala.inline
  def apply(`import`: String => js.Promise[Unit]): Importer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[Importer]
  }
}

