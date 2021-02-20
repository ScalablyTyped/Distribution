package typings.prettierLinterHelpers

import typings.prettierLinterHelpers.prettierLinterHelpersStrings.delete
import typings.prettierLinterHelpers.prettierLinterHelpersStrings.insert
import typings.prettierLinterHelpers.prettierLinterHelpersStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prettier-linter-helpers", "generateDifferences")
  @js.native
  val generateDifferences: GenerateDifferences_ = js.native
  
  @JSImport("prettier-linter-helpers", "showInvisibles")
  @js.native
  def showInvisibles(str: String): String = js.native
  
  @js.native
  trait Difference extends StObject {
    
    var deleteText: js.UndefOr[String] = js.native
    
    var insertText: js.UndefOr[String] = js.native
    
    var offset: Double = js.native
    
    var operation: insert | delete | replace = js.native
  }
  object Difference {
    
    @scala.inline
    def apply(offset: Double, operation: insert | delete | replace): Difference = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Difference]
    }
    
    @scala.inline
    implicit class DifferenceMutableBuilder[Self <: Difference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteText(value: String): Self = StObject.set(x, "deleteText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteTextUndefined: Self = StObject.set(x, "deleteText", js.undefined)
      
      @scala.inline
      def setInsertText(value: String): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperation(value: insert | delete | replace): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GenerateDifferences_ extends StObject {
    
    /**
      * Generate results for differences between source code and formatted version.
      *
      * @param source - The original source.
      * @param prettierSource - The Prettier formatted source.
      * @returns An array containing { operation, offset, insertText, deleteText }
      */
    def apply(source: String, prettierSource: String): js.Array[Difference] = js.native
    
    var DELETE: delete = js.native
    
    var INSERT: insert = js.native
    
    var REPLACE: replace = js.native
  }
}
