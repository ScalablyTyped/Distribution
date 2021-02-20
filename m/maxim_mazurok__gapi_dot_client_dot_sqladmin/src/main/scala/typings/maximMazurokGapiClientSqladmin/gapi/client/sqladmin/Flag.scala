package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flag extends StObject {
  
  /** Use this field if only certain integers are accepted. Can be combined with min_value and max_value to add additional values. */
  var allowedIntValues: js.UndefOr[js.Array[String]] = js.native
  
  /** For *STRING* flags, a list of strings that the value can be set to. */
  var allowedStringValues: js.UndefOr[js.Array[String]] = js.native
  
  /** The database version this flag applies to. Can be *MYSQL_8_0*, *MYSQL_5_6*, or *MYSQL_5_7*. */
  var appliesTo: js.UndefOr[js.Array[String]] = js.native
  
  /** Whether or not the flag is considered in beta. */
  var inBeta: js.UndefOr[Boolean] = js.native
  
  /** This is always *sql#flag*. */
  var kind: js.UndefOr[String] = js.native
  
  /** For *INTEGER* flags, the maximum allowed value. */
  var maxValue: js.UndefOr[String] = js.native
  
  /** For *INTEGER* flags, the minimum allowed value. */
  var minValue: js.UndefOr[String] = js.native
  
  /** This is the name of the flag. Flag names always use underscores, not hyphens, for example: *max_allowed_packet* */
  var name: js.UndefOr[String] = js.native
  
  /** Indicates whether changing this flag will trigger a database restart. Only applicable to Second Generation instances. */
  var requiresRestart: js.UndefOr[Boolean] = js.native
  
  /** The type of the flag. Flags are typed to being *BOOLEAN*, *STRING*, *INTEGER* or *NONE*. *NONE* is used for flags which do not take a value, such as *skip_grant_tables*. */
  var `type`: js.UndefOr[String] = js.native
}
object Flag {
  
  @scala.inline
  def apply(): Flag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flag]
  }
  
  @scala.inline
  implicit class FlagMutableBuilder[Self <: Flag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedIntValues(value: js.Array[String]): Self = StObject.set(x, "allowedIntValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedIntValuesUndefined: Self = StObject.set(x, "allowedIntValues", js.undefined)
    
    @scala.inline
    def setAllowedIntValuesVarargs(value: String*): Self = StObject.set(x, "allowedIntValues", js.Array(value :_*))
    
    @scala.inline
    def setAllowedStringValues(value: js.Array[String]): Self = StObject.set(x, "allowedStringValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedStringValuesUndefined: Self = StObject.set(x, "allowedStringValues", js.undefined)
    
    @scala.inline
    def setAllowedStringValuesVarargs(value: String*): Self = StObject.set(x, "allowedStringValues", js.Array(value :_*))
    
    @scala.inline
    def setAppliesTo(value: js.Array[String]): Self = StObject.set(x, "appliesTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliesToUndefined: Self = StObject.set(x, "appliesTo", js.undefined)
    
    @scala.inline
    def setAppliesToVarargs(value: String*): Self = StObject.set(x, "appliesTo", js.Array(value :_*))
    
    @scala.inline
    def setInBeta(value: Boolean): Self = StObject.set(x, "inBeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInBetaUndefined: Self = StObject.set(x, "inBeta", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMaxValue(value: String): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: String): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequiresRestart(value: Boolean): Self = StObject.set(x, "requiresRestart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresRestartUndefined: Self = StObject.set(x, "requiresRestart", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
