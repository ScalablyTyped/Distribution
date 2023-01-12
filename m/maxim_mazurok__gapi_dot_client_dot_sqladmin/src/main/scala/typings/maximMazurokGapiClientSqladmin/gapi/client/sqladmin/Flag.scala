package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flag extends StObject {
  
  /** Use this field if only certain integers are accepted. Can be combined with min_value and max_value to add additional values. */
  var allowedIntValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /** For `STRING` flags, a list of strings that the value can be set to. */
  var allowedStringValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The database version this flag applies to. Can be MySQL instances: `MYSQL_8_0`, `MYSQL_8_0_18`, `MYSQL_8_0_26`, `MYSQL_5_7`, or `MYSQL_5_6`. PostgreSQL instances: `POSTGRES_9_6`,
    * `POSTGRES_10`, `POSTGRES_11` or `POSTGRES_12`. SQL Server instances: `SQLSERVER_2017_STANDARD`, `SQLSERVER_2017_ENTERPRISE`, `SQLSERVER_2017_EXPRESS`, `SQLSERVER_2017_WEB`,
    * `SQLSERVER_2019_STANDARD`, `SQLSERVER_2019_ENTERPRISE`, `SQLSERVER_2019_EXPRESS`, or `SQLSERVER_2019_WEB`. See [the complete
    * list](/sql/docs/mysql/admin-api/rest/v1/SqlDatabaseVersion).
    */
  var appliesTo: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether or not the flag is considered in beta. */
  var inBeta: js.UndefOr[Boolean] = js.undefined
  
  /** This is always `sql#flag`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** For `INTEGER` flags, the maximum allowed value. */
  var maxValue: js.UndefOr[String] = js.undefined
  
  /** For `INTEGER` flags, the minimum allowed value. */
  var minValue: js.UndefOr[String] = js.undefined
  
  /** This is the name of the flag. Flag names always use underscores, not hyphens, for example: `max_allowed_packet` */
  var name: js.UndefOr[String] = js.undefined
  
  /** Indicates whether changing this flag will trigger a database restart. Only applicable to Second Generation instances. */
  var requiresRestart: js.UndefOr[Boolean] = js.undefined
  
  /** The type of the flag. Flags are typed to being `BOOLEAN`, `STRING`, `INTEGER` or `NONE`. `NONE` is used for flags that do not take a value, such as `skip_grant_tables`. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Flag {
  
  inline def apply(): Flag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Flag] (val x: Self) extends AnyVal {
    
    inline def setAllowedIntValues(value: js.Array[String]): Self = StObject.set(x, "allowedIntValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedIntValuesUndefined: Self = StObject.set(x, "allowedIntValues", js.undefined)
    
    inline def setAllowedIntValuesVarargs(value: String*): Self = StObject.set(x, "allowedIntValues", js.Array(value*))
    
    inline def setAllowedStringValues(value: js.Array[String]): Self = StObject.set(x, "allowedStringValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedStringValuesUndefined: Self = StObject.set(x, "allowedStringValues", js.undefined)
    
    inline def setAllowedStringValuesVarargs(value: String*): Self = StObject.set(x, "allowedStringValues", js.Array(value*))
    
    inline def setAppliesTo(value: js.Array[String]): Self = StObject.set(x, "appliesTo", value.asInstanceOf[js.Any])
    
    inline def setAppliesToUndefined: Self = StObject.set(x, "appliesTo", js.undefined)
    
    inline def setAppliesToVarargs(value: String*): Self = StObject.set(x, "appliesTo", js.Array(value*))
    
    inline def setInBeta(value: Boolean): Self = StObject.set(x, "inBeta", value.asInstanceOf[js.Any])
    
    inline def setInBetaUndefined: Self = StObject.set(x, "inBeta", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMaxValue(value: String): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: String): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequiresRestart(value: Boolean): Self = StObject.set(x, "requiresRestart", value.asInstanceOf[js.Any])
    
    inline def setRequiresRestartUndefined: Self = StObject.set(x, "requiresRestart", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
