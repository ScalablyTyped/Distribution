package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorCommentsOptions extends StObject {
  
  /**
    * Ignore empty lines when inserting line comments.
    * Defaults to true.
    */
  var ignoreEmptyLines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Insert a space after the line comment token and inside the block comments tokens.
    * Defaults to true.
    */
  var insertSpace: js.UndefOr[Boolean] = js.undefined
}
object IEditorCommentsOptions {
  
  inline def apply(): IEditorCommentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorCommentsOptions]
  }
  
  extension [Self <: IEditorCommentsOptions](x: Self) {
    
    inline def setIgnoreEmptyLines(value: Boolean): Self = StObject.set(x, "ignoreEmptyLines", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEmptyLinesUndefined: Self = StObject.set(x, "ignoreEmptyLines", js.undefined)
    
    inline def setInsertSpace(value: Boolean): Self = StObject.set(x, "insertSpace", value.asInstanceOf[js.Any])
    
    inline def setInsertSpaceUndefined: Self = StObject.set(x, "insertSpace", js.undefined)
  }
}
