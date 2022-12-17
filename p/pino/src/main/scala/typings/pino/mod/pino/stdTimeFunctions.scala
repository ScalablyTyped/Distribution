package typings.pino.mod.pino

import typings.pino.mod.TimeFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stdTimeFunctions {
  
  @JSImport("pino", "pino.stdTimeFunctions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The default time function for Pino. Returns a string like `,"time":1493426328206`.
    */
  inline def epochTime(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("epochTime")().asInstanceOf[String]
  /**
    * The default time function for Pino. Returns a string like `,"time":1493426328206`.
    */
  @JSImport("pino", "pino.stdTimeFunctions.epochTime")
  @js.native
  def epochTime_FstdTimeFunctions: TimeFn = js.native
  
  inline def epochTime_FstdTimeFunctions_=(x: TimeFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("epochTime")(x.asInstanceOf[js.Any])
  
  /*
    * Returns ISO 8601-formatted time in UTC
    */
  inline def isoTime(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("isoTime")().asInstanceOf[String]
  /*
    * Returns ISO 8601-formatted time in UTC
    */
  @JSImport("pino", "pino.stdTimeFunctions.isoTime")
  @js.native
  def isoTime_FstdTimeFunctions: TimeFn = js.native
  
  inline def isoTime_FstdTimeFunctions_=(x: TimeFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isoTime")(x.asInstanceOf[js.Any])
  
  /**
    * Returns an empty string. This function is used when the `timestamp` option is set to `false`.
    */
  inline def nullTime(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nullTime")().asInstanceOf[String]
  /**
    * Returns an empty string. This function is used when the `timestamp` option is set to `false`.
    */
  @JSImport("pino", "pino.stdTimeFunctions.nullTime")
  @js.native
  def nullTime_FstdTimeFunctions: TimeFn = js.native
  
  inline def nullTime_FstdTimeFunctions_=(x: TimeFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nullTime")(x.asInstanceOf[js.Any])
  
  /*
    * Returns the seconds since Unix epoch
    */
  inline def unixTime(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unixTime")().asInstanceOf[String]
  /*
    * Returns the seconds since Unix epoch
    */
  @JSImport("pino", "pino.stdTimeFunctions.unixTime")
  @js.native
  def unixTime_FstdTimeFunctions: TimeFn = js.native
  
  inline def unixTime_FstdTimeFunctions_=(x: TimeFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unixTime")(x.asInstanceOf[js.Any])
}
