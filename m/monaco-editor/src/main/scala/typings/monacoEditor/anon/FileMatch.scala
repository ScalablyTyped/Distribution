package typings.monacoEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileMatch extends js.Object {
  
  /**
    * A list of file names that are associated to the schema. The '*' wildcard can be used. For example '*.schema.json', 'package.json'
    */
  val fileMatch: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The schema for the given URI.
    */
  val schema: js.UndefOr[js.Any] = js.native
  
  /**
    * The URI of the schema, which is also the identifier of the schema.
    */
  val uri: String = js.native
}
object FileMatch {
  
  @scala.inline
  def apply(uri: String): FileMatch = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileMatch]
  }
  
  @scala.inline
  implicit class FileMatchOps[Self <: FileMatch] (val x: Self) extends AnyVal {
    
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
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileMatchVarargs(value: String*): Self = this.set("fileMatch", js.Array(value :_*))
    
    @scala.inline
    def setFileMatch(value: js.Array[String]): Self = this.set("fileMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileMatch: Self = this.set("fileMatch", js.undefined)
    
    @scala.inline
    def setSchema(value: js.Any): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
}
