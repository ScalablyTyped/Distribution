package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IGotoLocationOptions>> */
@js.native
trait GoToLocationOptions extends js.Object {
  val alternativeDeclarationCommand: String = js.native
  val alternativeDefinitionCommand: String = js.native
  val alternativeImplementationCommand: String = js.native
  val alternativeReferenceCommand: String = js.native
  val alternativeTypeDefinitionCommand: String = js.native
  val multiple: GoToLocationValues = js.native
  val multipleDeclarations: GoToLocationValues = js.native
  val multipleDefinitions: GoToLocationValues = js.native
  val multipleImplementations: GoToLocationValues = js.native
  val multipleReferences: GoToLocationValues = js.native
  val multipleTypeDefinitions: GoToLocationValues = js.native
}

object GoToLocationOptions {
  @scala.inline
  def apply(
    alternativeDeclarationCommand: String,
    alternativeDefinitionCommand: String,
    alternativeImplementationCommand: String,
    alternativeReferenceCommand: String,
    alternativeTypeDefinitionCommand: String,
    multiple: GoToLocationValues,
    multipleDeclarations: GoToLocationValues,
    multipleDefinitions: GoToLocationValues,
    multipleImplementations: GoToLocationValues,
    multipleReferences: GoToLocationValues,
    multipleTypeDefinitions: GoToLocationValues
  ): GoToLocationOptions = {
    val __obj = js.Dynamic.literal(alternativeDeclarationCommand = alternativeDeclarationCommand.asInstanceOf[js.Any], alternativeDefinitionCommand = alternativeDefinitionCommand.asInstanceOf[js.Any], alternativeImplementationCommand = alternativeImplementationCommand.asInstanceOf[js.Any], alternativeReferenceCommand = alternativeReferenceCommand.asInstanceOf[js.Any], alternativeTypeDefinitionCommand = alternativeTypeDefinitionCommand.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], multipleDeclarations = multipleDeclarations.asInstanceOf[js.Any], multipleDefinitions = multipleDefinitions.asInstanceOf[js.Any], multipleImplementations = multipleImplementations.asInstanceOf[js.Any], multipleReferences = multipleReferences.asInstanceOf[js.Any], multipleTypeDefinitions = multipleTypeDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoToLocationOptions]
  }
  @scala.inline
  implicit class GoToLocationOptionsOps[Self <: GoToLocationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlternativeDeclarationCommand(value: String): Self = this.set("alternativeDeclarationCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlternativeDefinitionCommand(value: String): Self = this.set("alternativeDefinitionCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlternativeImplementationCommand(value: String): Self = this.set("alternativeImplementationCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlternativeReferenceCommand(value: String): Self = this.set("alternativeReferenceCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlternativeTypeDefinitionCommand(value: String): Self = this.set("alternativeTypeDefinitionCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiple(value: GoToLocationValues): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultipleDeclarations(value: GoToLocationValues): Self = this.set("multipleDeclarations", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultipleDefinitions(value: GoToLocationValues): Self = this.set("multipleDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultipleImplementations(value: GoToLocationValues): Self = this.set("multipleImplementations", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultipleReferences(value: GoToLocationValues): Self = this.set("multipleReferences", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultipleTypeDefinitions(value: GoToLocationValues): Self = this.set("multipleTypeDefinitions", value.asInstanceOf[js.Any])
  }
  
}

