package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDocumentDiffProviderOptions extends StObject {
  
  /**
    * When set to true, the diff should ignore whitespace changes.i
    */
  var ignoreTrimWhitespace: Boolean
  
  /**
    * A diff computation should throw if it takes longer than this value.
    */
  var maxComputationTimeMs: Double
}
object IDocumentDiffProviderOptions {
  
  inline def apply(ignoreTrimWhitespace: Boolean, maxComputationTimeMs: Double): IDocumentDiffProviderOptions = {
    val __obj = js.Dynamic.literal(ignoreTrimWhitespace = ignoreTrimWhitespace.asInstanceOf[js.Any], maxComputationTimeMs = maxComputationTimeMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentDiffProviderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDocumentDiffProviderOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreTrimWhitespace(value: Boolean): Self = StObject.set(x, "ignoreTrimWhitespace", value.asInstanceOf[js.Any])
    
    inline def setMaxComputationTimeMs(value: Double): Self = StObject.set(x, "maxComputationTimeMs", value.asInstanceOf[js.Any])
  }
}
