package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugOnly extends StObject {
  
  var debugOnly: js.UndefOr[Boolean] = js.undefined
  
  var documentation: js.UndefOr[String] = js.undefined
  
  var git: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var prodOnly: js.UndefOr[Boolean] = js.undefined
  
  var summary: js.UndefOr[String] = js.undefined
  
  var testOnly: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object DebugOnly {
  
  inline def apply(): DebugOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugOnly]
  }
  
  extension [Self <: DebugOnly](x: Self) {
    
    inline def setDebugOnly(value: Boolean): Self = StObject.set(x, "debugOnly", value.asInstanceOf[js.Any])
    
    inline def setDebugOnlyUndefined: Self = StObject.set(x, "debugOnly", js.undefined)
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setGit(value: String): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
    
    inline def setGitUndefined: Self = StObject.set(x, "git", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProdOnly(value: Boolean): Self = StObject.set(x, "prodOnly", value.asInstanceOf[js.Any])
    
    inline def setProdOnlyUndefined: Self = StObject.set(x, "prodOnly", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setTestOnly(value: Boolean): Self = StObject.set(x, "testOnly", value.asInstanceOf[js.Any])
    
    inline def setTestOnlyUndefined: Self = StObject.set(x, "testOnly", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
