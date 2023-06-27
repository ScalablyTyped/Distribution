package typings.parseDuration

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("parse-duration", JSImport.Namespace)
  @js.native
  val ^ : Parse = js.native
  
  @js.native
  trait Parse
    extends StObject
       with /* key */ StringDictionary[Double] {
    
    def apply(input: String): js.UndefOr[Double] = js.native
    def apply(input: String, format: Units): js.UndefOr[Double] = js.native
    
    def default(input: String): js.UndefOr[Double] = js.native
    def default(input: String, format: Units): js.UndefOr[Double] = js.native
    @JSName("default")
    var default_Original: Parse = js.native
  }
  
  /**
    * convert `str` to ms
    */
  /* Rewritten from type alias, can be one of: 
    - typings.parseDuration.parseDurationStrings.nanosecond
    - typings.parseDuration.parseDurationStrings.ns
    - typings.parseDuration.parseDurationStrings.µs
    - typings.parseDuration.parseDurationStrings.μs
    - typings.parseDuration.parseDurationStrings.us
    - typings.parseDuration.parseDurationStrings.microsecond
    - typings.parseDuration.parseDurationStrings.millisecond
    - typings.parseDuration.parseDurationStrings.ms
    - typings.parseDuration.parseDurationStrings.second
    - typings.parseDuration.parseDurationStrings.sec
    - typings.parseDuration.parseDurationStrings.s
    - typings.parseDuration.parseDurationStrings.minute
    - typings.parseDuration.parseDurationStrings.min
    - typings.parseDuration.parseDurationStrings.m
    - typings.parseDuration.parseDurationStrings.hour
    - typings.parseDuration.parseDurationStrings.hr
    - typings.parseDuration.parseDurationStrings.h
    - typings.parseDuration.parseDurationStrings.day
    - typings.parseDuration.parseDurationStrings.d
    - typings.parseDuration.parseDurationStrings.week
    - typings.parseDuration.parseDurationStrings.wk
    - typings.parseDuration.parseDurationStrings.w
    - typings.parseDuration.parseDurationStrings.month
    - typings.parseDuration.parseDurationStrings.b
    - typings.parseDuration.parseDurationStrings.year
    - typings.parseDuration.parseDurationStrings.yr
    - typings.parseDuration.parseDurationStrings.y
  */
  trait Units extends StObject
  object Units {
    
    inline def b: typings.parseDuration.parseDurationStrings.b = "b".asInstanceOf[typings.parseDuration.parseDurationStrings.b]
    
    inline def d: typings.parseDuration.parseDurationStrings.d = "d".asInstanceOf[typings.parseDuration.parseDurationStrings.d]
    
    inline def day: typings.parseDuration.parseDurationStrings.day = "day".asInstanceOf[typings.parseDuration.parseDurationStrings.day]
    
    inline def h: typings.parseDuration.parseDurationStrings.h = "h".asInstanceOf[typings.parseDuration.parseDurationStrings.h]
    
    inline def hour: typings.parseDuration.parseDurationStrings.hour = "hour".asInstanceOf[typings.parseDuration.parseDurationStrings.hour]
    
    inline def hr: typings.parseDuration.parseDurationStrings.hr = "hr".asInstanceOf[typings.parseDuration.parseDurationStrings.hr]
    
    inline def m: typings.parseDuration.parseDurationStrings.m = "m".asInstanceOf[typings.parseDuration.parseDurationStrings.m]
    
    inline def microsecond: typings.parseDuration.parseDurationStrings.microsecond = "microsecond".asInstanceOf[typings.parseDuration.parseDurationStrings.microsecond]
    
    inline def millisecond: typings.parseDuration.parseDurationStrings.millisecond = "millisecond".asInstanceOf[typings.parseDuration.parseDurationStrings.millisecond]
    
    inline def min: typings.parseDuration.parseDurationStrings.min = "min".asInstanceOf[typings.parseDuration.parseDurationStrings.min]
    
    inline def minute: typings.parseDuration.parseDurationStrings.minute = "minute".asInstanceOf[typings.parseDuration.parseDurationStrings.minute]
    
    inline def month: typings.parseDuration.parseDurationStrings.month = "month".asInstanceOf[typings.parseDuration.parseDurationStrings.month]
    
    inline def ms: typings.parseDuration.parseDurationStrings.ms = "ms".asInstanceOf[typings.parseDuration.parseDurationStrings.ms]
    
    inline def nanosecond: typings.parseDuration.parseDurationStrings.nanosecond = "nanosecond".asInstanceOf[typings.parseDuration.parseDurationStrings.nanosecond]
    
    inline def ns: typings.parseDuration.parseDurationStrings.ns = "ns".asInstanceOf[typings.parseDuration.parseDurationStrings.ns]
    
    inline def s: typings.parseDuration.parseDurationStrings.s = "s".asInstanceOf[typings.parseDuration.parseDurationStrings.s]
    
    inline def sec: typings.parseDuration.parseDurationStrings.sec = "sec".asInstanceOf[typings.parseDuration.parseDurationStrings.sec]
    
    inline def second: typings.parseDuration.parseDurationStrings.second = "second".asInstanceOf[typings.parseDuration.parseDurationStrings.second]
    
    inline def us: typings.parseDuration.parseDurationStrings.us = "us".asInstanceOf[typings.parseDuration.parseDurationStrings.us]
    
    inline def w: typings.parseDuration.parseDurationStrings.w = "w".asInstanceOf[typings.parseDuration.parseDurationStrings.w]
    
    inline def week: typings.parseDuration.parseDurationStrings.week = "week".asInstanceOf[typings.parseDuration.parseDurationStrings.week]
    
    inline def wk: typings.parseDuration.parseDurationStrings.wk = "wk".asInstanceOf[typings.parseDuration.parseDurationStrings.wk]
    
    inline def y: typings.parseDuration.parseDurationStrings.y = "y".asInstanceOf[typings.parseDuration.parseDurationStrings.y]
    
    inline def year: typings.parseDuration.parseDurationStrings.year = "year".asInstanceOf[typings.parseDuration.parseDurationStrings.year]
    
    inline def yr: typings.parseDuration.parseDurationStrings.yr = "yr".asInstanceOf[typings.parseDuration.parseDurationStrings.yr]
    
    inline def µs: typings.parseDuration.parseDurationStrings.µs = "\u00B5s".asInstanceOf[typings.parseDuration.parseDurationStrings.µs]
    
    inline def μs: typings.parseDuration.parseDurationStrings.μs = "\u03BCs".asInstanceOf[typings.parseDuration.parseDurationStrings.μs]
  }
  
  type _To = Parse
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Parse = ^
}
