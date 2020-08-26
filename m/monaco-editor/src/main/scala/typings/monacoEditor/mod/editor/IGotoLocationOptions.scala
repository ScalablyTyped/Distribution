package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGotoLocationOptions extends js.Object {
  var alternativeDeclarationCommand: js.UndefOr[String] = js.native
  var alternativeDefinitionCommand: js.UndefOr[String] = js.native
  var alternativeImplementationCommand: js.UndefOr[String] = js.native
  var alternativeReferenceCommand: js.UndefOr[String] = js.native
  var alternativeTypeDefinitionCommand: js.UndefOr[String] = js.native
  var multiple: js.UndefOr[GoToLocationValues] = js.native
  var multipleDeclarations: js.UndefOr[GoToLocationValues] = js.native
  var multipleDefinitions: js.UndefOr[GoToLocationValues] = js.native
  var multipleImplementations: js.UndefOr[GoToLocationValues] = js.native
  var multipleReferences: js.UndefOr[GoToLocationValues] = js.native
  var multipleTypeDefinitions: js.UndefOr[GoToLocationValues] = js.native
}

object IGotoLocationOptions {
  @scala.inline
  def apply(): IGotoLocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGotoLocationOptions]
  }
  @scala.inline
  implicit class IGotoLocationOptionsOps[Self <: IGotoLocationOptions] (val x: Self) extends AnyVal {
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
    def deleteAlternativeDeclarationCommand: Self = this.set("alternativeDeclarationCommand", js.undefined)
    @scala.inline
    def setAlternativeDefinitionCommand(value: String): Self = this.set("alternativeDefinitionCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternativeDefinitionCommand: Self = this.set("alternativeDefinitionCommand", js.undefined)
    @scala.inline
    def setAlternativeImplementationCommand(value: String): Self = this.set("alternativeImplementationCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternativeImplementationCommand: Self = this.set("alternativeImplementationCommand", js.undefined)
    @scala.inline
    def setAlternativeReferenceCommand(value: String): Self = this.set("alternativeReferenceCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternativeReferenceCommand: Self = this.set("alternativeReferenceCommand", js.undefined)
    @scala.inline
    def setAlternativeTypeDefinitionCommand(value: String): Self = this.set("alternativeTypeDefinitionCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternativeTypeDefinitionCommand: Self = this.set("alternativeTypeDefinitionCommand", js.undefined)
    @scala.inline
    def setMultiple(value: GoToLocationValues): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setMultipleDeclarations(value: GoToLocationValues): Self = this.set("multipleDeclarations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleDeclarations: Self = this.set("multipleDeclarations", js.undefined)
    @scala.inline
    def setMultipleDefinitions(value: GoToLocationValues): Self = this.set("multipleDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleDefinitions: Self = this.set("multipleDefinitions", js.undefined)
    @scala.inline
    def setMultipleImplementations(value: GoToLocationValues): Self = this.set("multipleImplementations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleImplementations: Self = this.set("multipleImplementations", js.undefined)
    @scala.inline
    def setMultipleReferences(value: GoToLocationValues): Self = this.set("multipleReferences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleReferences: Self = this.set("multipleReferences", js.undefined)
    @scala.inline
    def setMultipleTypeDefinitions(value: GoToLocationValues): Self = this.set("multipleTypeDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleTypeDefinitions: Self = this.set("multipleTypeDefinitions", js.undefined)
  }
  
}

