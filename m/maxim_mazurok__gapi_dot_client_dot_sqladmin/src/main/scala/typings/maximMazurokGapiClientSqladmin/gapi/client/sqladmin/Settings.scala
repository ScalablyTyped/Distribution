package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
  /**
    * The activation policy specifies when the instance is activated; it is applicable only when the instance state is RUNNABLE. Valid values: *ALWAYS*: The instance is on, and remains so
    * even in the absence of connection requests. *NEVER*: The instance is off; it is not activated, even if a connection request arrives.
    */
  var activationPolicy: js.UndefOr[String] = js.native
  
  /** Active Directory configuration, relevant only for Cloud SQL for SQL Server. */
  var activeDirectoryConfig: js.UndefOr[SqlActiveDirectoryConfig] = js.native
  
  /** The App Engine app IDs that can access this instance. (Deprecated) Applied to First Generation instances only. */
  var authorizedGaeApplications: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Availability type. Potential values: *ZONAL*: The instance serves data from only one zone. Outages in that zone affect data accessibility. *REGIONAL*: The instance can serve data
    * from more than one zone in a region (it is highly available). For more information, see Overview of the High Availability Configuration.
    */
  var availabilityType: js.UndefOr[String] = js.native
  
  /** The daily backup configuration for the instance. */
  var backupConfiguration: js.UndefOr[BackupConfiguration] = js.native
  
  /** The name of server Instance collation. */
  var collation: js.UndefOr[String] = js.native
  
  /**
    * Configuration specific to read replica instances. Indicates whether database flags for crash-safe replication are enabled. This property was only applicable to First Generation
    * instances.
    */
  var crashSafeReplicationEnabled: js.UndefOr[Boolean] = js.native
  
  /** The size of data disk, in GB. The data disk size minimum is 10GB. */
  var dataDiskSizeGb: js.UndefOr[String] = js.native
  
  /** The type of data disk: PD_SSD (default) or PD_HDD. Not used for First Generation instances. */
  var dataDiskType: js.UndefOr[String] = js.native
  
  /** The database flags passed to the instance at startup. */
  var databaseFlags: js.UndefOr[js.Array[DatabaseFlags]] = js.native
  
  /** Configuration specific to read replica instances. Indicates whether replication is enabled or not. */
  var databaseReplicationEnabled: js.UndefOr[Boolean] = js.native
  
  /** Deny maintenance periods */
  var denyMaintenancePeriods: js.UndefOr[js.Array[DenyMaintenancePeriod]] = js.native
  
  /** Insights configuration, for now relevant only for Postgres. */
  var insightsConfig: js.UndefOr[InsightsConfig] = js.native
  
  /**
    * The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled
    * for Second Generation instances.
    */
  var ipConfiguration: js.UndefOr[IpConfiguration] = js.native
  
  /** This is always *sql#settings*. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The location preference settings. This allows the instance to be located as near as possible to either an App Engine app or Compute Engine zone for better performance. App Engine
    * co-location was only applicable to First Generation instances.
    */
  var locationPreference: js.UndefOr[LocationPreference] = js.native
  
  /** The maintenance window for this instance. This specifies when the instance can be restarted for maintenance purposes. */
  var maintenanceWindow: js.UndefOr[MaintenanceWindow] = js.native
  
  /** The pricing plan for this instance. This can be either *PER_USE* or *PACKAGE*. Only *PER_USE* is supported for Second Generation instances. */
  var pricingPlan: js.UndefOr[String] = js.native
  
  /** The type of replication this instance uses. This can be either *ASYNCHRONOUS* or *SYNCHRONOUS*. (Deprecated_ This property was only applicable to First Generation instances. */
  var replicationType: js.UndefOr[String] = js.native
  
  /**
    * The version of instance settings. This is a required field for update method to make sure concurrent updates are handled properly. During update, use the most recent settingsVersion
    * value for this instance and do not try to update this value.
    */
  var settingsVersion: js.UndefOr[String] = js.native
  
  /** Configuration to increase storage size automatically. The default value is true. */
  var storageAutoResize: js.UndefOr[Boolean] = js.native
  
  /** The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit. */
  var storageAutoResizeLimit: js.UndefOr[String] = js.native
  
  /** The tier (or machine type) for this instance, for example *db-n1-standard-1* (MySQL instances) or *db-custom-1-3840* (PostgreSQL instances). */
  var tier: js.UndefOr[String] = js.native
  
  /** User-provided labels, represented as a dictionary where each label is a single key value pair. */
  var userLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientSqladmin.maximMazurokGapiClientSqladminStrings.Settings with TopLevel[js.Any]
  ] = js.native
}
object Settings {
  
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivationPolicy(value: String): Self = this.set("activationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivationPolicy: Self = this.set("activationPolicy", js.undefined)
    
    @scala.inline
    def setActiveDirectoryConfig(value: SqlActiveDirectoryConfig): Self = this.set("activeDirectoryConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveDirectoryConfig: Self = this.set("activeDirectoryConfig", js.undefined)
    
    @scala.inline
    def setAuthorizedGaeApplicationsVarargs(value: String*): Self = this.set("authorizedGaeApplications", js.Array(value :_*))
    
    @scala.inline
    def setAuthorizedGaeApplications(value: js.Array[String]): Self = this.set("authorizedGaeApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizedGaeApplications: Self = this.set("authorizedGaeApplications", js.undefined)
    
    @scala.inline
    def setAvailabilityType(value: String): Self = this.set("availabilityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityType: Self = this.set("availabilityType", js.undefined)
    
    @scala.inline
    def setBackupConfiguration(value: BackupConfiguration): Self = this.set("backupConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupConfiguration: Self = this.set("backupConfiguration", js.undefined)
    
    @scala.inline
    def setCollation(value: String): Self = this.set("collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
    
    @scala.inline
    def setCrashSafeReplicationEnabled(value: Boolean): Self = this.set("crashSafeReplicationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrashSafeReplicationEnabled: Self = this.set("crashSafeReplicationEnabled", js.undefined)
    
    @scala.inline
    def setDataDiskSizeGb(value: String): Self = this.set("dataDiskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataDiskSizeGb: Self = this.set("dataDiskSizeGb", js.undefined)
    
    @scala.inline
    def setDataDiskType(value: String): Self = this.set("dataDiskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataDiskType: Self = this.set("dataDiskType", js.undefined)
    
    @scala.inline
    def setDatabaseFlagsVarargs(value: DatabaseFlags*): Self = this.set("databaseFlags", js.Array(value :_*))
    
    @scala.inline
    def setDatabaseFlags(value: js.Array[DatabaseFlags]): Self = this.set("databaseFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseFlags: Self = this.set("databaseFlags", js.undefined)
    
    @scala.inline
    def setDatabaseReplicationEnabled(value: Boolean): Self = this.set("databaseReplicationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseReplicationEnabled: Self = this.set("databaseReplicationEnabled", js.undefined)
    
    @scala.inline
    def setDenyMaintenancePeriodsVarargs(value: DenyMaintenancePeriod*): Self = this.set("denyMaintenancePeriods", js.Array(value :_*))
    
    @scala.inline
    def setDenyMaintenancePeriods(value: js.Array[DenyMaintenancePeriod]): Self = this.set("denyMaintenancePeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDenyMaintenancePeriods: Self = this.set("denyMaintenancePeriods", js.undefined)
    
    @scala.inline
    def setInsightsConfig(value: InsightsConfig): Self = this.set("insightsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsightsConfig: Self = this.set("insightsConfig", js.undefined)
    
    @scala.inline
    def setIpConfiguration(value: IpConfiguration): Self = this.set("ipConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpConfiguration: Self = this.set("ipConfiguration", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLocationPreference(value: LocationPreference): Self = this.set("locationPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationPreference: Self = this.set("locationPreference", js.undefined)
    
    @scala.inline
    def setMaintenanceWindow(value: MaintenanceWindow): Self = this.set("maintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenanceWindow: Self = this.set("maintenanceWindow", js.undefined)
    
    @scala.inline
    def setPricingPlan(value: String): Self = this.set("pricingPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricingPlan: Self = this.set("pricingPlan", js.undefined)
    
    @scala.inline
    def setReplicationType(value: String): Self = this.set("replicationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationType: Self = this.set("replicationType", js.undefined)
    
    @scala.inline
    def setSettingsVersion(value: String): Self = this.set("settingsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsVersion: Self = this.set("settingsVersion", js.undefined)
    
    @scala.inline
    def setStorageAutoResize(value: Boolean): Self = this.set("storageAutoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageAutoResize: Self = this.set("storageAutoResize", js.undefined)
    
    @scala.inline
    def setStorageAutoResizeLimit(value: String): Self = this.set("storageAutoResizeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageAutoResizeLimit: Self = this.set("storageAutoResizeLimit", js.undefined)
    
    @scala.inline
    def setTier(value: String): Self = this.set("tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTier: Self = this.set("tier", js.undefined)
    
    @scala.inline
    def setUserLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientSqladmin.maximMazurokGapiClientSqladminStrings.Settings with TopLevel[js.Any]
    ): Self = this.set("userLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserLabels: Self = this.set("userLabels", js.undefined)
  }
}
