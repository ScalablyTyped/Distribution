package typings.meteorSyncedCron

import typings.later.mod.ParseStatic
import typings.later.mod.ScheduleData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
      
      inline def setSchedule(value: ParseStatic => ScheduleData): Self = StObject.set(x, "schedule", js.Any.fromFunction1(value))
    }
  }
}
