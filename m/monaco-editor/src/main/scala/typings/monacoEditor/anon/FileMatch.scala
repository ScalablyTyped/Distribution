package typings.monacoEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileMatch extends StObject {
  
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
  implicit class FileMatchMutableBuilder[Self <: FileMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileMatch(value: js.Array[String]): Self = StObject.set(x, "fileMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileMatchUndefined: Self = StObject.set(x, "fileMatch", js.undefined)
    
    @scala.inline
    def setFileMatchVarargs(value: String*): Self = StObject.set(x, "fileMatch", js.Array(value :_*))
    
    @scala.inline
    def setSchema(value: js.Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
