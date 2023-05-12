package typings.postgres.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnInfo extends StObject {
  
  var atttypmod: Double
  
  var key: Double
  
  var name: String
  
  var parser: js.UndefOr[js.Function1[/* raw */ String, Any]] = js.undefined
  
  var `type`: Double
}
object ColumnInfo {
  
  inline def apply(atttypmod: Double, key: Double, name: String, `type`: Double): ColumnInfo = {
    val __obj = js.Dynamic.literal(atttypmod = atttypmod.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnInfo] (val x: Self) extends AnyVal {
    
    inline def setAtttypmod(value: Double): Self = StObject.set(x, "atttypmod", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParser(value: /* raw */ String => Any): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
    
    inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
