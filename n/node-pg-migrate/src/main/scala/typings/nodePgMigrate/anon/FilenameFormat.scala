package typings.nodePgMigrate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilenameFormat extends StObject {
  
  var filenameFormat: js.UndefOr[typings.nodePgMigrate.migrationMod.FilenameFormat] = js.native
}
object FilenameFormat {
  
  @scala.inline
  def apply(): FilenameFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilenameFormat]
  }
  
  @scala.inline
  implicit class FilenameFormatMutableBuilder[Self <: FilenameFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilenameFormat(value: typings.nodePgMigrate.migrationMod.FilenameFormat): Self = StObject.set(x, "filenameFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameFormatUndefined: Self = StObject.set(x, "filenameFormat", js.undefined)
  }
}
