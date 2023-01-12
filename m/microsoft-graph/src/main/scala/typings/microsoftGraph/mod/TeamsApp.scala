package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsApp
  extends StObject
     with Entity {
  
  // The details for each version of the app.
  var appDefinitions: js.UndefOr[NullableOption[js.Array[TeamsAppDefinition]]] = js.undefined
  
  // The name of the catalog app provided by the app developer in the Microsoft Teams zip app package.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The method of distribution for the app. Read-only.
  var distributionMethod: js.UndefOr[NullableOption[TeamsAppDistributionMethod]] = js.undefined
  
  // The ID of the catalog provided by the app developer in the Microsoft Teams zip app package.
  var externalId: js.UndefOr[NullableOption[String]] = js.undefined
}
object TeamsApp {
  
  inline def apply(): TeamsApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamsApp] (val x: Self) extends AnyVal {
    
    inline def setAppDefinitions(value: NullableOption[js.Array[TeamsAppDefinition]]): Self = StObject.set(x, "appDefinitions", value.asInstanceOf[js.Any])
    
    inline def setAppDefinitionsNull: Self = StObject.set(x, "appDefinitions", null)
    
    inline def setAppDefinitionsUndefined: Self = StObject.set(x, "appDefinitions", js.undefined)
    
    inline def setAppDefinitionsVarargs(value: TeamsAppDefinition*): Self = StObject.set(x, "appDefinitions", js.Array(value*))
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDistributionMethod(value: NullableOption[TeamsAppDistributionMethod]): Self = StObject.set(x, "distributionMethod", value.asInstanceOf[js.Any])
    
    inline def setDistributionMethodNull: Self = StObject.set(x, "distributionMethod", null)
    
    inline def setDistributionMethodUndefined: Self = StObject.set(x, "distributionMethod", js.undefined)
    
    inline def setExternalId(value: NullableOption[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
  }
}
