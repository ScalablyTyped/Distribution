package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowmergecommit
import typings.octokitTypes.anon.Autotriggerchecks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChecksSetSuitesPreferencesResponseData extends StObject {
  
  var preferences: Autotriggerchecks
  
  var repository: Allowmergecommit
}
object ChecksSetSuitesPreferencesResponseData {
  
  @scala.inline
  def apply(preferences: Autotriggerchecks, repository: Allowmergecommit): ChecksSetSuitesPreferencesResponseData = {
    val __obj = js.Dynamic.literal(preferences = preferences.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksSetSuitesPreferencesResponseData]
  }
  
  @scala.inline
  implicit class ChecksSetSuitesPreferencesResponseDataMutableBuilder[Self <: ChecksSetSuitesPreferencesResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreferences(value: Autotriggerchecks): Self = StObject.set(x, "preferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: Allowmergecommit): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
