package typings.miniprogramWxs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("getDate")
@js.native
object getDate extends js.Object {
  /**
    * 返回一个当前时间的对象。
    */
  def apply(): Date = js.native
  def apply(value: java.lang.String): Date = js.native
  /**
    * 获取时间
    * @param value  时间
    * milliseconds: 从1970年1月1日00:00:00 UTC开始计算的毫秒数
    * datestring: 日期字符串，其格式为："month day, year hours:minutes:seconds"
    */
  def apply(value: Double): Date = js.native
  def apply(year: Double, month: Double): Date = js.native
  def apply(year: Double, month: Double, date: Double): Date = js.native
  def apply(year: Double, month: Double, date: Double, hours: Double): Date = js.native
  def apply(year: Double, month: Double, date: Double, hours: Double, minutes: Double): Date = js.native
  def apply(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double): Date = js.native
  def apply(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: Double,
    seconds: Double,
    ms: Double
  ): Date = js.native
}

