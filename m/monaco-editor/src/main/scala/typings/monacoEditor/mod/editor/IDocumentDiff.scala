package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDocumentDiff extends StObject {
  
  /**
    * Maps all modified line ranges in the original to the corresponding line ranges in the modified text model.
    */
  val changes: js.Array[LineRangeMapping]
  
  /**
    * If true, both text models are identical (byte-wise).
    */
  val identical: Boolean
  
  /**
    * If true, the diff computation timed out and the diff might not be accurate.
    */
  val quitEarly: Boolean
}
object IDocumentDiff {
  
  inline def apply(changes: js.Array[LineRangeMapping], identical: Boolean, quitEarly: Boolean): IDocumentDiff = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], identical = identical.asInstanceOf[js.Any], quitEarly = quitEarly.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentDiff]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDocumentDiff] (val x: Self) extends AnyVal {
    
    inline def setChanges(value: js.Array[LineRangeMapping]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: LineRangeMapping*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setIdentical(value: Boolean): Self = StObject.set(x, "identical", value.asInstanceOf[js.Any])
    
    inline def setQuitEarly(value: Boolean): Self = StObject.set(x, "quitEarly", value.asInstanceOf[js.Any])
  }
}
