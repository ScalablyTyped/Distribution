package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGotoLocationOptions extends js.Object {
  var alternativeDeclarationCommand: js.UndefOr[String] = js.undefined
  var alternativeDefinitionCommand: js.UndefOr[String] = js.undefined
  var alternativeImplementationCommand: js.UndefOr[String] = js.undefined
  var alternativeReferenceCommand: js.UndefOr[String] = js.undefined
  var alternativeTypeDefinitionCommand: js.UndefOr[String] = js.undefined
  var multiple: js.UndefOr[GoToLocationValues] = js.undefined
  var multipleDeclarations: js.UndefOr[GoToLocationValues] = js.undefined
  var multipleDefinitions: js.UndefOr[GoToLocationValues] = js.undefined
  var multipleImplementations: js.UndefOr[GoToLocationValues] = js.undefined
  var multipleReferences: js.UndefOr[GoToLocationValues] = js.undefined
  var multipleTypeDefinitions: js.UndefOr[GoToLocationValues] = js.undefined
}

object IGotoLocationOptions {
  @scala.inline
  def apply(
    alternativeDeclarationCommand: String = null,
    alternativeDefinitionCommand: String = null,
    alternativeImplementationCommand: String = null,
    alternativeReferenceCommand: String = null,
    alternativeTypeDefinitionCommand: String = null,
    multiple: GoToLocationValues = null,
    multipleDeclarations: GoToLocationValues = null,
    multipleDefinitions: GoToLocationValues = null,
    multipleImplementations: GoToLocationValues = null,
    multipleReferences: GoToLocationValues = null,
    multipleTypeDefinitions: GoToLocationValues = null
  ): IGotoLocationOptions = {
    val __obj = js.Dynamic.literal()
    if (alternativeDeclarationCommand != null) __obj.updateDynamic("alternativeDeclarationCommand")(alternativeDeclarationCommand.asInstanceOf[js.Any])
    if (alternativeDefinitionCommand != null) __obj.updateDynamic("alternativeDefinitionCommand")(alternativeDefinitionCommand.asInstanceOf[js.Any])
    if (alternativeImplementationCommand != null) __obj.updateDynamic("alternativeImplementationCommand")(alternativeImplementationCommand.asInstanceOf[js.Any])
    if (alternativeReferenceCommand != null) __obj.updateDynamic("alternativeReferenceCommand")(alternativeReferenceCommand.asInstanceOf[js.Any])
    if (alternativeTypeDefinitionCommand != null) __obj.updateDynamic("alternativeTypeDefinitionCommand")(alternativeTypeDefinitionCommand.asInstanceOf[js.Any])
    if (multiple != null) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (multipleDeclarations != null) __obj.updateDynamic("multipleDeclarations")(multipleDeclarations.asInstanceOf[js.Any])
    if (multipleDefinitions != null) __obj.updateDynamic("multipleDefinitions")(multipleDefinitions.asInstanceOf[js.Any])
    if (multipleImplementations != null) __obj.updateDynamic("multipleImplementations")(multipleImplementations.asInstanceOf[js.Any])
    if (multipleReferences != null) __obj.updateDynamic("multipleReferences")(multipleReferences.asInstanceOf[js.Any])
    if (multipleTypeDefinitions != null) __obj.updateDynamic("multipleTypeDefinitions")(multipleTypeDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGotoLocationOptions]
  }
}

