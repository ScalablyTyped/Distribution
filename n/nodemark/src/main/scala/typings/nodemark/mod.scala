package typings.nodemark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(subjectFn: AsyncFn): js.Promise[BenchmarkResult] = ^.asInstanceOf[js.Dynamic].apply(subjectFn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BenchmarkResult]]
  inline def apply(
    subjectFn: AsyncFn,
    setupFn: scala.Unit,
    // optional, will be invoked before every execution of subjectFn
  duration: Double
  ): js.Promise[BenchmarkResult] = (^.asInstanceOf[js.Dynamic].apply(subjectFn.asInstanceOf[js.Any], setupFn.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BenchmarkResult]]
  inline def apply(subjectFn: AsyncFn, setupFn: AsyncFn): js.Promise[BenchmarkResult] = (^.asInstanceOf[js.Dynamic].apply(subjectFn.asInstanceOf[js.Any], setupFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BenchmarkResult]]
  inline def apply(
    subjectFn: AsyncFn,
    setupFn: AsyncFn,
    // optional, will be invoked before every execution of subjectFn
  duration: Double
  ): js.Promise[BenchmarkResult] = (^.asInstanceOf[js.Dynamic].apply(subjectFn.asInstanceOf[js.Any], setupFn.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BenchmarkResult]]
  inline def apply(subjectFn: AsyncFn, setupFn: SyncFn): js.Promise[BenchmarkResult] = (^.asInstanceOf[js.Dynamic].apply(subjectFn.asInstanceOf[js.Any], setupFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BenchmarkResult]]
  inline def apply(
    subjectFn: AsyncFn,
    setupFn: SyncFn,
    // optional, will be invoked before every execution of subjectFn
  duration: Double
  ): js.Promise[BenchmarkResult] = (^.asInstanceOf[js.Dynamic].apply(subjectFn.asInstanceOf[js.Any], setupFn.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BenchmarkResult]]
  inline def apply(subjectFn: SyncFn): js.Promise[BenchmarkResult] = ^.asInstanceOf[js.Dynamic].apply(subjectFn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BenchmarkResult]]
  inline def apply(
    subjectFn: SyncFn,
    setupFn: scala.Unit,
    // optional, will be invoked before every execution of subjectFn
  duration: Double
  ): js.Promise[BenchmarkResult] = (^.asInstanceOf[js.Dynamic].apply(subjectFn.asInstanceOf[js.Any], setupFn.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BenchmarkResult]]
  inline def apply(subjectFn: SyncFn, setupFn: AsyncFn): js.Promise[BenchmarkResult] = (^.asInstanceOf[js.Dynamic].apply(subjectFn.asInstanceOf[js.Any], setupFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BenchmarkResult]]
  inline def apply(
    subjectFn: SyncFn,
    setupFn: AsyncFn,
    // optional, will be invoked before every execution of subjectFn
  duration: Double
  ): js.Promise[BenchmarkResult] = (^.asInstanceOf[js.Dynamic].apply(subjectFn.asInstanceOf[js.Any], setupFn.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BenchmarkResult]]
  inline def apply(subjectFn: SyncFn, setupFn: SyncFn): BenchmarkResult = (^.asInstanceOf[js.Dynamic].apply(subjectFn.asInstanceOf[js.Any], setupFn.asInstanceOf[js.Any])).asInstanceOf[BenchmarkResult]
  inline def apply(
    subjectFn: SyncFn,
    setupFn: SyncFn,
    // optional, will be invoked before every execution of subjectFn
  duration: Double
  ): BenchmarkResult = (^.asInstanceOf[js.Dynamic].apply(subjectFn.asInstanceOf[js.Any], setupFn.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[BenchmarkResult]
  
  @JSImport("nodemark", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type AsyncFn = js.Function1[/* cb */ DoneCallback, scala.Unit]
  
  @js.native
  trait BenchmarkResult extends StObject {
    
    // the slowest measured time in nanoseconds
    var count: Double = js.native
    
    // the average measured time in nanoseconds
    var error: Double = js.native
    
    def hz(): Double = js.native
    def hz(precision: Double): Double = js.native
    
    // the margin of error as a ratio of the mean
    var max: Double = js.native
    
    var mean: Double = js.native
    
    def microseconds(): Double = js.native
    def microseconds(precision: Double): Double = js.native
    
    def milliseconds(): Double = js.native
    def milliseconds(precision: Double): Double = js.native
    
    // the fastest measured time in nanoseconds
    var min: Double = js.native
    
    // the number of times the subject was invoked and measured
    def nanoseconds(): Double = js.native
    def nanoseconds(precision: Double): Double = js.native
    
    def sd(): Double = js.native
    def sd(precision: Double): Double = js.native
    
    def seconds(): Double = js.native
    def seconds(precision: Double): Double = js.native
    
    def toString(format: Unit): String = js.native
  }
  
  type DoneCallback = js.Function0[scala.Unit]
  
  type SyncFn = js.Function0[scala.Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodemark.nodemarkStrings.nanoseconds
    - typings.nodemark.nodemarkStrings.microseconds
    - typings.nodemark.nodemarkStrings.milliseconds
    - typings.nodemark.nodemarkStrings.seconds
    - typings.nodemark.nodemarkStrings.hz
  */
  trait Unit extends StObject
  object Unit {
    
    inline def hz: typings.nodemark.nodemarkStrings.hz = "hz".asInstanceOf[typings.nodemark.nodemarkStrings.hz]
    
    inline def microseconds: typings.nodemark.nodemarkStrings.microseconds = "microseconds".asInstanceOf[typings.nodemark.nodemarkStrings.microseconds]
    
    inline def milliseconds: typings.nodemark.nodemarkStrings.milliseconds = "milliseconds".asInstanceOf[typings.nodemark.nodemarkStrings.milliseconds]
    
    inline def nanoseconds: typings.nodemark.nodemarkStrings.nanoseconds = "nanoseconds".asInstanceOf[typings.nodemark.nodemarkStrings.nanoseconds]
    
    inline def seconds: typings.nodemark.nodemarkStrings.seconds = "seconds".asInstanceOf[typings.nodemark.nodemarkStrings.seconds]
  }
}
