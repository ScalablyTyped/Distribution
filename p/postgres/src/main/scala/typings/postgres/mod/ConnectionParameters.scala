package typings.postgres.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionParameters
  extends StObject
     with /** Other connection parameters */
/* name */ StringDictionary[String] {
  
  /**
    * Default application_name
    * @default 'postgres.js'
    */
  var application_name: String
}
object ConnectionParameters {
  
  inline def apply(application_name: String): ConnectionParameters = {
    val __obj = js.Dynamic.literal(application_name = application_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionParameters] (val x: Self) extends AnyVal {
    
    inline def setApplication_name(value: String): Self = StObject.set(x, "application_name", value.asInstanceOf[js.Any])
  }
}
