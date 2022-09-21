package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackageAutomaticRequestSettings extends StObject {
  
  var gracePeriodBeforeAccessRemoval: js.UndefOr[NullableOption[String]] = js.undefined
  
  var removeAccessWhenTargetLeavesAllowedTargets: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If set to true, automatic assignments will be created for targets in the allowed target scope.
  var requestAccessForAllowedTargets: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object AccessPackageAutomaticRequestSettings {
  
  inline def apply(): AccessPackageAutomaticRequestSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackageAutomaticRequestSettings]
  }
  
  extension [Self <: AccessPackageAutomaticRequestSettings](x: Self) {
    
    inline def setGracePeriodBeforeAccessRemoval(value: NullableOption[String]): Self = StObject.set(x, "gracePeriodBeforeAccessRemoval", value.asInstanceOf[js.Any])
    
    inline def setGracePeriodBeforeAccessRemovalNull: Self = StObject.set(x, "gracePeriodBeforeAccessRemoval", null)
    
    inline def setGracePeriodBeforeAccessRemovalUndefined: Self = StObject.set(x, "gracePeriodBeforeAccessRemoval", js.undefined)
    
    inline def setRemoveAccessWhenTargetLeavesAllowedTargets(value: NullableOption[Boolean]): Self = StObject.set(x, "removeAccessWhenTargetLeavesAllowedTargets", value.asInstanceOf[js.Any])
    
    inline def setRemoveAccessWhenTargetLeavesAllowedTargetsNull: Self = StObject.set(x, "removeAccessWhenTargetLeavesAllowedTargets", null)
    
    inline def setRemoveAccessWhenTargetLeavesAllowedTargetsUndefined: Self = StObject.set(x, "removeAccessWhenTargetLeavesAllowedTargets", js.undefined)
    
    inline def setRequestAccessForAllowedTargets(value: NullableOption[Boolean]): Self = StObject.set(x, "requestAccessForAllowedTargets", value.asInstanceOf[js.Any])
    
    inline def setRequestAccessForAllowedTargetsNull: Self = StObject.set(x, "requestAccessForAllowedTargets", null)
    
    inline def setRequestAccessForAllowedTargetsUndefined: Self = StObject.set(x, "requestAccessForAllowedTargets", js.undefined)
  }
}
