package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  def openDatabase(
    database_name: String,
    database_version: String,
    database_displayname: String,
    database_size: Double
  ): Database
  
  var requestFileSystem: Any
}
object Window {
  
  inline def apply(openDatabase: (String, String, String, Double) => Database, requestFileSystem: Any): Window = {
    val __obj = js.Dynamic.literal(openDatabase = js.Any.fromFunction4(openDatabase), requestFileSystem = requestFileSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setOpenDatabase(value: (String, String, String, Double) => Database): Self = StObject.set(x, "openDatabase", js.Any.fromFunction4(value))
    
    inline def setRequestFileSystem(value: Any): Self = StObject.set(x, "requestFileSystem", value.asInstanceOf[js.Any])
  }
}
