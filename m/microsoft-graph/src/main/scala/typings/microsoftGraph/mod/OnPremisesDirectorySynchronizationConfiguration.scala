package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPremisesDirectorySynchronizationConfiguration extends StObject {
  
  // Contains the accidental deletion prevention configuration for a tenant.
  var accidentalDeletionPrevention: js.UndefOr[NullableOption[OnPremisesAccidentalDeletionPrevention]] = js.undefined
}
object OnPremisesDirectorySynchronizationConfiguration {
  
  inline def apply(): OnPremisesDirectorySynchronizationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPremisesDirectorySynchronizationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnPremisesDirectorySynchronizationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAccidentalDeletionPrevention(value: NullableOption[OnPremisesAccidentalDeletionPrevention]): Self = StObject.set(x, "accidentalDeletionPrevention", value.asInstanceOf[js.Any])
    
    inline def setAccidentalDeletionPreventionNull: Self = StObject.set(x, "accidentalDeletionPrevention", null)
    
    inline def setAccidentalDeletionPreventionUndefined: Self = StObject.set(x, "accidentalDeletionPrevention", js.undefined)
  }
}
