package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.constant
import typings.plotlyJs.plotlyJsStrings.percent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.plotlyJs.anon.typeconstantpercentvaluen
  - typings.plotlyJs.anon.typedataarrayArrayDatumar
*/
trait ErrorBar extends StObject
object ErrorBar {
  
  inline def typeconstantpercentvaluen(`type`: constant | percent, value: Double): typings.plotlyJs.anon.typeconstantpercentvaluen = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.plotlyJs.anon.typeconstantpercentvaluen]
  }
  
  inline def typedataarrayArrayDatumar(array: js.Array[Datum]): typings.plotlyJs.anon.typedataarrayArrayDatumar = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("data")
    __obj.asInstanceOf[typings.plotlyJs.anon.typedataarrayArrayDatumar]
  }
}
