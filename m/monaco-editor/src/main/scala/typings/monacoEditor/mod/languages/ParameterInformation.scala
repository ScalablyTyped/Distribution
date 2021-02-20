package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IMarkdownString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterInformation extends StObject {
  
  /**
    * The human-readable doc-comment of this signature. Will be shown
    * in the UI but can be omitted.
    */
  var documentation: js.UndefOr[String | IMarkdownString] = js.native
  
  /**
    * The label of this signature. Will be shown in
    * the UI.
    */
  var label: String | (js.Tuple2[Double, Double]) = js.native
}
object ParameterInformation {
  
  @scala.inline
  def apply(label: String | (js.Tuple2[Double, Double])): ParameterInformation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterInformation]
  }
  
  @scala.inline
  implicit class ParameterInformationMutableBuilder[Self <: ParameterInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentation(value: String | IMarkdownString): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setLabel(value: String | (js.Tuple2[Double, Double])): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
