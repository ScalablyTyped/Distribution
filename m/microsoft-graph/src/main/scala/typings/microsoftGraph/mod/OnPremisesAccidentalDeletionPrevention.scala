package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPremisesAccidentalDeletionPrevention extends StObject {
  
  /**
    * Threshold value which triggers accidental deletion prevention. The threshold is either an absolute number of objects or
    * a percentage number of objects.
    */
  var alertThreshold: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * The status of the accidental deletion prevention feature. The possible values are: disabled, enabledForCount,
    * enabledForPercentage, unknownFutureValue.
    */
  var synchronizationPreventionType: js.UndefOr[NullableOption[OnPremisesDirectorySynchronizationDeletionPreventionType]] = js.undefined
}
object OnPremisesAccidentalDeletionPrevention {
  
  inline def apply(): OnPremisesAccidentalDeletionPrevention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPremisesAccidentalDeletionPrevention]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnPremisesAccidentalDeletionPrevention] (val x: Self) extends AnyVal {
    
    inline def setAlertThreshold(value: NullableOption[Double]): Self = StObject.set(x, "alertThreshold", value.asInstanceOf[js.Any])
    
    inline def setAlertThresholdNull: Self = StObject.set(x, "alertThreshold", null)
    
    inline def setAlertThresholdUndefined: Self = StObject.set(x, "alertThreshold", js.undefined)
    
    inline def setSynchronizationPreventionType(value: NullableOption[OnPremisesDirectorySynchronizationDeletionPreventionType]): Self = StObject.set(x, "synchronizationPreventionType", value.asInstanceOf[js.Any])
    
    inline def setSynchronizationPreventionTypeNull: Self = StObject.set(x, "synchronizationPreventionType", null)
    
    inline def setSynchronizationPreventionTypeUndefined: Self = StObject.set(x, "synchronizationPreventionType", js.undefined)
  }
}
