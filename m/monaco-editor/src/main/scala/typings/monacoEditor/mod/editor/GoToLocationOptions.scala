package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IGotoLocationOptions>> */
trait GoToLocationOptions extends js.Object {
  val alternativeDeclarationCommand: String
  val alternativeDefinitionCommand: String
  val alternativeImplementationCommand: String
  val alternativeReferenceCommand: String
  val alternativeTypeDefinitionCommand: String
  val multiple: GoToLocationValues
  val multipleDeclarations: GoToLocationValues
  val multipleDefinitions: GoToLocationValues
  val multipleImplementations: GoToLocationValues
  val multipleReferences: GoToLocationValues
  val multipleTypeDefinitions: GoToLocationValues
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
}

