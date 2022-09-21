package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppScope
  extends StObject
     with Entity {
  
  /**
    * Provides the display name of the app-specific resource represented by the app scope. Provided for display purposes
    * since appScopeId is often an immutable, non-human-readable id. Read-only.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Describes the type of app-specific resource represented by the app scope. Provided for display purposes, so a user
    * interface can convey to the user the kind of app specific resource represented by the app scope. Read-only.
    */
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
}
object AppScope {
  
  inline def apply(): AppScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppScope]
  }
  
  extension [Self <: AppScope](x: Self) {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
