package typings.meteorSyncedCron

import typings.later.mod.ParseStatic
import typings.later.mod.ScheduleData
import typings.meteorSyncedCron.meteorSyncedCronStrings.debug
import typings.meteorSyncedCron.meteorSyncedCronStrings.error
import typings.meteorSyncedCron.meteorSyncedCronStrings.info
import typings.meteorSyncedCron.meteorSyncedCronStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CollectionName extends StObject {
    
    /**
      * Name of collection to use for synchronisation and logging
      *
      * Default `"cronHistory"`
      */
    var collectionName: js.UndefOr[String] = js.undefined
    
    /**
      * TTL in seconds for history records in collection to expire
      * NOTE: Unset to remove expiry but ensure you remove the index from
      * mongo by hand
      *
      * ALSO: SyncedCron can't use the `_ensureIndex` command to modify
      * the TTL index. The best way to modify the default value of
      * `collectionTTL` is to remove the index by hand (in the mongo shell
      * run `db.cronHistory.dropIndex({startedAt: 1})`) and re-run your
      * project. SyncedCron will recreate the index with the updated TTL.
      *
      * Default `172800` seconds (48 hours)
      */
    var collectionTTL: js.UndefOr[Double] = js.undefined
    
    /**
      * Log job run details to console
      *
      * Default `true`
      */
    var log: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use a custom logger function (defaults to Meteor's logging package)
      *
      * SyncedCron uses Meteor's `logging` package by default.
      * If you want to use your own logger (for sending to other consumers or similar)
      * you can do so by configuring the `logger` option.
      *
      * SyncedCron expects a function as `logger`,
      * and will pass arguments to it for you to take action on.
      *
      * The `opts` passed argument includes `level`, `message`, and `tag`.
      * - `level` will be one of `"info"`, `"warn"`, `"error"`, `"debug"`.
      * - `message` is something like `'Scheduled "Test Job" next run @Fri Mar 13 2015 10:15:00 GMT+0100 (CET)'`".
      * - `tag` will always be `"SyncedCron"` (handy for filtering).
      *
      * https://github.com/percolatestudio/meteor-synced-cron#logging
      */
    var logger: js.UndefOr[(js.Function1[/* opts */ Level, Unit]) | Null] = js.undefined
    
    /**
      * Use UTC or localtime for evaluating schedules
      *
      * Default to using localTime
      *
      * Default `false`
      */
    var utc: js.UndefOr[Boolean] = js.undefined
  }
  object CollectionName {
    
    inline def apply(): CollectionName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollectionName]
    }
    
    extension [Self <: CollectionName](x: Self) {
      
      inline def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
      
      inline def setCollectionNameUndefined: Self = StObject.set(x, "collectionName", js.undefined)
      
      inline def setCollectionTTL(value: Double): Self = StObject.set(x, "collectionTTL", value.asInstanceOf[js.Any])
      
      inline def setCollectionTTLUndefined: Self = StObject.set(x, "collectionTTL", js.undefined)
      
      inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setLogger(value: /* opts */ Level => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
      
      inline def setLoggerNull: Self = StObject.set(x, "logger", null)
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      inline def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
    }
  }
  
  trait Job extends StObject {
    
    /**
      * *required* the code to run
      */
    def job(): Unit
    
    /**
      * *required* unique name of the job
      */
    var name: String
    
    /**
      * Undocumented flag to enable synchronization and logging
      * for this job
      *
      * Default `true`
      *
      * https://github.com/percolatestudio/meteor-synced-cron/blob/687e9ea308a287fe6347f94e0fb3eac5e2e21c12/synced-cron-server.js#L120-L124
      */
    var persist: js.UndefOr[Boolean] = js.undefined
    
    /**
      * *required* when to run the job
      *
      * @param parser is a later.parse object
      */
    def schedule(parser: ParseStatic): ScheduleData
  }
  object Job {
    
    inline def apply(job: () => Unit, name: String, schedule: ParseStatic => ScheduleData): Job = {
      val __obj = js.Dynamic.literal(job = js.Any.fromFunction0(job), name = name.asInstanceOf[js.Any], schedule = js.Any.fromFunction1(schedule))
      __obj.asInstanceOf[Job]
    }
    
    extension [Self <: Job](x: Self) {
      
      inline def setJob(value: () => Unit): Self = StObject.set(x, "job", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
      
      inline def setSchedule(value: ParseStatic => ScheduleData): Self = StObject.set(x, "schedule", js.Any.fromFunction1(value))
    }
  }
  
  trait Level extends StObject {
    
    /**
      * will be one of `"info"`, `"warn"`, `"error"`, `"debug"`.
      */
    var level: info | warn | error | debug
    
    /**
      * something like `'Scheduled "Test Job" next run @Fri Mar 13 2015 10:15:00 GMT+0100 (CET)'`".
      */
    var message: String
    
    /**
      * will always be `"SyncedCron"` (handy for filtering).
      */
    var tag: String
  }
  object Level {
    
    inline def apply(level: info | warn | error | debug, message: String, tag: String): Level = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    extension [Self <: Level](x: Self) {
      
      inline def setLevel(value: info | warn | error | debug): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
}
