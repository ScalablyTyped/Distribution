package typings.meteorSyncedCron

import typings.meteorSyncedCron.anon.Job
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-single-declare-module
object meteorLittledataColonsyncedCronMod {
  
  /**
    * A simple cron system for Meteor.
    * It supports syncronizing jobs between multiple processes.
    * In other words, if you add a job that runs every hour
    * and your deployment consists of multiple app servers,
    * only one of the app servers will execute the job each time
    * (whichever tries first).
    *
    * - Meteor Atmosphere package: `littledata:synced-cron` https://atmospherejs.com/littledata/synced-cron
    * - Repository on GitHub: https://github.com/percolatestudio/meteor-synced-cron
    */
  object SyncedCron {
    
    @JSImport("meteor/littledata:synced-cron", "SyncedCron")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * add a scheduled job
      *
      * https://github.com/percolatestudio/meteor-synced-cron#basics
      */
    inline def add(addOptions: Job): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(addOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * find the date that the job referenced by `jobName` will run next.
      *
      * https://github.com/percolatestudio/meteor-synced-cron#advanced
      *
      * @param jobName to find the next valid instance Date for
      */
    inline def nextScheduledAtDate(jobName: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextScheduledAtDate")(jobName.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    
    /**
      * stop all jobs without removing them.
      * The existing jobs can be rescheduled (i.e. restarted)
      * with `SyncedCron.start()`.
      *
      * https://github.com/percolatestudio/meteor-synced-cron#advanced
      */
    inline def pause(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")().asInstanceOf[Unit]
    
    /**
      * remove and stop running the job referenced by jobName.
      *
      * https://github.com/percolatestudio/meteor-synced-cron#advanced
      *
      * @param jobName to be removed
      */
    inline def remove(jobName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(jobName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Start processing added jobs
      *
      * https://github.com/percolatestudio/meteor-synced-cron#basics
      */
    inline def start(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[Unit]
    
    /**
      * remove and stop all jobs.
      *
      * https://github.com/percolatestudio/meteor-synced-cron#advanced
      */
    inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
  }
}
