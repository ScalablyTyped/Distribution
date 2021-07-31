package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  /**
    * The activation policy specifies when the instance is activated; it is applicable only when the instance state is RUNNABLE. Valid values: *ALWAYS*: The instance is on, and remains so
    * even in the absence of connection requests. *NEVER*: The instance is off; it is not activated, even if a connection request arrives.
    */
  var activationPolicy: js.UndefOr[String] = js.undefined
  
  /** Active Directory configuration, relevant only for Cloud SQL for SQL Server. */
  var activeDirectoryConfig: js.UndefOr[SqlActiveDirectoryConfig] = js.undefined
  
  /** The App Engine app IDs that can access this instance. (Deprecated) Applied to First Generation instances only. */
  var authorizedGaeApplications: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Availability type. Potential values: *ZONAL*: The instance serves data from only one zone. Outages in that zone affect data accessibility. *REGIONAL*: The instance can serve data
    * from more than one zone in a region (it is highly available). For more information, see Overview of the High Availability Configuration.
    */
  var availabilityType: js.UndefOr[String] = js.undefined
  
  /** The daily backup configuration for the instance. */
  var backupConfiguration: js.UndefOr[BackupConfiguration] = js.undefined
  
  /** The name of server Instance collation. */
  var collation: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration specific to read replica instances. Indicates whether database flags for crash-safe replication are enabled. This property was only applicable to First Generation
    * instances.
    */
  var crashSafeReplicationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** The size of data disk, in GB. The data disk size minimum is 10GB. */
  var dataDiskSizeGb: js.UndefOr[String] = js.undefined
  
  /** The type of data disk: PD_SSD (default) or PD_HDD. Not used for First Generation instances. */
  var dataDiskType: js.UndefOr[String] = js.undefined
  
  /** The database flags passed to the instance at startup. */
  var databaseFlags: js.UndefOr[js.Array[DatabaseFlags]] = js.undefined
  
  /** Configuration specific to read replica instances. Indicates whether replication is enabled or not. */
  var databaseReplicationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Deny maintenance periods */
  var denyMaintenancePeriods: js.UndefOr[js.Array[DenyMaintenancePeriod]] = js.undefined
  
  /** Insights configuration, for now relevant only for Postgres. */
  var insightsConfig: js.UndefOr[InsightsConfig] = js.undefined
  
  /**
    * The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled
    * for Second Generation instances.
    */
  var ipConfiguration: js.UndefOr[IpConfiguration] = js.undefined
  
  /** This is always *sql#settings*. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The location preference settings. This allows the instance to be located as near as possible to either an App Engine app or Compute Engine zone for better performance. App Engine
    * co-location was only applicable to First Generation instances.
    */
  var locationPreference: js.UndefOr[LocationPreference] = js.undefined
  
  /** The maintenance window for this instance. This specifies when the instance can be restarted for maintenance purposes. */
  var maintenanceWindow: js.UndefOr[MaintenanceWindow] = js.undefined
  
  /** The pricing plan for this instance. This can be either *PER_USE* or *PACKAGE*. Only *PER_USE* is supported for Second Generation instances. */
  var pricingPlan: js.UndefOr[String] = js.undefined
  
  /** The type of replication this instance uses. This can be either *ASYNCHRONOUS* or *SYNCHRONOUS*. (Deprecated_ This property was only applicable to First Generation instances. */
  var replicationType: js.UndefOr[String] = js.undefined
  
  /**
    * The version of instance settings. This is a required field for update method to make sure concurrent updates are handled properly. During update, use the most recent settingsVersion
    * value for this instance and do not try to update this value.
    */
  var settingsVersion: js.UndefOr[String] = js.undefined
  
  /** Configuration to increase storage size automatically. The default value is true. */
  var storageAutoResize: js.UndefOr[Boolean] = js.undefined
  
  /** The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit. */
  var storageAutoResizeLimit: js.UndefOr[String] = js.undefined
  
  /** The tier (or machine type) for this instance, for example *db-n1-standard-1* (MySQL instances) or *db-custom-1-3840* (PostgreSQL instances). */
  var tier: js.UndefOr[String] = js.undefined
  
  /** User-provided labels, represented as a dictionary where each label is a single key value pair. */
  var userLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientSqladmin.maximMazurokGapiClientSqladminStrings.Settings & TopLevel[js.Any]
  ] = js.undefined
}
object Settings {
  
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivationPolicy(value: String): Self = StObject.set(x, "activationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationPolicyUndefined: Self = StObject.set(x, "activationPolicy", js.undefined)
    
    @scala.inline
    def setActiveDirectoryConfig(value: SqlActiveDirectoryConfig): Self = StObject.set(x, "activeDirectoryConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDirectoryConfigUndefined: Self = StObject.set(x, "activeDirectoryConfig", js.undefined)
    
    @scala.inline
    def setAuthorizedGaeApplications(value: js.Array[String]): Self = StObject.set(x, "authorizedGaeApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedGaeApplicationsUndefined: Self = StObject.set(x, "authorizedGaeApplications", js.undefined)
    
    @scala.inline
    def setAuthorizedGaeApplicationsVarargs(value: String*): Self = StObject.set(x, "authorizedGaeApplications", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityType(value: String): Self = StObject.set(x, "availabilityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityTypeUndefined: Self = StObject.set(x, "availabilityType", js.undefined)
    
    @scala.inline
    def setBackupConfiguration(value: BackupConfiguration): Self = StObject.set(x, "backupConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupConfigurationUndefined: Self = StObject.set(x, "backupConfiguration", js.undefined)
    
    @scala.inline
    def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    @scala.inline
    def setCrashSafeReplicationEnabled(value: Boolean): Self = StObject.set(x, "crashSafeReplicationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrashSafeReplicationEnabledUndefined: Self = StObject.set(x, "crashSafeReplicationEnabled", js.undefined)
    
    @scala.inline
    def setDataDiskSizeGb(value: String): Self = StObject.set(x, "dataDiskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDiskSizeGbUndefined: Self = StObject.set(x, "dataDiskSizeGb", js.undefined)
    
    @scala.inline
    def setDataDiskType(value: String): Self = StObject.set(x, "dataDiskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDiskTypeUndefined: Self = StObject.set(x, "dataDiskType", js.undefined)
    
    @scala.inline
    def setDatabaseFlags(value: js.Array[DatabaseFlags]): Self = StObject.set(x, "databaseFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseFlagsUndefined: Self = StObject.set(x, "databaseFlags", js.undefined)
    
    @scala.inline
    def setDatabaseFlagsVarargs(value: DatabaseFlags*): Self = StObject.set(x, "databaseFlags", js.Array(value :_*))
    
    @scala.inline
    def setDatabaseReplicationEnabled(value: Boolean): Self = StObject.set(x, "databaseReplicationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseReplicationEnabledUndefined: Self = StObject.set(x, "databaseReplicationEnabled", js.undefined)
    
    @scala.inline
    def setDenyMaintenancePeriods(value: js.Array[DenyMaintenancePeriod]): Self = StObject.set(x, "denyMaintenancePeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenyMaintenancePeriodsUndefined: Self = StObject.set(x, "denyMaintenancePeriods", js.undefined)
    
    @scala.inline
    def setDenyMaintenancePeriodsVarargs(value: DenyMaintenancePeriod*): Self = StObject.set(x, "denyMaintenancePeriods", js.Array(value :_*))
    
    @scala.inline
    def setInsightsConfig(value: InsightsConfig): Self = StObject.set(x, "insightsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightsConfigUndefined: Self = StObject.set(x, "insightsConfig", js.undefined)
    
    @scala.inline
    def setIpConfiguration(value: IpConfiguration): Self = StObject.set(x, "ipConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpConfigurationUndefined: Self = StObject.set(x, "ipConfiguration", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocationPreference(value: LocationPreference): Self = StObject.set(x, "locationPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationPreferenceUndefined: Self = StObject.set(x, "locationPreference", js.undefined)
    
    @scala.inline
    def setMaintenanceWindow(value: MaintenanceWindow): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceWindowUndefined: Self = StObject.set(x, "maintenanceWindow", js.undefined)
    
    @scala.inline
    def setPricingPlan(value: String): Self = StObject.set(x, "pricingPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingPlanUndefined: Self = StObject.set(x, "pricingPlan", js.undefined)
    
    @scala.inline
    def setReplicationType(value: String): Self = StObject.set(x, "replicationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTypeUndefined: Self = StObject.set(x, "replicationType", js.undefined)
    
    @scala.inline
    def setSettingsVersion(value: String): Self = StObject.set(x, "settingsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsVersionUndefined: Self = StObject.set(x, "settingsVersion", js.undefined)
    
    @scala.inline
    def setStorageAutoResize(value: Boolean): Self = StObject.set(x, "storageAutoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageAutoResizeLimit(value: String): Self = StObject.set(x, "storageAutoResizeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageAutoResizeLimitUndefined: Self = StObject.set(x, "storageAutoResizeLimit", js.undefined)
    
    @scala.inline
    def setStorageAutoResizeUndefined: Self = StObject.set(x, "storageAutoResize", js.undefined)
    
    @scala.inline
    def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
    
    @scala.inline
    def setUserLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientSqladmin.maximMazurokGapiClientSqladminStrings.Settings & TopLevel[js.Any]
    ): Self = StObject.set(x, "userLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLabelsUndefined: Self = StObject.set(x, "userLabels", js.undefined)
  }
}
