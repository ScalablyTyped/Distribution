package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDiffLineInformation extends StObject {
  
  val equivalentLineNumber: Double
}
object IDiffLineInformation {
  
  inline def apply(equivalentLineNumber: Double): IDiffLineInformation = {
    val __obj = js.Dynamic.literal(equivalentLineNumber = equivalentLineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDiffLineInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDiffLineInformation] (val x: Self) extends AnyVal {
    
    inline def setEquivalentLineNumber(value: Double): Self = StObject.set(x, "equivalentLineNumber", value.asInstanceOf[js.Any])
  }
}
