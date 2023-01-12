package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schedule extends StObject {
  
  /** Output only. Time the schedule was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Cron-tab formatted schedule by which the job will execute. Format: minute, hour, day of month, month, day of week, e.g. 0 0 * * WED = every Wednesday More examples:
    * https://crontab.guru/examples.html
    */
  var cronSchedule: js.UndefOr[String] = js.undefined
  
  /** A brief description of this environment. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Output only. Display name used for UI purposes. Name can only contain alphanumeric characters, hyphens '-', and underscores '_'. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Notebook Execution Template corresponding to this schedule. */
  var executionTemplate: js.UndefOr[ExecutionTemplate] = js.undefined
  
  /** Output only. The name of this schedule. Format: `projects/{project_id}/locations/{location}/schedules/{schedule_id}` */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The most recent execution names triggered from this schedule and their corresponding states. */
  var recentExecutions: js.UndefOr[js.Array[Execution]] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Timezone on which the cron_schedule. The value of this field must be a time zone name from the tz database. TZ Database: https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
    * Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string "utc". If a time
    * zone is not specified, the default will be in UTC (also known as GMT).
    */
  var timeZone: js.UndefOr[String] = js.undefined
  
  /** Output only. Time the schedule was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Schedule {
  
  inline def apply(): Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Schedule] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCronSchedule(value: String): Self = StObject.set(x, "cronSchedule", value.asInstanceOf[js.Any])
    
    inline def setCronScheduleUndefined: Self = StObject.set(x, "cronSchedule", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExecutionTemplate(value: ExecutionTemplate): Self = StObject.set(x, "executionTemplate", value.asInstanceOf[js.Any])
    
    inline def setExecutionTemplateUndefined: Self = StObject.set(x, "executionTemplate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRecentExecutions(value: js.Array[Execution]): Self = StObject.set(x, "recentExecutions", value.asInstanceOf[js.Any])
    
    inline def setRecentExecutionsUndefined: Self = StObject.set(x, "recentExecutions", js.undefined)
    
    inline def setRecentExecutionsVarargs(value: Execution*): Self = StObject.set(x, "recentExecutions", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
