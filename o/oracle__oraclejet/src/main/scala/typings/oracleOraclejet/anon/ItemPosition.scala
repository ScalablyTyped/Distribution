package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.after
import typings.oracleOraclejet.oracleOraclejetStrings.before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemPosition
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var item: typings.std.Element
  
  var position: before | after
  
  var reference: typings.std.Element
}
object ItemPosition {
  
  inline def apply(item: typings.std.Element, position: before | after, reference: typings.std.Element): ItemPosition = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemPosition]
  }
  
  extension [Self <: ItemPosition](x: Self) {
    
    inline def setItem(value: typings.std.Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: before | after): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setReference(value: typings.std.Element): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
