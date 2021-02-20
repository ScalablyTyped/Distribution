package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  def openDatabase(
    database_name: String,
    database_version: String,
    database_displayname: String,
    database_size: Double
  ): Database = js.native
  
  var requestFileSystem: js.Any = js.native
}
object Window {
  
  @scala.inline
  def apply(openDatabase: (String, String, String, Double) => Database, requestFileSystem: js.Any): Window = {
    val __obj = js.Dynamic.literal(openDatabase = js.Any.fromFunction4(openDatabase), requestFileSystem = requestFileSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenDatabase(value: (String, String, String, Double) => Database): Self = StObject.set(x, "openDatabase", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRequestFileSystem(value: js.Any): Self = StObject.set(x, "requestFileSystem", value.asInstanceOf[js.Any])
  }
}
