package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsApp extends Entity {
  
  // The details for each version of the app.
  var appDefinitions: js.UndefOr[NullableOption[js.Array[TeamsAppDefinition]]] = js.native
  
  // The name of the catalog app provided by the app developer in the Microsoft Teams zip app package.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The method of distribution for the app. Read-only.
  var distributionMethod: js.UndefOr[NullableOption[TeamsAppDistributionMethod]] = js.native
  
  // The ID of the catalog provided by the app developer in the Microsoft Teams zip app package.
  var externalId: js.UndefOr[NullableOption[String]] = js.native
}
object TeamsApp {
  
  @scala.inline
  def apply(): TeamsApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsApp]
  }
  
  @scala.inline
  implicit class TeamsAppMutableBuilder[Self <: TeamsApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppDefinitions(value: NullableOption[js.Array[TeamsAppDefinition]]): Self = StObject.set(x, "appDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppDefinitionsNull: Self = StObject.set(x, "appDefinitions", null)
    
    @scala.inline
    def setAppDefinitionsUndefined: Self = StObject.set(x, "appDefinitions", js.undefined)
    
    @scala.inline
    def setAppDefinitionsVarargs(value: TeamsAppDefinition*): Self = StObject.set(x, "appDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setDistributionMethod(value: NullableOption[TeamsAppDistributionMethod]): Self = StObject.set(x, "distributionMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionMethodNull: Self = StObject.set(x, "distributionMethod", null)
    
    @scala.inline
    def setDistributionMethodUndefined: Self = StObject.set(x, "distributionMethod", js.undefined)
    
    @scala.inline
    def setExternalId(value: NullableOption[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
  }
}
