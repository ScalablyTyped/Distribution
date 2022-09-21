package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleSequencePark extends StObject {
  
  /**
    * Deletes this park from the title sequence.
    */
  def delete(): Unit
  
  /**
    * The file name of the park.
    */
  var fileName: String
  
  /**
    * Loads this park.
    */
  def load(): Unit
}
object TitleSequencePark {
  
  inline def apply(delete: () => Unit, fileName: String, load: () => Unit): TitleSequencePark = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), fileName = fileName.asInstanceOf[js.Any], load = js.Any.fromFunction0(load))
    __obj.asInstanceOf[TitleSequencePark]
  }
  
  extension [Self <: TitleSequencePark](x: Self) {
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: () => Unit): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
  }
}
