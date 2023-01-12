package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://github.com/parse-community/Parse-SDK-JS/pull/1294/files
  * feat: Add option to return raw json from queries
  */
trait RawJSONOptions extends StObject {
  
  /** (3.0.0+) json: Return raw json without converting to Parse.Object */
  var json: js.UndefOr[Boolean] = js.undefined
}
object RawJSONOptions {
  
  inline def apply(): RawJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawJSONOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawJSONOptions] (val x: Self) extends AnyVal {
    
    inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
  }
}
