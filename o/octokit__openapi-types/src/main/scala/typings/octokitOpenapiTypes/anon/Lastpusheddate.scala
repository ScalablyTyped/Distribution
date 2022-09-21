package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lastpusheddate extends StObject {
  
  /** @example 2021-11-03 */
  var last_pushed_date: String
  
  var user_login: String
}
object Lastpusheddate {
  
  inline def apply(last_pushed_date: String, user_login: String): Lastpusheddate = {
    val __obj = js.Dynamic.literal(last_pushed_date = last_pushed_date.asInstanceOf[js.Any], user_login = user_login.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lastpusheddate]
  }
  
  extension [Self <: Lastpusheddate](x: Self) {
    
    inline def setLast_pushed_date(value: String): Self = StObject.set(x, "last_pushed_date", value.asInstanceOf[js.Any])
    
    inline def setUser_login(value: String): Self = StObject.set(x, "user_login", value.asInstanceOf[js.Any])
  }
}
