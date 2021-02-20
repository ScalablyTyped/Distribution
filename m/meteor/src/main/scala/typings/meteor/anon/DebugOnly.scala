package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugOnly extends StObject {
  
  var debugOnly: js.UndefOr[Boolean] = js.native
  
  var documentation: js.UndefOr[String] = js.native
  
  var git: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var prodOnly: js.UndefOr[Boolean] = js.native
  
  var summary: js.UndefOr[String] = js.native
  
  var testOnly: js.UndefOr[Boolean] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object DebugOnly {
  
  @scala.inline
  def apply(): DebugOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugOnly]
  }
  
  @scala.inline
  implicit class DebugOnlyMutableBuilder[Self <: DebugOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebugOnly(value: Boolean): Self = StObject.set(x, "debugOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugOnlyUndefined: Self = StObject.set(x, "debugOnly", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setGit(value: String): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitUndefined: Self = StObject.set(x, "git", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProdOnly(value: Boolean): Self = StObject.set(x, "prodOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProdOnlyUndefined: Self = StObject.set(x, "prodOnly", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setTestOnly(value: Boolean): Self = StObject.set(x, "testOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestOnlyUndefined: Self = StObject.set(x, "testOnly", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
