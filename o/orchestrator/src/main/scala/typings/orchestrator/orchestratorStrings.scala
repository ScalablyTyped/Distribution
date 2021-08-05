package typings.orchestrator

import typings.orchestrator.mod.EventNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orchestratorStrings {
  
  @js.native
  sealed trait callback extends StObject
  inline def callback: callback = "callback".asInstanceOf[callback]
  
  @js.native
  sealed trait `catch` extends StObject
  inline def `catch`: `catch` = "catch".asInstanceOf[`catch`]
  
  @js.native
  sealed trait err
    extends StObject
       with EventNames
  inline def err: err = "err".asInstanceOf[err]
  
  @js.native
  sealed trait promise extends StObject
  inline def promise: promise = "promise".asInstanceOf[promise]
  
  @js.native
  sealed trait start
    extends StObject
       with EventNames
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait stop
    extends StObject
       with EventNames
  inline def stop: stop = "stop".asInstanceOf[stop]
  
  @js.native
  sealed trait stream extends StObject
  inline def stream: stream = "stream".asInstanceOf[stream]
  
  @js.native
  sealed trait sync extends StObject
  inline def sync: sync = "sync".asInstanceOf[sync]
  
  @js.native
  sealed trait task_err
    extends StObject
       with EventNames
  inline def task_err: task_err = "task_err".asInstanceOf[task_err]
  
  @js.native
  sealed trait task_not_found
    extends StObject
       with EventNames
  inline def task_not_found: task_not_found = "task_not_found".asInstanceOf[task_not_found]
  
  @js.native
  sealed trait task_recursion
    extends StObject
       with EventNames
  inline def task_recursion: task_recursion = "task_recursion".asInstanceOf[task_recursion]
  
  @js.native
  sealed trait task_start
    extends StObject
       with EventNames
  inline def task_start: task_start = "task_start".asInstanceOf[task_start]
  
  @js.native
  sealed trait task_stop
    extends StObject
       with EventNames
  inline def task_stop: task_stop = "task_stop".asInstanceOf[task_stop]
}
