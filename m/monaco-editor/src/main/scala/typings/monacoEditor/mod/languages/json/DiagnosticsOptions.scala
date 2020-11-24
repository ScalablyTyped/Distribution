package typings.monacoEditor.mod.languages.json

import typings.monacoEditor.anon.FileMatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagnosticsOptions extends js.Object {
  
  /**
    * If set, comments are tolerated. If set to false, syntax errors will be emitted for comments.
    */
  val allowComments: js.UndefOr[Boolean] = js.native
  
  /**
    *  If set, the schema service would load schema content on-demand with 'fetch' if available
    */
  val enableSchemaRequest: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of known schemas and/or associations of schemas to file names.
    */
  val schemas: js.UndefOr[js.Array[FileMatch]] = js.native
  
  /**
    * If set, the validator will be enabled and perform syntax validation as well as schema based validation.
    */
  val validate: js.UndefOr[Boolean] = js.native
}
object DiagnosticsOptions {
  
  @scala.inline
  def apply(): DiagnosticsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagnosticsOptions]
  }
  
  @scala.inline
  implicit class DiagnosticsOptionsOps[Self <: DiagnosticsOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowComments(value: Boolean): Self = this.set("allowComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowComments: Self = this.set("allowComments", js.undefined)
    
    @scala.inline
    def setEnableSchemaRequest(value: Boolean): Self = this.set("enableSchemaRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSchemaRequest: Self = this.set("enableSchemaRequest", js.undefined)
    
    @scala.inline
    def setSchemasVarargs(value: FileMatch*): Self = this.set("schemas", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[FileMatch]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemas: Self = this.set("schemas", js.undefined)
    
    @scala.inline
    def setValidate(value: Boolean): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
